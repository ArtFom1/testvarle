package lt.artiom.pom.test.varleTest;

import lt.artiom.pom.page.Common;
import lt.artiom.pom.page.varlePage.CartPage;
import lt.artiom.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        CartPage.open();
    }

    @Test
    public void addingItemToCart() {
        String item = "Jaguar Stance EDT tualetinis vanduo vyrams, 100 ml";
        String expectedResult = "1";
        String actualResult;
        CartPage.clickOnSearchFieldAndEnterText(item);
        CartPage.clickOnSearchButton();
        CartPage.acceptCookies();
        CartPage.clickOnImage();
        CartPage.addItemIntoCart();
        actualResult = CartPage.getCartSize();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void addingItemToFavourites() {
        String secondItem = "Jaguar Stance EDT tualetinis vanduo vyrams, 100 ml";
        String expectedResult = "1";
        String actualResult;
        CartPage.clickOnSearchFieldEnterText(secondItem);
        CartPage.clickOnSearchButton();
        CartPage.acceptCookies();
        CartPage.clickOnImage();
        CartPage.addItemToFavourites();
        CartPage.clickOnFavourites();
        actualResult = CartPage.getFavouritesSize();
        Assert.assertEquals(actualResult, expectedResult);
        CartPage.removeItemFromFavourites();
    }
}
