package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Loginpage;

public class Testcaseorange extends Testbase {
Loginpage lpi;

@BeforeClass
public void setup()
{
	initialisation();
	lpi=new Loginpage();
	
}

@Test
public void Loginpagetest()
{
	lpi.login(prop.getProperty("username"),prop.getProperty("password"));
	
}
@AfterClass

public void closesetup()
{
	teardown();
}

}
