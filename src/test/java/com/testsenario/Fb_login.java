package com.testsenario;

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
	public void f() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		sendkeysByAnyLocators(obj.fblogin_email_editbox, "abc@gmail.com");
		sendkeysByAnyLocators(obj.fblogin_pass_editbox, "abc@123");
         clickByAnyLocators(obj.fblogin_login_button);
		Thread.sleep(5000);
		driver.quit();
	}
}
