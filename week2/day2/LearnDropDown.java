package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s1 =new Select(Source);
		s1.selectByIndex(4);
		
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select s2=new Select(Marketing);
		s2.selectByVisibleText("Automobile");
		
		WebElement Currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select s3=new Select(Currency);
		s3.selectByValue("KPW");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
driver.close();
	}
}
