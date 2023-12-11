package lt.artiom.pom.page.varlePage;

import lt.artiom.pom.page.Common;
import lt.artiom.pom.page.Locators;

import java.util.List;

public class SearchPage {
    public static void open() {
        LoginPage.loginToSite();
    }

    public static void clickOnSearchFieldAndEnterText(String text) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Search.searchField
                , text
        );
    }

    public static void clickOnSearchArrow() {
        Common.clickOnElement(
                Locators.Varle.Search.searchField
        );
        Common.clickOnElement(
                Locators.Varle.Search.arrowSearch);
    }

    public static Boolean checkSearchResult(List<String> searchingCriteria) {
        int countCriteria = 0;
        Common.waitForElements(Locators.Varle.Search.productListing);
        List<String> searchResults = Common.getSearchResult(
                Locators.Varle.Search.productListing);
        for (String searchResult : searchResults) {
            for (String criteria : searchingCriteria) {
                if (searchResult.contains(criteria)) {
                    break;
                }
                countCriteria++;
                if (countCriteria >= searchResults.size()) {
                    return false;
                }
            }
        }
        return true;
    }

}
