package com.trader.scripts.rvtrader;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

public class SmokeTest extends DriverTestCase {

	/**
	 * =====================================================================
	 * ATD-317: User should be logged in the application successfully.
	 * =====================================================================
	 */
	@Test
	public void verifyLoginToApplication() {
		OpenURL("RVTrader");
		loginHelper.clickOnLogInLink();
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
	 * ==========================================================================
	 * ATD-318: Validation message should be displayed when trying to login with
	 * invalid credentials.
	 * ==========================================================================
	 */
	@Test
	public void verifyLoginWithInvalidCredentials() {
		OpenURL("RVTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.enterEmailID("Testuser");
		loginHelper.enterPassword("TestPwd");
		loginHelper.clickOnSignInButton();
		loginHelper.assertValidationMessage();
	}

	/**
	 * ==============================================================================
	 * ATD-319: User should be create an account in the application successfully.
	 * ===============================================================================
	 */
	@Test
	public void verifyAbleToCreateAccount() {
		OpenURL("RVTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==========================================================================================
	 * ATD-320: User should be not create an account with invalid email id in the
	 * application.
	 * ===========================================================================================
	 */
	@Test
	public void verifyUnableToCreateAccountwithInvalidEmail() {
		OpenURL("RVTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpWithInvalidEmailID();
		signUpHelper.assertValidationForInvalidEmail();
	}

	/**
	 * ============================================================================================
	 * ATD-321: User should not be able to create account with existing email id.
	 * ============================================================================================
	 */
	@Test
	public void verifyUnableToCreateAccountWithExistingEmail() {
		OpenURL("RVTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpWithExistingEmail();
		signUpHelper.assertValidationForExistingEmail();
	}

	/**
	 * ============================================================================================
	 * ATD-322: Search Result page should be displayed when click on Find/Search
	 * button at home page.
	 * ============================================================================================
	 */
	@Test
	public void verifyAbleToSearchFromHome() {
		OpenURL("RVTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
	}

	/**
	 * ===============================================================================================
	 * ATD-323: 'Find RVs For Sale' page should be displayed when click on Advanced
	 * Search link.
	 * ===============================================================================================
	 */
	@Test
	public void verifyAdvancedSearchLinkAtHome() {
		OpenURL("RVTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
	}

	/**
	 * ========================================================================================
	 * ATD-375: User should be able to search with Keyword, Zip code and radius from
	 * home page.
	 * =========================================================================================
	 */
	@Test
	public void verifyAbleToSearchWithKeyWordZipCodeAndRadius() {
		OpenURL("RVTrader");
		searchHelper.assertSearchTab();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
	}

	/**
	 * ===========================================================================================
	 * ATD-324: User should be able to advance search with Location at 'Advanced
	 * Search' page.
	 * ===========================================================================================
	 */
	@Test
	public void verifyAbleToSearchWithLocation() {
		OpenURL("RVTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.searchWithLocationOption();
		searchHelper.assertAdSearchResult();
	}

	/**
	 * ===================================================================================================
	 * ATD-325: User should be able to advance search with Keywords at 'Advanced
	 * Search' page.
	 * ===================================================================================================
	 */
	@Test
	public void verifyAbleToAdvancedSearchWithKeyword() {
		OpenURL("RVTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedKeywordOption();
		searchHelper.enterAdvancedKeyword();
		searchHelper.clickOnAdvancedKeywordUpdateButton();
		searchHelper.clickOnSeeMatchesButton();
		searchHelper.assertAdSearchResult();
	}

	/**
	 * ATD-326: User should be able to advance search with select options(Type,
	 * Make, Model, Trim, Price and other all options) at 'Advanced Search' page.
	 */
	@Test
	public void verifyAdvancedSearchWithAllRefineOptions() {
		OpenURL("RVTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		// searchHelper.clickOnAdvancedModelOption();
		// searchHelper.selectModelFromPopUp();
		searchHelper.clickOnSeeMatchesButton();
		searchHelper.assertAdSearchResult();
	}

	/**
	 * ATD-327: Recent Searches Ad links should be displayed when click on 'Recent
	 * Searches' link under 'Search section at Home page.
	 */
	@Test
	public void verifyRecentSearchLinkRediration() {
		OpenURL("RVTrader");
		searchHelper.clickOnFindButton();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.clickAndAssertRecentSearchLinkResult();
	}

	/**
	 * ATD-328: Make page should be displayed when click on Search All icon under
	 * 'Popular Makes' section at Home page.
	 */
	@Test
	public void verifySearchAllIconRedirectingToMakePage() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
	}

	/**
	 * ATD-329: All Makes link should be displayed when click on 'Browse All Makes'
	 * link at 'Make' page.
	 */
	@Test
	public void verifyAllMakesLinksWhenClickingOnBrowseAllMakes() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnBrowseAllMakes();
		searchHelper.assertSalebyMake();
	}

	/**
	 * ATD-330: User should be redirected to respective 'Make Search Result' page
	 * when click on any Make link at 'Make' page.
	 */
	@Test
	public void verifyMakeResultPageWhenClickingOnAnyMakeLinks() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnAllMakeLinkAndAssertResultPage();
	}

	/**
	 * ATD-331: User should be redirected to respective Make Search Result page when
	 * click on any make icon at 'Make' page.
	 */
	@Test
	public void verifyMakeIconResultPageWhenClickingOnMakesIcon() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnMakeIconAndAssertResultPage();
	}

	/**
	 * ==========================================================================================
	 * ATD-332: 'Top RV Makes' section should be displayed under 'Footer' section at
	 * Home page.
	 * ==========================================================================================
	 */
	@Test
	public void verifyTopRVMakesSectionInFooter() {
		OpenURL("RVTrader");
		homeHelper.assertTopMakesSection();
	}

	/**
	 * ====================================================================================================
	 * ATD-333: User should be redirected to respective Make Search Result page when
	 * click on any top make link under 'Footer' section at Home page.
	 * ====================================================================================================
	 */
	@Test
	public void verifyTopMakeLinksRedirectionAndAssertResultPage() {
		OpenURL("RVTrader");
		homeHelper.clickOnTopMakesLinksAndAssertResultPage();
	}

	/**
	 * ======================================================================================================
	 * ATD-334: 'Top RV Make/Models' section should be displayed under 'Footer'
	 * section at Home page.
	 * ======================================================================================================
	 */
	@Test
	public void verifyTopTraderModelSection() {
		OpenURL("RVTrader");
		homeHelper.assertTopModelSection();
	}

	/**
	 * =======================================================================================================
	 * ATD-335: User should be redirected to respective Make/Model Search Result
	 * page when click on any top make/models link under 'Footer' section at Home
	 * page.
	 * =======================================================================================================
	 */
	@Test
	public void verifyTopModelLinksRedirectionAndAssertResultPage() {
		OpenURL("RVTrader");
		homeHelper.clickOnTopModelLinksAndAssertResultPage();
	}

	/**
	 * =======================================================================================================
	 * ATD-336: User should be redirected to 'Types Search Result' page when click
	 * on Search All icon under 'Popular Types' section at Home page.
	 * =======================================================================================================
	 */
	@Test
	public void verifySearchResultPageWhenClickOnSearchAllUnderPopularType() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
	}

	/**
	 * ========================================================================================================
	 * ATD-337: User should be redirected to respective 'Type Search Result' page
	 * when click on any Type icon under 'Popular Types' section at Home page.
	 * ========================================================================================================
	 */
	@Test
	public void verifyTypesResultPageWhenClickOnPopularTypesIcon() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnPopularTypesIconsAndAssertResultPage();
	}

	/**
	 * =======================================================================================================
	 * ATD-338: 'Top RV Types' section should be displayed under 'Footer' section at
	 * Home page.
	 * =======================================================================================================
	 */
	@Test
	public void assertTopTypesSection() {
		OpenURL("RVTrader");
		homeHelper.assertTopTypeSection();
	}

	/**
	 * =======================================================================================================
	 * ATD-339: User should be redirected to respective Type Search Result page when
	 * click on any top type link under 'Footer' section at Home page.
	 * =======================================================================================================
	 */
	@Test
	public void verifyResultPageWhenClickOnTopTypesLinks() {
		OpenURL("RVTrader");
		homeHelper.assertTopTypeSection();
		homeHelper.clickAndAssertTypesLink();
	}
	
	@Test
	public void verifyResultPageWhenClickOnSearchAllUnderPopularState() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
	}
	
	@Test
	public void verifyResultPageWhenClickOnStateLinksAtSaleByStatePage() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
		homeHelper.clickAndAssertStateLinks();
	}
	
	@Test
	public void searchWithPopularTypesIconAndAssertResultPage() {
		OpenURL("RVTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnStateIconAndAssertResultPage();
	}
}
