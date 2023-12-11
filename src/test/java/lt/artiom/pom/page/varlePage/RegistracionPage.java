package lt.giedre.pom.page.varlePage;

import lt.giedre.pom.page.Common;
import lt.giedre.pom.page.Locators;

public class RegistracionPage {
    public static void open() {
        Common.setUpCromeDriver();
        Common.openUrl("https://www.varle.lt/");
    }

    public static void clickOnTheLogInIcon() {
        Common.clickOnElement(
                Locators.Varle.Register.linkLogin
        );
    }

    public static void clickRegister() {
        Common.clickOnElement(
                Locators.Varle.Register.Register
        );
    }

    public static void clickOnFieldAndSendEmail(String emailAdress) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Register.inputEmail,
                emailAdress
        );
    }

    public static void clickOnFieldAndSendFirstPassword(String password) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Register.firstPassword,
                password
        );
    }

    public static void clickOnFieldAndSendSecondPassword(String password) {
        Common.clickOnFieldAndEnterInput(
                Locators.Varle.Register.secondPassword,
                password
        );
    }

    public static void clickOnCheckBox() {
        Common.clickOnElement(
                Locators.Varle.Register.checkBoxPrivacyPolicy
        );
    }

    public static void clickOnButtonRegister() {
        Common.clickOnElement(
                Locators.Varle.Register.buttonRegister
        );
    }

    public static String doesErrorMessageAppears() {
        return Common.getTextFromElement(
                Locators.Varle.Register.errorMessage
        );
    }
}
