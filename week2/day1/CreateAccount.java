package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
driver.findElement(By.linkText("Accounts")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("Account Name")).sendKeys("poornima");
driver.findElement(By.name("Description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("Number of Employees")).sendKeys("10");
driver.findElement(By.id("Site Name")).sendKeys("TestLeaf");
Thread.sleep(3000);
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
if (title.contains("Account Details")) {
System.out.println("success");
	}else{
	System.out.println("Fail");
}
driver.close();
	}
}
