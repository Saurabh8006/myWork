package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver3 {

	public static void main(String[] args) throws Exception
	{

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement co = d.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions act = new Actions(d);
		act.contextClick(co).perform();

		WebElement q = d.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-quit']//span"));
		act.click(q).perform();
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		d.quit();

	}

}
