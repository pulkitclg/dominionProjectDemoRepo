package com.trader.scripts.cycletrader;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

/**
 * =================================================================================================================
 * 
 * @author viveks
 * 
 *         This class contains all scenarios related to sign Up page.
 *         =========================================================================================================
 */
public class SignUpPage extends DriverTestCase {

	/**
	 * ================================================================================================================
	 * ATD-268: User should be redirected Create An Account page when click on Sign
	 * up for MyTrader link at Login page.
	 * ================================================================================================================
	 */
	@Test
	public void assertCreateAnAccountPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.clickOnJoinMyTraderlink();
		signUpHelper.assertMyTaderSignUpPage();
	}

	/**
	 * ==========================================================================================
	 * ATD-269: Following fields, link, check-box and button should be displayed at
	 * Sign Up page.
	 * ==========================================================================================
	 */
	@Test
	public void assertAllFieldsButtonsAndLinksAtJoinMyTraderPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.clickOnJoinMyTraderlink();
		signUpHelper.assertMyTaderSignUpPage();
		signUpHelper.assertAllFieldsButtonAndLinks();
	}

	/**
	 * ============================================================================
	 * ATD-270: All fields should be displayed as mandatory fields at Sign Up page.
	 * ============================================================================
	 */
	@Test
	public void assertValidationMessageForAllFieldAtJoinMyTraderPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.clickOnJoinMyTraderlink();
		signUpHelper.assertMyTaderSignUpPage();
		signUpHelper.clickOnJoinMyTraderButton();
		signUpHelper.assertValidationForAllMandatoryFields();
	}

	/**
	 * =====================================================================
	 * ATD-271: User should be able to create an account with valid details.
	 * =====================================================================
	 */
	@Test
	public void verifyCreateAccountWithValidDetails() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==================================================================== ATD-272:
	 * User is not able to create an account with invalid details.
	 * ====================================================================
	 */
	@Test
	public void verifyValidationForCreateAccountWithInvalidEmail() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpWithInvalidEmailID();
		signUpHelper.assertValidationForInvalidEmail();
	}

	/**
	 * ==========================================================================
	 * ATD-273: User should not able to create an account with existing email id.
	 * ==========================================================================
	 */
	@Test
	public void verifyValidationForCreateAccountWithExistingEmail() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpWithExistingEmail();
		signUpHelper.assertValidationForExistingEmail();
	}

	/**
	 * ===============================================================================================
	 * ATD-274: Login page should be displaying when click on 'Have an account?'
	 * link at Sign Up page.
	 * ===============================================================================================
	 */
	@Test
	public void verifyHaveAnAccountLinkRedirectToLoginPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.clickOnJoinMyTraderlink();
		signUpHelper.clickOnHaveAnAccountLink();
		loginHelper.assertLoginPage();
	}

	/**
	 * ===================================================================================
	 * ATD-275: User should able to log in with valid Credentials at Facebook Login
	 * popup.
	 * ===================================================================================
	 */
	@Test
	public void verifyLoginWithFacebookAtSignUpPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.clickOnJoinMyTraderlink();
		loginHelper.assertFacebookLoginPopUp();
		loginHelper.assertLoginSuccessfullyWithFacebook();
	}

	/**
	 * ==================================================================================
	 * ATD-276: User should able to log in with valid Credentials at Google Login
	 * pop-up.
	 * ==================================================================================
	 */
	@Test
	public void verifyLoginWithGoogleAtSignUpPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.clickOnJoinMyTraderlink();
		loginHelper.assertGoogleLoginPopUp();
		loginHelper.assertLoginSuccessfullyWithGoogle();
	}

	/**
	 * =================================================================================================
	 * ATD-278: User should able Save Search with create an account with valid
	 * details from 'Login to save this Search' Pop up at Search Result page.
	 * =================================================================================================
	 */
	@Test
	public void verifySavedSearchAfterSignUpAtSearchResultPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnSaveThisSearchButton();
		signUpHelper.enterAllValidDetailsInSignUpFieldsAndClickOnSignUpButton();
		searchHelper.assertSearchSavedAfterLogin();
	}

	/**
	 * ===========================================================================================
	 * ATD-280: User is able Save Listing with create an account with valid details
	 * from 'Login to save this Search' Pop up at Listing Detail page.
	 * ===========================================================================================
	 */
	@Test
	public void verifySavedListingAfterSignUpAtSearchResultPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnSaveListingIconOnListingGrid();
		searchHelper.clickOnSaveListingButtonOnSaveThisListingPopUp();
		signUpHelper.enterAllValidDetailsInSignUpFieldsAndClickOnSignUpButton();
		searchHelper.clickOnSaveListingButtonAndAssertListingSaved();
	}
}
