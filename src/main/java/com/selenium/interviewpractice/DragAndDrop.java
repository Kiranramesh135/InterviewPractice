package com.selenium.interviewpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		
		try {
			

			
			System.setProperty("webdriver.chrome.driver", "resources/executables/chrome/chromedriver_mac64/chromedriver");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--kiosk");
			WebDriver driver = new ChromeDriver(options);
			
			String URL  = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
			driver.get(URL);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("scroll(0,900);");
			
			Thread.sleep(5000);
			 
//			WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
			
			WebElement From = driver.findElement(By.xpath("(//span[contains(text(),'Thriller')])[1]"));

//			WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
			
			WebElement To = driver.findElement(By.xpath("(//span[contains(text(),'Bestsellers')])[2]"));
			
			Actions actions = new Actions(driver);
			
//			Thread.sleep(5000);
			
			actions.moveToElement(From).perform();
			
			actions.dragAndDrop(From, To).build().perform();
			
//			Actions builder = new Actions(driver);
	
//			Action dragAndDrop = builder.clickAndHold(From)
	
//			.moveToElement(To)
	
//			.release(To)
	
//			.build();
	
//			dragAndDrop.perform();
			
			Thread.sleep(10000);
			
			driver.quit();
			
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
