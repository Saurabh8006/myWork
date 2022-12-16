package com.generalPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\docs\\saurabh_velocity\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement element = w.findElement(By.xpath("//button[@class='dropbtn']"));
		Actions h = new Actions(w);
		h.moveToElement(element).perform();
		List <WebElement> elements1 = w.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int count = elements1.size();
		System.out.println("total WebElements are =" + count);
		for(int i =0;i<count;i++) {
			WebElement f = elements1.get(i);
			String text = f.getAttribute("innerHTML");
			System.out.println(text);
			if(text.equals("Appium")) {
			f.click();
			}
		}
		Thread.sleep(3000);
		w.quit();
	}
}
