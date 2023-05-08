package com.testsenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.objectrepository.Locators;

public class Fb_login {
	WebDriver driver;
	Locators obj = new Locators();
@BeforeTest	
public void apple() {
driver=new ChromeDriver();	
driver.get("https://www.facebook.com/");	
	
}

	
	
	
  @Test
  public void f() throws InterruptedException {
driver.findElement(obj.fblogin_email_editbox).sendKeys("abc1234@gmail.com");	  
Thread.sleep(5000);
driver.findElement(obj.fblogin_pass_editbox).sendKeys("Abcd@123");
Thread.sleep(5000);
driver.findElement(obj.fblogin_login_button).click();

Thread.sleep(5000);
driver.quit();
  }
}
