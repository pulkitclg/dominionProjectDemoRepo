package com.trader.pagehelper;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.trader.locators.Locator;
import com.trader.stringdata.Strings;
import com.trader.stringdata.Strings.FooterSection;
import com.trader.stringdata.Strings.RefineOptions;
import com.trader.stringdata.Strings.ResourceList;
import com.trader.stringdata.Strings.TabsAtListingDetails;
import com.trader.utils.DriverHelper;

public class SearchHelper extends DriverHelper {
	protected WebDriver driver;

	public SearchHelper(WebDriver driver) {
		super(driver, getSoftAssert());
	}

	/**
	 * Assert the Search Tab at Home page.
	 */
	public void assertSearchTab() {
		print("Search tab enabled");
		locator = Locator.Home.Search_Tab.value;
		waitForElementPresentInDom(5);
		WaitForElementEnabled(locator, 20);
		Assert.assertTrue(isTextPresent(locator, Strings.Tab.Search_Tab.value),
				"Element Locator :" + locator + " Not found");
	}

	/**
	 * Click on Find/Search button under search section.
	 */
	public void clickOnFindButton() {
		print("Click on find button");
		locator = Locator.Home.Find_Button.value;
		clickOn(locator);
		waitForElementPresentInDom(1);
	}

	/**
	 * Assert Search result page.
	 */
	public void assertSearchResultPage() {
		print("Traders for Sale Page");
		locator = Locator.Search.Search_Result_Page.value;
		String txt = getText(locator);
		print(txt);
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.Search_Result.value),
				"Element Locator :" + locator + " Not found");
	}

	/**
	 * Click on Advanced Search Link at home page.
	 */
	public void clickOnAdvancedSearchLink() {
		print("Click on Advanced Search link");
		locator = Locator.Home.Advanced_Search_Link.value;
		clickOn(locator);
	}

	/**
	 * Assert advanced search page.
	 */
	public void assertAdvancedSearchPage() {
		print("Motorcycles for Sale Page");
		waitForElementPresentInDom(2);
		locator = Locator.Search.Advanced_Search_Page.value;
		WaitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Enter Search details in all fields under search section.
	 */
	public void enterSearchDetails() {
		String kWord = this.getKeyword();
		String zCODE = this.getZipCode();
		String rADIUS = this.getRadius();
		this.enterKeyWord(kWord);
		this.enterZipCode(zCODE);
		this.selectRadiusFromDropDown(rADIUS);
	}

	/**
	 * Enter Keyword in search section at Home page.
	 * 
	 * @param KW
	 */
	public void enterKeyWord(String KW) {
		print("Enter KeyWord");
		locator = Locator.Home.Keyword_Field.value;
		sendKeys(locator, KW);
		print("Select Options from suggestion");
		waitForElementPresentInDom(1);
		clickOn(Locator.Home.Keyword_Suggestion.value);
	}

	/**
	 * Assert Auto Suggestion Drop Down.
	 * 
	 * @param KW
	 */
	public void autoSuggestionDropDown() {
		print("Auto Suggestion Drop Down");
		String kWord = this.getKeyword();
		locator = Locator.Home.Keyword_Field.value;
		sendKeys(locator, kWord);
		print("Select Options from suggestion");
		waitForElementPresentInDom(2);
		Assert.assertTrue(isElementPresent(Locator.Home.Keyword_Auto_Suggestion.value));
	}

	/**
	 * Enter Zip Code in search section at Home page.
	 * 
	 * @param ZCode
	 */
	public void enterZipCode(String ZCode) {
		print("Enter Zip Code");
		sendKeys(Locator.Home.Zip_Code.value, ZCode);
	}

	/**
	 * Select radius from drop down in search section at Home page.
	 * 
	 * @param radius
	 */
	public void selectRadiusFromDropDown(String radius) {
		print("Select Radius");
		locator = Locator.Home.Radius_DropDown.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, radius);
	}

	/**
	 * This method to get the Keyword from propery file.
	 * 
	 * @return
	 */
	public String getKeyword() {
		print("Get Keyword");
		String keyWord = propertyReader.readApplicationFile("Keyword");
		return keyWord;
	}

	/**
	 * This method to get the Zip Code from propery file.
	 * 
	 * @return
	 */
	public String getZipCode() {
		print("Get Zip Code");
		String zipCode = propertyReader.readApplicationFile("SearchZipCode");
		return zipCode;
	}

	/**
	 * This method to get the Radius from propery file.
	 * 
	 * @return
	 */
	public String getRadius() {
		print("Get Radius");
		String radius = propertyReader.readApplicationFile("Radius");
		return radius;
	}

	/**
	 * Assert search result page.
	 */
	public void assertAdSearchResult() {
		print("Ad's Search Result page.");
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.Search.Ad_SearchResult.value));
	}

	/**
	 * Click on listing at search result result page.
	 */
	public void clickOnListingAtSearchResultPage() {
		print("Click on listing at search result result page");
		locator = Locator.Search.Listed_AD.value;
		clickOn(locator);
		waitForElementPresentInDom(1);
	}

	/**
	 * In this method, input all location details and click on See Matches button.
	 * 
	 */
	public void searchWithLocationOption() {
		this.clickOnLocationOption();
		String zCODE = this.getZipCode();
		String lRadius = this.getLocationRadius();
		this.selectLocationRadius(lRadius);
		this.enterLocationZipCode(zCODE);
		this.clickOnLocationUpdateButton();
		this.clickOnSeeMatchesButton();
	}

	/**
	 * Click on Location option at Advanced Search page.
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnLocationOption() {
		print("Click on Location Option on Advanced Search");
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Location_Option.value;
		clickOn(locator);
	}

	/**
	 * Select location radius under Location section at Advanced Search page.
	 * 
	 * @param radius
	 */
	public void selectLocationRadius(String radius) {
		print("Select Radius from Location option");
		locator = Locator.AdvancedSearch.Location_Radius.value;
		clickOn(locator);
		selectDropDownByVisibleText(locator, radius);
		clickOn(locator);
	}

	/**
	 * Enter Zip code under Location section at Advanced Search page.
	 * 
	 * @param ZCode
	 */
	public void enterLocationZipCode(String ZCode) {
		print("Enter Zip code");
		sendKeys(Locator.AdvancedSearch.Location_ZipCode.value, ZCode);
	}

	/**
	 * Click on update button under location section at Advanced Search page.
	 * 
	 */
	public void clickOnLocationUpdateButton() {
		print("Click on update button");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.Location_Update.value;
		clickOn(locator);
		sleep(5000);
	}

	/**
	 * This method to get radius from property file.
	 * 
	 * @return
	 */
	public String getLocationRadius() {
		print("Get Location Radius");
		String radius = propertyReader.readApplicationFile("LocationRadius");
		return radius;
	}

	/**
	 * Click on See Matches button at Advanced Search page.
	 * 
	 */
	public void clickOnSeeMatchesButton() {
		print("Click on See Matches Button");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.See_Matches.value;
		String buttontext = getText(locator);
		buttontext = buttontext.replaceAll("\\D+", "");
		clickOn(locator);
	}

	public List<String> getRefineOptionsList() {
		print("Get refine Options from list");
		EnumSet<RefineOptions> all = EnumSet.allOf(RefineOptions.class);
		List<String> list = new ArrayList<>(all.size());
		for (RefineOptions s : all) {
			list.add(s.value);
		}
		return list;
	}

	/**
	 * Assert All refine options under advanced Search.
	 */
	public void assertRefinedOptionsUnderAdvancedSearch() {
		print("Assert All refine options under advanced Search");
		List<String> allRefineOptionsLists = getRefineOptionsList();
		for (String refineOptionsList : allRefineOptionsLists) {
			locator = "//*[@id='refinePanel']//a[contains(text(),'" + refineOptionsList + "')]";
			String txt = getText(locator);
			print(txt);
			Assert.assertTrue(isElementPresent(locator));
		}
	}

	/**
	 * Click on Keyword option at Advanced Search page.
	 * 
	 */
	public void clickOnAdvancedKeywordOption() {
		print("Click on Keyword option on Advaned Search");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.Keyword_Option.value;
		clickOn(locator);
	}

	/**
	 * Enter keyword in field at Advanced Search page.
	 */
	public void enterAdvancedKeyword() {
		print("Enter Keyword option on Advaned Search");
		String kWord = this.getKeyword();
		locator = Locator.AdvancedSearch.Advanced_Keyword.value;
		sendKeys(locator, kWord);
		waitForElementPresentInDom(2);
		String sugg = "(//div[@id='sugs']/li)[1]/span";
		clickOn(sugg);
	}

	/**
	 * Click on Update button under Keyword option at Advanced Search page.
	 */
	public void clickOnAdvancedKeywordUpdateButton() {
		print("Click on update button under Keyword Option");
		locator = Locator.AdvancedSearch.Keyword_Update_Button.value;
		waitForElementPresentInDom(2);
		clickOn(locator);
	}

	/**
	 * Click on Type Option at Advanced Search page
	 */
	public void clickOnAdvancedTypeOption() {
		print("Click on Type Option at Advanced Search page");
		sleep(5000);
		locator = Locator.AdvancedSearch.Advanced_Type.value;
		clickOn(locator);
	}

	/**
	 * Click on Make Option at Advanced Search page
	 */
	public void clickOnAdvancedMakeOption() {
		print("Click on Make Option at Advanced Search page");
		waitForElementPresentInDom(5);
		locator = Locator.AdvancedSearch.Advanced_Make.value;
		clickOn(locator);
	}

	/**
	 * Click on Model Option at Advanced Search page
	 */
	public void clickOnAdvancedModelOption() {
		print("Click on Model Option at Advanced Search page");
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Advanced_Model.value;
		clickOn(locator);
	}

	/**
	 * Click on Trim Option at Advanced Search page
	 */
	public void clickOnAdvancedTrimOption() {
		print("Click on Trim Option at Advanced Search page");
		waitForElementPresentInDom(5);
		locator = Locator.AdvancedSearch.Advanced_Trim.value;
		clickOn(locator);
	}

	/**
	 * Click on Category Option at Advanced Search page
	 */
	public void clickOnAdvancedCategoryOption() {
		print("Click on Category Option at Advanced Search page");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.Advanced_Category.value;
		clickOn(locator);
	}

	/**
	 * Click on price option at Advanced Search page.
	 */
	public void clickOnAdvancedPriceOption() {
		print("Click on price option at Advanced Search page.");
		waitForElementPresentInDom(5);
		locator = Locator.AdvancedSearch.Advanced_Price.value;
		clickOn(locator);
	}

	/**
	 * Click on New And Used option and select New Option at Advanced Search page.
	 */
	public void clickOnAdvancedNewAndUsedOption() {
		print("Click on New And Used option and select New Option at Advanced Search page.");
		waitForElementPresentInDom(5);
		locator = Locator.AdvancedSearch.Advanced_New_Used.value;
		clickOn(locator);
		String newOption = "//div[@id='conditionDetail']/div[2]/div/div";
		clickOn(newOption);
	}

	/**
	 * Click On year option under Advanced Search page.
	 */
	public void clickOnAdvancedYearOption() {
		print("Click On Advanced Year Option");
		waitForElementPresentInDom(5);
		locator = Locator.AdvancedSearch.Advanced_Year.value;
		clickOn(locator);
	}

	/**
	 * Click On Seller Type And Select Type
	 */
	public void clickOnSellerTypeAndSelectType() {
		print("Click On Seller Type And Select Type");
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Advanced_Seller_Type.value;
		clickOn(locator);
		String sellerType = "//div[@id='seller_typeDetail']//div[2]//a[1]";
		clickOn(sellerType);
	}

	/**
	 * Click on Mileage option.
	 */
	public void clickOnMileageOption() {
		print("Click on Milage option.");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.Advanced_Mileage.value;
		clickOn(locator);
		waitForElementPresentInDom(2);
	}

	/**
	 * Click on Engine Size option.
	 */
	public void clickOnEngineSizeOption() {
		print("Click on Engine Size option.");
		locator = Locator.AdvancedSearch.Advanced_Engine_Size.value;
		clickOn(locator);
		waitForElementPresentInDom(3);
	}

	/**
	 * Click on State option and select state.
	 */
	public void clickOnStateOptionAndSelectState() {
		print("Click on State option and select state.");
		locator = Locator.AdvancedSearch.Advanced_State.value;
		clickOn(locator);
		waitForElementPresentInDom(3);
		String state = "//*[contains(@id,'popover')]//div[@class='refineOptions']/div[1]/div[1]";
		clickOn(state);
		waitForElementPresentInDom(3);
	}

	/**
	 * Click on City option and select City.
	 */
	public void clickOnCityOptionAndSelectCity() {
		print("Click on City option and select City.");
		locator = Locator.AdvancedSearch.Advanced_City.value;
		clickOn(locator);
		waitForElementPresentInDom(3);
		String city = "//*[contains(@id,'popover')]//div[@class='refineOptions']/div[1]/div[1]";
		clickOn(city);
		waitForElementPresentInDom(3);
	}

	/**
	 * Select Types from Pop Up at Advanced Search page
	 * 
	 * @throws InterruptedException
	 */
	public void selectTypesFromPopUp() {
		print("Select Types Option From Pop up");
		waitForElementPresentInDom(2);
		// switchWin(0);
		locator = Locator.AdvancedSearch.Choose_Types.value;
		// String adsCount = getText(locator);

		clickOn(locator);
	}

	/**
	 * Select Makes from Pop Up at Advanced Search page
	 */
	public void selectMakesFromPopUp() {
		print("Select Make Option at Advanced Search page");
		waitForElementPresentInDom(1);
		locator = Locator.AdvancedSearch.Choose_Make.value;
		clickOn(locator);
		// clickOn(locator);
		this.clickOnUpdateButtonOnPopUp();
	}

	/**
	 * Select Model from Pop Up at Advanced Search page
	 */
	public void selectModelFromPopUp() {
		print("Click on Make Option at Advanced Search page");
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Choose_Model.value;
		clickOn(locator);
		this.clickOnUpdateButtonOnPopUp();
	}

	/**
	 * Select Trim from Pop Up at Advanced Search page
	 */
	public void selectTrimFromPopUp() {
		print("Click on trim Option at Advanced Search page");
		waitForElementPresentInDom(5);
		locator = Locator.AdvancedSearch.Choose_Trim.value;
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0,-800)");
		clickOn(locator);
		waitForElementPresentInDom(2);
		String update = "(//*[@data-param=\"trim\"])[2]//*[@data-track='Refine-Add To Search']";
		clickOn(update);
	}

	/**
	 * Select Category from Pop Up at Advanced Search page
	 */
	public void selectCategoryFromPopUp() {
		print("Select Category Option from Category pop up at Advanced Search page");
		waitForElementPresentInDom(1);
		locator = Locator.AdvancedSearch.Choose_Category.value;
		clickOn(locator);
		// this.getFirstVisible(locator, 20).click();
		this.clickOnUpdateButtonOnPopUp();
	}

	/**
	 * Select Min And Max Price From PopUp.
	 */
	public void selectMinAndMaxPriceFromPopUp() {
		print("Select Min And Max Price From PopUp.");
		String minPrice = Locator.AdvancedSearch.Min_Price.value;
		clickOn(minPrice);
		waitForElementPresentInDom(2);
		String selectMinPrice = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'minValue')]/option[2]";
		clickOn(selectMinPrice);
		waitForElementPresentInDom(1);
		String maxPrice = Locator.AdvancedSearch.Max_Price.value;
		clickOn(maxPrice);
		String selectMaxPrice = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'maxValue')]/option[2]";
		clickOn(selectMaxPrice);
		String txt = "(//div[contains(@id,'popover')]//div[2]//span)[1]";
		clickOn(txt);
		String update = "(//div[@data-param='price']/div[3])[2]/div[1]";
		clickOn(update);
	}

	/**
	 * Select Min And Max year From Year PopUp.
	 */
	public void selectMinAndMaxYearFromYearPopUp() {
		print("Select Min And Max year From Year PopUp.");
		String minDropDown = Locator.AdvancedSearch.Min_Price.value;
		clickOn(minDropDown);
		String minYearLocator = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'minValue')]/option[2]";
		clickOn(minYearLocator);
		waitForElementPresentInDom(1);
		String maxDropDown = Locator.AdvancedSearch.Max_Price.value;
		clickOn(maxDropDown);
		String maxYearLocator = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'maxValue')]/option[20]";
		clickOn(maxYearLocator);
		String txt = "(//div[contains(@id,'popover')]//div[2]//span)[1]";
		clickOn(txt);
		String update = "(//div[@data-param='year']/div[3])[2]/div[1]";
		clickOn(update);
	}

	/**
	 * Select Min And Max Mileage From PopUp.
	 */
	public void selectMinAndMaxMileage() {
		print("Select Min And Max Mileage From PopUp.");
		String minMilage = Locator.AdvancedSearch.Min_Price.value;
		clickOn(minMilage);
		waitForElementPresentInDom(2);
		String selectMinMilage = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'minValue')]/option[2]";
		clickOn(selectMinMilage);
		waitForElementPresentInDom(1);
		String maxMileage = Locator.AdvancedSearch.Max_Price.value;
		clickOn(maxMileage);
		String selectMaxMileage = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'maxValue')]/option[2]";
		clickOn(selectMaxMileage);
		String txt = "(//div[contains(@id,'popover')]//div[2]//span)[1]";
		clickOn(txt);
		String update = "(//div[@data-param='mileage']/div[3])[2]/div[1]";
		clickOn(update);
		waitForElementPresentInDom(5);
	}

	/**
	 * Select Min And Max Engine Size From PopUp.
	 */
	public void selectMinAndMaxEngineSize() {
		print("Select Min And Max Engine Size From PopUp.");
		String minEngineSize = Locator.AdvancedSearch.Min_Price.value;
		clickOn(minEngineSize);
		waitForElementPresentInDom(2);
		String selectMinEngineSize = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'minValue')]/option[2]";
		clickOn(selectMinEngineSize);
		waitForElementPresentInDom(1);
		String maxEngineSize = Locator.AdvancedSearch.Max_Price.value;
		clickOn(maxEngineSize);
		String selectMaxEngineSize = "//div[contains(@id,'popover')]//div[2]//select[contains(@class,'maxValue')]/option[2]";
		clickOn(selectMaxEngineSize);
		String txt = "(//div[contains(@id,'popover')]//div[2]//span)[1]";
		clickOn(txt);
		String update = "(//div[@data-param='engineSize']/div[3])[2]/div[1]";
		clickOn(update);
		waitForElementPresentInDom(5);
	}

	/**
	 * Click on Update button.
	 */
	public void clickOnUpdateButtonOnPopUp() {
		print("Click on Update button");
		locator = Locator.AdvancedSearch.Update_Button_PopUp.value;
		this.getFirstVisible(locator, 20).click();
	}

	/**
	 * Click on Browse All Icon at Sale By Makes
	 */
	public void clickOnBrowseAllMakes() {
		print("Click on Browse All Icon at Sale By Makes");
		locator = Locator.Search.Browse_All_Makes.value;
		clickOn(locator);
	}

	/**
	 * Assert Sales By Makes links.
	 */
	public void assertSalebyMake() {
		print("Assert Sales By Makes links");
		locator = Locator.Search.Makes_Link.value;
		this.getFirstVisible(locator);
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Click On All Makes Breadcrumb Link.
	 */
	public void clickOnAllMakesBreadcrumbLink() {
		print("Click On All Makes Breadcrumb Link");
		locator = Locator.Makes.Home_Breadcrumb.value;
		clickOn(locator);
		waitForElementPresentInDom(2);
		clickOn(Locator.Home.Popular_Makes.value);
		waitForElementPresentInDom(1);
		clickOn(Locator.Home.Makes_SearchAll.value);
	}

	public void clickOnHomeBreadcrumbLink() {
		print("Click On Home Breadcrumb Link");
		locator = Locator.Makes.Home_Breadcrumb.value;
		waitForElementPresentInDom(1);
		clickOn(locator);
		waitForElementPresentInDom(2);
		clickOn(Locator.Home.Popular_States.value);
		waitForElementPresentInDom(1);
		clickOn(Locator.State.Search_All.value);
	}

	/**
	 * Click On BMW Link.
	 */
	public void clickOnBMWLink() {
		print("Click On BMW Link");
		locator = Locator.Makes.BMW_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Can-Am Link.
	 */
	public void clickOnCanAmLink() {
		print("Click On Can-Am Link");
		locator = Locator.Makes.CAN_AM_Link.value;

	}

	/**
	 * Click On Ducati Link.
	 */
	public void clickOnDucatiLink() {
		print("Click On Ducati Link");
		locator = Locator.Makes.Ducati_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Harley Davidson Link.
	 */
	public void clickOnHarleyLink() {
		print("Click On Harley Davidson Link");
		locator = Locator.Makes.Harley_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Honda Link.
	 */
	public void clickOnHondaLink() {
		print("Click On Honda Link");
		locator = Locator.Makes.Honda_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On KTM Link.
	 */
	public void clickOnKTMLink() {
		print("Click On KTM Link");
		locator = Locator.Makes.KTM_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Kawasaki Link.
	 */
	public void clickOnKawasakiLink() {
		print("Click On Kawasaki Link");
		locator = Locator.Makes.Kawasaki_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Suzuki Link.
	 */
	public void clickOnSuzukiLink() {
		print("Click On Suzuki Link");
		locator = Locator.Makes.Suzuki_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Triumph Link
	 */
	public void clickOnTriumphLink() {
		print("Click On Triumph Link");
		locator = Locator.Makes.Triumph_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Victory Link
	 */
	public void clickOnVictoryLink() {
		print("Click On Victory Link");
		locator = Locator.Makes.Victory_link.value;
		clickOn(locator);
	}

	/**
	 * Click On Yamaha Link
	 */
	public void clickOnYamahaLink() {
		print("Click On Yamaha Link");
		locator = Locator.Makes.Yamaha_Link.value;
		clickOn(locator);
	}

	/**
	 * Click On Yamaha Icon
	 */
	public void clickOnYamahaIcon() {
		print("Click On Yamaha Icon");
		locator = Locator.Makes.Yamaha_Icon.value;
		clickOn(locator);
	}

	/**
	 * Click On Triumph Icon
	 */
	public void clickOnTriumphIcon() {
		print("Click On Triumph Icon");
		locator = Locator.Makes.Triumph_Icon.value;
		clickOn(locator);
	}

	/**
	 * Click On BMW Icon
	 */
	public void clickOnBMWIcon() {
		print("Click On BMW Icon");
		locator = Locator.Makes.BMW_Icon.value;
		clickOn(locator);
	}

	/**
	 * Assert Location updates.
	 */
	public void assertLocationUpdate() {
		print("Assert Location updates");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.Location_Updates.value;
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Wait for Updating Spinner
	 */
	public void waitForUpdatingSpinner() {
		print("Wait for Updating Spinner");
		locator = Locator.AdvancedSearch.Updating_Spinner.value;
		WaitForElementNotVisible(locator, 50);
	}

	/**
	 * Enter Keyword And Select Suggestion.
	 */
	public void enterKeywordAndSelectSuggestion() {
		print("Enter Keyword And Select Suggestion");
		String kWord = this.getKeyword();
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Advanced_Keyword.value;
		sendKeys(locator, kWord);
		waitForElementPresentInDom(2);
		clickOn("//div[@id='keywordDetail']/div[2]/div/li[1]");
	}

	/**
	 * Assert Keyword search Result Page
	 */
	public void assertKeywordSearchResult() {
		print("Assert Keyword search Result Page");
		String expected = propertyReader.readApplicationFile("Keyword");
		locator = Locator.Search.Search_Result_Page.value;
		String actual = getText(locator);
		sleep(5000);
		Assert.assertTrue(expected.contains(actual));
	}

	/**
	 * Search with location from refine search at search result page.
	 * 
	 */
	public void searchWithLocationFormRefineSearch() {
		this.clickOnLocationOption();
		waitForElementPresentInDom(3);
		String zCODE = this.getZipCode();
		String lRadius = this.getLocationRadius();
		this.selectLocationRadius(lRadius);
		this.enterLocationZipCode(zCODE);
		waitForElementPresentInDom(3);
		this.clickOnLocationUpdateButton();
		this.assertLocationUpdate();
	}

	/**
	 * Select Make option from refined section and assert search result page.
	 * 
	 */
	public void selectMakesOptionAndAssertSearchResultPage() {
		print("Select Make Option at Advanced Search page");
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Choose_Make.value;
		String txt = this.getFirstVisible(locator, 30).getText();
		this.getFirstVisible(locator, 30).click();
		this.clickOnUpdateButtonOnPopUp();
		// this.waitForUpdatingSpinner();
		waitForElementPresentInDom(2);
		String expected = getWebDriver().findElement(By.xpath("//*[@id='topicTitle']")).getText();
		Assert.assertTrue(expected.contains(txt));
	}

	/**
	 * Select model Option at Advanced Search page and result page.
	 *
	 */
	public void selectModelOptionAndAssertSearchResultPage() {
		print("Select model Option at Advanced Search page");
		this.clickOnAdvancedModelOption();
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Choose_Model.value;
		String txt = this.getFirstVisible(locator, 20).getText();
		this.getFirstVisible(locator, 20).click();
		this.clickOnUpdateButtonOnPopUp();
		// this.waitForUpdatingSpinner();
		waitForElementPresentInDom(3);
		String expected = getWebDriver().findElement(By.xpath("//*[@id='topicTitle']")).getText();
		Assert.assertTrue(expected.contains(txt));
	}

	/**
	 * Select Trim Option at Advanced Search page and Assert Result page.
	 * 
	 */
	public void selectTrimOptionAndAssertSearchResultPage() {
		print("Select Trim Option at Advanced Search page");
		this.clickOnAdvancedTrimOption();
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Choose_Trim.value;
		String txt = getText(locator);
		System.err.println(txt);
		clickOn(locator);
		waitForElementPresentInDom(2);
		String trimUpdate = "(//*[@data-track='Refine-Add To Search'])[5]";
		clickOn(trimUpdate);
		System.err.println("Click On Update");
		waitForElementPresentInDom(2);
		// .clickOnUpdateButtonOnPopUp();
		// this.waitForUpdatingSpinner();
		String expected = getWebDriver().findElement(By.xpath("//*[@id='topicTitle']")).getText();
		Assert.assertTrue(expected.contains(txt));
	}

	/**
	 * Select Category Option at Advanced Search page and Assert result page.
	 * 
	 */
	public void selectCategoryOptionAndAssertSearchResultPage() {
		print("Select Category Option at Advanced Search page");
		this.clickOnAdvancedCategoryOption();
		waitForElementPresentInDom(2);
		locator = Locator.AdvancedSearch.Choose_Category.value;
		String txt = this.getFirstVisible(locator, 20).getText();
		this.getFirstVisible(locator, 20).click();
		this.clickOnUpdateButtonOnPopUp();
		// this.waitForUpdatingSpinner();
		waitForElementPresentInDom(3);
		String expected = getWebDriver().findElement(By.xpath("//*[@id='topicTitle']")).getText();
		Assert.assertTrue(expected.contains(txt));
	}

	/**
	 * Click on Recent search link and assert result page.
	 */
	public void clickAndAssertRecentSearchLinkResult() {
		print("Recent search link");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.Choose_Make.value;
		String txt = this.getFirstVisible(locator, 20).getText();
		print(txt);
		this.getFirstVisible(locator, 20).click();
		waitForElementPresentInDom(2);
		this.clickOnUpdateButtonOnPopUp();
		// this.waitForUpdatingSpinner();
		waitForElementPresentInDom(3);
	    String expected = getWebDriver().findElement(ByLocator(Locator.Search.Ad_SearchResult.value)).getText();
	    print(expected);
		Assert.assertTrue(isElementPresent(Locator.Search.Ad_SearchResult.value));
		clickOn(Locator.Home.Application_Logo.value);
		print("Click on Recent Search section");
		waitForElementPresentInDom(2);
		clickOn(Locator.Home.Recent_Searches.value);
		print("Click on Recent Search link");
		waitForElementPresentInDom(2);
		clickOn(Locator.Home.Recent_Search_Link.value);
		waitForElementPresentInDom(3);
		String resultPage = getWebDriver().findElement(By.xpath("//*[@id='topicTitle']")).getText();
		print(resultPage);
		Assert.assertTrue(resultPage.contains(txt));
	}

	/**
	 * Click on Find by Make, State and Type button and assert result page.
	 */
	public void clickOnFindByButtonsAndAssertResultPage() {
		print("Click On Find By Make Button And Assert Result Page");
		waitForElementPresentInDom(3);
		locator = Locator.AdvancedSearch.Find_By_Search_Result.value;
		print(getText(locator));

		clickOn(Locator.AdvancedSearch.Find_By_Make_Button.value);
		waitForElementPresentInDom(2);
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.Find_By_Make.value),
				"Element Locator :" + locator + " Not found");
		waitForElementPresentInDom(2);
		clickOn(Locator.Menus.BUY.value);
		print("Click On Find By Type Button And Assert Result Page");
		waitForElementPresentInDom(2);
		clickOn(Locator.AdvancedSearch.Find_By_Type_Button.value);
		waitForElementPresentInDom(2);
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.Find_By_Type.value),
				"Element Locator :" + locator + " Not found");
		waitForElementPresentInDom(2);
		clickOn(Locator.Menus.BUY.value);
		print("Click On Find By State Button And Assert Result Page");
		waitForElementPresentInDom(2);
		clickOn(Locator.AdvancedSearch.Find_By_State_Button.value);
		waitForElementPresentInDom(2);
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.Find_By_State.value),
				"Element Locator :" + locator + " Not found");
		// clickOn(Locator.Menus.BUY.value);
	}

	/**
	 * Click On Save This Search And Assert Saved Search.
	 */
	public void clickOnSaveThisSearchAndAssertSavedSearch() {
		print("Click On Save This Search And Assert Saved Search");
		waitForElementPresentInDom(3);
		String saveSearchbutton = Locator.Search.Save_Search.value;
		String buttonTxt = getText(Locator.Search.Save_This_Search_Button.value);
		print(buttonTxt);
		if (buttonTxt == "Saved") {
			clickOn(saveSearchbutton);
			waitForElementPresentInDom(3);
			clickOn(saveSearchbutton);
		} else {
			clickOn(saveSearchbutton);
		}
		String savedSearchText = propertyReader.readApplicationFile("SaveSearchName");
		getWebDriver().findElement(By.xpath("//div[@id='mytraderModal']//input"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		sendKeys(Locator.Search.Save_Search_Title.value, savedSearchText);
		clickOn(Locator.Search.Save_Search_Button.value);
		print("Click On Saved Icon in header section");
		sleep(5000);
		clickOn(Locator.Menus.Saved_Icon.value);
		sleep(5000);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.MyTrader_Message.value));
		clickOn(Locator.MyTrader.Saved_Searches.value);
		String savedSearch = getWebDriver().findElement(By.xpath("//*[@class='myt-content']//li[1]//span/span"))
				.getText();
		Assert.assertTrue(savedSearchText.contains(savedSearch));
	}

	/**
	 * ==================================================================================================================
	 * This method is to click On save Seacrh icon and assert saved search.
	 * ==================================================================================================================
	 */
	public void clickOnSaveIconAndAssertsavedListing() {
		print("Click On Ad And Assert Ad Details Page");
		this.clickOnListingAtSearchResultPage();
		print("Assert Listing Name");
		String listingName = getWebDriver().findElement(By.xpath("(//*[@class='detail-title']//h2)[1]")).getText();
		String locator1 = Locator.Search.Save_Listing.value;
		clickOn(locator1);
		waitForElementPresentInDom(1);
		String locator2 = Locator.Search.Save_Listing_Button.value;
		clickOn(locator2);
		print("Click On Saved Icon in header section");
		waitForElementPresentInDom(2);
		clickOn(Locator.Menus.Saved_Icon.value);
		waitForElementPresentInDom(2);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.MyTrader_Message.value));
		clickOn(Locator.MyTrader.Saved_Listing.value);
		String savedListing = getWebDriver().findElement(By.xpath("//*[@class='grid-image-wrapper']//div[3]/a"))
				.getText();
		Assert.assertTrue(listingName.contains(savedListing));
	}

	/**
	 * Click On Save listings link And Assert saved Listings.
	 */
	public void clickOnSaveListingLinkAndAssertSavedListing() {
		print("Click On Save listings link And Assert saved Listings");
		locator = Locator.Search.Save_Listing_Link.value;
		String listingName = getWebDriver().findElement(ByLocator(Locator.Search.Listed_AD.value)).getText();
		clickOn(locator);
		waitForElementPresentInDom(2);
		String SaveListing_locator = Locator.Search.Save_Listing_Button.value;
		clickOn(SaveListing_locator);
		print("Click On Saved Icon in header section");
		waitForElementPresentInDom(5);
		clickOn(Locator.Menus.Saved_Icon.value);
		waitForElementPresentInDom(5);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.MyTrader_Message.value));
		clickOn(Locator.MyTrader.Saved_Listing.value);
		String savedListing = getWebDriver().findElement(By.xpath("//*[@class='grid-image-wrapper']//div[3]/a"))
				.getText();
		Assert.assertTrue(listingName.contains(savedListing));
	}

	/**
	 * Click On Ad listing And Assert Ad Details Page
	 */
	public void clickOnAdAndAssertAdDetailsPage() {
		print("Click On Ad And Assert Ad Details Page");
		locator = Locator.Search.Listed_AD.value;
		waitForElementPresentInDom(2);
		String listing = getText(locator);
		print(listing);
		clickOn(locator);
		print("Assert Listing Name");
		String listingName = getWebDriver().findElement(By.xpath("(//*[@class='detail-title']//h2)[1]")).getText();
		print("Assert Listing Name" + listingName);
		Assert.assertTrue(listing.contains(listingName));
	}

	/**
	 * Click On Email Only icon And Assert Contact seller Section.
	 */
	public void clickOnEmailOnlyAndAssertContactsellerSection() {
		print("Click On Email Only And Assert Contact seller Section");
		locator = Locator.Search.Email_Only.value;
		clickOn(locator);
		Assert.assertTrue(isElementPresent(Locator.Search.Contact_Seller.value));
	}

	/**
	 * Enter First name, Last Name, Email Id and select Verify Checkbox.
	 */
	public void enterSellerDetailsAndClickOnContactButton() {
		print("Enter first Name");
		String fname = propertyReader.readApplicationFile("ContactFname");
		locator = Locator.ListingDetails.Seller_Fname.value;
		sendKeys(locator, fname);

		print("Enter Last Name");
		String lname = propertyReader.readApplicationFile("ContactLname");
		String LastName_locator = Locator.ListingDetails.Seller_Lname.value;
		sendKeys(LastName_locator, lname);

		print("Enter email Id");
		String emailID = propertyReader.readApplicationFile("ContactEmail");
		String ContactEmail_locator = Locator.ListingDetails.Seller_Email.value;
		sendKeys(ContactEmail_locator, emailID);

		print("Click on Verify Captcha check box");

		String VerifyCheckBox_locator = Locator.ListingDetails.Verify_Checkbox.value;
		waitForElementPresentInDom(2);
		clickOn(VerifyCheckBox_locator);
		sleep(3000);
		print("Clicked");
	}

	/**
	 * This method is for Save Listing
	 */
	public void saveListing() {
		this.assertSearchTab();
		this.enterSearchDetails();
		this.clickOnFindButton();
		this.assertAdSearchResult();
		this.clickOnSaveListingLinkAndAssertSavedListing();
	}

	/**
	 * This method is for save search.
	 */
	public void saveSearch() {
		this.assertSearchTab();
		this.enterSearchDetails();
		this.clickOnFindButton();
		this.assertAdSearchResult();
		this.clickOnSaveThisSearchAndAssertSavedSearch();
	}

	/**
	 * Click on any listing with Price getting first on page and
	 */
	public void clickOnListingWithPriceAndEstimatePaymentIcon() {
		print("Click on any Listing with Price");
		locator = Locator.Search.Listing_With_Price.value;
		waitForElementPresentInDom(2);
		getFirstVisible(locator).click();
		waitForElementPresentInDom(5);
		clickOn(Locator.Search.Estimate_Payment.value);
	}

	/**
	 * In this method, enter all required details on Estimate Payment Window.
	 */
	public void estimatePaymentWindow() {
		print("Input all details and estimat payment");
		waitForElementPresentInDom(1);
		String downPayment = propertyReader.readApplicationFile("DownPayment");
		sendKeys(Locator.ListingDetails.Down_Payment.value, downPayment);
		String interestRate = propertyReader.readApplicationFile("InterestRate");
		sendKeys(Locator.ListingDetails.Interest_Rate.value, interestRate);
		waitForElementPresentInDom(1);
		clickOn(Locator.ListingDetails.Loan_Term.value);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.ListingDetails.Estimated_Payment.value));
		clickOn(Locator.ListingDetails.Cross_Icon.value);
	}

	/**
	 * Assert Find By Make, State And Type Button At Advanced Search Page.
	 */
	public void assertFindByMakeStateAndTypeButtonAtAdvancedSearchPage() {
		print("Assert Find By Make, State And Type Button At Advanced Search Page");
		String findByMakelocator = Locator.AdvancedSearch.Find_By_Make_Button.value;
		Assert.assertTrue(isTextPresent(findByMakelocator, Strings.Button.Find_By_Make.value),
				"Element Locator :" + findByMakelocator + " Not found");
		String findByTypelocator = Locator.AdvancedSearch.Find_By_Type_Button.value;
		Assert.assertTrue(isTextPresent(findByTypelocator, Strings.Button.Find_By_Type.value),
				"Element Locator :" + findByTypelocator + " Not found");
		String findByStatelocator = Locator.AdvancedSearch.Find_By_State_Button.value;
		Assert.assertTrue(isTextPresent(findByStatelocator, Strings.Button.Find_By_State.value),
				"Element Locator :" + findByStatelocator + " Not found");
	}

	/**
	 * Click On Find By Make Button And Assert Result Page.
	 */
	public void clickOnFindByMakeButtonAndAssertResultPage() {
		print("Click On Find By Make Button And Assert Result Page.");
		clickOn(Locator.AdvancedSearch.Find_By_Make_Button.value);
		locator = Locator.AdvancedSearch.Find_By_Search_Result.value;
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.Find_By_Make.value),
				"Element Locator :" + locator + " Not found");
	}

	/**
	 * Click On Find By Type Button And Assert Result Page.
	 */
	public void clickOnFindByTypeButtonAndAssertResultPage() {
		print("Click On Find By Type Button And Assert Result Page.");
		clickOn(Locator.AdvancedSearch.Find_By_Type_Button.value);
		locator = Locator.AdvancedSearch.Find_By_Search_Result.value;
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.Find_By_Type.value),
				"Element Locator :" + locator + " Not found");
	}

	/**
	 * Click On Find By State Button And Assert Result Page.
	 */
	public void clickOnFindByStateButtonAndAssertResultPage() {
		print("Click On Find By State Button And Assert Result Page.");
		clickOn(Locator.AdvancedSearch.Find_By_State_Button.value);
		locator = Locator.AdvancedSearch.Find_By_Search_Result.value;
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.Find_By_State.value),
				"Element Locator :" + locator + " Not found");
	}

	/**
	 * Click on location and assert location options under advanced search page.
	 */
	public void clickOnLocationAndAssertLocationsOptions() {
		print("Click on location and assert location options under advanced search page.");
		this.clickOnLocationOption();
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.Location_Radius.value));
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.Location_ZipCode.value));
	}

	/**
	 * Assert Auto suggestion drop down.
	 */
	public void assertAutoSuggestionDropDown() {
		print("Assert Auto suggestion drop down.");
		this.clickOnAdvancedKeywordOption();
		String kWord = this.getKeyword();
		locator = Locator.AdvancedSearch.Advanced_Keyword.value;
		sendKeys(locator, kWord);
		waitForElementPresentInDom(10);
		String autoSuggestion = "//div[@id='keywordDetail']/div[2]/div/li[1]/span";
		Assert.assertTrue(isElementPresent(autoSuggestion));
	}

	public void enterKeywordAndAssertResult() {
		print("Enter Keyword And Assert Result");
		this.clickOnAdvancedKeywordOption();
		String kWord = this.getKeyword();
		locator = Locator.AdvancedSearch.Advanced_Keyword.value;
		sendKeys(locator, kWord);
		waitForElementPresentInDom(2);
		String updateButton = "//*[@id='keywordDetail']//div[@data-track='Update Keyword']";
		clickOn(updateButton);

	}

	/**
	 * Click On See Matches Button And Assert Listing Counts.
	 */
	public void clickOnSeeMatchesButtonAndAssertListingCounts() {
		print("Click On See Matches Button And Assert Listing Counts.");
		waitForElementPresentInDom(4);
		String seeMatchesButton = Locator.AdvancedSearch.See_Matches_Button.value;
		String buttonText = getText(seeMatchesButton);
		String finalButtonText = buttonText.replaceAll("[,]*", "");
		print(finalButtonText);
		clickOn(seeMatchesButton);
		String listingMatchesCount = Locator.AdvancedSearch.Listing_Matches_Counts.value;
		String listingCount = getText(listingMatchesCount);
		String finalListingCount = listingCount.replaceAll("[,]*", "");
		print(finalListingCount);
		Assert.assertTrue(finalButtonText.matches(finalListingCount));
	}

	/**
	 * Click On See Matches Button And Assert Listing Counts.
	 */
	public void clickOnSeeMatchesButtonAndAssertListingCountsAtResultPage() {
		print("Click On See Matches Button And Assert Listing Counts.");
		waitForElementPresentInDom(4);
		String seeMatchesButton = Locator.AdvancedSearch.See_Matches_Button.value;
		String buttonText = getText(seeMatchesButton);
		String finalButtonText = buttonText.replaceAll("[,]*", "");
		print(finalButtonText);
		clickOn(seeMatchesButton);
		String listingMatchesCount = "//*[@id='searchPage']/*[@class='h1']";
		String listingCount = getText(listingMatchesCount);
		String finalListingCount = listingCount.replaceAll("[,]*", "");
		print(finalListingCount);
		Assert.assertTrue(finalListingCount.contains(finalButtonText));
	}

	/**
	 * Click On Start Over Link And Assert Filter Reset.
	 */
	public void clickOnStartOverLinkAndAssertFilterReset() {
		print("Click On Start Over Link And Assert Filter Reset");
		locator = Locator.AdvancedSearch.Start_Over_Link.value;
		clickOn(locator);
		waitForElementPresentInDom(5);
		String remove = "(//*[contains(@class,'resetFilter rfloat hide')])[3]";
		Assert.assertTrue(isElementPresent(remove));
	}

	public List<String> getFindByLinksList() {
		print("Get find by links from list");
		EnumSet<FooterSection> all = EnumSet.allOf(FooterSection.class);
		List<String> list = new ArrayList<>(all.size());
		for (FooterSection s : all) {
			list.add(s.value);
		}
		return list;
	}

	/**
	 * Assert find By links under advanced Search.
	 */
	public void assertFindByLinksUnderAdvancedSearch() {
		print("Assert find By links under advanced Search");
		List<String> allFindByLists = getFindByLinksList();
		for (String findByList : allFindByLists) {
			locator = "//*[@id='page-content-wrapper']//a[contains(text(),'" + findByList + "')]";
			String txt = getText(locator);
			print(txt);
			Assert.assertTrue(isElementPresent(locator));
		}
	}

	/**
	 * Click On Find By Make And Assert Result Page.
	 */
	public void clickOnFindByMakeAndAssertResultPage() {
		print("Click On Find By Make And Assert Result Page");
		locator = Locator.AdvancedSearch.Find_By_Make.value;
		String makeTxt = getText(locator);
		print(makeTxt);
		String[] text2 = makeTxt.split(" ");
		String Finaltext = text2[text2.length - 1];
		print(Finaltext);
		clickOn(locator);
		String resultPage = Locator.Search.Advanced_Search_Page.value;
		String resultPageTxt = getText(resultPage);
		Assert.assertTrue(resultPageTxt.contains(Finaltext));
	}

	/**
	 * Click On Find By Type And Assert Result Page.
	 */
	public void clickOnFindByTypeAndAssertResultPage() {
		print("Click On Find By Type And Assert Result Page");
		locator = Locator.AdvancedSearch.Find_By_Type.value;
		String typeTxt = getText(locator);
		String[] text2 = typeTxt.split(" ");
		String Finaltext = text2[text2.length - 1];
		print(Finaltext);
		clickOn(locator);
		String resultPage = Locator.Search.Advanced_Search_Page.value;
		String resultPageTxt = getText(resultPage);
		Assert.assertTrue(resultPageTxt.contains(Finaltext));
	}

	/**
	 * Click On Find By State And Assert Result Page.
	 */
	public void clickOnFindByStateAndAssertResultPage() {
		print("Click On Find By State And Assert Result Page");
		locator = Locator.AdvancedSearch.Find_By_State.value;
		String stateTxt = getText(locator);
		String[] text2 = stateTxt.split(" ");
		String Finaltext = text2[text2.length - 1];
		clickOn(locator);
		String resultPage = Locator.Search.Advanced_Search_Page.value;
		String resultPageTxt = getText(resultPage);
		Assert.assertTrue(resultPageTxt.contains(Finaltext));
	}

	/**
	 * Click On Find Motorcycle Dealers And Assert Result Page.
	 */
	public void clickOnFindDealerAndAssertResultPage() {
		print("Click On Find Motorcycle Dealers And Assert Result Page");
		locator = Locator.AdvancedSearch.Find_Dealers.value;
		String dealerTxt = getText(locator);
		String[] text2 = dealerTxt.split(" ");
		String Finaltext = text2[text2.length - 1];
		clickOn(locator);
		String resultPage = Locator.Dealer.Find_Motorcyle_Dealer.value;
		String resultPageTxt = getText(resultPage);
		Assert.assertTrue(resultPageTxt.contains(Finaltext));
	}

	/**
	 * Click On all Makes Links Under Find By Make Section And Assert Result Page
	 */
	public void clickOnallMakesLinksUnderFindByMakeSectionAndAssertResultPage() {
		print("Click On all Makes Links Under Find By Make Section And Assert Result Page");
		locator = Locator.AdvancedSearch.Find_Makes_Links.value;
		int links = getWebDriver().findElements(ByLocator(locator)).size();
		System.out.println(links);
		for (int i = 1; i <= links; i++) {
			String makeLinks = "(//*[@class='footerLink']/span)[1]/a[" + i + "]";
			String linkName = getText(makeLinks);
			String[] text2 = linkName.split(" ");
			String Finaltext = text2[0];
			print(Finaltext);
			clickOn(makeLinks);
			String resultPage = Locator.Search.Search_Result_Page.value;
			String expectedResult = getText(resultPage);
			Assert.assertTrue(expectedResult.contains(Finaltext));
			clickOn(Locator.Menus.BUY.value);
		}
	}

	/**
	 * Click On all Type Links Under Find By Type Section And Assert Result Page.
	 */
	public void clickOnallTypeLinksUnderFindByTypeSectionAndAssertResultPage() {
		print("Click On all Type Links Under Find By Type Section And Assert Result Page");
		locator = Locator.AdvancedSearch.Find_Types_Links.value;
		int links = getWebDriver().findElements(ByLocator(locator)).size();
		System.out.println(links);
		for (int i = 1; i <= links; i++) {
			String makeLinks = "(//*[@class='footerLink']/span)[2]/a[" + i + "]";
			String linkName = getText(makeLinks);
			String[] text2 = linkName.split(" ");
			String Finaltext = text2[0];
			print(Finaltext);
			clickOn(makeLinks);
			String resultPage = Locator.Search.Search_Result_Page.value;
			String expectedResult = getText(resultPage);
			print(expectedResult);
			Assert.assertTrue(expectedResult.contains(Finaltext));
			clickOn(Locator.Menus.BUY.value);
		}
	}

	/**
	 * Click On all State Links Under Find By State Section And Assert Result Page.
	 */
	public void clickOnallStateLinksUnderFindByStateSectionAndAssertResultPage() {
		print("Click On all State Links Under Find By State Section And Assert Result Page");
		locator = Locator.AdvancedSearch.Find_State_Links.value;
		int links = getWebDriver().findElements(ByLocator(locator)).size();
		System.out.println(links);
		for (int i = 1; i <= links; i++) {
			String makeLinks = "(//*[@class='footerLink']/span)[3]/a[" + i + "]";
			String linkName = getText(makeLinks);
			String[] text2 = linkName.split(" ");
			String Finaltext = text2[0];
			print(Finaltext);
			clickOn(makeLinks);
			String resultPage = "//*[@id='topicTitle']/em[2]";
			String expectedResult = getText(resultPage);
			print(expectedResult);
			Assert.assertTrue(expectedResult.contains(Finaltext));
			clickOn(Locator.Menus.BUY.value);
		}
	}

	/**
	 * Assert ByType And By State Links
	 */
	public void assertByTypeAndByStateLinks() {
		print("Assert By Type And ByState Links");
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.By_State.value));
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.By_Type.value));
	}

	/**
	 * Assert By Make And By Type Links
	 */
	public void assertByMakeAndByTypeLinks() {
		print("Assert By Make And By Type Links");
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.By_Make.value));
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.By_Type.value));
	}

	/**
	 * Assert By Make And By State Links
	 */
	public void assertByMakeAndByStateLinks() {
		print("Assert By Make And By State Links");
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.By_Make.value));
		Assert.assertTrue(isElementPresent(Locator.AdvancedSearch.By_State.value));
	}

	/**
	 * Click On By State Link And Assert Result Page.
	 */
	public void clickOnByStateLinkAndAssertResultPage() {
		print("Click On By State Link And Assert Result Page.");
		waitForElementPresentInDom(2);
		clickOn(Locator.AdvancedSearch.By_State.value);
		waitForElementPresentInDom(2);
		Assert.assertTrue(isElementPresent(Locator.State.State_Search_Result.value));
	}

	/**
	 * Click On By Type Link And Assert Result Page.
	 */
	public void clickOnByTypeLinkAndAssertResultPage() {
		print("Click On By Type Link And Assert Result Page.");
		waitForElementPresentInDom(1);
		clickOn(Locator.AdvancedSearch.By_Type.value);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.State.State_Search_Result.value));
	}

	public void clickOnByMakeLinkAndAssertResultPage() {
		print("Click On By Type Make Link And Assert Result Page.");
		waitForElementPresentInDom(1);
		clickOn(Locator.AdvancedSearch.By_Make.value);
		locator = Locator.Search.SearchAllMakes_Result.value;
		Assert.assertTrue(isTextPresent(locator, Strings.PageName.SearchAll_Search_Result.value),
				"Element Locator :" + locator + " Not found");
		waitForElementPresentInDom(2);
	}

	/**
	 * Assert Advanced Search Button.
	 */
	public void assertAdvancedSearchButton() {
		print("Assert Advanced Search Button.");
		locator = Locator.AdvancedSearch.Advanced_Search_Button.value;
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Click On Advanced Search Button And Assert Result Page
	 */
	public void clickOnAdvancedSearchButtonAndAssertResultPage() {
		print("Click On Advanced Search Button And Assert Result Page");
		locator = Locator.AdvancedSearch.Advanced_Search_Button.value;
		clickOn(locator);
		waitForElementPresentInDom(4);
		String advancedSearch = Locator.Search.Advanced_Search_Page.value;
		Assert.assertTrue(isElementPresent(advancedSearch));
	}

	/**
	 * Get All Makes Icon name.
	 */
	public void getAllMakesIconsText() {
		print("Get All Makes Icon name.");
		String makesIcon = "//*[@id='mkBtn']/li";
		int iconCount = getWebDriver().findElements(ByLocator(makesIcon)).size();
		for (int i = 1; i < iconCount; i++) {
			String makeIconName = "//*[@id='mkBtn']/li[" + i + "]//span[1]";
			String iconName = getText(makeIconName);
			print(iconName);
		}
	}

	/**
	 * Click on all make icons and Assert result Page.
	 */
	public void clickOnMakeIconAndAssertResultPage() {
		print("Click on all make icons and Assert result Page");
		String makesIcon = "//*[@id='mkBtn']/li";
		int iconCount = getWebDriver().findElements(ByLocator(makesIcon)).size();
		for (int i = 1; i < iconCount; i++) {
			String makeIconName = "//*[@id='mkBtn']/li[" + i + "]//span[1]";
			String iconName = getText(makeIconName);
			print("Make Icon Name: " + iconName);
			locator = "//*[@id='mkBtn']/li[" + i + "]//a";
			clickOn(locator);
			waitForElementPresentInDom(2);
			String resultPage = Locator.Search.Search_Result_Page.value;
			String makeResultPage = getText(resultPage);
			Assert.assertTrue(makeResultPage.contains(iconName));
			this.clickOnAllMakesBreadcrumbLink();
		}
	}

	/**
	 * Assert Make Link Name.
	 */
	public void assertMakeLink() {
		print("Assert Make Link Name");
		String browseAllMakeLink = Locator.AdvancedSearch.Browse_All_Makes.value;
		clickOn(browseAllMakeLink);
		waitForElementPresentInDom(2);
		String makeLinks = "//*[@id='mkLnks']/div";
		int linkCount = getWebDriver().findElements(ByLocator(makeLinks)).size();
		System.out.println(linkCount);
		for (int i = 2; i <= linkCount; i++) {
			String makelinkName = "//*[@id='mkLnks']/div[" + i + "]//a";
			String linkName = getText(makelinkName);
			print("Make Links Name: " + linkName);
		}
	}

	/**
	 * Click On All Make Link And Assert Result Page.
	 */
	public void clickOnAllMakeLinkAndAssertResultPage() {
		print("Click On All Make Link And Assert Result Page.");
		String browseAllMakeLink = Locator.AdvancedSearch.Browse_All_Makes.value;
		clickOn(browseAllMakeLink);
		waitForElementPresentInDom(2);
		String makeLinks = "//*[@id='mkLnks']/div";
		int linkCount = getWebDriver().findElements(ByLocator(makeLinks)).size();
		System.out.println(linkCount);
		for (int i = 2; i <= linkCount; i++) {
			String makelinkName = "//*[@id='mkLnks']/div[" + i + "]//a";
			String linkName = getText(makelinkName).replaceAll("[()^0-9,]", "");
			clickOn(makelinkName);
			print("Click on Make link name: " + linkName);
			waitForElementPresentInDom(2);
			String resultPage = Locator.Search.Search_Result_Page.value;
			String makeResultPage = getText(resultPage);
			Assert.assertTrue(makeResultPage.contains(linkName));
			this.clickOnAllMakesBreadcrumbLink();
			waitForElementPresentInDom(1);
//			clickOn(Locator.Home.Popular_Makes.value);
//			waitForElementPresentInDom(1);
//			clickOn(Locator.Home.Makes_SearchAll.value);
//			waitForElementPresentInDom(1);
			clickOn(browseAllMakeLink);
		}
	}

	/**
	 * Click On All State Link And Assert Result Page.
	 */
	public void clickOnAllStateLinkAndAssertResultPage() {
		print("Click On All State Link And Assert Result Page.");
		waitForElementPresentInDom(2);
		String stateLinks = Locator.AdvancedSearch.State_Links.value;
		int linkCount = getWebDriver().findElements(ByLocator(stateLinks)).size();
		System.out.println(linkCount);
		for (int i = 1; i <= linkCount; i++) {
			String statelinkName = "//*[@class='browseContainer']/div[" + i + "]//a";
			String linkName = getText(statelinkName).replaceAll("[()^0-9,]", "").trim();
			clickOn(statelinkName);
			print("Click on State link name: " + linkName);
			waitForElementPresentInDom(2);
			String resultPage = Locator.Search.Ad_SearchResult.value;
			String stateResultPage = getText(resultPage);
			print(stateResultPage);
			Assert.assertTrue(stateResultPage.contains(linkName));
			waitForElementPresentInDom(1);
			this.clickOnHomeBreadcrumbLink();
		}
	}

	/**
	 * Assert View All, View New and View Used Button at Motorcycle for Sale Page.
	 */
	public void assertAllButtonAtMotorcycleForSalePage() {
		print("Assert View All, View New and View Used Button at Motorcycle for Sale Page");
		String viewAll = Locator.Types.View_Makes.value;
		Assert.assertTrue(isTextPresent(viewAll, Strings.Button.View_All.value),
				"Element Locator :" + viewAll + " Not found");
		String viewNew = Locator.Types.View_New_Button.value;
		Assert.assertTrue(isTextPresent(viewNew, Strings.Button.View_New.value),
				"Element Locator :" + viewNew + " Not found");
		String viewUsed = Locator.Types.View_Used_Button.value;
		Assert.assertTrue(isTextPresent(viewUsed, Strings.Button.View_Used.value),
				"Element Locator :" + viewUsed + " Not found");
	}

	/**
	 * Click On View Used Button And Assert Used Option Selected In Refine Section
	 */
	public void clickOnViewUsedButtonAndAssertUsedOptionSelectedInRefineSection() {
		print("Click On View Used Button And Assert Used Option Selected In Refine Section");
		String viewUsed = Locator.Types.View_Used_Button.value;
		String getButton = getText(viewUsed);
		String[] text2 = getButton.split(" ");
		String Finaltext = text2[text2.length - 1].replaceAll("[()^0-9, ]", "");
		clickOn(viewUsed);
		String selectOption = "//*[@id='conditionOption']/span/span";
		String selectOptionTxt = getText(selectOption).replaceAll("[-+.^:,] ", "");
		Assert.assertTrue(Finaltext.contentEquals(selectOptionTxt));

	}

	/**
	 * Click On View New Button And Assert New Option Selected In Refine Section
	 */
	public void clickOnViewNewButtonAndAssertUsedOptionSelectedInRefineSection() {
		print("Click On View New Button And Assert New Option Selected In Refine Section");
		String viewUsed = Locator.Types.View_New_Button.value;
		String getButton = getText(viewUsed);
		String[] text2 = getButton.split(" ");
		String Finaltext = text2[text2.length - 1].replaceAll("[()^0-9, ]", "");
		clickOn(viewUsed);
		String selectOption = "//*[@id='conditionOption']/span/span";
		String selectOptionTxt = getText(selectOption).replaceAll("[-+.^:,] ", "");
		Assert.assertTrue(Finaltext.contentEquals(selectOptionTxt));
	}

	/**
	 * Click On View All Button And Assert Makes Section Expend
	 */
	public void clickOnViewAllButtonAndAssertMakesSectionExpend() {
		print("Click On View All Button And Assert Makes Section Expend");
		String viewAllButton = Locator.Types.View_Makes.value;
		clickOn(viewAllButton);
		waitForElementPresentInDom(1);
		locator = Locator.Types.Make_Section.value;
		Assert.assertTrue(isElementPresent(locator, 1));
	}

	/**
	 * Assert Hide All Button After Expand Makes Section
	 */
	public void assertHideAllButtonAfterExpandMakesSection() {
		print("Assert Hide All Button After Expand Makes Section");
		String viewAllButton = Locator.Types.View_Makes.value;
		clickOn(viewAllButton);
		waitForElementPresentInDom(1);
		locator = Locator.Types.Make_Section.value;
		// Assert.assertTrue(WaitForNotPresent(locator, 1));
		String hideAll = Locator.Types.Close_Button.value;
		Assert.assertTrue(isTextPresent(hideAll, Strings.Button.Hide_All.value),
				"Element Locator :" + hideAll + " Not found");
	}

	/**
	 * Click on All Makes links under Motorcycle For Sale page and assert result
	 * page.
	 */
	public void clickOnAllMakesLinkAndAssertResultPage() {
		print("Click on All Makes links under Motorcycle For Sale page and assert result page.");
		String makesLinkSection = "//*[@id='linkList']/ul";
		int count = getWebDriver().findElements(ByLocator(makesLinkSection)).size();
		for (int i = 1; i <= count; i++) {
			String section = "//*[@id='linkList']/ul[" + i + "]/li";
			int linkCount = getWebDriver().findElements(ByLocator(section)).size();
			System.out.println("Links Count" + linkCount);
			for (int j = 1; j <= linkCount; j++) {
				waitForElementPresentInDom(1);
				String links = "//*[@id='linkList']/ul[" + i + "]/li[" + j + "]//*[@class='title']";
				waitForElementPresentInDom(1);
				String linktxt = getText(links).replaceAll("[()^0-9,]", "").toLowerCase();
				print(linktxt);
				clickOn(links);
				waitForElementPresentInDom(2);
				String resultPage = Locator.Search.Ad_SearchResult.value;
				String result = getText(resultPage).toLowerCase();
				print(result);
				Assert.assertTrue(result.contains(linktxt));
				waitForElementPresentInDom(1);
				clickOn(Locator.Makes.Home_Breadcrumb.value);
				waitForElementPresentInDom(2);
				clickOn(Locator.Home.Popular_Types.value);
				waitForElementPresentInDom(1);
				clickOn(Locator.Types.Search_All.value);
				waitForElementPresentInDom(2);
				locator = Locator.Search.Search_Result_Page.value;
				Assert.assertTrue(isTextPresent(locator, Strings.PageName.Search_Result.value),
						"Element Locator :" + locator + " Not found");
				clickOn(Locator.Types.View_Makes.value);
			}
		}
	}

	/**
	 * Click On Hide All Button And Assert Makes Link Section Collapse.
	 */
	public void clickOnHideAllButtonAndAssertMakesLinkSectionCollapse() {
		print("Click On Hide All Button And Assert Makes Link Section Collapse.");
		locator = Locator.Types.Close_Button.value;
		Assert.assertTrue(isElementPresent(locator));
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.Types.Make_Section.value));
		JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
		jse.executeScript("scroll(0, 1080)");
		Assert.assertTrue(isElementPresent(Locator.Types.View_Makes.value));
	}

	/**
	 * Click On Make Link And Assert View New And Used Button At Makes Detales Page.
	 */
	public void clickOnMakeLinkAndAssertViewNewAndUsedButtonAtMakesDetalesPage() {
		print("Click On Make Link And Assert View New And Used Button At Makes Detales Page");
		// clickOn(Locator.Makes.Make_Link.value);
		waitForElementPresentInDom(1);
		String viewNew = Locator.Types.View_New_Button.value;
		Assert.assertTrue(isTextPresent(viewNew, Strings.Button.View_New.value),
				"Element Locator :" + viewNew + " Not found");
		String viewUsed = Locator.Types.View_Used_Button.value;
		Assert.assertTrue(isTextPresent(viewUsed, Strings.Button.View_Used.value),
				"Element Locator :" + viewUsed + " Not found");
	}

	/**
	 * Click On BMW Make Link And Assert Result Page.
	 */
	public void clickOnBMWMakeLinkAndAssertViewAllTrimButtonAtResultPage() {
		print("Click On BMW Make Link And Assert Result Page");
		clickOn(Locator.Types.View_Makes.value);
		waitForElementPresentInDom(1);
		clickOn(Locator.Makes.BMW_Make_Link.value);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.Types.View_Makes.value));
	}

	/**
	 * Click On View All Trim Button And Assert Trim Link Section.
	 */
	public void clickOnViewAllTrimButtonAndAssertTrimLinkSection() {
		print("Click On View All Trim Button And Assert Trim Link Section");
		clickOn(Locator.Types.View_Makes.value);
		waitForElementPresentInDom(1);
		// locator = Locator.Types.Make_Section.value;
		// Assert.assertTrue(WaitForNotPresent(locator, 1));
	}

	/**
	 * Click On Trim Links Under Top Trim Option.
	 */
	public void clickOnTrimLinksUnderTopTrimOption() {
		print("Click On Trim Links Under Top Trim Option");
		for (int i = 1; i <= 3; i++) {
			String trimSection = "//*[@id='linkList']/ul[" + i + "]/li";
			int link = getWebDriver().findElements(ByLocator(trimSection)).size();
			for (int j = 1; j <= link; j++) {
				String trimlinks = "//*[@id='linkList']/ul[" + i + "]/li[" + j + "]/a";
				waitForElementPresentInDom(1);
				String[] txt = getText(trimlinks).split("\\s");
				String linktxt = txt[3];
				print(linktxt);
				clickOn(trimlinks);
				waitForElementPresentInDom(2);
				String resultPage = Locator.Search.Search_Result_Page.value;
				String result = getText(resultPage);
				Assert.assertTrue(result.contains(linktxt));
				waitForElementPresentInDom(1);
				clickOn(Locator.Makes.Home_Breadcrumb.value);
				waitForElementPresentInDom(2);
				clickOn(Locator.Home.Popular_Types.value);
				waitForElementPresentInDom(1);
				clickOn(Locator.Types.Search_All.value);
				waitForElementPresentInDom(2);
				locator = Locator.Search.Search_Result_Page.value;
				Assert.assertTrue(isTextPresent(locator, Strings.PageName.Search_Result.value),
						"Element Locator :" + locator + " Not found");
				this.clickOnBMWMakeLinkAndAssertViewAllTrimButtonAtResultPage();
				clickOn(Locator.Types.View_Makes.value);
			}
		}
	}

	/**
	 * Click On Trim Link And Assert Options Selected Under Refine Section
	 */
	public void clickOnTrimLinkAndAssertOptionsSelectedUnderRefineSection() {
		print("Click On Trim Link And Assert Options Selected Under Refine Section");
		clickOn(Locator.Types.View_Makes.value);
		waitForElementPresentInDom(1);
		String trimLocator = Locator.Makes.Trim_Link.value;
		String txt = getText(trimLocator);
		String[] linkSplit = txt.split("\\s");
		String make = linkSplit[0];
		String model = linkSplit[1];
		String trim = linkSplit[3];
		clickOn(trimLocator);
		String makeOption = "//*[@id='makeOption']/span/span";
		String makeOptionTxt = getText(makeOption).replaceAll("[-+.^:,] ", "");
		Assert.assertTrue(make.contentEquals(makeOptionTxt));
		String modelOption = "//*[@id='modelOption']/span/span";
		String modelOptionTxt = getText(modelOption).replaceAll("[-+.^:,] ", "");
		Assert.assertTrue(modelOptionTxt.contains(model));
		String trimOption = "//*[@id='trimOption']/span/span";
		String trimOptionTxt = getText(trimOption).replaceAll("[-+.^:,] ", "");
		Assert.assertTrue(trimOptionTxt.contentEquals(trim));
	}

	/**
	 * Assert All types icons and Browse All icon at Sale for Type page.
	 */
	public void assertTypesIcon() {
		print("Assert All types icons and Browse All icon at Sale for Type page.");
		String typeIcon = "//*[@class='browseContainer']/ul/li//span[1]";
		int iconCount = getWebDriver().findElements(ByLocator(typeIcon)).size();
		for (int i = 1; i <= iconCount; i++) {
			String icons = "//*[@class='browseContainer']/ul/li[" + i + "]//span[1]";
			String txt = getText(icons);
			print("Type Icon Name is: " + txt);
		}
		String browseAll = "//*[@class='browseContainer']/ul/li/a";
		print("Browse All icon name is: " + getText(browseAll));
	}

	/**
	 * Click On Type Icons And Assert Result Page.
	 */
	public void clickOnTypeIconsAndAssertResultPage() {
		print("Click On Type Icons And Assert Result Page.");
		String typeIcon = "//*[@class='browseContainer']/ul/li//span[1]";
		int iconCount = getWebDriver().findElements(ByLocator(typeIcon)).size();
		for (int i = 1; i <= iconCount; i++) {
			String icons = "//*[@class='browseContainer']/ul/li[" + i + "]//a";
			String txt = getText(icons);
			clickOn(icons);
			waitForElementPresentInDom(2);
			String resultPage = getText(Locator.Search.Ad_SearchResult.value);
			Assert.assertTrue(resultPage.contains(txt));
			waitForElementPresentInDom(1);
			this.clickOnAllMakesBreadcrumbLink();
			waitForElementPresentInDom(1);
			clickOn(Locator.AdvancedSearch.By_Type.value);
		}
	}

	/**
	 * Click On Browse All Types Icon And Assert Result Page.
	 */
	public void clickOnBrowseAllTypesIconAndAssertResultPage() {
		print("Click On Browse All Types Icon And Assert Result Page");
		String browseAllTypes = "//*[@class='browseContainer']/ul/li/a";
		clickOn(browseAllTypes);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.Search.Ad_SearchResult.value));
	}

	/**
	 * Click On Type Icon And Assert Category Option Selected.
	 */
	public void clickOnTypeIconAndAssertCategoryOptionSelected() {
		print("Click On Type Icon And Assert Category Option Selected");
		String typeIcon = Locator.Types.Type_Icon.value;
		String typeTxt = "//*[@class='browseContainer']//li[1]//span[1]";
		String txt = getText(typeTxt);
		clickOn(typeIcon);
		String categoryOption = "//*[@id='categoryOption']/span/span";
		String categoryTxt = getText(categoryOption);
		Assert.assertTrue(categoryTxt.contains(txt));
	}

	/**
	 * Click On Start Over Link And Assert Applied Filter Removed.
	 */
	public void clickOnStartOverLinkAndAssertAppliedFilterRemoved() {
		print("Click On Start Over Link And Assert Applied Filter Removed.");
		locator = Locator.AdvancedSearch.Start_Over_Link.value;
		String matchesCount = "//*[@id='runRefineSearch']/span";
		String count = getText(matchesCount);
		clickOn(locator);
		waitForElementPresentInDom(1);
		String listingCount = getText(matchesCount).replaceAll(",", "");
		Assert.assertNotEquals(listingCount, count);
	}

	/**
	 * Click On Listing With Request Price.
	 */
	public void clickOnListingWithRequestPrice() {
		print("Click On Listing With Request Price.");
		locator = Locator.ListingDetails.RequestPrice_Listing.value;
		clickOn(locator);
		waitForElementPresentInDom(1);
	}

	/**
	 * Assert All Links And Button At Details Page.
	 */
	public void assertAllLinksAndButtonAtDetailsPage() {
		print("Assert All Links And Button At Details Page.");
		String listingName = Locator.ListingDetails.Listing_Name.value;
		Assert.assertTrue(isElementPresent(listingName));
		String visitDealerWebsiteLink = Locator.ListingDetails.Visit_Dealer_Website.value;
		Assert.assertTrue(isElementPresent(visitDealerWebsiteLink));
		String requestPrice = Locator.ListingDetails.Request_Price.value;
		Assert.assertTrue(isElementPresent(requestPrice));
		String estimatePayment = Locator.ListingDetails.Estimate_Payment.value;
		Assert.assertTrue(isElementPresent(estimatePayment));
		String email = Locator.ListingDetails.Email.value;
		Assert.assertTrue(isElementPresent(email));
		String save = Locator.ListingDetails.Save.value;
		Assert.assertTrue(isElementPresent(save));
	}

	/**
	 * Assert Request Price button at Listing details page.
	 */
	public void assertRequestPriceButton() {
		print("Assert Request Price button at Listing details page.");
		Assert.assertTrue(isElementPresent(Locator.ListingDetails.Request_Price.value));
	}

	/**
	 * Click On Listing With Save TagLine at search result page and Assert result
	 * Page.
	 */
	public void clickOnListingWithSaveTagLineAndAssertResultPage() {
		print("Click On Listing With Save TagLine at search result page and Assert result Page.");
		String listing = "(//*[@class='tagline smallest' and contains(text(),'Save')])[1]";
		String saveText = getText(listing).replaceAll(" ", "").toLowerCase();
		waitForElementPresentInDom(1);
		clickOn(listing);
		waitForElementPresentInDom(1);
		String saveTag = "(//*[@class='locationColor']/span)[1]";
		String saveTagLine = getText(saveTag).replaceAll("[-, ]", "").toLowerCase();
		Assert.assertTrue(saveTagLine.equals(saveText));
	}

	/**
	 * Click on listing with Get Quote and assert Get Quote button at listing
	 * details page.
	 */
	public void assertGetQuoteButton() {
		print("Click on listing with Get Quote and assert Get Quote button at listing details page.");
		String getQuote = "(//*[@id=\"listingsContainer\"]//*[@id='bestPrice'])[1]";
		waitForElementPresentInDom(1);
		String getQuoteTxt = getText(getQuote);
		locator = Locator.ListingDetails.Get_Quote_Listing.value;
		clickOn(locator);
		waitForElementPresentInDom(1);
		String getQuoteButton = Locator.ListingDetails.Get_Quote_Button.value;
		String buttonTxt = getText(getQuoteButton);
		Assert.assertTrue(buttonTxt.equals(getQuoteTxt));
	}

	/**
	 * Click On Get Quote Button And Assert PopUp at listing details page.
	 */
	public void clickOnGetQuoteButtonAndAssertPopUp() {
		print("Click On Get Quote Button And Assert PopUp at listing details page.");
		String getQuoteButton = Locator.ListingDetails.Get_Quote_Button.value;
		String buttonTxt = getText(getQuoteButton);
		clickOn(getQuoteButton);
		waitForElementPresentInDom(1);
		String popUp = Locator.ListingDetails.Tagline_PopUp.value;
		String popUpHeading = getText(popUp);
		print(popUpHeading);
		Assert.assertTrue(popUpHeading.equals(buttonTxt));
	}

	/**
	 * Click On Get Quote Button And Assert Phone Number.
	 */
	public void clickOnGetQuoteButtonAndAssertPhoneNumber() {
		print("Click On Get Quote Button And Assert Phone Number.");
		String call = Locator.ListingDetails.Phone_Number_ListingDetails.value;
		String callNumber = getText(call).replaceAll("[-,a-z,A-Z \r\n" + 
				" ]", "");
		print("Phone number is: " + callNumber);
		waitForElementPresentInDom(1);
		clickOn(Locator.ListingDetails.Get_Quote_Button.value);
		String number = Locator.ListingDetails.Phone_Number_GetQuote.value;
		String phoneNumber = getText(number).replaceAll("[a-z,A-Z- ]", "");
		print("Phone number on Get Quote pop up: " + phoneNumber);
		Assert.assertTrue(phoneNumber.contains(callNumber));
	}

	/**
	 * Enter All details And Click On Contact Button On GetQuote PopUp.
	 */
	public void enterAlldetailsAndClickOnContactButtonOnGetQuotePopUp() {
		print("Enter first Name");
		String fname = propertyReader.readApplicationFile("ContactFname");
		locator = Locator.ListingDetails.GetQuote_Fname.value;
		sendKeys(locator, fname);

		waitForElementPresentInDom(1);
		print("Enter Last Name");
		String lname = propertyReader.readApplicationFile("ContactLname");
		String LastName_locator = Locator.ListingDetails.GetQuote_Lname.value;
		sendKeys(LastName_locator, lname);

		waitForElementPresentInDom(1);
		print("Enter email Id");
		String emailID = propertyReader.readApplicationFile("ContactEmail");
		String ContactEmail_locator = Locator.ListingDetails.GetQuote_Email.value;
		sendKeys(ContactEmail_locator, emailID);

		// waitForElementPresentInDom(1);
		// print("Click on Verify Captcha check box");
		// String VerifyCheckBox_locator = Locator.ListingDetails.Verify_Checkbox.value;
		// waitForElementPresentInDom(2);
		// getFirstVisible(VerifyCheckBox_locator).click();
		// print("Clicked");
	}

	/**
	 * Click On Listing With OBO And Assert OBO Tagline At Listing Details Page.
	 */
	public void clickOnListingWithOBOAndAssertOBOTaglineAtListingDetailsPage() {
		print("Click On Listing With OBO And Assert OBO Tagline At Listing Details Page.");
		waitForElementPresentInDom(1);
		locator = Locator.ListingDetails.OBO_Listing.value;
		String obo = getText(locator);
		clickOn(locator);
		waitForElementPresentInDom(1);
		String oboTagline = Locator.ListingDetails.Tagline.value;
		String oboTaglineTxt = getText(oboTagline);
		Assert.assertTrue(oboTaglineTxt.contains(obo));
	}

	/**
	 * Click On Listing With Out The Door And Assert Out The Door Tagline At Listing
	 * Details Page.
	 */
	public void clickOnListingWithOutTheDoorAndAssertOutTheDoorTaglineAtListingDetailsPage() {
		print("Click On Listing With Out The Door And Assert Out The Door Tagline At Listing Details Page.");
		waitForElementPresentInDom(1);
		String pages = "//*[@class='list-unstyled']//*[contains(text(),'Last')]";
		String totalPages = getWebDriver().findElement(ByLocator(pages)).getAttribute("data-page");
		print(totalPages);
		int result = Integer.parseInt(totalPages);
		for(int i=1;i<=result; i++) {
		locator = Locator.ListingDetails.OutTheDoor_Listing.value;
		if(isElementPresent(locator)==true) {
		String txt = getText(locator).toLowerCase();
		print(txt);
		clickOn(locator);
		waitForElementPresentInDom(1);
		String Tagline = Locator.ListingDetails.Tagline.value;
		String taglineTxt = getText(Tagline).toLowerCase();
		print(taglineTxt);
		Assert.assertTrue(taglineTxt.contains(txt));
		break;
		}
		else {
			clickOn(Locator.ListingDetails.NextPage_Button.value);
		}
		}
	}

	/**
	 * Click On Listing With Warranty And Assert Warranty Tagline At Listing Page.
	 */
	public void clickOnListingWithWarrantyAndAssertWarrantyTaglineAtListingPage() {
		print("Click On Listing With Warranty And Assert Warranty Tagline At Listing Page");
		locator = Locator.ListingDetails.Warranty_Listing.value;
		if (isElementPresent(locator)) {
			waitForElementPresentInDom(1);
			String txt = getText(locator).toLowerCase();
			clickOn(locator);
			String Tagline = Locator.ListingDetails.Tagline.value;
			String taglineTxt = getText(Tagline).toLowerCase();
			print(taglineTxt);
			Assert.assertTrue(taglineTxt.contains(txt));
		} else {
			String next = Locator.ListingDetails.NextPage_Button.value;
			clickOn(next);
			waitForElementPresentInDom(1);
			String txt = getText(locator).toLowerCase();
			clickOn(locator);
			String Tagline = Locator.ListingDetails.Tagline.value;
			String taglineTxt = getText(Tagline).toLowerCase();
			print(taglineTxt);
			Assert.assertTrue(taglineTxt.contains(txt));
		}
	}

	/**
	 * Click On Listing With Reduced And Assert Reduced Tagline At Listing Page.
	 */
	public void clickOnListingWithReducedAndAssertReducedTaglineAtListingPage() {
		print("Click On Listing With Reduced And Assert Reduced Tagline At Listing Page");
		locator = Locator.ListingDetails.Reduced_Listing.value;
		for (int i = 1; i >= 100; i++) {
			if (isElementPresent(locator) == true) {
				String txt = getText(locator).toLowerCase();
				clickOn(locator);
				String Tagline = Locator.ListingDetails.Tagline.value;
				String taglineTxt = getText(Tagline).toLowerCase();
				print(taglineTxt);
				Assert.assertTrue(taglineTxt.contains(txt));
				break;
			} else {
				String next = Locator.ListingDetails.NextPage_Button.value;
				clickOn(next);
				waitForElementPresentInDom(1);

			}
			// String txt = getText(locator).toLowerCase();
			// clickOn(locator);
			// String Tagline = Locator.ListingDetails.Tagline.value;
			// String taglineTxt = getText(Tagline).toLowerCase();
			// print(taglineTxt);
			// Assert.assertTrue(taglineTxt.contains(txt));
		}
	}

	/**
	 * Click On Listing With Reduced And Assert Reduced Tagline At Listing Page.
	 */
	public void clickOnListingWithTestingAndAssertTestingTaglineAtListingPage() {
		print("Click On Listing With Testing And Assert Testing Tagline At Listing Page");
		locator = Locator.ListingDetails.Testing_Listing.value;
		if (isElementPresent(locator)) {
			waitForElementPresentInDom(1);
			String txt = getText(locator).toLowerCase();
			clickOn(locator);
			String Tagline = Locator.ListingDetails.Tagline.value;
			String taglineTxt = getText(Tagline).toLowerCase();
			print(taglineTxt);
			Assert.assertTrue(taglineTxt.contains(txt));
		} else {
			String next = Locator.ListingDetails.NextPage_Button.value;
			clickOn(next);
			waitForElementPresentInDom(1);
			String txt = getText(locator).toLowerCase();
			clickOn(locator);
			String Tagline = Locator.ListingDetails.Tagline.value;
			String taglineTxt = getText(Tagline).toLowerCase();
			print(taglineTxt);
			Assert.assertTrue(taglineTxt.contains(txt));
		}
	}

	/**
	 * Click On Listing With Financing And Assert Financing Tagline At Listing Page.
	 */
	public void clickOnListingWithFinancingAndAssertFinancingTaglineAtListingPage() {
		print("Click On Listing With Financing And Assert Financing Tagline At Listing Page");
		locator = Locator.ListingDetails.Financing_Listing.value;
		if (isElementPresent(locator)) {
			waitForElementPresentInDom(1);
			String txt = getText(locator).toLowerCase();
			clickOn(locator);
			String Tagline = Locator.ListingDetails.Tagline.value;
			String taglineTxt = getText(Tagline).toLowerCase();
			print(taglineTxt);
			Assert.assertTrue(taglineTxt.contains(txt));
		} else {
			String next = Locator.ListingDetails.NextPage_Button.value;
			clickOn(next);
			waitForElementPresentInDom(1);
			String txt = getText(locator).toLowerCase();
			clickOn(locator);
			String Tagline = Locator.ListingDetails.Tagline.value;
			String taglineTxt = getText(Tagline).toLowerCase();
			print(taglineTxt);
			Assert.assertTrue(taglineTxt.contains(txt));
		}
	}

	public void clickOnListingWithPhoneNumberAndAssertPhoneNumberAtListingPage() {
		print("Click On Listing With Phone Number And Assert Phone Number At Listing Page");
		locator = Locator.ListingDetails.PhoneNumber_Listing.value;
		if (isElementPresent(locator)) {
			waitForElementPresentInDom(1);
			String txt = getText(locator);
			print(txt);
			String listing = "(//*[@class='seller-phone pointer']/span[2]/ancestor::div[3]//div[5])[1]";
			clickOn(listing);
			print("Clicked on Listing");
			waitForElementPresentInDom(1);
			String phoneNumber = Locator.ListingDetails.Phone_Number_ListingDetails.value;
			String pHTxt = getText(phoneNumber);
			print (pHTxt);
			Assert.assertTrue(pHTxt.contains(txt));
		} else {
			String next = Locator.ListingDetails.NextPage_Button.value;
			clickOn(next);
			waitForElementPresentInDom(1);
			String txt = getText(locator).toLowerCase();
			String listing = "(//*[@class='seller-phone pointer']/span[2]/ancestor::div[3]//div[5])[1]";
			clickOn(listing);
			waitForElementPresentInDom(1);
			String phoneNumber = Locator.ListingDetails.Phone_Number_ListingDetails.value;
			String pHTxt = getText(phoneNumber);
			Assert.assertTrue(pHTxt.contains(txt));
		}
	}

	/**
	 * Assert Save This Listing Tab Highlighted After Saved Listing.
	 */
	public void assertSaveThisListingTabHighlightedAfterSavedListing() {
		print("Assert Save This Listing Tab Highlighted After Saved Listing.");
		this.clickOnListingAtSearchResultPage();
		print("Assert Listing Name");
		// String listingName =
		// getWebDriver().findElement(By.xpath("(//*[@class='detail-title']//h2)[1]")).getText();
		String saveIcon = Locator.Search.Save_Listing.value;
		clickOn(saveIcon);
		waitForElementPresentInDom(1);
		String saveListingButton = Locator.Search.Save_Listing_Button.value;
		clickOn(saveListingButton);
		locator = Locator.ListingDetails.Saved_This_Listing.value;
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Assert Saved icon Highlighted After Saved Listing.
	 */
	public void assertSavedIconHighlightedAfterSavedListing() {
		print("Assert Saved icon Highlighted After Saved Listing.");
		this.clickOnListingAtSearchResultPage();
		String saveIcon = Locator.Search.Save_Listing.value;
		clickOn(saveIcon);
		waitForElementPresentInDom(1);
		String saveListingButton = Locator.Search.Save_Listing_Button.value;
		clickOn(saveListingButton);
		locator = Locator.ListingDetails.Saved_Icon.value;
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * Assert Listing is Saved After LoggedIn.
	 */
	public void assertListingSavedAfterLoggedIn() {
		print("Assert Listing is Saved After LoggedIn.");
		this.clickOnListingAtSearchResultPage();
		String saveIcon = Locator.Search.Save_Listing.value;
		clickOn(saveIcon);
		waitForElementPresentInDom(1);
		String saveListingButton = Locator.Search.Save_Listing_Button.value;
		clickOn(saveListingButton);
	}

	/**
	 * Assert save icon is highlighted after saved.
	 */
	public void assertSavedIconHighlighted() {
		print("Assert save icon is highlighted after saved.");
		waitForElementPresentInDom(1);
		String saveListingButton = Locator.Search.Save_Listing_Button.value;
		clickOn(saveListingButton);
		locator = Locator.ListingDetails.Saved_Icon.value;
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(locator));
	}

	public void assertOkAndOpenButtonOnCallPopUpAtListingDetailsPage() {
		print("Assert Ok And Open Button On Call Pop Up At Listing Details Page");
		this.clickOnListingAtSearchResultPage();
		String tel = getWebDriver().findElement(ByLocator(Locator.ListingDetails.Phone_Number_ListingDetails.value))
				.getAttribute("href").replaceAll("[a-z,A-Z,: ]", "");

		print(tel);
		String telNum = getText("(//*[contains(@class,'callButton telHref')])[1]/span").replaceAll("[-, ]", "");
		print(telNum);
		Assert.assertTrue(telNum.contains(tel));
	}

	public void assertAcceptCallPopUpAtListingDetailsPage() {
		print("Assert accept Call Pop Up At Listing Details Page");
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.Phone_Number_ListingDetails.value);
		waitForElementPresentInDom(1);
		getWebDriver().switchTo().alert().accept();
	}

	public void assertCancelCallPopUpAtListingDetailsPage() {
		print("Assert Cancel Call Pop Up At Listing Details Page");
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.Phone_Number_ListingDetails.value);
		waitForElementPresentInDom(1);
		getWebDriver().switchTo().alert().dismiss();
	}

	/**
	 * Assert Dealer logo At Listing Details Page.
	 */
	public void assertDealerLogoAtListingDetailsPage() {
		print("Assert Dealer logo At Listing Details Page");
		this.clickOnListingAtSearchResultPage();
		Assert.assertTrue(isElementPresent(Locator.ListingDetails.Dealer_Logo.value));
	}

	public void assertDealerAddressAndWhatIsMyTraderWorthButton() {
		print("Assert Dealer Address And What Is My Trader Worth Button At Listing Details Page");
		String dealer = Locator.ListingDetails.Dealer_Name.value;
		String getText = getText(dealer).toLowerCase();
		print(getText);
		this.clickOnListingAtSearchResultPage();
		Assert.assertTrue(isElementPresent(Locator.ListingDetails.What_My_TradeIn.value));
		String address = Locator.ListingDetails.Dealer_Address.value;
		String addressTxt = getText(address).toLowerCase();
		print(addressTxt);
		Assert.assertTrue(addressTxt.contains(getText));
	}

	public List<String> getTabsList() {
		print("Get find by links from list");
		EnumSet<TabsAtListingDetails> all = EnumSet.allOf(TabsAtListingDetails.class);
		List<String> list = new ArrayList<>(all.size());
		for (TabsAtListingDetails s : all) {
			list.add(s.value);
		}
		return list;
	}

	/**
	 * Assert All Tabs in Right Rail below dealer address at Listing details page.
	 */
	public void assertAllTabsInRightRail() {
		print("Assert All Tabs in Right Rail below dealer address at Listing details page.");
		this.clickOnListingAtSearchResultPage();
		List<String> allFindByLists = getTabsList();
		String tabAllTxt = allFindByLists.toString();
		waitForElementPresentInDom(1);
		String tabs = "(//*[contains(@class,'btn-group-vertical')])[1]/a";
		int tabsCount = getWebDriver().findElements(ByLocator(tabs)).size();
		for (int i = 1; i <= tabsCount; i++) {
			String tabsTxt = "(//*[contains(@class,'btn-group-vertical')])[1]/a[" + i + "]/span[1]";
			String txt = getText(tabsTxt).toLowerCase();
			Assert.assertTrue(tabAllTxt.contains(txt));
		}
	}

	/**
	 * Assert More From This Dealer Redirect To Dealer Listing Page at Listing
	 * details page.
	 */
	public void assertMoreFromThisDealerRedirectToDealerListingPage() {
		print("Assert More From This Dealer Redirect To Dealer Listing Page at Listing details page.");
		this.clickOnListingAtSearchResultPage();
		String dealerName = Locator.ListingDetails.Dealer_Address.value;
		String dealerNameTxt = getText(dealerName).toLowerCase();
		clickOn(Locator.ListingDetails.More_From_Dealer.value);
		waitForElementPresentInDom(1);
		String dealerListing = Locator.Dealer.Dealer_ResultPage.value;
		String dealer = getText(dealerListing).toLowerCase();
		Assert.assertTrue(dealer.contains(dealerNameTxt));
	}

	/**
	 * Click On Save This Listing Tab And Assert Listing Saved.
	 */
	public void clickOnSaveThisListingTabAndAssertListingSaved() {
		print("Click On Save This Listing Tab And Assert Listing Saved.");
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.Save_Listing_Tab.value);
		waitForElementPresentInDom(1);
		String saveListingButton = Locator.Search.Save_Listing_Button.value;
		clickOn(saveListingButton);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.ListingDetails.Saved_This_Listing.value));
	}

	/**
	 * Enter Valid Details in Send To Friends Pop-Up.
	 */
	public void enterValidDetailsInSendToFriendsPopUp() {
		print("Enter Valid Details in Send To Friends Pop-Up.");
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.SendTo_Friend_Tab.value);
		waitForElementPresentInDom(1);
		String popUpTxt = getText(Locator.ListingDetails.SendTo_Friend_PopUp.value);
		Assert.assertTrue(popUpTxt.equals("Send to Friend"));
		sendKeys(Locator.ListingDetails.Friend_Email.value, "test360.2000@gmail.com");
		waitForElementPresentInDom(1);
		sendKeys(Locator.ListingDetails.Your_Name.value, "Vivek");
		waitForElementPresentInDom(1);
		sendKeys(Locator.ListingDetails.Your_LName.value, "Test");
		waitForElementPresentInDom(1);
		sendKeys(Locator.ListingDetails.Your_Email.value, "test360.1999@gmail.com");
		waitForElementPresentInDom(1);
		// String captcha = Locator.ListingDetails.Captcha.value;
		// getFirstVisible(captcha).click();
		// waitForElementPresentInDom(1);
		// clickOn(Locator.ListingDetails.FriendEmail_Contact_Button.value);
	}

	/**
	 * Assert Loan Calculated At Estimate Paymant PopUp.
	 */
	public void assertLoanCalculatedAtEstimatePaymantPopUp() {
		print("Assert Loan Calculated At Estimate Paymant PopUp.");
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.Estimate_Payment_Tab.value);
		this.estimatePaymentWindow();

	}

	/**
	 * Click On print, Dealer Website and sell My Motorcycle tab and Assert Result
	 * at Listing details page.
	 */
	public void clickOnTabsAndAssertResultPage() {
		print("Click On print, Dealer Website and sell My Motorcycle tab and Assert Result at Listing details page.");
		this.clickOnListingAtSearchResultPage();
		String dealerWebsite = getWebDriver().findElement(ByLocator(Locator.ListingDetails.Dealer_Website.value))
				.getAttribute("href");
		String websiteURL = "http";
		print(dealerWebsite);
		Assert.assertTrue(dealerWebsite.contains(websiteURL));
		waitForElementPresentInDom(1);
		String print = getWebDriver().findElement(ByLocator(Locator.ListingDetails.Print_Listing.value))
				.getAttribute("href");
		String printString = "print";
		print(print);
		Assert.assertTrue(print.contains(printString));
		waitForElementPresentInDom(1);
		getWebDriver().switchTo().frame("google_ads_iframe_/29685107/CycleTrader/CycleTrader_Desktop/DT_0");

		String sell = getWebDriver().findElement(ByLocator(Locator.ListingDetails.Sell_Motorcycle.value))
				.getAttribute("href");
		String sellUrl = "/sell-motorcycles";
		getWebDriver().switchTo().defaultContent();
		Assert.assertTrue(sell.contains(sellUrl));
	}

	public void assertShareIconsLink() {
		print("Assert share icons link at listing details page.");
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.Share_Link.value);
		waitForElementPresentInDom(1);
		String facebook = getWebDriver().findElement(ByLocator(Locator.ListingDetails.Facebook_icon.value))
				.getAttribute("style");
		String ftxt = "facebook";
		Assert.assertTrue(facebook.contains(ftxt));
		String twitter = getWebDriver().findElement(ByLocator(Locator.ListingDetails.Twitter_Icon.value))
				.getAttribute("style");
		String ttxt = "twitter";
		Assert.assertTrue(twitter.contains(ttxt));
		String pinterest = getWebDriver().findElement(ByLocator(Locator.ListingDetails.Pinterest_Icon.value))
				.getAttribute("style");
		String ptxt = "pinterest";
		Assert.assertTrue(pinterest.contains(ptxt));
	}

	/**
	 * Assert Play Brochure Icon Changed to Pause Brochure After Clicking.
	 */
	public void assertPlayBrochureIconChangedAfterClicking() {
		print("Assert Play Brochure Icon Changed to Pause Brochure After Clicking");
		String brochureIcon = Locator.Search.Brochure_Icon_Listing.value;
		clickOn(brochureIcon);
		waitForElementPresentInDom(1);
		locator = Locator.ListingDetails.Brochure_Icon.value;
		clickOn(locator);
		Assert.assertTrue(isTextPresent(locator, "Pause Brochure"), "Element Locator :" + locator + " Not found");
	}

	/**
	 * Assert Video After Clicking On Video Link
	 */
	public void assertVideoAfterClickingOnVideoLink() {
		print("Assert Video After Clicking On Video Link");
		String videoIcon = Locator.Search.Video_Icon_Listing.value;
		clickOn(videoIcon);
		waitForElementPresentInDom(1);
		locator = Locator.ListingDetails.Watch_Video.value;
		clickOn(locator);
		String videoWindow = "(//*[@id='Gallery']//*[@class='rsVideoContainer'])[1]";
		Assert.assertTrue(isElementPresent(videoWindow));
	}

	/**
	 * Assert image section at listing details page.
	 */
	public void assertListingImageSection() {
		print("Assert image section at listing details page.");
		this.clickOnListingAtSearchResultPage();
		Assert.assertTrue(isElementPresent(Locator.ListingDetails.Listing_Image_Section.value));
	}

	public void assertPrivateSellerAddress() {
		print("Assert private seller address at listing details page.");
		locator = Locator.AdvancedSearch.Advanced_Seller_Type.value;
		clickOn(locator);
		String sellerType = Locator.AdvancedSearch.Private_Seller_Type.value;
		clickOn(sellerType);
		waitForElementPresentInDom(1);
		String seller = getText(Locator.Search.Seller_Name.value).toLowerCase();
		this.clickOnListingAtSearchResultPage();
		String sellerAddress = getText(Locator.ListingDetails.Seller_Address.value).toLowerCase();
		Assert.assertTrue(sellerAddress.contains(seller));
	}

	public void assertReportThisAdTab() {
		print("Assert report this Ad tab at private listing details page.");
		locator = Locator.AdvancedSearch.Advanced_Seller_Type.value;
		clickOn(locator);
		String sellerType = Locator.AdvancedSearch.Private_Seller_Type.value;
		clickOn(sellerType);
		waitForElementPresentInDom(1);
		this.clickOnListingAtSearchResultPage();
		String reportThisAd = Locator.ListingDetails.Report_This_Ad.value;
		Assert.assertTrue(isElementPresent(reportThisAd));
	}

	public List<String> getResourceList() {
		print("Get Resource List");
		EnumSet<ResourceList> all = EnumSet.allOf(ResourceList.class);
		List<String> list = new ArrayList<>(all.size());
		for (ResourceList s : all) {
			list.add(s.value);
		}
		return list;
	}

	/**
	 * Assert All Links Under Resource List
	 */
	public void assertAllLinksUnderResourceList() {
		print("Assert All Links Under Resource List");
		locator = Locator.AdvancedSearch.Advanced_Seller_Type.value;
		clickOn(locator);
		String sellerType = Locator.AdvancedSearch.Private_Seller_Type.value;
		clickOn(sellerType);
		waitForElementPresentInDom(1);
		this.clickOnListingAtSearchResultPage();
		List<String> allResourceList = getResourceList();
		String resouce = allResourceList.toString();
		print(resouce);
		waitForElementPresentInDom(1);
		int links = getWebDriver().findElements(ByLocator(Locator.ListingDetails.Resource_List.value)).size();
		for (int i = 1; i <= links; i++) {
			String listURL = "//*[contains(@class,'resourceList')]/li[" + i + "]/a";
			String url = getWebDriver().findElement(ByLocator(listURL)).getAttribute("href");
			print(url);
			// waitForElementPresentInDom(1);
			Assert.assertTrue(resouce.contains(url));
		}
	}

	public void enterAlldetails() {
		String issue = Locator.ListingDetails.Issue.value;
		clickOn(issue);
		waitForElementPresentInDom(1);
		String reason = Locator.ListingDetails.Reason.value;
		sendKeys(reason, "Testing");
		waitForElementPresentInDom(1);
		String email = Locator.ListingDetails.Your_Email.value;
		sendKeys(email, "test360.2000@gmail.com");
	}

	public void assertReportThisAdPopUpAndInsertDetails() {
		print("Assert report this Ad pop up and insert all details at private listing details page.");
		locator = Locator.AdvancedSearch.Advanced_Seller_Type.value;
		clickOn(locator);
		String sellerType = Locator.AdvancedSearch.Private_Seller_Type.value;
		clickOn(sellerType);
		waitForElementPresentInDom(1);
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.Report_This_Ad.value);
		waitForElementPresentInDom(2);
		String popUp = getText(Locator.ListingDetails.SendTo_Friend_PopUp.value);
		print(popUp);
		Assert.assertEquals(popUp, "Report This Ad");
		this.enterAlldetails();
	}

	/**
	 * Assert Details From Seller Section.
	 */
	public void assertDetailsFromSellerSection() {
		clickOn(Locator.AdvancedSearch.Advanced_Seller_Type.value);
		waitForElementPresentInDom(1);
		clickOn(Locator.AdvancedSearch.Private_Seller_Type.value);
		this.clickOnListingAtSearchResultPage();
		clickOn(Locator.ListingDetails.Report_This_Ad.value);
		waitForElementPresentInDom(2);
		Assert.assertTrue(isElementPresent(Locator.ListingDetails.Details_From_Seller.value));
	}

	/**
	 * ========================================================================================
	 * Click on Save This Search button at search result page.
	 * ========================================================================================
	 */
	public void clickOnSaveThisSearchButton() {
		print("Click on Save This Search button at search result page.");
		// waitForElementPresentInDom(2);
		// String popUp= Locator.Search.Describe_You_PopUp.value;
		// clickOn(popUp);
		waitForElementPresentInDom(1);
		((JavascriptExecutor) getWebDriver()).executeScript("scroll(0,400)");
		locator = Locator.Search.Save_This_Search_Button.value;
		clickOn(locator);
	}

	/**
	 * =============================================================================================
	 * Assert Search is saved after login.
	 * =============================================================================================
	 */
	public void assertSearchSavedAfterLogin() {
		print("Assert Search is saved after login");
		clickOn(Locator.Search.Save_Search_Button.value);
		String buttonTxt = getText(Locator.Search.Save_This_Search_Button.value);
		print(buttonTxt);
		if (buttonTxt == "Saved") {
			clickOn(Locator.Search.Save_Search.value);
		}
	}

	/**
	 * ==================================================================================================
	 * Click On Save Listing Icon On Listing Grid
	 * ==================================================================================================
	 */
	public void clickOnSaveListingIconOnListingGrid() {
		print("Click On Save Listing Icon On Listing Grid.");
		String save = Locator.Search.Save_Listing_Icon.value;
		clickOn(save);
	}

	/**
	 * ===================================================================================================
	 * Click On Save Listing Button On Save This Listing PopUp.
	 * ===================================================================================================
	 */
	public void clickOnSaveListingButtonOnSaveThisListingPopUp() {
		print("Click On Save Listing Button On Save This Listing PopUp.");
		String saveListingButton = Locator.Search.Save_Listing_Button.value;
		isElementPresent(saveListingButton, 20);
		clickOn(saveListingButton);
	}

	public void clickOnSaveListingButtonAndAssertListingSaved() {
		print("Click On Save Listing Button And Assert Listing Saved.");
		String saveListingButton = Locator.Search.Save_Listing_Button.value;
		isElementPresent(saveListingButton, 20);
		clickOn(saveListingButton);
		String saved = Locator.Search.Save_Listing_Icon.value;
		if (getWebDriver().findElement(ByLocator(saved)).isDisplayed()) {
			waitForElementPresentInDom(2);
			isElementPresent(saved, 50);
			String txt = getText(saved);
			Assert.assertEquals(txt, "Saved");
		} else {
			waitForElementPresentInDom(1);
			String doneButton = Locator.Search.Already_Saved_Done.value;
			clickOn(doneButton);
			waitForElementPresentInDom(2);
			isElementPresent(saved, 50);
			String txt = getText(saved);
			Assert.assertEquals(txt, "Saved");
		}
		// waitForElementPresentInDom(2);
		// String saved = Locator.Search.Save_Listing_Icon.value;
		// isElementPresent(saved, 50);
		// String txt = getText(saved);
		// Assert.assertEquals(txt, "Saved");
	}
}
