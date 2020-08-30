package org.tcs.test.BaseClass;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PojoClass extends BaseClass{
	
	public PojoClass() {
		PageFactory.initElements( new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy (id ="in.amazon.mShop.android.shopping:id/sso_continue")
	private MobileElement btnContinue;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement searchTextBox;

	/*@AndroidFindBy (id ="in.amazon.mShop.android.shopping:id/sso_continue")
	private MobileElement*/ 
	
	public MobileElement getBtnContinue() {
		return btnContinue;
	}

	public void setBtnContinue(MobileElement btnContinue) {
		this.btnContinue = btnContinue;
	}
	
	
	
	public MobileElement getSearchTextBox() {
		return searchTextBox;
	}

	public void setSearchTextBox(MobileElement searchTextBox) {
		this.searchTextBox = searchTextBox;
	}
	
	
}
