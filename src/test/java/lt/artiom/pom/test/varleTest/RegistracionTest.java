package lt.artiom.pom.test.varleTest;

import lt.artiom.pom.page.varlePage.RegistracionPage;
import lt.artiom.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistracionTest extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        RegistracionPage.open();
    }

    @Test
    public void registerWithExistingUserEmail() {
        String emailAdress = "artiom.fomichiovqa@gmail.com";
        String password = "abcd12321";
        String expectedResult = "A user is already registered with this e-mail address.";
        String actualResult;
        RegistracionPage.clickOnTheLogInIcon();
        RegistracionPage.clickRegister();
        RegistracionPage.clickOnFieldAndSendEmail(emailAdress);
        RegistracionPage.clickOnFieldAndSendFirstPassword(password);
        RegistracionPage.clickOnFieldAndSendSecondPassword(password);
        RegistracionPage.clickOnCheckBox();
        RegistracionPage.clickOnButtonRegister();
        actualResult = RegistracionPage.doesErrorMessageAppears();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
