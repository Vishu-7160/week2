package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishalini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V N ");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vishu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("R&D");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Research and developement");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vishu123@mail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishali");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		
		
	}

}
