package com.trader.pagehelper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.trader.locators.Locator;
import com.trader.utils.DriverHelper;

/**
 * =====================================================================================================
 * 
 * @author viveks
 * 
 *         This class contains all methods related to My Trader Page.
 *         =============================================================================================
 */
public class MyTraderHelper extends DriverHelper {

	public MyTraderHelper(WebDriver driver) {
		super(driver, getSoftAssert());
	}

	/**
	 * ===============================================================================
	 * Assert My Trader page message.
	 * ===============================================================================
	 */
	public void assertMyTraderPage() {
		print("Welcome to My Trader text on My Trader page");
		waitForElementPresentInDom(2);
		locator = Locator.MyTrader.MyTrader_Message.value;
		Assert.assertTrue(isTextPresent(locator, "Welcome to MyTrader"), "Element Locator :" + locator + " Not found");
	}

	/**
	 * =================================================================================
	 * Assert Saved Listing and Saved Searches section.
	 * =================================================================================
	 */
	public void assertSavedListingAndSavedSearchesSection() {
		print("Assert Saved Listing Section");
		locator = Locator.MyTrader.Saved_Listings_Section.value;
		Assert.assertTrue(isElementPresent(locator));
		print("Assert Saved Searches Section");
		String SavedSearches_locator = Locator.MyTrader.Saved_Searches_Section.value;
		Assert.assertTrue(isElementPresent(SavedSearches_locator));
	}

