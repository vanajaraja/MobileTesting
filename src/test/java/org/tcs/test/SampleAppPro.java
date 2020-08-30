package org.tcs.test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.tcs.test.BaseClass.BaseClass;
import org.tcs.test.BaseClass.PojoClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class SampleAppPro extends BaseClass {
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		
		launchApp("in.amazon.mShop.android.shopping", "com.amazon.mShop.home.HomeActivity", "http://0.0.0.0:4723/wd/hub");
		
		Thread.sleep(5000);
		
		PojoClass pc = new PojoClass();
		btnClick(pc.getBtnContinue()); 
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		pc.getSearchTextBox().sendKeys("Apple iPhone 11 ");
		
		Thread.sleep(5000);
		pressEnter();
		
		MobileElement proSearch = driver.findElement(By.xpath("//*[@text='Apple iPhone 11 (64GB) - White']"));
		btnClick(proSearch);
		scrolldown();
					
		MobileElement proAddToCart = driver.findElement(By.xpath("//*[@resource-id='add-to-cart-button']"));
		btnClick(proAddToCart);
		
		
		closeApp();
		
	}

}
