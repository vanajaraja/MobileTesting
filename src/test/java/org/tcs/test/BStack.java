package org.tcs.test;

import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tcs.test.BaseClass.BaseClass;
import org.tcs.test.BaseClass.PojoClass;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class BStack extends BaseClass{
  
  public static String userName = "vanajasadasivam1";
  public static String accessKey = "S9ZSM9qxx432Q94L7xGT";

  public static void main(String args[]) throws MalformedURLException, InterruptedException {
    DesiredCapabilities caps = new DesiredCapabilities();

    caps.setCapability("device", "Google Pixel 3");
    caps.setCapability("name", "Bstack-[Java] Sample Test");
    caps.setCapability("app", "bs://8a7e556fb43c890abf37fffc987b8e314183700d");

    
    caps.setCapability("os_version", "9.0");
    caps.setCapability("project", "My First Project");
    caps.setCapability("build", "My First Build");
    
    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	PojoClass pc = new PojoClass();
	btnClick(pc.getBtnContinue());
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	pc.getSearchTextBox().sendKeys("iphone");
	pressEnter();
	TouchAction acc = new TouchAction(driver);
	acc.press(PointOption.point(200,200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
	.moveTo(PointOption.point(200, 800)).release().perform();
	
    driver.quit();
  }
}