package com.generalPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.investing.com/");
		Thread.sleep(3000);
		Set<String> parentid=d.getWindowHandles();
		System.out.println(parentid);
		d.findElement(By.xpath("//header/div[@id='navBar']/nav[@id='navMenu']/ul[1]/li[1]/ul[1]/li[2]")).click();
		
		Set <String>parentids = d.getWindowHandles();
		System.out.println(parentids);
		
		/*
		Dimension j = d.manage().window().getSize();
		System.out.println(j);
		Dimension k = new Dimension(800,300);
		d.manage().window().setSize(k);
		Thread.sleep(3000);
		
		d.manage().window().getPosition();
		
		Point t = new Point(1200,600);
		d.manage().window().setPosition(t);
		Thread.sleep(3000);
		*/
		d.quit();

	}

}
