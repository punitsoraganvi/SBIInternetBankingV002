package com.testautomation.byteam;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sravani {
	WebDriver driver;
	@Test(priority = 0)
	public void display() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("executed");
	}
	@Test(priority = 1)
	public void write() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	

}
