package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISSelected {

	public static void main(String[] args) throws InterruptedException {
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\docs\\saurabh_velocity\\setup\\chromedriver_win32\\chromedriver.exe");
			WebDriver k = new ChromeDriver();
			k.manage().deleteAllCookies();
			k.manage().window().maximize();
			k.navigate().to("https://paytm.com/recharge");
			k.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement radio = k.findElement(By.xpath("//input[@id ='radio1']"));
			boolean result = radio.isSelected();
			
			if(result == false) {
				System.out.println("Radio Button is verified and result is " + result);
			}
			else {
				System.out.println("radio button is not verified and result is " +  result);
			}
			Thread.sleep(2000);
			k.quit();
	}

}
