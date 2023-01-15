package com.stc.jan2023;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class getData {
	@Test
	public void f() {
		try {
			File fileMy = new File(
					"E:\\SeleniumJan2023Other\\jan2023\\src\\test\\java\\com\\stc\\jan2023\\myT.properties");
			FileInputStream inStream = new FileInputStream(fileMy);
			Properties propFile = new Properties();
			propFile.load(inStream);
			System.out.println(propFile.getProperty("userName1"));
		} catch (Exception e) {
			System.out.println("Error Code :" + e.getMessage());
		}
	}
}
