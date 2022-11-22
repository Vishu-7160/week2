package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select d1 = new Select(drop1);
		d1.selectByIndex(3);
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select d2 = new Select(drop2);
		d2.selectByVisibleText("Appium");
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select d3 = new Select(drop3);
		d3.selectByValue("4");
		WebElement drop4 = driver.findElement(By.className("dropdown"));
		Select d4 = new Select(drop4);
		int num = d4.getOptions().size();
		System.out.println("Number of dropwdown option:"+num);
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Selenium");
		WebElement drop5 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]"));
		Select d5 = new Select(drop5);
		d5.selectByValue("1");
		d5.selectByValue("3");
		driver.close();
	}

}
