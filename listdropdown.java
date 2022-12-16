package com.generalPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listdropdown {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\docs\\saurabh_velocity\\setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver w = new ChromeDriver();
			w.manage().window().maximize();
			w.navigate().to("https://www.facebook.com/signup");
			WebElement day = w.findElement(By.xpath("//select[@id ='day']"));
			Select s1 = new Select(day);
			s1.selectByVisibleText("1");
			Thread.sleep(3000);
			WebElement month = w.findElement(By.xpath("//select[@id ='month']"));
			Select s2 = new Select(month);
			s2.selectByValue("4");
			Thread.sleep(3000);
			WebElement year = w.findElement(By.xpath("//select[@id ='year']"));
			Select s3 = new Select(year);
			s3.selectByIndex(30);
			Thread.sleep(3000);
			
			List<WebElement>options = s3.getOptions();
			int count = options.size();
			System.out.println("total option are present" + count);
			for(int i=0;i<count;i++) {
				String text = options.get(i).getText();
				System.out.println(text);	
			}
			Thread.sleep(3000);
			w.quit();	
			
		}
}
