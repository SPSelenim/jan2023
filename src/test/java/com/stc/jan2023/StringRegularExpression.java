package com.stc.jan2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class StringRegularExpression {
  @Test
  public void f() {
  String str="Hello Datish";
  
  String[]split=str.split(" ");
  System.out.println(split[1]);
  char achr=split[1].charAt(0);
  
  try
  {
Pattern ptnTest = Pattern.compile("[A-Z]");
Matcher matcher=ptnTest.matcher(Character.toString(achr));
boolean aa=matcher.matches();
  System.out.println(aa +"::::");
  System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
  }
  catch(Exception e)
  {
	  System.out.println(e.getMessage());
  }
  }

  
}
