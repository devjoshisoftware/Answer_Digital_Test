package Answer_Digital_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class TestCase_2 extends Utils
{

    public void clickOnInfiniteScrollToBottomOfThePageTwiceAndScrollBackToTopOfThePage() throws InterruptedException
    {
        //JavascriptExecutor method for scrolling the page
        //have to create an object first of JavascriptExecutor
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //click on Infinite scroll
        driver.findElement(By.xpath("//a[contains(text(),'Infinite Scroll')]")).click();
        //initialising the int for iteration
        int i=0;
        //while loop will help to scroll down page twice
        while(i<=1)
        {
            //this method will scroll down the page till 30000 pixels
            jse.executeScript("window.scrollTo(0,30000)");
            Thread.sleep(2000);
            //will scroll down from 30000 to 60000 pixels
            jse.executeScript("window.scrollTo(30000,60000)");
            Thread.sleep(2000);
            i++;
        }
        //scroll page to the top
        jse.executeScript("window.scrollTo(0,0)");
        //expected result for assertion
        String expectedResult="Infinite Scroll";
        //actual on the page
        String ActualResult=driver.findElement(By.xpath("//div[@class=\"example\"]/h3")).getText();
        //assertion of actual and expected result
        Assert.assertEquals(expectedResult,ActualResult);
    }
}
