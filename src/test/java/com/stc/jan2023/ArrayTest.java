package com.stc.jan2023;

import org.testng.annotations.Test;

import java.util.Scanner;


public class ArrayTest {
  
	@Test()
  public void f() {
  String []strTest=new String[3];
  Scanner s1=new Scanner(System.in);


System.out.println("Please Enter some data ");
for(int numCount=0;numCount<strTest.length;numCount++)
{
	  String aa=  s1.nextLine();
	  strTest[numCount]=aa;
}

for(int numCount=0;numCount<strTest.length;numCount++)
{
	System.out.println("O U T P U T *******************************");
	System.out.println(strTest[numCount]);
}
  
  }
  

  
}
