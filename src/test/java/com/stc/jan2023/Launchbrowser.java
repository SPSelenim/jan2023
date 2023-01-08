package com.stc.jan2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {
  @Test
  public void f() {
	  System.out.println("***************L A U N C H B R O W S E R **********************");
 try
 {
	 
 WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
			driver.get("E:\\SeleniumTraining1\\TestingWorld.html");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("link")).click();
			String aa = driver.findElement(By.xpath("//label")).getText();
			System.out.println(aa);
			  System.out.println("***************C L O S E B R O W S E R **********************");
			  System.out.println("***************2nd C L O S E B R O W S E R **********************");
			  driver.quit();
 }
 
 catch(Exception e)
 {
	 System.out.println("ERROR ::::"+e.getMessage());
 }
  }
}
