package com.generalPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandling_2 {
	public static void main(String[] args) throws Exception {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String ID = d.getWindowHandle();
		System.out.println("parent window" + ID);  //CDwindow-63B3355B478590C4A666629B81D5123A
		WebElement acc = d.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		acc.click();
		Set<String>  ID_2 = d.getWindowHandles();
		
		for(String z : ID_2) {
			if(!ID.equals(ID_2)) {
				d.switchTo().window(z);
				Thread.sleep(3000);
				//d.findElement(By.xpath("//input[@type='text']")).sendKeys("Saurabh chavan");
			//	Thread.sleep(3000);
			//	d.navigate().back();
				d.close();
			}
		}
		
		d.switchTo().window(ID);
		Thread.sleep(3000);
		d.quit();	
		
	}
}
