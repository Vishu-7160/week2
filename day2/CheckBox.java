package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement selenium = driver.findElement(By.xpath("(//label[@for='java'])[2]"));
		if(selenium.isSelected())
		{
			System.out.println("Confirmed that Selenium is slected");
		}
		WebElement deselect = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]"));
		if(deselect.isSelected())
		{
			driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
		}
		List<WebElement> all = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		int n = all.size();
		for(int i = 0;i<n;i++)
		{
			all.get(i).click();
		}
	}

}
