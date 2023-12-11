package lt.artiom.pom.page;

import org.openqa.selenium.By;

public class Locators {
    public static class Varle {

        public static class Register {

            public static By linkLogin = By.xpath("//a[@data-tooltip='Prisijungimas']");
            public static By Register = By.xpath("//a[contains(text(), 'Registruotis')]");
            public static By inputEmail = By.xpath("//input[@id='id_email']");
            public static By firstPassword = By.xpath("//input[@id='id_password1']");
            public static By secondPassword = By.xpath("//input[@id='id_password2']");
            public static By checkBoxPrivacyPolicy = By.xpath("//input[@id='id_agreement_check']");
            public static By buttonRegister = By.xpath("//button[contains(text(),'Registruotis')]");
            public static By errorMessage = By.xpath(
                    "//li[contains(text(), 'A user is already registered with this e-mail address.')]");
        }

        public class Login {
            public static By linkLogin = By.xpath("//a[@data-tooltip='Prisijungimas']");
            public static By enterEmail = By.xpath("//input[@id='id_login']");
            public static By enterPassword = By.xpath("//input[@id='id_password']");
            public static By buttonLogin = By.xpath("//button[contains(text(), 'Prisijungti')]");
            public static By nameBlock = By.xpath("(//div[@class='name-block'])[2]");
        }

        public class Search {

            public static By searchField = By.xpath("//input[@placeholder='Paieška']");
            public static By arrowSearch = By.xpath("//img[@alt='search']");
            public static By productListing = By.xpath(
                    "//div[@class='grid three-in-row flexible-height-mobile ']//div[@class='GRID_ITEM']");
        }

        public class ChangeSizes {
            public static By secondSearchField = By.xpath("//input[@placeholder='Paieška']");
            public static By itemImg = By.xpath(
                    "//img[@class='product-img primary-img']");
            public static By clickAddToCart = By.xpath("(//img[@alt='add to cart'])[1]");
            public static By clickAddToFavourites = By.xpath("//div[contains(@class, 'PRODUCT_SHORTCUTS')]//span[contains(@class, 'product-like')]");
            public static By clickRemoveAddFromFavourites = By.xpath("//span[@class='product-like active']");
            public static By clickOnButtonContinue = By.xpath("//div[@class='popup-content']//button[@class='secondary-button']");
            public static By clickOnButtonBuy = By.xpath("//div[@class='popup-content']//button[@class='primary-button']");
            public static By checkCartStatus = By.xpath(
                    "//span[@class='cart-items']//span[@class='item-amount']");
            public static By favouritesSize = By.xpath(
                    "//div[contains(@class, 'wishlist-items')]//span[@class='item-amount']");
            public static By acceptMandatoryCokies = By.xpath(
                    "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
            public static By errorMessage = By.xpath("//div[@class='error-message-box']");
            public static By favourites = By.xpath("//span[@class='wishlist-items']");
        }

    }
}
