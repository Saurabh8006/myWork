package com.generalPractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.investing.com/");
		Thread.sleep(3000);
		String parentID = d.getWindowHandle();
		System.out.println(parentID);
		Set<String> ID = d.getWindowHandles();
		System.out.println(ID);
		d.quit();
	}
}
