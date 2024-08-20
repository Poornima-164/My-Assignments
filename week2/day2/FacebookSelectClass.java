package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass {

	public static void main(String[] args) throws InterruptedException {
   ChromeDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://en-gb.facebook.com/");
   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Poornima");
   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sundar");
   Thread.sleep(3000);
   driver.findElement(By.id("//input[@name='reg_email__']")).sendKeys("1234567890");
   driver.findElement(By.id("//input[@id='password_step_input']")).sendKeys("123333322255");
   WebElement date = driver.findElement(By.id("day"));
   Select s1=new Select(date);
   s1.selectByValue("16");
   WebElement month = driver.findElement(By.id("month"));
   Select s2=new Select(month);
   s2.selectByVisibleText("April");
   WebElement year = driver.findElement(By.id("year"));
   Select s3=new Select(year);
   s3.selectByValue("1992");
   driver.findElement(By.className("//input[@class='_8esa']")).sendKeys("Female");
   driver.findElement(By.name("websubmit")).click();
   driver.close();
	}

}
