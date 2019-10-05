package com.trader.scripts.cycletrader;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

/**
 * ===============================================================================================================
 * @author viveks
 * 
 * This class contains all scenarios related to home page.
 *=================================================================================================================
 */
public class HomePage extends DriverTestCase {

	/**
	 * ===================================================================================
	 * ATD:65 - Following menu links should be shown under Menu section.
	 * ===================================================================================
	 */
	@Test
	public void assertMenuLinks() {
		OpenURL("CycleTrader");
		traderMenus.assertAllMenusInHeader();
	}

	/**
	 * =================================================================================================
	 * ATD:66 - All menu links should be click-able and redirect on link related
	 * page.
	 * ==================================================================================================
	 */
	@Test
	public void menusLinksClickableAndAssertResultPage() {
		OpenURL("CycleTrader");
		traderMenus.menusLinksRedirationAndAssertResultPage();
	}

	/**
	 * ========================================================================================================
	 * ATD:67 - 'Application logo should be clickable and redirect on home page.
	 * ========================================================================================================
	 */
	@Test
	public void applicationLogoRedirectionAndAssertHomePage() {
		OpenURL("CycleTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.assertLoginPage();
		homeHelper.clickOnApplicationLogo();
		homeHelper.assertHomePage();
	}

	/**
	 * ===========================================================================================================
	 * ATD:68 - 'Login' logo should be displayed in header section and redirect on
	 * Login page.
	 * ===========================================================================================================
	 */
	@Test
	public void clickOnLoginAndAssertLoginPage() {
		OpenURL("CycleTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.assertLoginPage();
	}

	/**
	 * ============================================================================================================
	 * ATD-69: 'More hamburger icon should be displayed in header and hamburger list
	 * is opens when click on hamburger icon.
	 * ============================================================================================================
	 */
	@Test
	public void clickOnMoreHamburgerAndAssertList() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.assertHamburgerListing();
	}

	/**
	 * =================================================================================================================
	 * ATD-70: Assert 'Following links are displayed under hamburger list: 1. Home
	 * 2. Login 3. Dealer Login/Sign up 4. Advanced Search 5. Find Parts, Gear and
	 * More 6. Find a Dealer 7. Sell My Motorcycle 8. Edit My Motorcycle 9.
	 * Motorcycle Research 10. Race Team 11. News 12. Give Cycle Trader Feedback
	 * ==================================================================================================================
	 */
	@Test
	public void assertLinksUnderHamburger() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.assertHamburgerListing();
		traderMenus.assertLinksUnderHamburgerList();
	}

