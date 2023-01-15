package com.stc.jan2023;

import org.testng.annotations.Test;

public class Invocation {
  public static int numCount=1;
	@Test (invocationCount=5)
  public void f() {
  
	  System.out.println("Invocation ...." + numCount);
	  numCount=numCount+1;  
	 
  }
  
}
