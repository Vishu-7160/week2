package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Vishalini");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Nagarajan");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("9012345679");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("God12345");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select scd = new Select(day);
		scd.selectByValue("23");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select scm = new Select(month);
		scm.selectByValue("7");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select scy = new Select(year);
		scy.selectByValue("1995");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}
