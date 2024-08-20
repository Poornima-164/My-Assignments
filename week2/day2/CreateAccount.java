package week2.day2;

import java.awt.SecondaryLoop;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
			driver.findElement(By.id("accountName")).sendKeys("poornima");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			WebElement opt1 = driver.findElement(By.name("industryEnumId"));
			Select Industry=new Select(opt1);
			Industry.selectByVisibleText("Computer Software");
			WebElement opt2 = driver.findElement(By.name("ownershipEnumId"));
			Select Ownership=new Select(opt2);
            Ownership.selectByVisibleText("S-Corporation");
            WebElement opt3 = driver.findElement(By.id("dataSourceId"));
			Select Source=new Select(opt3);
            Source.selectByValue("LEAD_EMPLOYEE");
            WebElement opt4 = driver.findElement(By.id("marketingCampaignId"));
			Select Marketing=new Select(opt4);
            Marketing.selectByIndex(5);
            WebElement opt5 = driver.findElement(By.id("generalStateProvinceGeoId"));
			Select StateProvince=new Select(opt5);
			StateProvince.selectByValue("TX");
			driver.findElement(By.className("smallSubmit")).click();
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Account details")) {
				System.out.println("Name is displayed correctly");
			}else {
				System.out.println("Name is displayed incorrectly");
			}
     		driver.close();   
	}

}
