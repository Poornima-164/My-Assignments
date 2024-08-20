package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("poornima");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sundar");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
			driver.findElement(By.className("smallSubmit")).click();
			Thread.sleep(3000);
			String title = driver.getTitle();
			if (title.contains("View Lead")) {
				System.out.println("Lead created successfully");
			}else {
				System.out.println("Lead is not created");
}
			driver.close();
	}
}
