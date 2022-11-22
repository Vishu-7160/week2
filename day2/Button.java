package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		String title = driver.getTitle();
		String Title = "TestLeaf - Selenium Playground";
		if (title.equals(Title)) 
		{
			System.out.println("Home page");
		} else {
			System.out.println("Wrong page");
		}
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		//Finding position
		Point posi = driver.findElement(By.id("position")).getLocation();
		int x = posi.getX();
		int y = posi.getY();
		System.out.println("X value of the button " + x);
		System.out.println("Y value of the button " + y);
		
		//Get colour of button
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Button colour is " + color);
		
		//Finding height and width
		Dimension size = driver.findElement(By.id("size")).getSize();
		int height = size.height;
		int width = size.width;
		System.out.println("Height of the  button is " + height);
		System.out.println("Width of the  button is " + width);
		
		driver.close();

	}

}
