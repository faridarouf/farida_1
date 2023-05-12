package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class commonfunctions {

	public WebDriver driver;

	public void ChromebrowserLaunch() {
		driver = new ChromeDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("Chrome browser will maximize");

	}

	public void EdgebrowserLaunch() {
		driver = new EdgeDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("Edge browser will maximize");

	}

	public void FirefoxbrowserLaunch() {
		driver = new FirefoxDriver();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		System.out.println("Firefox browser will maximize");

	}

	public void HeadlessbrowserLaunch() {
		driver = new HtmlUnitDriver();
		System.out.println("Headless browser is Launched");
	}

//Reusable methods for Sendkeys.
	public void sendkeysByAnyLocators(By Locators, String inputdata) {
		WebElement element = driver.findElement(Locators);
		// check your locator Id displayed?
		if (driver.findElements(Locators).size() > 0) {
			// check your element is enable state?
			if (element.isEnabled()) {
				System.out.println("given locators is enable state");
				// clear any existing data.
				element.clear();
				// send test data to edit box.
				element.sendKeys(inputdata);
			} else {
				System.out.println("given locator is not enable state on DOM");
			}
		} else {
			System.out.println("given locator is not displayed on DOM");
		}
	}

	public void clickByAnyLocators(By Locators) {
		WebElement element = driver.findElement(Locators);
		// check your locator Id displayed?
		if (driver.findElements(Locators).size() > 0) {
			// check your element is enable state?
			if (element.isEnabled()) {
				System.out.println("given locators is enable state");
				// clear any existing data.
				element.click();

			} else {
				System.out.println("given locator is not enable state on DOM");
			}
		} else {
			System.out.println("given locator is not displayed on DOM");
		}

	}
}
