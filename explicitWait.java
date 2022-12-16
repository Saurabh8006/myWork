package com.generalPractice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	//Explicit wait = waiting time + condition
	public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\docs\\saurabh_velocity\\SOFTWARE\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver t = new ChromeDriver();
			//step-1 Creation of WebdriverWait Objeect
			WebDriverWait w = new WebDriverWait(t,Duration.ofSeconds(10));
			t.manage().deleteAllCookies();
			t.manage().window().maximize();
			t.navigate().to("https://paytm.com/recharge");
			//step-2 checking the specific condition of specific webelement
			//until method
		//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		/*	WebElement dth;
			dth = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'DTH']")));
			dth.click();
			Thread.sleep(7000);
			t.quit();
			*/
			//Fluent Wait = Waiting + condition + Frequency	
			Wait q = new FluentWait(t)
			.withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(4))
			.ignoring(NoSuchElementException.class);
			WebElement dth1;
			dth1 = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'DTH']")));
			dth1.click();
			//Thread.sleep(7000);
			t.quit();		
	}
/*
	private static FluentWait<WebDriver> withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
