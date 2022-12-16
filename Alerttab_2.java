package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttab_2 {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().deleteAllCookies();
		w.manage().window().maximize();
		w.navigate().to("https://demoqa.com/alerts");
		
		WebElement ele2 = w.findElement(By.xpath("//button[@id='promtButton']"));
		ele2.click();
		//Thread.sleep(5000);
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		w.switchTo().alert().sendKeys("Automation Testing");
		w.switchTo().alert().accept();
		
		
	}

}