	/**
	 * ==========================================================================
	 * Click on Edit button under Saved Listing Section.
	 * ==========================================================================
	 */
	public void clickOnEditButtonOnSavedListings() {
		print("Click on Edit under Saved Listing Section");
		locator = Locator.MyTrader.Saved_Listing_Edit.value;
		clickOn(locator);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Your_Saved_Listings_Page.value));
	}

	/**
	 * ============================================================================
	 * Click on Edit button under Saved Searches Section.
	 * ============================================================================
	 */
	public void clickOnEditButtonOnSavedSearches() {
		print("Click on Edit under Saved Searches Section");
		locator = Locator.MyTrader.Saved_Search_Edit.value;
		clickOn(locator);
		waitForElementPresentInDom(1);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Your_Saved_Searches.value));
	}

	/**
	 * =============================================================================
	 * Click on My Trader Home Icon.
	 * =============================================================================
	 */
	public void clickOnMyTraderHomeIcon() {
		print("Click on My Trader Home Icon");
		locator = Locator.MyTrader.MyTrader_Home.value;
		clickOn(locator);
	}

	/**
	 * ============================================================================
	 * Click on Sell A Motorcycle Link.
	 * ============================================================================
	 */
	public void clickOnSellAMotorcycleLink() {
		print("Click on Sell A Motorcycle Link");
		locator = Locator.MyTrader.Sell_A_Motorcycle.value;
		waitForElementPresentInDom(2);
		clickOn(locator);
	}

	/**
	 * ============================================================================
	 * Click on Account Setting Link
	 * ============================================================================
	 */
	public void clickOnAccountSettingLink() {
		print("Click on Account Setting Link");
		locator = Locator.MyTrader.Account_Setting.value;
		clickOn(locator);
	}

	/**
	 * ===============================================================================
	 * Update First name and last name.
	 * ===============================================================================
	 */
	public void updateFirstNameAndlastName() {
		print("Update First name and last name");
		DateFormat txt = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String fNamePostFix = "Vivek" + txt.format(date);
		String lNamePostFix = "Sharma" + txt.format(date);
		sendKeys(Locator.MyTrader.First_Name.value, fNamePostFix);
		sendKeys(Locator.MyTrader.Last_Name.value, lNamePostFix);
	}

	/**
	 * =================================================================================
	 * Click on Save Changes Button.
	 * =================================================================================
	 */
	public void clickOnSaveChangesButton() {
		print("Click on Save Changes Button");
		locator = Locator.MyTrader.Save_Changes_Button.value;
		clickOn(locator);
	}

	/**
	 * =============================================================================
	 * Assert Update changes Confirmation message.
	 * =============================================================================
	 */
	public void assertUpdateChangesMessage() {
		print("Assert Updates Changes Confirmation Message");
		locator = Locator.MyTrader.Updated_Changes_Messages.value;
		Assert.assertTrue(isElementPresent(locator));
	}

	/**
	 * =================================================================================
	 * Assert All tabs at My Trader page.
	 * =================================================================================
	 */
	public void assertAllTabsInRightSide() {
		print("Assert All tabs at My Trader page.");
		Assert.assertTrue(isTextPresent(Locator.MyTrader.My_Listing.value, "My Listings"));
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Saved_Listing.value, "Saved Listings"));
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Saved_Searches.value, "Saved Searches"));
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Sell_A_Motorcycle.value, "Sell a Motorcycle"));
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Account_Setting.value, "Account Settings"));
	}

	/**
	 * =================================================================== Assert My
	 * Listings section.
	 * ===================================================================
	 */
	public void assertMyTraderSection() {
		print("Assert My Listings section.");
		locator = Locator.MyTrader.My_Listings_Section.value;
		Assert.assertTrue(isTextPresent(locator, "My Listings ("));
	}

	/**
	 * ====================================================================================================
	 * Assert All Buttons, Icons And Links Under My Listings Section.
	 * ====================================================================================================
	 */
	public void assertAllButtonsIconsAndLinksUnderMyListingsSection() {
		print("Assert All Buttons, Icons And Links Under My Listings Section");
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Listing_Count.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Edit_Buttons_MyListings.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Edit_Listing_Icon.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Listing_Link.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Edit_Listings_Button.value));
	}

	/**
	 * =====================================================================================================
	 * Click on Edit icon on saved listing under My listings section.
	 * =====================================================================================================
	 */
	public void clickOnEditIconOnSavedListing() {
		print("Click on Edit icon on saved listing under My listings section.");
		locator = Locator.MyTrader.Edit_Listing_Icon.value;
		clickOn(locator);
	}

	/**
	 * =============================================== Assert My Listings Page.
	 * ===============================================
	 */
	public void assertMyListingsPage() {
		print("Assert My Listings Page.");
		Assert.assertTrue(isElementPresent(Locator.MyTrader.My_Listing_Page.value));
	}

	/**
	 * ============================================================================
	 * Click On Edit Button Under My Listings Section.
	 * ============================================================================
	 */
	public void clickOnEditButtonUnderMyListingsSection() {
		print("Click On Edit Button Under My Listings Section.");
		clickOn(Locator.MyTrader.Edit_Buttons_MyListings.value);
	}

	/**
	 * =================================================================================
	 * Click On Edit Listings Button Under My Listings Section.
	 * =================================================================================
	 */
	public void clickOnEditListingsButtonUnderMyListingsSection() {
		print("Click On Edit Listings Button Under My Listings Section.");
		clickOn(Locator.MyTrader.Edit_Listings_Button.value);
	}

	/**
	 * ===================================================================================
	 * Assert Listings Listed with Edit button On My Listings Page.
	 * ===================================================================================
	 */
	public void assertListingsListedWithEditButtonOnMyListingsPage() {
		print("Assert Listings Listed with Edit button On My Listings Page.");
		String listingcount = getText(Locator.MyTrader.Listing_Count.value);
		print(listingcount);
		this.clickOnEditButtonUnderMyListingsSection();
		this.assertMyListingsPage();
		int savedListings = getWebDriver().findElements(By.xpath("(//*[@class='list-unstyled'])[3]/li")).size();
		String listing = Integer.toString(savedListings);
		System.out.println(listing);
		Assert.assertEquals(listingcount, listing);
	}

	/**
	 * ==================================================================================
	 * Assert Listings Listed with Edit Listings button On My Listings Page.
	 * ==================================================================================
	 */
	public void assertListingsListedWithEditListingsButtonOnMyListingsPage() {
		print("Assert Listings Listed with Edit Listings button On My Listings Page.");
		String listingcount = getText(Locator.MyTrader.Listing_Count.value);
		print(listingcount);
		this.clickOnEditListingsButtonUnderMyListingsSection();
		this.assertMyListingsPage();
		int savedListings = getWebDriver().findElements(By.xpath("(//*[@class='list-unstyled'])[3]/li")).size();
		String listing = Integer.toString(savedListings);
		System.out.println(listing);
		Assert.assertEquals(listingcount, listing);
	}

	/**
	 * =================================================================================================
	 * Assert All Links Icons And Button Under Saved Listings Section.
	 * =================================================================================================
	 */
	public void assertAllLinksIconsAndButtonUnderSavedListingsSection() {
		print("Assert All Links Icons And Button Under Saved Listings Section.");
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Saved_Listings_Section.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Saved_Listing_Edit.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Saved_Listing_Links.value));
		int savedIcon = getWebDriver().findElements(ByLocator(Locator.MyTrader.Saved_Icon_On_Listing_Link.value)).size();
		System.out.println(savedIcon);
		int savedListing = getWebDriver().findElements(By.xpath("(//*[@class='myt-column'])[2]//li")).size();
		System.out.println(savedListing);
		Assert.assertEquals(savedIcon, savedListing);
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Find_More_Listings_Button.value));
	}

	/**
	 * ==============================================================================================
	 * Click On Edit Button Under Saved Listings And Assert Saved Listing Page.
	 * ==============================================================================================
	 */
	public void clickOnEditButtonUnderSavedListingAndAssertSavedListingPage() {
		print("Click On Edit Button Under Saved Listings And Assert Saved Listing Page.");
		clickOn(Locator.MyTrader.Saved_Listing_Edit.value);
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Your_Saved_Listings_Page.value, "Your Saved Listings"));
	}

	/**
	 * ================================================================================
	 * Click On Find More Listings And Assert Result Page.
	 * ================================================================================
	 */
	public void clickOnFindMoreListingsAndAssertResultPage() {
		print("Click On Find More Listings And Assert Result Page.");
		clickOn(Locator.MyTrader.Find_More_Listings_Button.value);
		Assert.assertTrue(isElementPresent(Locator.Search.Advanced_Search_Page.value), "Find Motorcycles For Sale");
	}

	/**
	 * ================================================================================
	 * Click On Saved Listing Icon And Assert Result Page.
	 * ================================================================================
	 */
	public void clickOnSavedListingIconAndAssertResultPage() {
		print("Click On Saved Listing Icon And Assert Result Page.");
		String savedlink = getText(Locator.MyTrader.Saved_Listing_Link.value).replaceAll("0-9,", "");
		//String txt [] = 
		print(savedlink);
		clickOn(Locator.MyTrader.Saved_Listing_Icons.value);
		String listingDetails = getText(Locator.ListingDetails.Listing_Name.value);
		print(listingDetails);
		Assert.assertTrue(savedlink.contains(listingDetails));
	}

	/**
	 * ===================================================================================
	 * Assert All Links, Button And Icon Under Saved Searches Section.
	 * ===================================================================================
	 */
	public void assertAllLinksButtonAndIconUnderSavedSearchesSection() {
		print("Assert All Links, Button And Icon Under Saved Searches Section.");
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Saved_Searches_Section.value), "Saved Searches");
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Saved_Search_Edit.value, "Edit"));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Saved_Searches_Link.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Saved_Searches_Icon.value));
		Assert.assertTrue(isElementPresent(Locator.MyTrader.Start_New_Search_Button.value), "Start A New Search");
	}

	/**
	 * ================================================================================
	 * Click On Saved Search Icon And Assert Result Page.
	 * ================================================================================
	 */
	public void clickOnSavedSearchIconAndAssertResultPage() {
		print("Click On Saved Search Icon And Assert Result Page.");
		clickOn(Locator.MyTrader.Saved_Searches_Icon.value);
		Assert.assertTrue(isElementPresent(Locator.Search.Ad_SearchResult.value));
	}

	/**
	 * ========================================================================================
	 * Click On Edit button under Saved Searches Section And Assert Result Page.
	 * ========================================================================================
	 */
	public void clickOnEditAndAssertYourSavedSearchesPage() {
		print("Click On Edit button under Saved Searches Section And Assert Result Page.");
		clickOn(Locator.MyTrader.Saved_Search_Edit.value);
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Your_Saved_Searches.value, "Your Saved Searches"));
	}

	/**
	 * =========================================================================================
	 * Click On Start A New Search Button under Saved Searches section And Assert
	 * Result Page.
	 * =========================================================================================
	 */
	public void clickOnStartANewSearchButtonAndAssertResultPage() {
		print("Click On Start A New Search Button under Saved Searches section And Assert Result Page.");
		clickOn(Locator.MyTrader.Start_New_Search_Button.value);
		Assert.assertTrue(isTextPresent(Locator.Search.Advanced_Search_Page.value, "Find Motorcycles For Sale"));
	}
	
	/**
	 * ===================================================================================
	 * Click On Resume Listing button And Assert Result Page.
	 * ===================================================================================
	 */
	public void clickOnResumeListingAndAssertResultPage() {
		print("Click On Resume Listing button And Assert Result Page.");
		clickOn(Locator.MyTrader.Resume_Listings.value);
		Assert.assertTrue(isElementPresent(Locator.Sell.Enter_Your_Contact_Info.value));
	}
	
	/**
	 * ==========================================================================================
	 * Click On Saved Listing Under My Trader Section And Assert Result Page.
	 * ==========================================================================================
	 */
	public void clickOnSavedListingUnderMyTraderSectionAndAssertResultPage() {
		print("Click On Saved Listing Under My Trader Section And Assert Result Page.");
		clickOn(Locator.MyTrader.Saved_Listing.value);
		Assert.assertTrue(isTextPresent(Locator.MyTrader.Your_Saved_Listings_Page.value, "Your Saved Listings"));		
	}
	
	/**
	 * =============================================================================================
	 * Click On My Listings Under My Trader Section And Assert Result Page.
	 * =============================================================================================
	 */
	public void clickOnMyListingsUnderMyTraderSectionAndAssertResultPage() {
		print("Click On My Listings Under My Trader Section And Assert Result Page.");
		clickOn(Locator.MyTrader.My_Listing.value);
		Assert.assertTrue(isTextPresent(Locator.MyTrader.My_Listing_Page.value, "Your Listings For Sale"));		
	}
	
	/**
	 * ===============================================================================================
	 * Click On Sell a Motorcycle Link And Assert Result Page.
	 * ===============================================================================================
	 */
	public void clickOnSellMotorcycleLinkAndAssertResultPage() {
		print("Click On Sell a Motorcycle Link And Assert Result Page.");
		clickOn(Locator.MyTrader.Sell_A_Motorcycle.value);
		Assert.assertTrue(isElementPresent(Locator.Sell.Sell_Your_Motocycle_Page.value));
	}
	
	/**
	 * ====================================================================================================
	 * Click On Account Settings And Assert Your MyTrader Information Page.
	 * ====================================================================================================
	 */
	public void clickOnAccountSettingsAndAssertResultPage() {
		print("Click On Account Settings And Assert Your MyTrader Information Page");
		this.clickOnAccountSettingLink();
		Assert.assertTrue(isTextPresent(Locator.MyTrader.MyTrader_Info_Page.value, "Your MyTrader Information"));
	}
}
