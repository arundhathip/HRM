package com.orangehrm.tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataprovidertest
	{
	    @DataProvider (name = "dptest")
	     public String[][] dataproviderMethod(){
		 return new String[][] {
			 {"Hello"}, 
			 {"Gowthami"},
			 {"How"},
			 {"are u"}
			 };
	     }
		
	    @Test (dataProvider = "dptest")
	    public void myTest (String val) {
	        System.out.println("Passed Parameter Is : " + val);
	    }
	    
	    @DataProvider (name = "dptest1")
	     public String[][] dataproviderMethod1(){
		 return new String[][] {
			 {"Hello","11"}, 
			 {"Gowthami","22"},
			 {"How","33"},
			 {"are u","44"}
			 };
	     }
		
	    @Test (dataProvider = "dptest1")
	    public void myTest (String val,String val1) {
	        System.out.println("Passed Parameters are  : " + val + " , " + val1);
	    }
	}


