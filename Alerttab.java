package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttab {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\docs\\saurabh_velocity\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().deleteAllCookies();
		w.manage().window().maximize();
		w.navigate().to("https://demoqa.com/alerts");

		w.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		w.switchTo().alert().accept();
		Thread.sleep(5000);
		System.out.println("First alert done");

		JavascriptExecutor js = ((JavascriptExecutor)w);
		js.executeScript("scroll(0,200)");
		WebElement ele = w.findElement(By.xpath("//button[@id='confirmButton']"));
		ele.click();
		Thread.sleep(5000);
		System.out.println("click done");
		String txt = w.switchTo().alert().getText();
		System.out.println("text = " + txt);
		Thread.sleep(5000);
		w.switchTo().alert().dismiss();

		WebElement ele2 = w.findElement(By.xpath("//button[@id='promtButton']"));
		ele2.click();
		//Thread.sleep(5000);
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		w.switchTo().alert().sendKeys("Automation Testing");
		w.switchTo().alert().accept();
		System.out.println("Third click done");
		Thread.sleep(5000);
		w.quit();
	}

}
