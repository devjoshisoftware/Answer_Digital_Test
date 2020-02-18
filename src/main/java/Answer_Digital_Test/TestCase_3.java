package Answer_Digital_Test;

import org.openqa.selenium.By;
import org.testng.Assert;

public class TestCase_3 extends Utils {

    public void clickOn4KeysAndAssertTheTextDisplayedAfterEveryKeyPress()
    {
        //click on Key Presses
        driver.findElement(By.xpath("//a[contains(text(),'Key Presses')]")).click();
        //(1)enter First Key
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys("A");
        //collect the result
        String firstKey=driver.findElement(By.xpath("//p[@id='result']")).getText();
        //expected result
        String expectedFirstKey="You entered: A";
        //Assert.assertEquals(expectedFirstKey.equalsIgnoreCase());
        Assert.assertEquals(expectedFirstKey,firstKey);

        //(2)enter Second Key
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys("B");
        //collect the result
        String secondKey=driver.findElement(By.xpath("//p[@id='result']")).getText();
        //expected result
        String expectedSecondKey="You entered: B";
        //Assert.assertEquals(expectedFirstKey.equalsIgnoreCase());
        Assert.assertEquals(expectedSecondKey,secondKey);

        //(3)enter Third Key
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys("C");
        //collect the result
        String ThirdKey=driver.findElement(By.xpath("//p[@id='result']")).getText();
        //expected result
        String expectedThirdKey="You entered: C";
        //Assert.assertEquals(expectedFirstKey.equalsIgnoreCase());
        Assert.assertEquals(expectedThirdKey,ThirdKey);

        //(4)enter Fourth Key
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys("D");
        //collect the result
        String fourthKey=driver.findElement(By.xpath("//p[@id='result']")).getText();
        //expected result
        String expectedFourthKey="You entered: D";
        //Assert.assertEquals(expectedFirstKey.equalsIgnoreCase());
        Assert.assertEquals(expectedFourthKey,fourthKey);
    }
}
