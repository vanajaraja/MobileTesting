package org.tcs.test.BaseClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	
	public static AndroidDriver<MobileElement> driver;
	
	public static void launchApp(String appPackage,String appActivity,  String url) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy S10+");
		dc.setCapability("platformName", "Andriod");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("appPackage", appPackage);
		dc.setCapability("appActivity", appActivity);
		driver = new AndroidDriver<MobileElement>(new URL(url), dc);

	}
	
	public static void btnClick(MobileElement m) {
		m.click();
	}
	
	public static void insertText(MobileElement m, String text) {
		m.sendKeys(text);
	}
	
	public static void scrolldown() {
		/*Dimension size = driver.manage().window().getSize();
		Double s1 =(size.getHeight() )* 0.5;
		Double e1 =(size.getHeight() )* 0.2;
		int start = s1.intValue();
		int end = e1.intValue();*/
		
		TouchAction acc = new TouchAction(driver);
		acc.press(PointOption.point(849,300)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		.moveTo(PointOption.point(715, 787)).release().perform();
		
		
	}
	
	public static void takeScreenshot() throws IOException{
		
		TakesScreenshot ts =(TakesScreenshot) driver ;
		File sceen = ts.getScreenshotAs(OutputType.FILE);
		File fdes = new File("C:\\Users\\RAJAPPA\\Desktop\\JavaPractise\\TempScreens");
		fdes.mkdir();
		FileUtils.copyFileToDirectory(sceen, fdes);
	}
	
	public static void pressEnter() {
		KeyEvent k = new KeyEvent(AndroidKey.ENTER);
		driver.pressKey(k);
				
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
			
	}
	public static void closeApp() {
		driver.quit();

	}
}

