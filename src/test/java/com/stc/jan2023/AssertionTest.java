package com.stc.jan2023;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest {
  @Test
  public void f() {
	  WebDriver driver=null;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
			driver.get("E:\\SeleniumTraining1\\TestingWorld.html");
			driver.manage().window().maximize();
			String strText=driver.findElement(By.xpath("//label[contains(text(),'Automation')]")).getText();
			boolean blnFlag=driver.findElement(By.xpath("//label[contains(text(),'Automation')]")).isDisplayed();
			System.out.println(blnFlag);
			System.out.println(strText);
		//Assert.assertEquals(blnFlag,false,"Label Exists");
		SoftAssert SA=new SoftAssert();
		SA.assertEquals(blnFlag,false,"Label Exists");
			System.out.println("DONE");
			driver.quit();
			SA.assertAll();
			
  }
}