	/**
	 * ======================================================================================================================
	 * ATD-71: 'Close (X) button should be displayed for close the hamburger menu
	 * list and hamburger menu list collapsed when click on close(X) button.
	 * ======================================================================================================================
	 */
	@Test
	public void closeHamburgerList() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.assertHamburgerListing();
		traderMenus.clickOnCloseLink();
	}

	/**
	 * =====================================================================================================================
	 * ATD-73: Following tabs should be displayed at home page: 1. Search 2. Sell a
	 * Motorcycle.
	 * =====================================================================================================================
	 */
	@Test
	public void assertSearchAndSellMotorcycleTabsAtHome() {
		OpenURL("CycleTrader");
		homeHelper.assertHomePage();
		homeHelper.assertSellMotorcycleAndSearchtabs();
	}

	/**
	 * ===================================================================================================================
	 * ATD-74: Following fields, drop down, button and links are displayed under
	 * Search Tab.
	 * ====================================================================================================================
	 */
	@Test
	public void assertFieldsButtonAndLinksUnderSearchTab() {
		OpenURL("CycleTrader");
		homeHelper.assertSearchFieldsAndButton();
		homeHelper.assertAdvancedSearchAndFindMotorCycleDealerLinks();
	}

	/**
	 * ===================================================================================================================
	 * ATD-75: Auto suggestion list should be displayed when enter any text in Enter
	 * keywords field under search tab and user able to select any auto suggestion
	 * from list.
	 * ===================================================================================================================
	 */
	@Test
	public void assertKeywordFieldAutoSuggestion() {
		OpenURL("CycleTrader");
		searchHelper.autoSuggestionDropDown();
	}

	/**
	 * ====================================================================================================================
	 * ATD-76: User should be able to find search with keywords, Zip code and
	 * selected radius from Search tab.
	 * ====================================================================================================================
	 */
	@Test
	public void searchWithKeywordZipCodeAndRadius() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
	}

	/**
	 * ========================================================================================================================
	 * ATD-77: 'Advanced Search' link should be clickable and redirect to 'Find
	 * Motorcycles For Sale' page.
	 * ========================================================================================================================
	 */
	@Test
	public void searchWithAdvancedSearchLinkAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
	}

	/**
	 * ================================================================================================================
	 * ATD-78: 'Find Motorcycle Dealers' link should be clickable and redirect to
	 * 'Find Motorcycle Dealers' page.
	 * ================================================================================================================
	 */
	@Test
	public void searchWithMotorcycleDealerAndAssertResultPage() {
		OpenURL("CycleTrader");
		dealerHelper.clickOnFindMotorcycleDealersLink();
		dealerHelper.assertFindMotorcycleDealersPage();
	}

	/**
	 * =================================================================================================================
	 * ATD-79: All recent searches should be listed under Recent searches drop down
	 * list and recent search link redirect to correct page.
	 * =================================================================================================================
	 */
	@Test
	public void searchWithRecentSearchLink() {
		OpenURL("CycleTrader");
		searchHelper.clickOnFindButton();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.clickAndAssertRecentSearchLinkResult();
	}

	/**
	 * =====================================================================================================================
	 * ATD-80: User should be redirecting on 'Sell your motorcycle fast, free &
	 * secure' page when click on 'Sell a Motorcycle' tab at home page.
	 * =====================================================================================================================
	 */
	@Test
	public void clickOnSellMotorcycleTabAndAssertSellMotorcyclePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnSellMotorcycleTab();
		sellYourMotorcycleHelper.assertSellAMotorcyclePage();
	}

	/**
	 * ====================================================================================================================
	 * ATD-81: Following tabs should be displayed below search module at home page:
	 * 1. Popular Motorcycle Makes 2. Popular Motorcycle Types 3. Popular States
	 * ====================================================================================================================
	 */
	@Test
	public void assertPopularMakesTypesAndStateTab() {
		OpenURL("CycleTrader");
		homeHelper.assertPopularMakesTypesAndStateTab();
	}

	/**
	 * =================================================================================================================
	 * ATD-82: Popular makes icons should be displayed and all icons redirect on
	 * related page when click on any make Icon under Popular Motorcycles Makes tab.
	 * =================================================================================================================
	 */
	@Test
	public void searchWithPopularMakesAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.searchWithPopularMakesAndAssertResultPage();
	}

	/**
	 * ===================================================================================================================
	 * ATD-83: Search All icon should be displayed and it redirect to 'Motorcycles
	 * For Sale by Make' page under Popular Motorcycles Makes tab.
	 * ===================================================================================================================
	 */
	@Test
	public void searchAllIconWorkingUnderPopularMakesAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.searchSearchAllMakes();
	}

	/**
	 * =====================================================================================================================
	 * ATD-84: Popular types icons should be displayed and all icons redirect on
	 * related page when click on any types Icon under Popular Motorcycles Types
	 * tab.
	 * =====================================================================================================================
	 */
	@Test
	public void searchWithPopularTypesIconAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickAndAssertPopularTypeLinks();
	}

	/**
	 * ===============================================================================================================
	 * ATD-85: Search All icon should be displayed and it redirect to 'Motorcycles
	 * for Sale for sale' page under Popular Motorcycles Types tab.
	 * ================================================================================================================
	 */
	@Test
	public void searchAllIconWorkingUnderPopularTypeAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
	}

	/**
	 * ===========================================================================================================
	 * ATD-86: Popular States icons are displayed and all icons redirect on related
	 * page when click on any State Icon under Popular States tab.
	 * ===========================================================================================================
	 */
	@Test
	public void searchWithPopularStateIconAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickAndAssertPopularStateLinks();
	}

	/**
	 * =========================================================================================================
	 * ATD-87: Search All icon should be displayed and it redirect to 'Motorcycles
	 * For Sale by State' page under Popular States tab.
	 * =========================================================================================================
	 */
	@Test
	public void searchAllIconWorkingUnderPopularStateAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
	}

	/**
	 * ==================================================================================================
	 * ATD-88: 'SELL YOUR MOTORCYCLE' section with 'Post for Free' button should be
	 * displayed at home page.
	 * ==================================================================================================
	 */
	@Test
	public void assertSellYourMotorcycleSection() {
		OpenURL("CycleTrader");
		homeHelper.assertSellYourMotorcycleSection();
	}

	/**
	 * =======================================================================================================
	 * ATD-89: User should be redirecting to 'Sell your motorcycle fast, free &
	 * secure' page when click on 'Post For Free' button under Sell Your Motorcycle
	 * section.
	 * =========================================================================================================
	 */
	@Test
	public void postForFreeButtonWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.assertSellYourMotorcycleSection();
		homeHelper.clickOnPostForFreeAndAssertResultPage();
	}

	/**
	 * ===========================================================================================================
	 * ATD-90: 'Sell your motorcycle fast, free & secure' page should be opens in
	 * new tab when click on 'Post For Free' button under Sell Your Motorcycle
	 * section.
	 * ============================================================================================================
	 */
	@Test
	public void sellYourMotorcycleOpenInNewPage() {
		OpenURL("CycleTrader");
		homeHelper.assertSellYourMotorcycleSection();
		homeHelper.clickOnPostForFreeAndAssertResultPage();
	}

	/**
	 * ============================================================================================================
	 * ATD-91: 'CHECK OUT OUR GUIDE FOR BUYING OR SELLING USED MOTORCYCLE' section
	 * with 'Check it out' button should be displayed at home page.
	 * ============================================================================================================
	 */
	@Test
	public void assertSellUsedMotorcycleWithCheckItOutButton() {
		OpenURL("CycleTrader");
		homeHelper.assertSellUsedMOTORCYCLESection();
	}

	/**
	 * ==============================================================================================================
	 * ATD-92: User should be redirecting on 'ISSUU' site on new tab when click on
	 * check it out button under 'CHECK OUT OUR GUIDE FOR BUYING OR SELLING USED
	 * MOTORCYCLE' section.
	 * ===============================================================================================================
	 */
	@Test
	public void checkItOutButtonWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.assertSellUsedMOTORCYCLESection();
		homeHelper.clickOnCheckItOutButtonAndAssertResultPage();
	}

	/**
	 * ============================================================================================================
	 * ATD-93: 'Stay Connected' and 'Give Us Feedback' section should be displayed
	 * below the ''CHECK OUT OUR GUIDE FOR BUYING OR SELLING USED MOTORCYCLE'
	 * section at home page.
	 * ============================================================================================================
	 */
	@Test
	public void assertStayConnectedAndGiveUsFeedbackSection() {
		OpenURL("CycleTrader");
		homeHelper.assertStayConnected();
	}

	/**
	 * ==========================================================================================================
	 * ATD-94: 'Thanks for signing up!' confirmation message should be displayed
	 * when user signup with valid email for Newsletter under Stay Connect section
	 * at home page.
	 * ===========================================================================================================
	 */
	@Test
	public void newsletterSignUpAndAssertConfirmationMessage() {
		OpenURL("CycleTrader");
		homeHelper.assertStayConnected();
		homeHelper.newsletterSignUp();
		homeHelper.assertNewsletterConfirmationMessage();
	}

	/**
	 * ========================================================================================================
	 * ATD-95: 'Email Us' should be worked correctly and user able to send feedback
	 * email under Give Us Feedback section at home page.
	 * ========================================================================================================
	 */
	@Test
	public void giveUsFeedbackEmail() {
		OpenURL("CycleTrader");
		homeHelper.assertEmailUSButtonLinkUnderGiveUsFeedback();
	}

	/**
	 * =========================================================================================================
	 * ATD-96: Following section should be displayed under footer section: 1. Top
	 * Motorcycle Makes 2. Top Motorcycle Make/Models 3. Top Motorcycle Types 4.
	 * Explore Cycle Trader 5. Cycle Trader Newsletters 6. Cycle Trader Affiliates
	 * 7. Dealer Fuel 8. Follow Us 9. Give Us Feedback 10. Careers
	 * ==========================================================================================================
	 */
	@Test
	public void assertAllSectionsInFooter() {
		OpenURL("CycleTrader");
		homeHelper.assertTopMakeModelAndTypesSection();
		homeHelper.assertSectionsInFooter();
	}

	/**
	 * =======================================================================================================
	 * ATD-97: All links should be redirected to related page under Top Motorcycle
	 * makes Section.
	 * =======================================================================================================
	 */
	@Test
	public void topMakeLinksRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnTopMakesLinksAndAssertResultPage();
	}

	/**
	 * ======================================================================================================
	 * ATD-98: All links should be redirected on related page under Top Motorcycle
	 * Make/Models Section.
	 * ======================================================================================================
	 */
	@Test
	public void topModelLinksRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnTopModelLinksAndAssertResultPage();
	}

	/**
	 * ========================================================================================================
	 * ATD-99: All links should be redirected to related page under Top Motorcycle
	 * Types Section.
	 * ========================================================================================================
	 */
	@Test
	public void topTypesLinksRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnTopTypesLinksAndAssertResultPage();
	}

	/**
	 * ========================================================================================================
	 * ATD-100: All links should be redirected to related page under Explore Cycle
	 * Trader Section.
	 * =========================================================================================================
	 */
	@Test
	public void exploreLinksRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnExploreLinksAndAssertResultPage();
	}

	/**
	 * ========================================================================================================
	 * ATD-101: All links should be redirected to related page under Cycle Trader
	 * Affiliates Section.
	 * =========================================================================================================
	 */
	@Test
	public void traderAdffiliatesLinksAndAssertResullPages() {
		OpenURL("CycleTrader");
		homeHelper.traderAffiliatesLinksAndAssertResultPage();
	}

	/**
	 * ======================================================================================================
	 * ATD-102: User should be able to signup for newsletter with valid email
	 * address under Cycle Trader Newsletters section.
	 * ======================================================================================================
	 */
	@Test
	public void traderNewsletterSubscription() {
		OpenURL("CycleTrader");
		homeHelper.newsletterSubscription();
	}

	/**
	 * ==================================================================================================
	 * ATD-103: 'Dealer Login/SignUp and Dealer Search links/buttons should be
	 * worked correctly and redirecting on correct page under Dealer Fuel section.
	 * 
	 * @throws AWTException
	 * ===================================================================================================
	 */
	@Test
	public void buttonsRediractionUnderDealerFuelAndAssertResultPage(){
		OpenURL("CycleTrader");
		homeHelper.clickOnDealerLogin_SignUpButtonAndAssertResultPage();
		homeHelper.clickOnDealerSearchButtonAndAssertResultPage();
	}

	/**
	 * ==============================================================================================
	 * ATD-104: All social site icons should be redirected on correct page in new
	 * tab under Follow Us section.
	 * ==============================================================================================
	 */
	@Test
	public void allSocialSiteIconWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnAllSocialSiteIconAndAssertResultPage();
	}

	/**
	 * ==============================================================================================
	 * ATD-105: Give CycleTrader Feedback link should be worked correctly and user
	 * able to send feedback email under Give Us Feedback section at home page.
	 * ===============================================================================================
	 */
	@Test
	public void traderFeedbackEmail() {
		OpenURL("CycleTrader");
		homeHelper.assertGiveTraderFeedbackButtonLink();
	}

	/**
	 * ================================================================================================
	 * ATD-106: Careers link should be worked correctly and redirecting on correct
	 * page under footer section.
	 * ================================================================================================
	 */
	@Test
	public void careerLinkRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnCareerLinkAndAsssertResultPage();
	}

	/**
	 * ===================================================================================================
	 * ATD-107: Application logo should be displayed under footer section and it
	 * redirecting to application home page in footer section.
	 * ===================================================================================================
	 */
	@Test
	public void applicationLogoRedirectionInFooter() {
		OpenURL("CycleTrader");
		homeHelper.clickOnFooterLogoAndAssertResultPage();
	}

	/**
	 * ==================================================================================================
	 * ATD-108: Following links should be displayed under footer section: 1.
	 * Security Center 2. Advertiser Agreement 3. Community Guidelines Copyright
	 * Privacy Policy Terms of Use 4. Copyright 5. Privacy Policy 6. Terms of Use.
	 * =================================================================================================
	 */
	@Test
	public void assertAllLinksUnderFooter() {
		OpenURL("CycleTrader");
		homeHelper.assertFooterLinks();
	}

	/**
	 * =========================================================================================================
	 * ATD-109: All links should be click-able and redirecting to related page under
	 * footer section.
	 * 
	 * @throws AWTException
	 * ==========================================================================================================
	 */
	@Test
	public void footerLinksRediractionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickFooterLinksAndAssertResultPage();
	}

	/**
	 * =========================================================================================================
	 * ATD-110: 'Find Motorcycles For Sale on Cycle Trader' section should be
	 * displayed below the application logo section in footer section.
	 * =========================================================================================================
	 */
	@Test
	public void findMotorcycleForSaleSection() {
		OpenURL("CycleTrader");
		homeHelper.assertFindMotorcyclesForSaleSection();
	}

	/**
	 * ===========================================================================================================
	 * ATD-111: 'Find Motorcycles For Sale' link should be displayed and it
	 * redirecting on 'Find Motorcycles For Sale' page in 'Find Motorcycles For Sale
	 * on Cycle Trader' section under footer.
	 * ============================================================================================================
	 */
	@Test
	public void findMotorCycleForSaleLinkRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.assertFindMotorcyclesForSaleSection();
		homeHelper.clickOnfindMotorCycleForSaleLink();
		searchHelper.assertAdvancedSearchPage();
	}
}
