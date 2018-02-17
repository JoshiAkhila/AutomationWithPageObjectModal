package com.apex.ecommerce.register.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.register.constant.RegisterPageConstant;

import core.apex.ecommerce.core.ApexBasePage;

public class RegisterPage extends ApexBasePage implements RegisterPageConstant {

	@FindBy(xpath = ECOMMERCE_ACCOUNT_LOCATOR)
	private WebElement AccountBtn;

	@FindBy(className = SIGN_UP_LOCATOR)
	private WebElement SignUpBtn;

	@FindBy(css = GENDER_ID_LOCATOR)
	private WebElement GenderIDElm;

	@FindBy(id = FNAME_ID_LOCATOR)
	private WebElement FnameIdElm;

	@FindBy(id = LNAME_ID_LOACATOR)
	private WebElement LnameIdElm;

	@FindBy(id = DAY_ID_LOCATOR)
	private WebElement DayIdElm;

	@FindBy(id = MONTH_ID_LOCATOR)
	private WebElement MonthIdElm;

	@FindBy(id = YEAR_ID_LOCATOR)
	private WebElement YearIdElm;

	@FindBy(id = EMAIL_ID_LOCATOR)
	private WebElement EmailIdElm;

	@FindBy(id = HOUSE_NUM_ID_LOCATOR)
	private WebElement HouseIdElm;

	@FindBy(id = STREET_ID_LOCATOR)
	private WebElement StreetIdElm;

	@FindBy(id = TOWN_ID_LOCATOR)
	private WebElement TownIdElm;

	@FindBy(id = STATE_ID_LACATOR)
	private WebElement StateIdElm;

	@FindBy(id = COUNTRY_ID_LOCATOR)
	private WebElement CountryIdElm;

	@FindBy(id = POSTCODE_ID_LOCATOR)
	private WebElement PostCodeIdElm;

	@FindBy(id = PHONE_ID_LOCATOR)
	private WebElement PhoneIdElm;

	@FindBy(id = FAX_ID_LOCATOR)
	private WebElement FaxIdElm;

	@FindBy(id = PASSWORD_ID_LOCATOR)
	private WebElement passwordIdElm;

	@FindBy(id = CONFIRM_PASS_ID_LOCATOR)
	private WebElement CpassIdElm;

	@FindBy(id = TERMS_ID_LOCATOR)
	private WebElement TermIdBtn;

	@FindBy(name = SUBMIT_ID_LOCATOR)
	private WebElement SubIdBtn;

	public RegisterPage(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setFnameLocator(String Fname) {
		FnameIdElm.sendKeys(Fname);
	}

	public void setLnameLocator(String Lname) {
		LnameIdElm.sendKeys(Lname);
	}

	public void setDateIDLocator(String Date) {
		DayIdElm.sendKeys(Date);
	}

	public void setMonthIDLocator(String Month) {
		MonthIdElm.sendKeys(Month);
	}

	public void setYearIDLocator(String Year) {
		YearIdElm.sendKeys(Year);
	}

	public void setEmailIdLocator(String EmailID) {
		EmailIdElm.sendKeys(EmailID);
	}

	public void setHouseIDLocator(String HouseID) {
		HouseIdElm.sendKeys(HouseID);
	}

	public void setStreetIdLocator(String StreetID) {
		StreetIdElm.sendKeys(StreetID);
	}

	public void setTownIDLocator(String TownID) {
		TownIdElm.sendKeys(TownID);
	}

	public void setStateIDLocator(String StateID) {
		StateIdElm.sendKeys(StateID);
	}

	public void setCountryIDLocator(String CountryID) {
		CountryIdElm.sendKeys(CountryID);
	}

	public void setPostcodeIDLocator(String PostcodeID) {
		PostCodeIdElm.sendKeys(PostcodeID);
	}

	public void setPhoneIDLocator(String PhoneID) {
		PhoneIdElm.sendKeys(PhoneID);
	}

	public void setFaxIdLocator(String FaxId) {
		FaxIdElm.sendKeys(FaxId);
	}

	public void setPassIdLocator(String PassId) {
		passwordIdElm.sendKeys(PassId);
	}

	public void setCPasswordIdLocator(String CPasswordId) {
		CpassIdElm.sendKeys(CPasswordId);
	}

	public void RegistertoEcommerce(String Fname, String Lname, String Date, String Month, String Year, String EmailID,
			String HouseID, String StreetID, String TownID, String StateID, String CountryID, String PostcodeID,
			String PhoneID, String FaxId, String PassId, String CPasswordId) throws InterruptedException {
		AccountBtn.click();
		Thread.sleep(500);

		SignUpBtn.click();
		Thread.sleep(500);

		GenderIDElm.click();
		Thread.sleep(500);

		setFnameLocator(Fname);
		Thread.sleep(500);

		setLnameLocator(Lname);
		Thread.sleep(500);

		setDateIDLocator(Date);
		Thread.sleep(500);

		setMonthIDLocator(Month);
		Thread.sleep(500);

		setYearIDLocator(Year);
		Thread.sleep(500);

		setEmailIdLocator(EmailID);
		Thread.sleep(500);

		setHouseIDLocator(HouseID);
		Thread.sleep(500);

		setStreetIdLocator(StreetID);
		Thread.sleep(500);

		setTownIDLocator(TownID);
		Thread.sleep(500);

		setStateIDLocator(StateID);
		Thread.sleep(500);

		setCountryIDLocator(CountryID);
		Thread.sleep(500);

		setPostcodeIDLocator(PostcodeID);
		Thread.sleep(500);

		setPhoneIDLocator(PhoneID);
		Thread.sleep(500);

		setFaxIdLocator(FaxId);
		Thread.sleep(500);

		setPassIdLocator(PassId);
		Thread.sleep(500);

		setCPasswordIdLocator(CPasswordId);
		Thread.sleep(500);

		TermIdBtn.click();
		Thread.sleep(500);

		SubIdBtn.click();
		Thread.sleep(3000);
	}

	public String getPageMessage() {
		// TODO Auto-generated method stub
		return driver.findElement(By.className(REGISTER_MESSAGE_LOCATOR)).getText();
	}
}
