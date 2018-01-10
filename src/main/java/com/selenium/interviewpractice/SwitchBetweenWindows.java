package com.selenium.interviewpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchBetweenWindows {
	
	public static void main(String[]args) {
		

		System.setProperty("webdriver.chrome.driver", "resources/executables/chrome/chromedriver_mac64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--kiosk");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> windows = handles.iterator();
//		System.out.println(windows.toString());
		while(windows.hasNext())
		{
			String child_window = windows.next();
			
			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window title = "+driver.getTitle());
		
	}

}
