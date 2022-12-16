package com.generalPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling_3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//String windowid = driver.getWindowHandle();
		//System.out.println(windowid);  //single window id return  // every time get new windowid
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
		ele.click(); // open another window

		Set<String> windowids = driver.getWindowHandles();  // return ids multiple browser window

		/*
		//first method = iteration
		Iterator<String> it = windowids.iterator(); 
		String parentid = it.next();
		String childid = it.next();
		System.out.println("Parent window id is = " + parentid);
		System.out.println("Child window id is = " + childid);
		 */

		//List collection List / ArrayList
		List<String> wind = new ArrayList(windowids);
		String parentid =  wind.get(0);
		String childid = wind.get(1);
		System.out.println("Parent window id is = " + parentid);
		System.out.println("Child window id is = " + childid);

		//How to use windows ID's for switching
		driver.switchTo().window(parentid);
		System.out.println("parent title :- " + driver.getTitle());
		driver.switchTo().window(childid);
		System.out.println("Child title :- " + driver.getTitle());

		/*	//for each loop
		for(String wd : windowids)
		{
			String title = driver.switchTo().window(wd).getTitle();
			System.out.println(title);
		} */

		for(String wd : windowids)
		{
			String title = driver.switchTo().window(wd).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}
	}
}
