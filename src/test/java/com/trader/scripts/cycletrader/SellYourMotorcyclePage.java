package com.trader.scripts.cycletrader;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

/**
 * ===============================================================================================
 * 
 * @author viveks
 * 
 *         This class contains all scenarios related to Sell Your Motorcycle.
 * 
 *         ========================================================================================
 */
public class SellYourMotorcyclePage extends DriverTestCase {

	/**
	 * =======================================================================================
	 * ATD-301: Following buttons and icon should be displayed at pop up when click
	 * on Sell For Free' link in header at home page 1. Sell Your Motorcycle 2. Edit
	 * Your Listing 3. Cross(X) icon.
	 * ========================================================================================
	 */
	@Test
	public void verifyAllButtonAndLinksOnSellForFreeDropDown() {
		OpenURL("CycleTrader");
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertAllButtonsAndLinkOnDropDown();
	}

	/**
	 * ==========================================================================================
	 * ATD-302: 'Sell your Trader fast, free & secure' page should be displayed when
	 * click on Sell Your Motorcycle button at pop up.
	 * ==========================================================================================
	 */
	@Test
	public void verifySellYourTraderFastFreeAndSecurePage() {
		OpenURL("CycleTrader");
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
	}

	/**
	 * ======================================================================================
	 * ATD-303: Following package options and buttons should be displayed under View
	 * Our Package Options at 'Sell your Trader fast, free & secure' page 1. FREE 2.
	 * ENHANCED 3. BEST 4. Select Free 5. Select Enhanced 6. Select Best.
	 * ======================================================================================
	 */
	@Test
	public void verifyPackagesOptionsAndAllButtonsForSelectPackages() {
		OpenURL("CycleTrader");
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.assertPackageSectionAndAllButtons();
	}

	/**
	 * ===============================================================================================
	 * ATD-304: Testimonial section with Testimonials should be displayed below
	 * 'View Our Package Options' section at at 'Sell your Trader fast, free &
	 * secure' page.
	 * ===============================================================================================
	 */
	@Test
	public void verifyTestimonialSectionBelowPackagesSection() {
		OpenURL("CycleTrader");
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.assertTestimonialsSectionBelowPackagesSection();
	}

	/**
	 * ==================================================================================================
	 * ATD-305: "Sold our motorcycle super quick and we're very happy!" page with
	 * all testimonials should be displayed when user click on Read More Customer
	 * reviews button under testimonial section.
	 * ==================================================================================================
	 */
	@Test
	public void verifyTestimonialPageAfterClickingOnReadMoreCustomerReviews() {
		OpenURL("CycleTrader");
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.assertTestimonialsSectionBelowPackagesSection();
		sellYourMotorcycleHelper.clickOnReadMoreCustomerReviewsAndAssertResultPage();
	}

