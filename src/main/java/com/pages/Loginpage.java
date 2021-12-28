package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Loginpage extends Testbase {

	@FindBy(xpath="//input [@id='txtUsername']")
	 WebElement username;//declare them as private
	@FindBy(xpath = "//input[@id='txtPassword']")
	 WebElement password;
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement login;
	
	public Loginpage()
	{
		PageFactory.initElements(driver,this);
	}
public  void login(String uname,String pwd)
{
	username.sendKeys(uname);
	password.sendKeys(pwd);
	login.click();
}
}
