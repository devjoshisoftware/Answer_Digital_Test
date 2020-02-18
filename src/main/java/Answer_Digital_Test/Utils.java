package Answer_Digital_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Utils extends BasePage{
    //it will click on elements
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    // method for wait till element visible
    public static void waitForElementVisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // to enter text of element
    public static void sendText (By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //to get the text for expected and actual result
    public static String getTextReturn(By by)
    {
        return driver.findElement(by).getText();
    }

    //assert URL
    public void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
}
