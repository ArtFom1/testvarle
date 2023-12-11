package lt.artiom.pom.page.varlePage;

import lt.artiom.pom.page.Common;
import lt.artiom.pom.page.Locators;

public class LoginPage {
    public static void open() {
        Common.setUpCromeDriver();
        Common.openUrl("https://www.varle.lt/");
    }

    public static void loginToSite() {
        String emailAddress = "artiom.fomichiovqa@gmail.com";
        String password = "abcd12321";
        LoginPage.open();
        LoginPage.clickOnTheLogInIcon();
        LoginPage.clickOnFieldAndSendEmail(emailAddress);
        LoginPage.clickOnFieldAndSendPassword(password);
        LoginPage.clickOnButtonLogin();
    }

    public static void clickOnTheLogInIcon() {
        Common.clickOnElement(
                Locators.Varle.Login.linkLogin
        );
    }

    public static void clickOnFieldAndSendEmail(String emailAdress) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Login.enterEmail,
                emailAdress
        );
    }

    public static void clickOnFieldAndSendPassword(String password) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Login.enterPassword,
                password
        );
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(
                Locators.Varle.Login.buttonLogin
        );
    }

    public static String checkIfCorrectEmailAppears() {
        return Common.getTextFromElement(
                Locators.Varle.Login.nameBlock
        );
    }

    public static String checkIfErrorMessageAppears() {
        return Common.getTextFromElement(
                Locators.Varle.ChangeSizes.errorMessage
        );
    }
}
