package lt.artiom.pom.test.varleTest;

import lt.artiom.pom.page.varlePage.SearchPage;
import lt.artiom.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SearchTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        SearchPage.open();
    }

    @Test
    public void filterItems() {
        String text = "jaguar kvepalai vyrams";
        List<String> searchingCriteria = Arrays.asList("jaguar", "kvepalai", "vyrams");
        Boolean actualResult;
        SearchPage.clickOnSearchFieldAndEnterText(text);
        SearchPage.clickOnSearchArrow();
        actualResult = SearchPage.checkSearchResult(searchingCriteria);
        Assert.assertTrue(actualResult);
    }
}
