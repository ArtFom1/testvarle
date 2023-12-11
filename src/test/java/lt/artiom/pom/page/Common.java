package lt.giedre.pom.page;

import lt.giedre.pom.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void quitWebDriver() {
//        Driver.quitWebDriver();
    }

    public static void setUpCromeDriver() {
        Driver.setChromeDriver();
    }

    public static void openUrl(String url) {
        Driver.getWebDriver().get(url);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    private static WebElement getElement(By locator) {
        return Driver.getWebDriver().findElement(locator);
    }

    public static void clickOnFieldAndEnterInput(By locator, String input) {
        getElement(locator).sendKeys(input);

    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElements(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static List<String> getSearchResult(By locator) {
        List<WebElement> elements = getElements(locator);
        List<String> searchResults = new ArrayList<>();

        for (WebElement element : elements) {
            searchResults.add(element.getText().toLowerCase());
        }
        return searchResults;
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getWebDriver().findElements(locator);
    }

}
