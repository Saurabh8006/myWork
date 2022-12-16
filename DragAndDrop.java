package com.generalPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://jqueryui.com/droppable/");
		//d.get("https://jqueryui.com/draggable/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.switchTo().frame(0);

	//	WebElement drag = d.findElement(By.xpath("//div[@id='draggable']//p"));
		WebElement drag = d.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = d.findElement(By.xpath("//div[@id='droppable']"));

		Actions a = new Actions(d);
		a.contextClick(drag).perform();
		Thread.sleep(3000);
		a.clickAndHold(drag).moveToElement(drop).build().perform();
		//	a.dragAndDrop(drag, drop).perform();
		//a.dragAndDropBy(drag, 250, 200).perform();
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.quit();
	}
}
