package lt.giedre.pom.page.varlePage;

import lt.giedre.pom.page.Common;
import lt.giedre.pom.page.Locators;

public class LoginPage {
    public static void open() {
        Common.setUpCromeDriver();
        Common.openUrl("https://www.varle.lt/");
    }

    public static void loginToSite() {
        String emailAdress = "mokinys90123@gmail.com";
        String password = "M@kinys123*";
        LoginPage.open();
        LoginPage.clickOnTheLogInIcon();
        LoginPage.clickOnFieldAndSendEmail(emailAdress);
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
}
