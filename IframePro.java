package com.generalPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePro {

	public static void main(String[] args) throws InterruptedException {
			WebDriver d = new ChromeDriver();
			d.get("https://www.rediff.com/");
			
			//d.switchTo().frame("moneyiframe");
			d.switchTo().frame(0);
			//d.switchTo().frame(d.findElement(By.xpath("//span[@id = 'nseindex']")));
			
			String nse = d.findElement(By.xpath("//span[@id = 'nseindex']")).getText();
			Thread.sleep(3000);
			System.out.println(nse);
			
			//d.switchTo().defaultContent();
			d.switchTo().parentFrame();
			d.findElement(By.xpath("//a[text() = 'SPORTS']")).click();
			
			d.quit();
	}

}