	/**
	 * ========================================================================================
	 * ATD-306: Following section with fields, links and buttons should be displayed
	 * at form when click on 'Select Free' button under 'View Our Package Options'
	 * section. 1. Enter Vehicle Info 2. Add Photos & Video 3.SignIn To Complete 4.
	 * Your Listing Summary 5. Checkout 6. See Preview
	 * ========================================================================================
	 */
	@Test
	public void verifyAllSectionsLinksAndButtonAtMyTraderCreateListingsPage() {
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
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickOnSelectFreeButton();
		sellYourMotorcycleHelper.assertAllSectionsLinksAndButtonsOnCreateListingsPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =================================================================================================
	 * ATD-307: Ad Preview pop up with Ad details should be displayed when user
	 * click on See Preview link under Checkout button at 'Select Free' form.
	 * =================================================================================================
	 */
	@Test
	public void verifyListingPreviewWindowAtMyTraderCreateListingsPage() {
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
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickOnSelectFreeButton();
		sellYourMotorcycleHelper.assertAllSectionsLinksAndButtonsOnCreateListingsPage();
		sellYourMotorcycleHelper.clickOnSeePreviewLinkAndAssertPreviewWindow();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ================================================================================================
	 * ATD-308: User should be able to post free Ad When click on 'Select Free'
	 * button under 'View Our Package Options' section.
	 * ================================================================================================
	 */
	@Test
	public void verifyListingsPostWithSelectingFreePackage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.fillListingDetailsForFreePackage();
		searchHelper.waitForUpdatingSpinner();
		sellYourMotorcycleHelper.assertListingConfirmationPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =====================================================================================
	 * ATD-309: 'Finish building your listing!' Pop up should be displayed for Sign
	 * In/Login when user click on 'Sign In To Complete' button at 'Select Free'
	 * form with guest user.
	 * =====================================================================================
	 */
	@Test
	public void verifyFinishBuildingYourListingPopUpAfterClikingSignInToComplete() {
		OpenURL("CycleTrader");
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickOnSelectFreeButton();
		sellYourMotorcycleHelper.clickOnSignInToCompleteAndAssertFinishBuildingYourListing();
	}

	/**
	 * =============================================================================================
	 * ATD-310: Following section with fields, links and buttons should be displayed
	 * at form when click on 'Select Enhanced' button under 'View Our Package
	 * Options' section.
	 * =============================================================================================
	 */
	@Test
	public void verifyAllSectionsLinksAndButtonAtMyTraderCreateListingsWithEnhancedPackagePage() {
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
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickOnSelectEnhancedButton();
		sellYourMotorcycleHelper.assertAllSectionsLinksAndButtonsOnCreateListingsPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ========================================================================================
	 * ATD-311: Ad Preview pop up with Ad details should be displayed when user
	 * click on See Preview link under Checkout button at 'Select Enhanced' form.
	 * ========================================================================================
	 */
	@Test
	public void verifyListingPreviewWindowAtMyTraderCreateEnhancedListingsPage() {
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
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickOnSelectEnhancedButton();
		sellYourMotorcycleHelper.assertAllSectionsLinksAndButtonsOnCreateListingsPage();
		sellYourMotorcycleHelper.clickOnSeePreviewLinkAndAssertPreviewWindow();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ========================================================================================
	 * ATD-312: User should be able to post free Ad When click on 'Select Enhanced'
	 * button under 'View Our Package Options' section.
	 * ========================================================================================
	 */
	@Test
	public void verifyListingsPostWithSelectingEnhancedPackage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.fillListingDetailsForEnhancedPackage();
		searchHelper.waitForUpdatingSpinner();
		sellYourMotorcycleHelper.assertListingConfirmationPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =============================================================================================
	 * ATD-313: Following section with fields, links and buttons should be displayed
	 * at form when click on 'Select Best' button under 'View Our Package Options'
	 * section. 1. Enter Vehicle Info 2. Add Photos & Video 3. Sign In To Complete
	 * 4. Your Listing Summary 5. Checkout 6. See Preview
	 * ==============================================================================================
	 */
	@Test
	public void verifyAllSectionsLinksAndButtonAtMyTraderCreateListingsWithBestPackagePage() {
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
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickOnSelectBestButton();
		sellYourMotorcycleHelper.assertAllSectionsLinksAndButtonsOnCreateListingsPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==========================================================================================
	 * ATD-314: Ad Preview pop up with Ad details should be displayed when user
	 * click on See Preview link under Checkout button at 'Select Best' form.
	 * =========================================================================================
	 */
	@Test
	public void verifyListingPreviewWindowAtMyTraderCreateBestListingsPage() {
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
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.clickOnSelectBestButton();
		sellYourMotorcycleHelper.assertAllSectionsLinksAndButtonsOnCreateListingsPage();
		sellYourMotorcycleHelper.clickOnSeePreviewLinkAndAssertPreviewWindow();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ========================================================================================
	 * ATD-315: User should be able to post free Ad When click on 'Select Best'
	 * button under 'View Our Package Options' section.
	 * ========================================================================================
	 */
	@Test
	public void verifyListingsPostWithSelectingBestPackage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		sellYourMotorcycleHelper.clickOnSellForFreeMenuAndAssertResultPage();
		sellYourMotorcycleHelper.fillListingDetailsForBestPackage();
		searchHelper.waitForUpdatingSpinner();
		sellYourMotorcycleHelper.assertListingConfirmationPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}
}
