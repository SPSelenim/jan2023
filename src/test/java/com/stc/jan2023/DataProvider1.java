package com.stc.jan2023;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
  
@Test(dataProvider="dataProvider1")
  public void f(String str1,String str2,String str3) {
	System.out.println("---------D A T A P R O V I D E R -----");
	System.out.println(str1+str2+str3);
  
}

  @DataProvider
  public String[][] dataProvider1(){
	  String [][] strEmp=new String[2][3];
	strEmp[0][0]="One";
	strEmp[0][1]="One**1";
	strEmp[0][2]="One**2";

	strEmp[1][0]="Two";
	strEmp[1][1]="Two**1";
	strEmp[1][2]="Two**2";
	
	
	  return strEmp;

  }

}
