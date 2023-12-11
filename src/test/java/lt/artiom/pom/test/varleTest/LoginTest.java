package lt.artiom.pom.test.varleTest;

import lt.artiom.pom.page.varlePage.LoginPage;
import lt.artiom.pom.test.BaseTest;
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
        String expectedResult = "artiom.fomichiovqa@gmail.com";
        String actualResult;
        LoginPage.loginToSite();
        actualResult = LoginPage.checkIfCorrectEmailAppears();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void loginWithInValidEmail() {
        String emailAddress = "artiom.fomichiovqa@gmail.com";
        String password = "abcd123";
        String expectedResult = "Pateiktas el. pašto adresas ir/arba slaptažodis yra neteisingi.";
        String actualResult;
        LoginPage.clickOnTheLogInIcon();
        LoginPage.clickOnFieldAndSendEmail(emailAddress);
        LoginPage.clickOnFieldAndSendPassword(password);
        LoginPage.clickOnButtonLogin();
        actualResult = LoginPage.checkIfErrorMessageAppears();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
