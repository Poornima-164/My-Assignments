package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	private static String title;

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.facebook.com");
driver.findElement(By.id("username")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.id("password")).sendKeys("Tuna@321");
driver.findElement(By.name("login")).click();
Thread.sleep(4000);
String title = driver.getTitle();
System.out.println("title");
if (title.contains("Facebook")) {
System.out.println("Login is successfull");	
}else {
	System.out.println("Login is not successfull");
}
driver.close();
	}

}
