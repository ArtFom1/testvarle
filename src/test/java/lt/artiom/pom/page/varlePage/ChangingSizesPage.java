package lt.artiom.pom.page.varlePage;

import lt.artiom.pom.page.Common;
import lt.artiom.pom.page.Locators;

public class ChangingSizesPage {
    public static void open() {
        LoginPage.loginToSite();
    }

    public static void clickOnSearchFieldAndEnterText(String item) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.ChangeSizes.secondSearchField,
                item
        );
    }

    public static void clickOnSearchButton() {
        Common.clickOnElement(
                Locators.Varle.Search.searchField);
        Common.clickOnElement(
                Locators.Varle.Search.arrowSearch);
    }

    public static void clickOnImage() {
        Common.clickOnElement(
                Locators.Varle.ChangeSizes.itemImg
        );
    }

    public static void clickOnFavourites() {
        Common.clickOnElement(
                Locators.Varle.ChangeSizes.favourites
        );
    }

    public static void addItemIntoCart() {
        Common.clickOnElement(
                Locators.Varle.ChangeSizes.clickAddToCart
        );
        Common.waitForElements(
                Locators.Varle.ChangeSizes.clickOnButtonBuy);
        Common.clickOnElement(
                Locators.Varle.ChangeSizes.clickOnButtonContinue
        );
    }

    public static void addItemToFavourites() {
        Common.clickOnElement(
                Locators.Varle.ChangeSizes.clickAddToFavourites
        );
    }

    public static void removeItemFromFavourites() {
        Common.clickOnElement(
                Locators.Varle.ChangeSizes.clickRemoveAddFromFavourites
        );
    }

    public static String getCartSize() {
        return Common.getTextFromElement(
                Locators.Varle.ChangeSizes.checkCartStatus
        );
    }

    public static void acceptCookies() {
        Common.clickOnElement(
                Locators.Varle.ChangeSizes.acceptMandatoryCokies
        );
    }

    public static void clickOnSearchFieldEnterText(String secondItem) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.ChangeSizes.secondSearchField,
                secondItem
        );
    }

    public static String getFavouritesSize() {
        return Common.getTextFromElement(
                Locators.Varle.ChangeSizes.favouritesSize
        );
    }
}
