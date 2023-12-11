package lt.giedre.pom.test.varleTest;

import lt.giedre.pom.page.varlePage.LoginPage;
import lt.giedre.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();
    }
    @Test
    public void loginWithValidEmail() {
        String expectedResult = "mokinys90123@gmail.com";
        String actualResult;
        LoginPage.loginToSite();
        actualResult = LoginPage.checkIfCorrectEmailAppears();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
