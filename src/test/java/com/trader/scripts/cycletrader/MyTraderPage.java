package com.trader.scripts.cycletrader;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

/**
 * @author viveks
 * 
 *         This class contains all scenarios related to My Trader page.
 *
 */
public class MyTraderPage extends DriverTestCase {

	/**
	 * =================================================================================================
	 * ATD-281: MyTrader page should be displayed when click on MyTrader Account
	 * link from Menu.
	 * =================================================================================================
	 */
	@Test
	public void verifyMyTraderPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ===============================================================================================
	 * ATD-282: Following links should be displayed under 'My Trader' tab. 1. My
	 * Listings 2. Saved Listing 3. Saved Searches 4. Sell A Motorcycle 5. Account
	 * Settings
	 * ===============================================================================================
	 */
	@Test
	public void verifyAllTabsAtMyTraderPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertAllTabsInRightSide();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ======================================================================================
	 * ATD-283: Following sections are displayed at 'My Trader' page. My Listings
	 * Saved Listings Saved Searches.
	 * ======================================================================================+
	 */
	@Test
	public void verifySavedListingSearchAndMyListingSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =========================================================================================
	 * ATD-284: Following links, buttons and icons should be displayed under My
	 * Listings section at Welcome to MyTrader page. 1. My Listings heading with
	 * Listing count 2. All posted Ad links for that account 3. Edit button 4. Edit
	 * icon 5. Edit Listing
	 * =========================================================================================
	 */
	@Test
	public void verifyAllLinksButtonsAndIconsUnderMyListingSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.assertAllButtonsIconsAndLinksUnderMyListingsSection();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-285: User is able to Edit Posted Ad information when click on 'Edit' icon
	 * with Saved Listings under My Listings section at Welcome to MyTrader page.
	 * ==============================================================================================
	 */
	@Test
	public void verifyUserAbleToEditSavedListingMyListingSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.assertAllButtonsIconsAndLinksUnderMyListingsSection();
		myTraderHelper.clickOnEditIconOnSavedListing();
		sellYourMotorcycleHelper.clickOnSaveChangesButton();
		myTraderHelper.assertMyListingsPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =====================================================================================
	 * ATD-286: All posted Ads should be displayed at 'Your Listings For Sale' page
	 * when click on Edit button in header at My Listings section.
	 * ======================================================================================
	 */
	@Test
	public void verifyAllPostedListingListedAtMyListingSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.assertAllButtonsIconsAndLinksUnderMyListingsSection();
		myTraderHelper.assertListingsListedWithEditButtonOnMyListingsPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =======================================================================================
	 * ATD-287: All posted Ads should be displayed at 'Your Listings For Sale' page
	 * when click on Edit Listings button under My Listings section.
	 * =======================================================================================
	 */
	@Test
	public void verifyAllListingListedAtMyListingSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.assertAllButtonsIconsAndLinksUnderMyListingsSection();
		myTraderHelper.assertListingsListedWithEditListingsButtonOnMyListingsPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ===========================================================================================
	 * ATD-288: Following links, buttons and icons should be displayed under Saved
	 * Listings section at Welcome to MyTrader page. 1. Saved Listings heading with
	 * Listing count 2. All saved Listing links for that account 3. Edit button 4.
	 * Save icon 5. Find More Listings
	 * ===========================================================================================
	 */
	@Test
	public void verifyAllLinksButtonsAndIconsUnderSavedListingSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.assertAllLinksIconsAndButtonUnderSavedListingsSection();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==================================================================================================
	 * ATD-290: All saved listings should be displayed at 'Your Saved Listings' page
	 * when click on Edit button in header at Saved Listings section.
	 * ==================================================================================================
	 */
	@Test
	public void verifyYourSavedListingPageWhenClickOnEditUnderSavedListingsSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnEditButtonUnderSavedListingAndAssertSavedListingPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ========================================================================================================
	 * ATD-291: 'Find Motorcycles For Sale' page should be displayed when user click
	 * on 'Find More Listings' button under Saved Listings section.
	 * ========================================================================================================
	 */
	@Test
	public void verifyFindMotorcyclePageWhenClickOnFindMoreListings() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnFindMoreListingsAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ===========================================================================================
	 * ATD-289: Listing detail page should be displayed when click on 'Save' icon
	 * with Saved Listings under Saved Listings section at Welcome to MyTrader page.
	 * ===========================================================================================
	 */
	@Test
	public void verifySavedListingPageWhenClickOnSavedListingIconUnderSavedListingsSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnSavedListingIconAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =======================================================================================
	 * ATD-292: Following links, buttons and icons should be displayed under Saved
	 * searches section at Welcome to MyTrader page. 1.All Saved searches heading
	 * with searches count 2.All saved Searches links for that account 3.Edit button
	 * 4.Search icon 5.Start A New Search
	 * =======================================================================================
	 */
	@Test
	public void verifyAllButtonsLinksAndIconsUnderSavedSearchesSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.assertAllLinksButtonAndIconUnderSavedSearchesSection();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==========================================================================================
	 * ATD-293: Saved Search result page should be displayed when click on 'Search'
	 * icon with Saved Searches link under Saved searches section at Welcome to
	 * MyTrader page.
	 * ==========================================================================================
	 */
	@Test
	public void verifyResultPagenWhenClickOnSavedSearchIconUnderSavedSearchesSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnSavedSearchIconAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-294: All saved searches should be displayed at Your Saved Searches' page
	 * when click on Edit button in header at Saved Searches section.
	 * ==============================================================================================
	 */
	@Test
	public void verifyYourSavedSearchesPageWhenClickOnEditUnderSavedSearchesSection() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnEditAndAssertYourSavedSearchesPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-295: 'Find Motorcycles For Sale' page should be displayed when user click
	 * on 'Start A New Search' button under Saved Searches section.
	 * ==============================================================================================
	 */
	@Test
	public void verifyAdvancedSearchPageWhenClickOnStartNewSearchButton() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnStartANewSearchButtonAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-296: Ad post form should be displayed when click on Resume Listing button
	 * at top right corner of Welcome to MyTrader page.
	 * ==============================================================================================
	 */
	@Test
	public void verifyListingFormPageWhenClickOnResumeListingButton() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnResumeListingAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-297: Your Listings For Sale page should be displayed when click on Saved
	 * Listings link under 'My Trader' tab.
	 * ==============================================================================================
	 */
	@Test
	public void verifyYourListingForSalePage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnMyListingsUnderMyTraderSectionAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-298: 'Your Saved Searches' page should be displayed when click on 'Saved
	 * Searches' link under 'My Trader' tab.
	 * ==============================================================================================
	 */
	@Test
	public void verifySavedSearchesPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnSavedListingUnderMyTraderSectionAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-299: 'Sell your motorcycle' page should be displayed when click on 'Sell
	 * A Motorcycle' link under 'My Trader' tab.
	 * ==============================================================================================
	 */
	@Test
	public void verifySellYourMotorcyclePageAfterClickOnSellAMotorcycleLink() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnSellMotorcycleLinkAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-300: 'Your MyTrader Information' page should be displayed when click on
	 * 'Account Settings' link under 'My Trader' tab.
	 * ==============================================================================================
	 */
	@Test
	public void verifyYourMyTraderInformationPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterEmailID(uname);
		loginHelper.enterPassword(password);
		loginHelper.clickOnSignInButton();
		myTraderHelper.assertMyTraderPage();
		myTraderHelper.assertSavedListingAndSavedSearchesSection();
		myTraderHelper.assertMyTraderSection();
		myTraderHelper.clickOnAccountSettingsAndAssertResultPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}
}
