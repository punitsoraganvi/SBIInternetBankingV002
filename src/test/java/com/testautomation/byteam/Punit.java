package com.testautomation.byteam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Punit {
@Test(priority=-2)
public void tc1() {
	System.out.println("Hi Team members, ");
	System.out.println("Good morning, write program by creating the new class or test case");
	System.out.println("class name must be your name...... and don't use the priority and dependsonmethods");
}

@Test(priority=-1)
public void tc2() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://punitsoraganvi.github.io/bagalakote/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.quit();
	
	
}
}
