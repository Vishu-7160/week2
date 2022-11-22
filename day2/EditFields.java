package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("vishu123@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Editing fields");
		String defa = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println("Default text is" + defa);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean b = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if(!b)
		{
			System.out.println("The field is diabled");
			
		}
		else
		{
			System.out.println("The field is enabled");
		}
		driver.close();
	}
	

}
