package com.generalPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling_4 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);  //single window id return  // every time get new windowid
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
		ele.click(); // open another window

		Set<String> windowids = driver.getWindowHandles();  // return ids multiple browser window
		String parentid = windowid;
		for(String z : windowids) {
			String title2=	driver.switchTo().window(z).getTitle();
			System.out.println(title2);
			if(!parentid.equals( z)) {
				driver.switchTo().window(z); // child window handle
				driver.findElement(By.xpath("//input[@id='myText']")).sendKeys("benikre");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		driver.quit();	
	}
}
