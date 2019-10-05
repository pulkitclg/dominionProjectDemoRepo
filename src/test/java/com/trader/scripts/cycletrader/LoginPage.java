package com.trader.scripts.cycletrader;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

/**
 * =============================================================================================================
 * 
 * @author viveks
 *
 *         This class contains all scenarios related to Login page.
 *         =====================================================================================================
 */
public class LoginPage extends DriverTestCase {

	/**
	 * =======================================================================================================
	 * ATD-253: Login page should be displaying when click on 'MyTrader Log In' link
	 * under Menu section.
	 * =========================================================================================================
	 */
	@Test
	public void assertLoginPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
	}

	/**
	 * =======================================================================================================
	 * ATD-255: "Following buttons, links and fields should be displayed at Login
	 * page. 1. Sign in with Facebook 2. Sign in with Google 3. Email 4. Password 5.
	 * Forgot your password? 6. Get Started 7. Sign up for MyTrader 8. Login as a
	 * Dealer
	 * =======================================================================================================
	 */
	@Test
	public void assertAllLinksButtonsAndFieldsAtLoginPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertAllLinksButtonAndFields();
	}

	/**
	 * ========================================================================================================
	 * ATD-256: Facebook Login popup is displaying when click on 'Sign in with
	 * Facebook' button at Login page.
	 * =========================================================================================================
	 */
	@Test
	public void assertFacebookLoginPopUpAtLoginPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertFacebookLoginPopUp();
	}

	/**
	 * =============================================================================================================
	 * ATD-257: User should be logged in the application successfully with Facebook.
	 * =============================================================================================================
	 */
	@Test
	public void assertLoginSucessfullyWithFacebookAtLoginPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertFacebookLoginPopUp();
		loginHelper.assertLoginSuccessfullyWithFacebook();
	}

	/**
	 * ===============================================================================================================
	 * ATD-258: 'Incorrect email address or phone number' message should be
	 * displayed when trying to login with invalid facebook login credentials.
	 * ================================================================================================================
	 */
	@Test
	public void assertErrorMessageForFacebookInvalidLoginAtFacebookPopUp() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertFacebookLoginPopUp();
		loginHelper.assertErrorMessageForFcaebbokInvalidEmailId();
	}

	/**
	 * ==============================================================================================================
	 * ATD-259: Google Login popup should be displaying when click on 'Sign in with
	 * Google' button at Login page.
	 * ==============================================================================================================
	 */
	@Test
	public void assertGoogleLoginPopUpAtLoginPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertGoogleLoginPopUp();
	}

	/**
	 * =================================================================================================================
	 * ATD-260: User should be logged in the application successfully with Google
	 * Login Credentials.
	 * =================================================================================================================
	 */
	@Test
	public void assertLoginSucessfullyWithGoogleAtLoginPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertGoogleLoginPopUp();
		loginHelper.assertLoginSuccessfullyWithGoogle();
	}

	/**
	 * ==============================================================================================================
	 * ATD-261: Validation message should be displayed when trying to login with
	 * Google invalid credentials.
	 * ==============================================================================================================
	 */
	@Test
	public void assertErrorMessageForGoogleInvalidLoginAtGooglePopUp() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		loginHelper.assertLoginPage();
		loginHelper.assertGoogleLoginPopUp();
		loginHelper.assertErrorMessageForGoogleInvalidEmailId();
	}

	/**
	 * ================================================================================================================
	 * ATD-262: User should be logged in the application successfully.
	 * ================================================================================================================
	 */
	@Test
	public void assertLoginOnTheApplication() {
		OpenURL("CycleTrader");
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
	 * ========================================================================================================================
	 * ATD-263: 'Invalid username or password' message should be displayed when
	 * trying to login with invalid credentials.
	 * ========================================================================================================================
	 */
	@Test
	public void assertValidationForInvalidLoginCredentials() {
		OpenURL("CycleTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.enterEmailID("Testuser");
		loginHelper.enterPassword("TestPwd");
		loginHelper.clickOnSignInButton();
		loginHelper.assertValidationMessage();
	}

	/**
	 * ===============================================================================================
	 * ATD-264: User should able to click on Show/Hide link under Password field at
	 * Login page.
	 * ===============================================================================================
	 */
	@Test
	public void assertShowHideLinkUnderPasswordFieldAtLoginPage() {
		OpenURL("CycleTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.assertShowHidePasswordLink();
	}

	/**
	 * ==============================================================================================
	 * ATD-265: FORGOT PASSWORD page should be displaying when click on 'Forgot your
	 * password?' link at Login page.
	 * ==============================================================================================
	 */
	@Test
	public void assertForgotPasswordPage() {
		OpenURL("CycleTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.clickOnForgotYourPasswordLinkAndAssertResultPage();
	}

	/**
	 * =============================================================================================
	 * ATD-266: User should be got the reset forget password email.
	 * =============================================================================================
	 */
	@Test
	public void assertForgotPasswordLinkInReceivedForgotEmail() {
		OpenURL("CycleTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.clickOnForgotYourPasswordLinkAndAssertResultPage();
		loginHelper.assertForgotPasswordLinkInEmailAfterForgotPassword();
	}

	/**
	 * =============================================================================================
	 * ATD-267: Dealer Center page should be displaying when click on 'Login as a
	 * Dealer' button at Login page.
	 * ==============================================================================================
	 */
	@Test
	public void assertLoginAsDealerButtonRedirectToDealerCentrePage() {
		OpenURL("CycleTrader");
		loginHelper.clickOnLogInLink();
		loginHelper.clickOnLoginAsDealerAndAssertResultPage();
	}

	/**
	 * ====================================================================================================
	 * ATD-277: User should able Save Search with valid credential from 'Login to
	 * save this Search' Pop up at Search Result page.
	 * ====================================================================================================
	 */
	@Test
	public void verifySavedSearchAfterLoginAtSearchResultPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnSaveThisSearchButton();
		signUpHelper.clickOnHaveAnAccountLinksAtPopUp();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterLoginDetailsAndClickOnGetStartedButton(uname, password);
		searchHelper.assertSearchSavedAfterLogin();
	}

	/**
	 * ===========================================================================================
	 * ATD-279: User should able Save Listing with valid credential from 'Login to save this Search' Pop up at Listing Detail page.  
	 * ===========================================================================================
	 */
	@Test
	public void verifySavedListingAfterLoginAtSearchResultPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnSaveListingIconOnListingGrid();
		searchHelper.clickOnSaveListingButtonOnSaveThisListingPopUp();
		signUpHelper.clickOnHaveAnAccountLinksAtPopUp();
		String uname = loginHelper.getUserName();
		String password = loginHelper.getPassword();
		loginHelper.enterLoginDetailsAndClickOnGetStartedButton(uname, password);
		searchHelper.clickOnSaveListingButtonAndAssertListingSaved();
	}
}
