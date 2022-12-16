package com.generalPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDown_2 {

	public static void main(String[] args) throws Exception {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.facebook.com/");
		Thread.sleep(3000);

		dr.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		System.out.println("Open sign up page");
	//	dr.switchTo().alert().accept();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyanaka");
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Chavan");
		dr.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8605378106");	
		WebElement day = dr.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByVisibleText("27");
		WebElement Month = dr.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(Month);
		s2.selectByIndex(4);
		WebElement year = dr.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year);
		s3.selectByValue("1995");
		
		dr.findElement(By.xpath("//input[@name='sex']")).click();
		System.out.println("All detail filled");
		dr.findElement(By.xpath("//button[@name='websubmit']")).click();

		Thread.sleep(3000);
		dr.quit();	

	}

}
