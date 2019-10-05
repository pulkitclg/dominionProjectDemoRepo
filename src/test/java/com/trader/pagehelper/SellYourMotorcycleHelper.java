package com.trader.pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.trader.locators.Locator;
import com.trader.utils.DriverHelper;

/**
 * ==============================================================================
 * 
 * @author viveks
 * 
 *         This helper file contains the all methods related to Sell Your
 *         Motorcycle page.
 *         ================================================================================
 */
public class SellYourMotorcycleHelper extends DriverHelper {
	protected WebDriver driver;

	public SellYourMotorcycleHelper(WebDriver driver) {
		super(driver, getSoftAssert());
	}

	/**
	 * ======================================================================================
	 * Click On Sell For Free Menu And Assert Result Page.
	 * ======================================================================================
	 */
	public void clickOnSellForFreeMenuAndAssertResultPage() {
		print("Click On Sell For Free Menu And Assert Result Page");
		locator = Locator.Menus.Sell_For_Free.value;
		WaitForElementPresent(locator, 20);
		// print(getText(locator));
		// Assert.assertTrue(isElementDisplayed(locator));
		// getWebDriver().findElement(ByLocator(locator)).click();
		clickOn(locator);
		print("Click on Sell Motorcycle button");
		waitForElementPresentInDom(1);
		WaitForElementPresent(Locator.Sell.Sell_Your_Motorcycle.value, 20);
		clickOn(Locator.Sell.Sell_Your_Motorcycle.value);
		WaitForElementPresent(Locator.Sell.Sell_Your_Motocycle_Page.value, 20);
		Assert.assertTrue(isElementPresent(Locator.Sell.Sell_Your_Motocycle_Page.value));
	}

	/**
	 * ======================================================================================
	 * Click on Select Free button.
	 * ======================================================================================
	 */
	public void clickOnSelectFreeButton() {
		print("Click on Select Free button");
		locator = Locator.Sell.Select_Free_Button.value;
		clickOn(locator);
	}

	/**
	 * =====================================================================================
	 * Click on Select Enhanced button.
	 * =====================================================================================
	 */
	public void clickOnSelectEnhancedButton() {
		print("Click on Select Enhanced button");
		locator = Locator.Sell.Select_Enhanced_Button.value;
		clickOn(locator);
	}

	/**
	 * =========================================================================================
	 * Click on Select Best button.
	 * =========================================================================================
	 */
	public void clickOnSelectBestButton() {
		print("Click on Select Best button");
		locator = Locator.Sell.Select_Best_Button.value;
		clickOn(locator);
	}

	/**
	 * ==========================================================================================
	 * Assert Enter Vehicle Info Tab.
	 * ==========================================================================================
	 */
	public void assertSellpage() {
		print("Assert Enter Vehicle Info Tab");
		locator = Locator.Sell.Enter_Vehicle_Info.value;
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * ======================================================================================
	 * Select Listing Year from Year drop down.
	 * ======================================================================================
	 */
	public void selectListingYear() {
		print("Select Listing Year from Year drop down");
		String listingYear = propertyReader.readApplicationFile("Year");
		locator = Locator.Sell.Select_Year.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingYear);
	}

