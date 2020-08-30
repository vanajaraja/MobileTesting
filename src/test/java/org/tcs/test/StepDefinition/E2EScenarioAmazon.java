package org.tcs.test.StepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.tcs.test.BaseClass.BaseClass;
import org.tcs.test.BaseClass.PojoClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class E2EScenarioAmazon extends BaseClass {

	@Given("user should be in Amazon home page")
	public void user_should_be_in_Amazon_home_page() throws IOException {
		launchApp("in.amazon.mShop.android.shopping", "com.amazon.mShop.home.HomeActivity",
				"http://0.0.0.0:4723/wd/hub");

	}

	
	@When("search a product and click on buy now")
	public void search_a_product_and_click_on_buy_now(io.cucumber.datatable.DataTable dataTable) {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		PojoClass pc = new PojoClass();
		btnClick(pc.getBtnContinue());
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		pc.getSearchTextBox().sendKeys(dataTable.asList().get(0));
		pressEnter();
		TouchAction acc = new TouchAction(driver);
		acc.press(PointOption.point(200,200)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		.moveTo(PointOption.point(200, 800)).release().perform();
		
	
			closeApp();}


	@Then("user should be navigated to payment page")
	public void user_should_be_navigated_to_payment_page() {
		Assert.assertTrue("Testcase Passed", (getTitle().equals("Payment")));
	}

}
