package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("yes")).click();
		WebElement uncheck = driver.findElement(By.xpath("//input[@name='news']"));
		WebElement check = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		if(uncheck.isSelected())
		{
			System.out.println("Unchecked radio button is selected by default");
		}
		else if(check.isSelected())
		{
			System.out.println("Checked radio button is selected by default");
		}
		WebElement age = driver.findElement(By.xpath("(//input[@name='age'])[2])"));
		if(!age.isSelected())
		{
			driver.findElement(By.xpath("(//input[@name='age'])[2])")).click();
		}
	}

}