	/**
	 * ======================================================================================
	 * Select Motorcycle Class in Class drop down.
	 * ======================================================================================
	 */
	public void selectMotorCycleClass() {
		print("Select Motorcycle Class in Class drop down");
		String motorcycleClass = propertyReader.readApplicationFile("MotocycleClass");
		locator = Locator.Sell.Select_Class.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, motorcycleClass);
	}

	/**
	 * ===================================================================================
	 * Select listing Make from Make drop down.
	 * ===================================================================================
	 */
	public void selectListingMake() {
		print("Select listing Make from Make drop down");
		String listingMake = propertyReader.readApplicationFile("Make");
		locator = Locator.Sell.Select_Make.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingMake);
	}

	/**
	 * ===================================================================================
	 * Select listing Model from Model drop down.
	 * ===================================================================================
	 */
	public void selectListingModel() {
		print("Select listing Model from Model drop down");
		waitForElementPresentInDom(2);
		String listingMake = propertyReader.readApplicationFile("Model");
		locator = Locator.Sell.Select_Model.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingMake);
	}

	/**
	 * ===============================================================================
	 * Select listing Trim from Trim drop down.
	 * ===============================================================================
	 */
	public void selectListingTrim() {
		print("Select listing Trim from Trim drop down");
		waitForElementPresentInDom(2);
		String listingMake = propertyReader.readApplicationFile("Trim");
		locator = Locator.Sell.Select_Trim.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingMake);
	}

	/**
	 * ===============================================================================
	 * Enter listing Price in Price field.
	 * ===============================================================================
	 */
	public void enterListingPrice() {
		print("Enter listing Price in Price field");
		waitForElementPresentInDom(1);
		String listingPrice = propertyReader.readApplicationFile("Price");
		locator = Locator.Sell.Enter_Price.value;
		// clickOn(locator);
		// this.waitForStepsvalidator();
		sendKeys(locator, listingPrice);
	}

	/**
	 * ================================================================================
	 * Select listing Price Tagline from Price Tagline drop down.
	 * ================================================================================
	 */
	public void selectListingPriceTagline() {
		print("Select listing Price Tagline from Price Tagline drop down");
		String listingTagline = propertyReader.readApplicationFile("Tagline");
		locator = Locator.Sell.Price_Tagline.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, listingTagline);
	}

	/**
	 * ============================================================================
	 * Enter listing message in Message field.
	 * ============================================================================
	 */
	public void enterListingMessage() {
		print("Enter listing message in Message field");
		waitForElementPresentInDom(1);
		getWebDriver().switchTo().frame("description_ifr");
		WebElement element = getWebDriver().findElement(By.id("tinymce"));
		System.out.println("Entering something in text input");
		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys("Test text");
		getWebDriver().switchTo().defaultContent();
		//switchToFrame(Locator.Sell.Message_iFrame.value);
//		String listingMessage = propertyReader.readApplicationFile("Message");
//		locator = Locator.Sell.Enter_Message.value;
//		clickOn(locator);
//		sendKeys(locator, listingMessage);
	}

	/**
	 * ============================================================================
	 * Select listing Category from Category drop down.
	 * ============================================================================
	 */
	public void selectListingCategory() {
		print("Select listing Category from Category drop down");
		String listingcat = propertyReader.readApplicationFile("Category");
		locator = Locator.Sell.Select_Category.value;
		// clickOn(locator);
		selectDropDownByVisibleText(locator, listingcat);
	}

	// public void waitForStepsvalidator() {
	// print("Step Validator still shown");
	// locator = Locator.Sell.Step_Validator.value;
	// WaitForElementNotVisible(locator, 40);
	// }

	/**
	 * =================================================================================
	 * Click On Enter Your Contact Info Tab.
	 * =================================================================================
	 */
	public void clickOnEnterYourContactInfoTab() {
		print("Click On Enter Your Contact Info Tab");
		locator = Locator.Sell.Enter_Your_Contact_Info.value;
		waitForElementPresentInDom(1);
		clickOn(locator);
	}

	/**
	 * ===================================================================================
	 * Enter First Name and Last Name.
	 * ===================================================================================
	 */
	public void enterFirstNameAndLastName() {
		print("Enter First Name and Last Name");
		locator = Locator.Sell.Enter_FirstName.value;
		waitForElementPresentInDom(1);
		sendKeys(locator, "Vivek");
		String Lname_locator = Locator.Sell.Enter_LastName.value;
		sendKeys(Lname_locator, "Sharma");
	}

	/**
	 * =================================================================================
	 * Enter contact address in Address field.
	 * =================================================================================
	 */
	public void enterContactAddress() {
		print("Enter Contact Address");
		String address = propertyReader.readApplicationFile("Address");
		waitForElementPresentInDom(1);
		locator = Locator.Sell.Enter_Address.value;
		sendKeys(locator, address);
	}

	/**
	 * ===================================================================================
	 * Enter City in City field.
	 * ===================================================================================
	 */
	public void enterContactCity() {
		print("Enter Contact City");
		String city = propertyReader.readApplicationFile("City");
		waitForElementPresentInDom(1);
		locator = Locator.Sell.Enter_City.value;
		sendKeys(locator, city);
	}

	/**
	 * ============================================================================
	 * Enter Phone Number in phone number field.
	 * ============================================================================
	 */
	public void enterContactPhoneNumber() {
		print("Enter Contact Phone Number");
		String phoneNumber = propertyReader.readApplicationFile("PhoneNumber");
		waitForElementPresentInDom(1);
		locator = Locator.Sell.Enter_Phone_Number.value;
		sendKeys(locator, phoneNumber);
	}

	/**
	 * ==========================================================================
	 * Enter Zip code in Zip code field.
	 * ==========================================================================
	 */
	public void enterContactZipCode() {
		print("Enter Contact Zip Code");
		String zipCode = propertyReader.readApplicationFile("ListingZipCode");
		waitForElementPresentInDom(1);
		locator = Locator.Sell.Enter_ZipCode.value;
		sendKeys(locator, zipCode);
	}

	/**
	 * ========================================================================
	 * Select State in State drop down.
	 * ========================================================================
	 */
	public void selectContactState() {
		print("Select Contact State");
		String state = propertyReader.readApplicationFile("State");
		waitForElementPresentInDom(1);
		locator = Locator.Sell.Select_State.value;
		selectDropDownByVisibleText(locator, state);
	}

	/**
	 * ======================================================================
	 * Click on checkout button.
	 * ======================================================================
	 */
	public void clickOnCheckoutButton() {
		print("Click on Checkout button");
		locator = Locator.Sell.Checkout_Button.value;
		waitForElementPresentInDom(1);
		clickOn(locator);
	}

	/**
	 * =================================================================================
	 * Enter coupon code and click on Apply coupon code.
	 * =================================================================================
	 */
	public void enterCouponCodeAndClickOnApplyButton() {
		print("Enter Coupon code");
		locator = Locator.Sell.CouponCode_Field.value;
		String couponCode = propertyReader.readApplicationFile("CouponCode");
		sendKeys(locator, couponCode);
		print("Click on Apply coupon code button");
		String ApplyCouponCode_locator = Locator.Sell.Apply_Coupon_Code.value;
		clickOn(ApplyCouponCode_locator);
		waitForElementPresentInDom(1);
	}

	/**
	 * ===============================================================================
	 * Assert Sell A Motorcycle Page.
	 * ===============================================================================
	 */
	public void assertSellAMotorcyclePage() {
		print("Assert Sell A Motorcycle Page");
		locator = Locator.Sell.Sell_Your_Motocycle_Page.value;
		WaitForElementPresent(locator, 30);
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * ===========================================================================================
	 * Assert posted Ad Confirmation Page.
	 * ===========================================================================================
	 */
	public void assertListingConfirmationPage() {
		print("Assert Listing Confirmation Page");
		waitForElementPresentInDom(2);
		locator = Locator.Sell.Listing_Confirmation.value;
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * ========================================================================================
	 * This method is for fill ad details and post the Free Package Ad.
	 * ========================================================================================
	 */
	public void fillListingDetailsForFreePackage() {
		this.clickOnSelectFreeButton();
		this.assertSellpage();
		this.selectMotorCycleClass();
		this.selectListingYear();
		this.selectListingMake();
		this.selectListingModel();
		this.selectListingTrim();
		this.enterListingPrice();
		this.selectListingPriceTagline();
		this.selectListingCategory();
		this.enterListingMessage();
		this.clickOnEnterYourContactInfoTab();
		this.enterFirstNameAndLastName();
		this.enterContactAddress();
		this.enterContactCity();
		this.selectContactState();
		this.enterContactZipCode();
		this.enterContactPhoneNumber();
		this.clickOnCheckoutButton();
	}

	/**
	 * =======================================================================================
	 * This method is for fill ad details and post the Enhanced Package Ad.
	 * =======================================================================================
	 */
	public void fillListingDetailsForEnhancedPackage() {
		this.clickOnSelectEnhancedButton();
		this.assertSellpage();
		this.selectMotorCycleClass();
		this.selectListingYear();
		this.selectListingMake();
		this.selectListingModel();
		this.selectListingTrim();
		this.enterListingPrice();
		this.selectListingPriceTagline();
		this.selectListingCategory();
		this.enterListingMessage();
		this.clickOnEnterYourContactInfoTab();
		this.enterFirstNameAndLastName();
		this.enterContactAddress();
		this.enterContactCity();
		this.selectContactState();
		this.enterContactZipCode();
		this.enterContactPhoneNumber();
		this.enterCouponCodeAndClickOnApplyButton();
		this.clickOnCheckoutButton();
	}

	/**
	 * ==============================================================================
	 * This method is for fill ad details and post the Best Package Ad.
	 * ==============================================================================
	 */
	public void fillListingDetailsForBestPackage() {
		this.clickOnSelectBestButton();
		this.assertSellpage();
		this.selectMotorCycleClass();
		this.selectListingYear();
		this.selectListingMake();
		this.selectListingModel();
		this.selectListingTrim();
		this.enterListingPrice();
		this.selectListingPriceTagline();
		this.selectListingCategory();
		this.enterListingMessage();
		this.clickOnEnterYourContactInfoTab();
		this.enterFirstNameAndLastName();
		this.enterContactAddress();
		this.enterContactCity();
		this.selectContactState();
		this.enterContactZipCode();
		this.enterContactPhoneNumber();
		this.enterCouponCodeAndClickOnApplyButton();
		this.clickOnCheckoutButton();
	}

	/**
	 * =========================================================================
	 * Click On Save Changes Button.
	 * =========================================================================
	 */
	public void clickOnSaveChangesButton() {
		print("Click On Save Changes Button.");
		isElementPresent(Locator.Sell.Save_Changes.value);
		sendKeys(Locator.Sell.Enter_Price.value, getRandomNumber(5));
		print("Saved Changes Button present");
		clickOn(Locator.Sell.Enter_Your_Contact_Info.value);
		waitForElementPresentInDom(1);
		clickOn(Locator.Sell.Save_Changes.value);
		waitForElementPresentInDom(1);
		clickOn(Locator.Sell.Ok_Button.value);
	}
	
	/**
	 * ======================================================================================
	 * Click On Sell For Free Menu And Assert All Buttons And Link On Drop Down.
	 * ======================================================================================
	 */
	public void clickOnSellForFreeMenuAndAssertAllButtonsAndLinkOnDropDown() {
		print("Click On Sell For Free Menu And Assert All Buttons And Link On Drop Down.");
		clickOn( Locator.Menus.Sell_For_Free.value);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isTextPresent(Locator.Sell.Sell_Your_Motorcycle.value, "Sell Your Motorcycle"));
		Assert.assertTrue(isTextPresent(Locator.Sell.Edit_Your_Listings_Button.value, "Edit Your Listing"));
		Assert.assertTrue(isElementPresent(Locator.Sell.Close_Button.value));
	}
	
	/**
	 * ======================================================================================================
	 * Assert Package Section And All Buttons at Sell your motorcycle fast, free & secure page.
	 * ======================================================================================================
	 */
	public void assertPackageSectionAndAllButtons() {
		print("Assert Package Section And All Buttons at Sell your motorcycle fast, free & secure page.");
		Assert.assertTrue(isElementPresent(Locator.Sell.Packages_Section.value),"View Our Package Options section");
		Assert.assertTrue(isTextPresent(Locator.Sell.Select_Free_Button.value, "Select Free"));
		Assert.assertTrue(isTextPresent(Locator.Sell.Select_Best_Button.value, "Select Best"));
		Assert.assertTrue(isTextPresent(Locator.Sell.Select_Enhanced_Button.value, "Select Enhanced"));
	}
	
	/**
	 * ======================================================================================================
	 * Assert Testimonials Section Below Packages Section.
	 * ======================================================================================================
	 */
	public void assertTestimonialsSectionBelowPackagesSection() {
		print("Assert Testimonials Section Below Packages Section.");
		Assert.assertTrue(isElementPresent(Locator.Sell.Testimonials_Heading.value));
		Assert.assertTrue(isTextPresent(Locator.Sell.Read_Customer_Reviews_Button.value, "Read More Customer Reviews"));
	}
	
	/**
	 * =========================================================================================================
	 * Click On Read More Customer Reviews And Assert Testimonials Page.
	 * =========================================================================================================
	 */
	public void clickOnReadMoreCustomerReviewsAndAssertResultPage() {
		print("Click On Read More Customer Reviews And Assert Testimonials Page.");
		clickOn(Locator.Sell.Read_Customer_Reviews_Button.value);
		Assert.assertTrue(isTextPresent(Locator.Sell.Testimonials_Page.value, "Sold our motorcycle super quick and we're very happy!"));
	}
	
	/**
	 * ===========================================================================================================
	 * Assert All Sections, Links, And Buttons On Create Listings Page.
	 * ===========================================================================================================
	 */
	public void assertAllSectionsLinksAndButtonsOnCreateListingsPage() {
		print("Assert All Sections, Links, And Buttons On Create Listings Page.");
		Assert.assertTrue(isElementPresent(Locator.Sell.Enter_Vehicle_Info.value));
		Assert.assertTrue(isElementPresent(Locator.Sell.Add_Photo_Video.value));
		Assert.assertTrue(isElementPresent(Locator.Sell.Enter_Your_Contact_Info.value));
		Assert.assertTrue(isTextPresent(Locator.Sell.Your_Listing_Summary.value, "Your Listing Summary"));
		Assert.assertTrue(isElementPresent(Locator.Sell.Checkout_Button.value), "Checkout Button");
		Assert.assertTrue(isElementPresent(Locator.Sell.See_Preview_Link.value), "See Preview link");
	}
	
	/**
	 * ======================================================================================================
	 * Click On See Preview Link And Assert Preview Window.
	 * ======================================================================================================
	 */
	public void clickOnSeePreviewLinkAndAssertPreviewWindow() {
		print("Click On See Preview Link And Assert Preview Window.");
		clickOn(Locator.Sell.Enter_Your_Contact_Info.value);
//		JavascriptExecutor jse = (JavascriptExecutor)getWebDriver();
//		jse.executeScript("scroll(500, 1400)");
		waitForElementPresentInDom(1);
		clickOn(Locator.Sell.See_Preview_Link.value);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.Sell.Preview_Window.value));
		clickOn(Locator.Sell.Preview_Window_Close.value);
	}
	
	/**
	 * ===================================================================================
	 * Click On Sign In To Complete Button And Assert Finish Building Your Listing.
	 * ===================================================================================
	 */
	public void clickOnSignInToCompleteAndAssertFinishBuildingYourListing() {
		print("Click On Sign In To Complete Button And Assert Finish Building Your Listing");
		clickOn(Locator.Sell.Preview_Window_Close.value);
		waitForElementPresentInDom(1);
		clickOn(Locator.Sell.SignIn_To_Complete_Button.value);
		waitForElementPresentInDom(2);
		Assert.assertTrue(isTextPresent(Locator.Sell.Preview_Window.value, "Finish building your listing!"));
	}
	
	
}
