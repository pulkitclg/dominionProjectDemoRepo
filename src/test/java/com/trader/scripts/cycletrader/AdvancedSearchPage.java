package com.trader.scripts.cycletrader;

import org.testng.annotations.Test;

import com.trader.utils.DriverTestCase;

/**
 * ============================================================================================================
 * 
 * @author viveks
 *
 *         This class contains all scenarios related to search and advanced
 *         page.
 *         ====================================================================================================
 */
public class AdvancedSearchPage extends DriverTestCase {

	/**
	 * ===============================================================================================
	 * ATD-129: Following buttons should be displayed at Find Motorcycles For Sale
	 * page. 1. Find By Make 2. Find By Type 3. Find By State.
	 * ===============================================================================================
	 */
	@Test
	public void assertFindByMakeTypeAndStateButton() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByMakeStateAndTypeButtonAtAdvancedSearchPage();
	}

	/**
	 * ==================================================================================================
	 * ATD-130: Motorcycles For Sale by Make page should be displaying when click on
	 * 'Find By Make' button at Advanced Search page.
	 * ==================================================================================================
	 */
	@Test
	public void findByMakeButtonRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnFindByMakeButtonAndAssertResultPage();
	}

	/**
	 * ===============================================================================================
	 * ATD-131: Motorcycles For Sale by Type should be displaying when click on
	 * 'Find By Type' button at Advanced Search page.
	 * ===============================================================================================
	 */
	@Test
	public void findByTypeButtonRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnFindByTypeButtonAndAssertResultPage();
	}

	/**
	 * =================================================================================================
	 * ATD-132: Motorcycles For Sale by State should be displaying when click on
	 * 'Find By State' button at Advanced Search page.
	 * =================================================================================================
	 */
	@Test
	public void findByStateButtonRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnFindByStateButtonAndAssertResultPage();
	}

	/**
	 * =================================================================================================
	 * ATD-133: Following options and button are displayed under Advanced Search
	 * section: 1. Location 2. Keyword 3. Type 4. Make 5. Model 6. Trim 7. Category
	 * 8. Price 9. New or Used 10. Year 11. Seller Type 12. Mileage 13. Engine Size
	 * 14. State 15. City
	 * =================================================================================================
	 */
	@Test
	public void followingRefinedOptionsUnderAdvancedSearchPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertRefinedOptionsUnderAdvancedSearch();

	}

	/**
	 * =============================================================================================
	 * ATD-134: Location option should be clickable under Advanced Search section.
	 * =============================================================================================
	 */
	@Test
	public void locationOptionClickableUnderAdvancedSearchPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnLocationAndAssertLocationsOptions();
	}

	/**
	 * =========================================================================================================
	 * ATD-135: User should be able to find search with Zip code and selected radius
	 * from Location option under Advanced Search section.
	 * =========================================================================================================
	 */
	@Test
	public void searchWithLocationAndAssertLocationDetails() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.searchWithLocationFormRefineSearch();
	}

	/**
	 * ============================================================================================================
	 * ATD-136: Auto suggestion list should be displayed when enter any text in
	 * Enter keywords field under Keyword option and user able to select any auto
	 * suggestion from list.
	 * ===========================================================================================================
	 */
	@Test
	public void autoSuggestionDropDownForKeywordOption() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertAutoSuggestionDropDown();
	}

	/**
	 * ===========================================================================================================
	 * ATD-137: Type pop up should be displaying when click on Type option and user
	 * able to select any option and click on Search button.
	 * ===========================================================================================================
	 */
	@Test
	public void selectTypesOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ===========================================================================================================
	 * ATD-138: Make pop up should be displayed when click on Make option and user
	 * able to select any options, click update and click on Search button.
	 * ===========================================================================================================
	 */
	@Test
	public void selectMakeOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ==================================================================================================
	 * ATD-139: Model pop up should be displayed when click on Model option after
	 * selecting Make and user able to select any model options, click update and
	 * click on Search button.
	 * ===================================================================================================
	 */
	@Test
	public void selectModelOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * =====================================================================================================
	 * ATD-140: Trim pop up should be displayed when click on Trim option after
	 * selecting Make/Model and user able to select any trim options, click update
	 * and click on Search button.
	 * =====================================================================================================
	 */
	@Test
	public void selectTrimOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ========================================================================================================
	 * ATD-141: Category pop up should be displayed when click on Category option
	 * and user able to select any option and click on Search button.
	 * ========================================================================================================
	 */
	@Test
	public void selectCategoryOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ===========================================================================================================
	 * ATD-142: Price pop up should be displayed when click on Price option and user
	 * able to select any price option and click on Search button.
	 * ===========================================================================================================
	 */
	@Test
	public void selectPriceOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ==================================================================================================
	 * ATD-143: New and Used two options should be displayed when click on 'New or
	 * Used' option and user able to any one option and click on Search button.
	 * ==================================================================================================
	 */
	@Test
	public void selectNewAndUsedOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ===================================================================================================
	 * ATD-144: Year pop up should be displayed when click on 'Year' option and user
	 * able to any one option and click on Search button.
	 * ===================================================================================================
	 */
	@Test
	public void selectYearOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnAdvancedYearOption();
		searchHelper.selectMinAndMaxYearFromYearPopUp();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ==================================================================================================
	 * ATD-145: Dealer and Private Seller two options should be displayed when click
	 * on 'Seller Type' option and user able to any one option and click on Search
	 * button.
	 * ===================================================================================================
	 */
	@Test
	public void selectSellerTypeOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnAdvancedYearOption();
		searchHelper.selectMinAndMaxYearFromYearPopUp();
		searchHelper.clickOnSellerTypeAndSelectType();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * =============================================================================================
	 * ATD-146: Mileage pop up should be displayed when click on 'Mileage' option
	 * and user able to any one option and click on Search button.
	 * =============================================================================================
	 */
	@Test
	public void selectMileageOptionsAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnAdvancedYearOption();
		searchHelper.selectMinAndMaxYearFromYearPopUp();
		searchHelper.clickOnSellerTypeAndSelectType();
		searchHelper.clickOnMileageOption();
		searchHelper.selectMinAndMaxMileage();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * ======================================================================================================
	 * ATD-147: Engine Size pop up should be displayed when click on 'Engine Size'
	 * option and user able to any one option and click on Search button.
	 * ======================================================================================================
	 */
	@Test
	public void selectEngineSizeAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnAdvancedYearOption();
		searchHelper.selectMinAndMaxYearFromYearPopUp();
		searchHelper.clickOnSellerTypeAndSelectType();
		searchHelper.clickOnMileageOption();
		searchHelper.selectMinAndMaxMileage();
		searchHelper.clickOnEngineSizeOption();
		searchHelper.selectMinAndMaxEngineSize();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * =========================================================================================================
	 * ATD-148: State pop up should be displayed when click on 'State' option and
	 * user able to any one option and click on Search button.
	 * =========================================================================================================
	 */
	@Test
	public void selectStateAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnAdvancedYearOption();
		searchHelper.selectMinAndMaxYearFromYearPopUp();
		searchHelper.clickOnSellerTypeAndSelectType();
		searchHelper.clickOnMileageOption();
		searchHelper.selectMinAndMaxMileage();
		searchHelper.clickOnEngineSizeOption();
		searchHelper.selectMinAndMaxEngineSize();
		searchHelper.clickOnStateOptionAndSelectState();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCounts();
	}

	/**
	 * =================================================================================================
	 * ATD-149: City pop up should be displayed when click on 'City' option and user
	 * able to any one option and click on Search button.
	 * =================================================================================================
	 */
	@Test
	public void selectCityAndAssertListingCountAtResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnAdvancedYearOption();
		searchHelper.selectMinAndMaxYearFromYearPopUp();
		searchHelper.clickOnSellerTypeAndSelectType();
		searchHelper.clickOnMileageOption();
		searchHelper.selectMinAndMaxMileage();
		searchHelper.clickOnEngineSizeOption();
		searchHelper.selectMinAndMaxEngineSize();
		searchHelper.clickOnStateOptionAndSelectState();
		searchHelper.clickOnCityOptionAndSelectCity();
		searchHelper.clickOnSeeMatchesButtonAndAssertListingCountsAtResultPage();
	}

	/**
	 * ===================================================================================================
	 * ATD-150: Applied filter should be removed when click on 'Start Over'
	 * link/icon at Advanced Search page.
	 * ===================================================================================================
	 */
	@Test
	public void startOverLinkWorkingAndRemoveAppliedFilter() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnAdvancedModelOption();
		searchHelper.selectModelFromPopUp();
		searchHelper.clickOnAdvancedTrimOption();
		searchHelper.selectTrimFromPopUp();
		searchHelper.clickOnAdvancedCategoryOption();
		searchHelper.selectCategoryFromPopUp();
		searchHelper.clickOnAdvancedPriceOption();
		searchHelper.selectMinAndMaxPriceFromPopUp();
		searchHelper.clickOnAdvancedNewAndUsedOption();
		searchHelper.clickOnAdvancedYearOption();
		searchHelper.selectMinAndMaxYearFromYearPopUp();
		searchHelper.clickOnSellerTypeAndSelectType();
		searchHelper.clickOnMileageOption();
		searchHelper.selectMinAndMaxMileage();
		searchHelper.clickOnEngineSizeOption();
		searchHelper.selectMinAndMaxEngineSize();
		searchHelper.clickOnStateOptionAndSelectState();
		searchHelper.clickOnCityOptionAndSelectCity();
		searchHelper.clickOnStartOverLinkAndAssertFilterReset();
	}

	/**
	 * ===================================================================================================
	 * ATD-152: Following section should be displayed below Advanced Search at Find
	 * Motorcycles For Sale page. 1. Find by Make 2. Find by Type 3. Find by State
	 * 4. Find Motorcycle Dealers
	 * ===================================================================================================
	 */
	@Test
	public void followingFindByLinksUnderAdvancedSearchSection() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByLinksUnderAdvancedSearch();
	}

	/**
	 * ======================================================================================================
	 * ATD-153: Motorcycles For Sale by Make page should be displayed when click on
	 * 'Find By Make' link below Advanced Search at Advanced Search page.
	 * ======================================================================================================
	 */
	@Test
	public void findByMakeLinkWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByLinksUnderAdvancedSearch();
		searchHelper.clickOnFindByMakeAndAssertResultPage();
	}

	/**
	 * =========================================================================================================
	 * ATD-154: Related Make Search Result page should be displayed when click on
	 * any Make link below Advanced Search at Find Motorcycles For Sale page.
	 * =========================================================================================================
	 */
	@Test
	public void allMakesLinksWorkingUnderFindByMakeSection() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByLinksUnderAdvancedSearch();
		searchHelper.clickOnallMakesLinksUnderFindByMakeSectionAndAssertResultPage();
	}

	/**
	 * ===========================================================================================================
	 * ATD-155: Motorcycles For Sale by Type should be displayed when click on 'Find
	 * By Type' link at Advanced Search page.
	 * ===========================================================================================================
	 */
	@Test
	public void findByTypeLinkWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByLinksUnderAdvancedSearch();
		searchHelper.clickOnFindByTypeAndAssertResultPage();
	}

	/**
	 * ==============================================================================================================
	 * ATD-156: Related Type Search Result page is displaying when click on any Type
	 * link below Advanced Search at Find Motorcycles For Sale page.
	 * ==============================================================================================================
	 */
	@Test
	public void allTypeLinksWorkingUnderFindByTypeSection() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByLinksUnderAdvancedSearch();
		searchHelper.clickOnallTypeLinksUnderFindByTypeSectionAndAssertResultPage();
	}

	/**
	 * ==============================================================================================================
	 * ATD-157: Motorcycles For Sale by State should be displayed when click on
	 * 'Find By State' button at Advanced Search page.
	 * ==============================================================================================================
	 */
	@Test
	public void findByStateLinkWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByLinksUnderAdvancedSearch();
		searchHelper.clickOnFindByStateAndAssertResultPage();
	}

	/**
	 * =================================================================================================================
	 * ATD-158: Related State Search Result page should be displayed when click on
	 * any State link below Advanced Search at Find Motorcycles For Sale page.
	 * =================================================================================================================
	 */
	@Test
	public void allStateLinksWorkingUnderFindByStateSection() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.assertFindByLinksUnderAdvancedSearch();
		searchHelper.clickOnallStateLinksUnderFindByStateSectionAndAssertResultPage();
	}

	/**
	 * ============================================================================================================
	 * ATD-159: Find Motorcycle Dealers page should be displayed when click on Find
	 * Motorcycle Dealers link below Advanced Search at Find Motorcycles For Sale
	 * page.
	 * ============================================================================================================
	 */
	@Test
	public void findCycleTraderDealerLinkWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		dealerHelper.clickOnFindMotorcycleDealersLink();
		dealerHelper.assertFindMotorcycleDealersPage();
	}

	/**
	 * =====================================================================================================
	 * ATD-160: By State and by Type link should be under Header section displaying
	 * at Motorcycles For Sale by Make page.
	 * =====================================================================================================
	 */
	@Test
	public void assertByTypeAndByStateLinksAtSaleByMakePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.assertByTypeAndByStateLinks();
	}

	/**
	 * ========================================================================================================
	 * ATD-161: Motorcycles For Sale by State page should be displayed when click on
	 * by State link at Motorcycles For Sale by Make page.
	 * ========================================================================================================
	 */
	@Test
	public void byStateLinkWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.assertByTypeAndByStateLinks();
		searchHelper.clickOnByStateLinkAndAssertResultPage();
	}

	/**
	 * =============================================================================================================
	 * ATD-162: Motorcycles For Sale by Type page should be displayed when click on
	 * by Type link at Motorcycles For Sale by Make page.
	 * =============================================================================================================
	 */
	@Test
	public void byTypeLinkWorkingAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.assertByTypeAndByStateLinks();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
	}

	/**
	 * ==========================================================================================================
	 * ATD-163: Advanced Search button should be displayed on top right at
	 * Motorcycles For Sale by Make page.
	 * ==========================================================================================================
	 */
	@Test
	public void assertAdvancedSearchButtonAtSaleByMakePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.assertAdvancedSearchButton();
	}

	/**
	 * ==============================================================================================================
	 * ATD-164: Find Motorcycles For Sale page should be displayed when click on
	 * Advanced Search button at Motorcycles For Sale by Make page.
	 * ==============================================================================================================
	 */
	@Test
	public void advancedSearchButtonRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.assertAdvancedSearchButton();
		searchHelper.clickOnAdvancedSearchButtonAndAssertResultPage();
	}

	/**
	 * =============================================================================================================
	 * ATD-171: Make and All Makes Button icons should be displaying at Motorcycles
	 * For Sale by Make page.
	 * =============================================================================================================
	 */
	@Test
	public void assertAllMakesIcons() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.getAllMakesIconsText();
	}

	/**
	 * ======================================================================================================
	 * ATD-172: Related Make Search Result page should be displaying when click on
	 * any Make icon at Motorcycles For Sale by Make page.
	 * ======================================================================================================
	 */
	@Test
	public void allMakesIconsRedirectionAndAssertResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnMakeIconAndAssertResultPage();
	}

	/**
	 * =======================================================================================================
	 * ATD-173: All Make links should be displaying when click on Browse All Make
	 * icon at Motorcycles For Sale by Make page.
	 * =======================================================================================================
	 */
	@Test
	public void assertAllMakeLinksAtSaleByMakePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.assertMakeLink();
	}

	/**
	 * ========================================================================================================
	 * ATD-174: Related Make Search Result page should be displaying when click on
	 * any Make link at Motorcycles For Sale by Make page.
	 * ========================================================================================================
	 */
	@Test
	public void allMakeLinksRedirectionAtSaleByMakePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnAllMakeLinkAndAssertResultPage();
	}

	/**
	 * =========================================================================================================
	 * ATD-175: By Make and by Type links should under Header section displaying at
	 * Motorcycles For Sale by State page.
	 * ==========================================================================================================
	 */
	@Test
	public void assertByMakeAndByTypeLinksAtSaleByStatePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
		searchHelper.assertByMakeAndByTypeLinks();
	}

	/**
	 * =========================================================================================
	 * ATD-176: Motorcycles For Sale by Make page should displaying when by Make
	 * link at Motorcycles For Sale by State page.
	 * =========================================================================================
	 */
	@Test
	public void byMakeLinkWorkingAtSaleByStatePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
		searchHelper.assertByMakeAndByTypeLinks();
		searchHelper.clickOnByMakeLinkAndAssertResultPage();
	}

	/**
	 * ========================================================================================
	 * ATD-177: Motorcycles For Sale by Type page should be displaying when by Type
	 * link at Motorcycles For Sale by State page.
	 * ========================================================================================
	 */
	@Test
	public void byTypeLinkWorkingAtSaleByStatePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
		searchHelper.assertByMakeAndByTypeLinks();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
	}

	/**
	 * =======================================================================================
	 * ATD-178: Advanced Search button should be displaying on top right at
	 * Motorcycles For Sale by State page.
	 * ========================================================================================
	 */
	@Test
	public void assertAdvancedSearchButtonAtSaleByStatePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
		searchHelper.assertAdvancedSearchButton();
	}

	/**
	 * =======================================================================================
	 * ATD-179: Find Motorcycles For Sale page should be displaying when click on
	 * Advanced Search button at Motorcycles For Sale by State page.
	 * =======================================================================================
	 */
	@Test
	public void advancedSearchButtonWorkingAtSaleByStatePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
		searchHelper.assertAdvancedSearchButton();
		searchHelper.clickOnAdvancedSearchButtonAndAssertResultPage();
	}

	/**
	 * =======================================================================================
	 * ATD-180: Related State Search Result page should be displaying when click on
	 * any State link at Motorcycles For Sale by State page.
	 * =======================================================================================
	 */
	@Test
	public void stateLinksWorkingAtSaleByStatePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularStateTab();
		homeHelper.clickOnSearchAllUnderState();
		homeHelper.assertStateResultPage();
		searchHelper.clickOnAllStateLinkAndAssertResultPage();
	}

	/**
	 * ========================================================================================
	 * ATD-181: By State and by Make link should be under Header section displaying
	 * at Motorcycles For Sale by Type page.
	 * ========================================================================================
	 */
	@Test
	public void assertViewAllNewAndUsedButtonAtMotorcycleForSalePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.assertAllButtonAtMotorcycleForSalePage();
	}

	/**
	 * ============================================================================================
	 * ATD-182: Used listing should be displayed when clicking on View Used button
	 * at Motorcycle For Sale.
	 * ============================================================================================
	 */
	@Test
	public void assertListingResultAfterClickingOnViewUsedButton() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.assertAllButtonAtMotorcycleForSalePage();
		searchHelper.clickOnViewUsedButtonAndAssertUsedOptionSelectedInRefineSection();
	}

	/**
	 * ==============================================================================================
	 * ATD-183: New listing should be displayed when clicking on View Used button at
	 * Motorcycle For Sale.
	 * ==============================================================================================
	 */
	@Test
	public void assertListingResultAfterClickingOnViewNewButton() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.assertAllButtonAtMotorcycleForSalePage();
		searchHelper.clickOnViewNewButtonAndAssertUsedOptionSelectedInRefineSection();
	}

	/**
	 * ===============================================================================================
	 * ATD-184: All types section is displayed expanded when clicking on View All
	 * button at Motorcycles For Sale page.
	 * ===============================================================================================
	 */
	@Test
	public void assertAllMakesSectionExpandedWhenClickOnViewAllButton() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.assertAllButtonAtMotorcycleForSalePage();
		searchHelper.clickOnViewAllButtonAndAssertMakesSectionExpend();
	}

	/**
	 * ================================================================================================
	 * ATD-185: View All button is changed with Hide All button when clicking on
	 * View All button at Motorcycles For Sale page.
	 * ================================================================================================
	 */
	@Test
	public void assertHideAllButtonUnderAllMakessection() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.assertAllButtonAtMotorcycleForSalePage();
		searchHelper.assertHideAllButtonAfterExpandMakesSection();
	}

	/**
	 * ================================================================================================
	 * ATD-186: Makes link redirect on correct page when clicking on any Make link
	 * at Motorcycle For Sale page.
	 * ================================================================================================
	 */
	@Test
	public void makeLinksWorkingAtMotorcycleForSalePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.assertAllButtonAtMotorcycleForSalePage();
		searchHelper.assertHideAllButtonAfterExpandMakesSection();
		searchHelper.clickOnAllMakesLinkAndAssertResultPage();
	}

	/**
	 * =========================================================================================================
	 * ATD-187: Expanded makes link section should be collapse when clicking on Hide
	 * All Makes button.
	 * =========================================================================================================
	 */
	@Test
	public void assertMakesLinkSectionCollapseAfterClickOnViewAllButton() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.assertAllButtonAtMotorcycleForSalePage();
		searchHelper.assertHideAllButtonAfterExpandMakesSection();
		searchHelper.clickOnHideAllButtonAndAssertMakesLinkSectionCollapse();
	}

	/**
	 * ================================================================================================
	 * ATD-188: View New and View Used button should be displayed at Makes details
	 * page.
	 * ================================================================================================
	 */
	@Test
	public void assertViewNewAndUsedButtonAtMakesDetailsPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnMakeLinkAndAssertViewNewAndUsedButtonAtMakesDetalesPage();
	}

	/**
	 * ==============================================================================================
	 * ATD-189: New option should be selected under refine search section when click
	 * on View New button at Makes details page.
	 * ==============================================================================================
	 */
	@Test
	public void assertNewOptionSelectedUnderRefineSectionAfterClickOnViewNewButton() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnMakeLinkAndAssertViewNewAndUsedButtonAtMakesDetalesPage();
		searchHelper.clickOnViewNewButtonAndAssertUsedOptionSelectedInRefineSection();
	}

	/**
	 * =========================================================================================
	 * ATD-237: Used option should be selected under refine search section when
	 * click on View Used button at Makes details page.
	 * =========================================================================================
	 */
	@Test
	public void assertUsedOptionSelectedUnderRefineSectionAfterClickOnViewUsedButton() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnMakeLinkAndAssertViewNewAndUsedButtonAtMakesDetalesPage();
		searchHelper.clickOnViewUsedButtonAndAssertUsedOptionSelectedInRefineSection();
	}

	/**
	 * =========================================================================================
	 * ATD-238: View All trim button should be displayed at Makes details page.
	 * =========================================================================================
	 */
	@Test
	public void assertViewAllTrimButtonAtMakesDetailsPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnBMWMakeLinkAndAssertViewAllTrimButtonAtResultPage();
	}

	/**
	 * ===========================================================================================
	 * ATD-239: Top Trim And Other Trim section with trim links are displayed when
	 * click on View All Trim button at makes details page.
	 * ===========================================================================================
	 */
	@Test
	public void assertTopAndOtherTrimSectionAfterClickOnViewAllTrimButton() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnBMWMakeLinkAndAssertViewAllTrimButtonAtResultPage();
		searchHelper.clickOnViewAllTrimButtonAndAssertTrimLinkSection();
	}

	/**
	 * ==============================================================================================
	 * ATD-240: Related trim page opens when clicking on any trim link under top
	 * trim section at makes details page.
	 * ==============================================================================================
	 */
	@Test
	public void assertResultPageWhenClickingOnAnyTrimLinkAtMakesDetailsPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnBMWMakeLinkAndAssertViewAllTrimButtonAtResultPage();
		searchHelper.clickOnViewAllTrimButtonAndAssertTrimLinkSection();
		searchHelper.clickOnTrimLinksUnderTopTrimOption();
	}

	/**
	 * ===================================================================================================
	 * ATD-241: View all trim button should be changed with Hide All Trim button
	 * after expanded the trim links section.
	 * ===================================================================================================
	 */
	@Test
	public void assertViewAllTrimButtonChangedToHideAllButtonAfterClicking() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnBMWMakeLinkAndAssertViewAllTrimButtonAtResultPage();
		searchHelper.assertHideAllButtonAfterExpandMakesSection();
	}

	/**
	 * ========================================================================================================
	 * ATD-242: Make, Mode and Trim option should be selected as trim link after
	 * clicking under refine search section.
	 * ========================================================================================================
	 */
	@Test
	public void assertRefineSearchOptionAfterClickingOnTrimLink() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularTypesTab();
		homeHelper.clickOnSearchAllUnderPopularTypesTab();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnBMWMakeLinkAndAssertViewAllTrimButtonAtResultPage();
		searchHelper.clickOnTrimLinkAndAssertOptionsSelectedUnderRefineSection();
	}

	/**
	 * =======================================================================================================
	 * ATD-243: By State and by Make link should be under Header section displaying
	 * at Motorcycles For Sale by Type page.
	 * =======================================================================================================
	 */
	@Test
	public void assertByMakeAndByStateLinkAtSalebyTypePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
	}

	/**
	 * ===============================================================================================
	 * ATD-244: Motorcycles For Sale by State page should be displayed when click on
	 * by State link at Motorcycles For Sale by Type page.
	 * ===============================================================================================
	 */
	@Test
	public void byStateLinkWorkingAtSalebyTypePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.clickOnByStateLinkAndAssertResultPage();
	}

	/**
	 * =======================================================================================================
	 * ATD-245: Motorcycles For Sale by Make page should be displayed when click on
	 * by Type link at Motorcycles For Sale by Type page.
	 * =======================================================================================================
	 */
	@Test
	public void byMakeLinkWorkingAtSalebyTypePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.clickOnByMakeLinkAndAssertResultPage();
	}

	/**
	 * ====================================================================================================
	 * ATD-246: Advanced Search button should be displayed on top right at
	 * Motorcycles For Sale by Type page.
	 * ====================================================================================================
	 */
	@Test
	public void assertAdvancedSearchButtonAtSaleByTypePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.assertAdvancedSearchButton();
	}

	/**
	 * ========================================================================================================
	 * ATD-247: Find Motorcycles For Sale page should be displaying when click on
	 * Advanced Search button at Motorcycles For Sale by Type page.
	 * ========================================================================================================
	 */
	@Test
	public void assertAdvancedSearchButtonResultPage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.assertAdvancedSearchButton();
		searchHelper.clickOnAdvancedSearchButtonAndAssertResultPage();
	}

	/**
	 * =====================================================================================================
	 * ATD-248: Types and Browse All Types icons should be displayed at Motorcycles
	 * For Sale by Type page.
	 * =====================================================================================================
	 */
	@Test
	public void assertAllTypesAndBrowseAllIconAtSaleByTypePage() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.assertTypesIcon();
	}

	/**
	 * ===================================================================================================
	 * ATD-249: Related Type Search Result page is displayed when click on any Type
	 * icon at Motorcycles For Sale by Type page.
	 * ====================================================================================================
	 */
	@Test
	public void assertTypesResultPageAfterClickingOnTypesIcon() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.clickOnTypeIconsAndAssertResultPage();
	}

	/**
	 * ====================================================================================================
	 * ATD-250: All Type links should be displayed when click on Browse All Type
	 * icon at Motorcycles For Sale by Type page.
	 * =====================================================================================================
	 */
	@Test
	public void assertResultPageafterClickingOnBrowseAllTypesIcon() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.clickOnBrowseAllTypesIconAndAssertResultPage();
	}

	/**
	 * ================================================================================================
	 * ATD-251: Related Type Search Result page should be displayed when click on
	 * any Type link at Motorcycles For Sale by Type page.
	 * ================================================================================================
	 */
	@Test
	public void assertResultPageAfterClickingOnAnyTypeLink() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.clickOnBrowseAllTypesIconAndAssertResultPage();
	}

	/**
	 * ==============================================================================================
	 * ATD-252: Category refine option should be selected with clicked link at Type
	 * result page.
	 * ==============================================================================================
	 */
	@Test
	public void assertCategoryRefineOptionSelectedAfterClickingOnTypeIcon() {
		OpenURL("CycleTrader");
		homeHelper.clickOnPopularMakesTab();
		homeHelper.clickOnSearchAllIcon();
		homeHelper.assertSearchAllMakesSearchResultPage();
		searchHelper.clickOnByTypeLinkAndAssertResultPage();
		searchHelper.assertByMakeAndByStateLinks();
		searchHelper.clickOnTypeIconAndAssertCategoryOptionSelected();
	}

	/**
	 * =============================================================================================
	 * ATD-151: Applied filter should be removed when click on 'Start Over'
	 * link/icon on applied option at Advanced Search page.
	 * =============================================================================================
	 */
	@Test
	public void appliedFilterRemoveAfterClickingOnStartOverLink() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnAdvancedSearchLink();
		searchHelper.assertAdvancedSearchPage();
		searchHelper.clickOnAdvancedTypeOption();
		searchHelper.selectTypesFromPopUp();
		searchHelper.clickOnAdvancedMakeOption();
		searchHelper.selectMakesFromPopUp();
		searchHelper.clickOnStartOverLinkAndAssertAppliedFilterRemoved();
	}

	/**
	 * ===========================================================================================
	 * ATD-191: All links and buttons should be displayed at Listing detail page
	 * below header of application.
	 * ===========================================================================================
	 */
	@Test
	public void assertLinksAndButtonAtDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithRequestPrice();
		searchHelper.assertAllLinksAndButtonAtDetailsPage();
	}

	/**
	 * ==========================================================================================
	 * ATD-192: 'Request Price' button should be displayed with Listing name at
	 * Listing detail page below header of application.
	 * ==========================================================================================
	 */
	@Test
	public void assertRequestPriceButtonAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithRequestPrice();
		searchHelper.assertRequestPriceButton();
	}

	/**
	 * =================================================================================================
	 * ATD-196: 'Save' tagline with Listing name and 'MSRP does not include ${79.00}
	 * in destination charges' text with price should be displayed at Listing detail
	 * page below header of application.
	 * =================================================================================================
	 */
	@Test
	public void assertSaveTagLineAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithSaveTagLineAndAssertResultPage();
	}

	/**
	 * =============================================================================================
	 * ATD-197: 'Get Quote' Button should be displayed under price at Listing detail
	 * page below header of application.
	 * =============================================================================================
	 */
	@Test
	public void assertGetQuoteButtonAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.assertGetQuoteButton();
	}

	/**
	 * ===================================================================================================
	 * ATD-198: 'Get Quote' popup should be displayed when click on 'Get Quote'
	 * Button under price at Listing detail page below header of application.
	 * ===================================================================================================
	 */
	@Test
	public void assertGetQuotePopUpAfterClickingOnGetQuoteButton() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.assertGetQuoteButton();
		searchHelper.clickOnGetQuoteButtonAndAssertPopUp();
	}

	/**
	 * =========================================================================================================
	 * ATD-199: Dealer contact no. should be displayed at 'Get Quote' popup.
	 * =========================================================================================================
	 */
	@Test
	public void assertDealerContactNumberOnGetQuotePopUp() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.assertGetQuoteButton();
		searchHelper.clickOnGetQuoteButtonAndAssertPhoneNumber();
	}

	/**
	 * =============================================================================================
	 * ATD-200: Message Sent confirmation popup should be displayed when user click
	 * on Contact button after filling the form with valid details.
	 * =============================================================================================
	 */
	@Test
	public void assertGetQuoteMessageConfirmationText() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.assertGetQuoteButton();
		searchHelper.clickOnGetQuoteButtonAndAssertPopUp();
		searchHelper.enterAlldetailsAndClickOnContactButtonOnGetQuotePopUp();
	}

	/**
	 * =================================================================================================
	 * ATD-201: 'OBO' tagline with Listing name should be displayed at Listing
	 * detail page below header of application.
	 * =================================================================================================
	 */
	@Test
	public void assertOBOTaglineAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithOBOAndAssertOBOTaglineAtListingDetailsPage();
	}

	/**
	 * =================================================================================================
	 * ATD-202: 'Out The Door Price' tagline with Listing name and 'MSRP does not
	 * include $450 in destination charges.' text with price should be displayed at
	 * Listing detail page below header of application.
	 * ==================================================================================================
	 */
	@Test
	public void assertOutTheDoorTaglineAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithOutTheDoorAndAssertOutTheDoorTaglineAtListingDetailsPage();
	}

	/**
	 * =========================================================================================================
	 * ATD-203: 'Reduced' tagline with Listing name should be displayed at Listing
	 * detail page below header of application.
	 * =========================================================================================================
	 */
	@Test
	public void assertReducedTaglineAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithReducedAndAssertReducedTaglineAtListingPage();
	}

	/**
	 * ==========================================================================================================
	 * ATD-204: 'Testing' tagline with Listing name should be displayed at Listing
	 * detail page below header of application.
	 * ==========================================================================================================
	 */
	@Test
	public void assertTestingTaglineAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithTestingAndAssertTestingTaglineAtListingPage();
	}

	/**
	 * =============================================================================================================
	 * ATD-205: 'Warranty' tagline with Listing name should be displayed at Listing
	 * detail page below header of application.
	 * =============================================================================================================
	 */
	@Test
	public void assertWarrantyTaglineAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithWarrantyAndAssertWarrantyTaglineAtListingPage();
	}

	/**
	 * =========================================================================================================
	 * ATD-206: 'Financing ' tagline with Listing name and 'MSRP does not include
	 * $450 in destination charges.' text with price should be displayed at Listing
	 * detail page below header of application.
	 * =========================================================================================================
	 */
	@Test
	public void assertFinancingTaglineAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithFinancingAndAssertFinancingTaglineAtListingPage();
	}

	/**
	 * ================================================================================================
	 * ATD-207: User should be able to calculate estimated payment at 'Loan
	 * Calculator' popup when click on 'Est. Payment' button at Listing detail page.
	 * ================================================================================================
	 */
	@Test
	public void calculateEstimatePayment() {
		OpenURL("CycleTrader");
		searchHelper.clickOnFindButton();
		searchHelper.clickOnListingWithPriceAndEstimatePaymentIcon();
		searchHelper.estimatePaymentWindow();
	}

	/**
	 * =================================================================================================
	 * ATD-208: Call button should contain phone no. and should be redirected to
	 * call pop up when click on it at Listing detail page.
	 * =================================================================================================
	 */
	@Test
	public void assertCallButtonContainsPhoneNumberAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.clickOnFindButton();
		searchHelper.assertSearchResultPage();
		searchHelper.clickOnListingWithPhoneNumberAndAssertPhoneNumberAtListingPage();
	}

	/**
	 * ==============================================================================================
	 * ATD-209: Contact seller section should be displayed when user click on Email
	 * button at Listing detail page.
	 * ==============================================================================================
	 */
	@Test
	public void assertContactSellerSectionAfterClickingOnEmailAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnAdAndAssertAdDetailsPage();
		searchHelper.clickOnEmailOnlyAndAssertContactsellerSection();
	}

	/**
	 * =========================================================================================================
	 * ATD-210: User should be able to save listing when click on Save button at
	 * Listing detail page.(if user is logged in).
	 * =========================================================================================================
	 */
	@Test
	public void ableToSaveListingAtListingDetailsPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		// searchHelper.assertSearchTab();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnSaveIconAndAssertsavedListing();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ===========================================================================================================
	 * ATD-211: Save button should be changed to Saved and icon should get
	 * highlighted once the listing is saved at Listing detail page.
	 * ============================================================================================================
	 */
	@Test
	public void savedButtonAfterSavedTheListingAtListingDetailsPage() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnSaveIconAndAssertsavedListing();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ========================================================================================================
	 * ATD-212: 'Save This Listing' tab should be highlighted once the listing is
	 * saved at Listing detail page.
	 * ========================================================================================================
	 */
	@Test
	public void saveThisListingTabHighlightedAfterSavedListing() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertSaveThisListingTabHighlightedAfterSavedListing();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ==============================================================================================
	 * ATD-213: 'Save Listing' button should be changed to Saved and icon should be
	 * highlighted under same listing at search result page.
	 * ==============================================================================================
	 */
	@Test
	public void savedIconHighlightedAfterSavedListing() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertSavedIconHighlightedAfterSavedListing();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ===========================================================================================
	 * ATD-214: User should be able to save listing after login (if user is not
	 * logged in).
	 * ============================================================================================
	 */
	@Test
	public void assertListingSavedAfterLoggedInAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertListingSavedAfterLoggedIn();
		signUpHelper.signUpToApplicationFromPopUp();
		searchHelper.assertSavedIconHighlighted();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * ===================================================================================================
	 * ATD-215: 'You are now leaving our site' pop up with Cancel link and OK button
	 * should be displayed when user click on 'Contact Now' button.
	 * ====================================================================================================
	 */
	@Test
	public void assertCancelAndOpenButtonOnCallPopUp() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertOkAndOpenButtonOnCallPopUpAtListingDetailsPage();
	}

	/**
	 * =======================================================================================================
	 * ATD-217: User should be redirected to concerned page when click on OK button
	 * at 'You are now leaving our site' pop up.
	 * =======================================================================================================
	 */
	@Test
	public void acceptTheCallPopUp() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertOkAndOpenButtonOnCallPopUpAtListingDetailsPage();
	}

	/**
	 * ==========================================================================================================
	 * ATD-216: 'You are now leaving our site' pop up should get closed when click
	 * on 'Cancel' link at 'You are now leaving our site' pop up.
	 * ==========================================================================================================
	 */
	@Test
	public void cancelTheCallPopUp() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertOkAndOpenButtonOnCallPopUpAtListingDetailsPage();
	}

	/**
	 * ====================================================================================================
	 * ATD-218: Dealer logo and address should be displayed in right rail at Listing
	 * detail page.
	 * ====================================================================================================
	 */
	@Test
	public void dealerLogoAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertDealerLogoAtListingDetailsPage();
	}

	/**
	 * ==============================================================================================
	 * ATD-219: 'What's My Trade Worth' button should be displayed under Dealer logo
	 * and address in right rail at Listing detail page.
	 * ==============================================================================================
	 */
	@Test
	public void assertDealerAddressAndWhatIsMyTraderWorthButtonAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertDealerAddressAndWhatIsMyTraderWorthButton();
	}

	/**
	 * ===============================================================================================
	 * ATD-220: Following tabs are displayed in right rail at Listing detail page:
	 * Directions to Dealership More From this Dealer Visit Dealer Web-site Save
	 * This Listing Send to a Friend Print Listing Estimate Payment Sell My
	 * Motorcycle.
	 * ===============================================================================================
	 */
	@Test
	public void assertAllTabsBelowDealerAddressAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertAllTabsInRightRail();
	}

	/**
	 * ===============================================================================================
	 * ATD-221: User should be redirected to dealer detail page when click on More
	 * From this Dealer tab at Listing detail page.
	 * ===============================================================================================
	 */
	@Test
	public void assertMoreFromThisDealerRedirectToDealerListingPageAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertMoreFromThisDealerRedirectToDealerListingPage();
	}

	/**
	 * ===================================================================================================
	 * ATD-222: User should be able to save listing when click on Save This Listing
	 * tab in right rail at Listing detail page.(if user is logged in).
	 * ===================================================================================================
	 */
	@Test
	public void assertListingSavedAfterClickingOnSaveThisListingTab() {
		OpenURL("CycleTrader");
		traderMenus.clickOnMoreHamburgerButton();
		traderMenus.clickOnMyTraderSignIn();
		signUpHelper.signUpToApplication();
		myTraderHelper.assertMyTraderPage();
		homeHelper.clickOnApplicationLogo();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnSaveThisListingTabAndAssertListingSaved();
		traderMenus.signOutMyTrader();
		traderMenus.assertPageAfterSignout();
	}

	/**
	 * =====================================================================================================
	 * ATD-223: User should be able to send the listing to a Friend at Listing
	 * detail page.
	 * ======================================================================================================
	 */
	@Test
	public void userAbleToSendEmailToFriendFromListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.enterValidDetailsInSendToFriendsPopUp();
	}

	/**
	 * =======================================================================================================
	 * ATD-224: User should be able to calculate estimated payment at 'Loan
	 * Calculator' pop up when click on 'Estimate Payment' button at Listing detail
	 * page.
	 * =======================================================================================================
	 */
	@Test
	public void loanCalculatedatestimatePaymentPopUp() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertLoanCalculatedAtEstimatePaymantPopUp();
	}

	/**
	 * =========================================================================================================
	 * ATD-225: User should be redirected to concerned page when click on tabs in
	 * right rail at Listing detail page. Directions to Dealer-ship Visit Dealer
	 * Web-site Print Listing Sell My Motorcycle.
	 * ==========================================================================================================
	 */
	@Test
	public void clickOnAllTabsAndAssertResultPageAtListingResultPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnTabsAndAssertResultPage();
	}

	/**
	 * ==================================================================================================
	 * ATD-226: User should be able to share listing (on Facebook, Twitter,
	 * Pinterest) when click on Share link under listing image at Listing detail
	 * page.
	 * ==================================================================================================
	 */
	@Test
	public void assertShareIconsLinkAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertShareIconsLink();
	}

	/**
	 * ==================================================================================================
	 * ATD-227: 'Play Brochure' link should change to 'Pause Brochure' when click on
	 * 'Play Brochure' link under listing image at Listing detail page.
	 * ==================================================================================================
	 */
	@Test
	public void assertPlayBrochureChangedToPauseBrochureAfterClickingAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertPlayBrochureIconChangedAfterClicking();
	}

	/**
	 * ==========================================================================================
	 * ATD-228: User should be able to watch video when click on Watch Video link
	 * under listing image at Listing detail page.
	 * ==========================================================================================
	 */
	@Test
	public void assertVideoWindowAfterClickingOnWatchVideoAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertVideoAfterClickingOnVideoLink();
	}

	/**
	 * ====================================================================================================
	 * ATD-229: Thumb-nail of all images should be displayed under image section at
	 * Listing detail page.
	 * ====================================================================================================
	 */
	@Test
	public void assertListingImageSectionAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertListingImageSection();
	}

	/**
	 * ===================================================================================================
	 * ATD-230: Private Seller address should be displayed in right rail at Listing
	 * detail page.
	 * ===================================================================================================
	 */
	@Test
	public void assertPrivateSellerAddressAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertPrivateSellerAddress();
	}

	/**
	 * ===================================================================================================
	 * ATD-231: Report this Ad tab should be displayed in right rail at Listing
	 * detail page.
	 * ===================================================================================================
	 */
	@Test
	public void assertReportThisAdAtPrivateListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertReportThisAdTab();
	}

	/**
	 * =====================================================================================================
	 * ATD-232: User is able to report ad after submitting form with valid details.
	 * =====================================================================================================
	 */
	@Test
	public void assertReportThisAdPopUpAndInsertAllDetails() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertReportThisAdPopUpAndInsertDetails();
	}

	/**
	 * =======================================================================================================
	 * ATD-234: Following links should be displayed at Listing detail page
	 * Motorcycle Parts for Sale Motorcycle Financing Motorcycle Insurance Need to
	 * Ship Your Motorcycle? NADAguides Pricing Credit Center Motorcycle Injury
	 * =======================================================================================================
	 */
	@Test
	public void assertAllResourcesLinksAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertAllLinksUnderResourceList();
	}

	/**
	 * =====================================================================================================
	 * ATD-235: Details from Seller section should be displayed under listing image.
	 * =====================================================================================================
	 */
	@Test
	public void assertDetailsFromSellerSectionAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.assertDetailsFromSellerSection();
	}

	/**
	 * ======================================================================================================
	 * ATD-236: Contact Seller form should be displayed at Listing detail page.
	 * ======================================================================================================
	 */
	@Test
	public void assertContactSellerFormAtListingDetailsPage() {
		OpenURL("CycleTrader");
		searchHelper.assertSearchTab();
		searchHelper.enterSearchDetails();
		searchHelper.clickOnFindButton();
		searchHelper.assertAdSearchResult();
		searchHelper.clickOnAdAndAssertAdDetailsPage();
		searchHelper.clickOnEmailOnlyAndAssertContactsellerSection();
	}
}
