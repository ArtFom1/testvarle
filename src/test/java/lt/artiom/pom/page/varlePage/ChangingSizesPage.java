package lt.artiom.pom.page.varlePage;

import lt.artiom.pom.page.Common;
import lt.artiom.pom.page.Locators;
import lt.artiom.pom.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class CartPage {
    public static void open() {
        LoginPage.loginToSite();
    }

    public static void clickOnSearchFieldAndEnterText(String item) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Cart.secondSearchField,
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
                Locators.Varle.Cart.itemImg
        );
    }

    public static void clickOnFavourites() {
        Common.clickOnElement(
                Locators.Varle.Cart.favourites
        );
    }

    public static void addItemIntoCart() {
        Common.clickOnElement(
                Locators.Varle.Cart.clickAddToCart
        );
        Common.waitForElements(
                Locators.Varle.Cart.clickOnButtonBuy);
        Common.clickOnElement(
                Locators.Varle.Cart.clickOnButtonContinue
        );
    }

    public static void addItemIntoCartAndBuy() {
        Common.clickOnElement(
                Locators.Varle.Cart.clickAddToCart
        );

        Common.waitForElements(
                Locators.Varle.Cart.clickOnButtonBuy);

        Common.clickOnElement(
                Locators.Varle.Cart.clickOnButtonBuy
        );
    }

    public static void addItemToFavourites() {
        Common.clickOnElement(
                Locators.Varle.Cart.clickAddToFavourites
        );
    }
    public static void removeItemFromFavourites() {
        Common.clickOnElement(
                Locators.Varle.Cart.clickRemoveAddFromFavourites
        );
    }

    public static String getCartSize() {
        return Common.getTextFromElement(
                Locators.Varle.Cart.checkCartStatus
        );
    }

    public static void acceptCookies() {
        Common.clickOnElement(
                Locators.Varle.Cart.acceptMandatoryCokies
        );
    }

    public static void clickOnSearchFieldEnterText(String secondItem) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Cart.secondSearchField,
                secondItem
        );
    }

    public static void clickOnCart() {
        Common.waitForElements(
                Locators.Varle.Cart.clickOnCartIcon);
        Common.clickOnElement(
                Locators.Varle.Cart.clickOnCartIcon
        );

        Driver.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void clickOnRemoveIcon() {
        Common.waitForElements(
                Locators.Varle.Cart.clickRemoveIcon
        );
        Common.clickOnElement(
                Locators.Varle.Cart.clickRemoveIcon
        );
    }

    public static String cartSizeAfterRemoving() {
        return Common.getTextFromElement(
                Locators.Varle.Cart.checkCartStatus
        );
    }

    public static String getFavouritesSize() {
        return Common.getTextFromElement(
                Locators.Varle.Cart.favouritesSize
        );
    }
}
