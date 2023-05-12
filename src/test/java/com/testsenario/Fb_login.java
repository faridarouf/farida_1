package com.testsenario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.commonfunctions;

public class Fb_login extends commonfunctions {

	Locators obj = new Locators();

	@Test
	public void f() throws InterruptedException, Exception {
	Properties p = new Properties();	
	FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\QAtestdata.properties");
	 p.load(fi);
	
	
		driver = new ChromeDriver();
		driver.get(p.getProperty("Fb_URL"));
		sendkeysByAnyLocators(obj.fblogin_email_editbox, p.getProperty("Fb_email"));
		sendkeysByAnyLocators(obj.fblogin_pass_editbox, p.getProperty("Fb_password"));
         clickByAnyLocators(obj.fblogin_login_button);
		Thread.sleep(5000);
		driver.quit();
	}
}
