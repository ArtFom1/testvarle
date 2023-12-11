package lt.artiom.pom.test.varleTest;

import lt.artiom.pom.page.varlePage.ChangingSizesPage;
import lt.artiom.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangingSizesTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        ChangingSizesPage.open();
    }

    @Test
    public void addingItemToCart() {
        String item = "Jaguar Stance EDT tualetinis vanduo vyrams, 100 ml";
        String expectedResult = "1";
        String actualResult;
        ChangingSizesPage.clickOnSearchFieldAndEnterText(item);
        ChangingSizesPage.clickOnSearchButton();
        ChangingSizesPage.acceptCookies();
        ChangingSizesPage.clickOnImage();
        ChangingSizesPage.addItemIntoCart();
        actualResult = ChangingSizesPage.getCartSize();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void addingItemToFavourites() {
        String secondItem = "Jaguar Stance EDT tualetinis vanduo vyrams, 100 ml";
        String expectedResult = "1";
        String actualResult;
        ChangingSizesPage.clickOnSearchFieldEnterText(secondItem);
        ChangingSizesPage.clickOnSearchButton();
        ChangingSizesPage.acceptCookies();
        ChangingSizesPage.clickOnImage();
        ChangingSizesPage.addItemToFavourites();
        ChangingSizesPage.clickOnFavourites();
        actualResult = ChangingSizesPage.getFavouritesSize();
        Assert.assertEquals(actualResult, expectedResult);
        ChangingSizesPage.removeItemFromFavourites();
    }
}
