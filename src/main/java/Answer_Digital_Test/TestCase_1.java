package Answer_Digital_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase_1 extends Utils
{

    public void userShouldNotBeAbleToLogInWithCorrectUserNameAndWrongPassword()
    {
        //click on Form Authentication
        driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
        //enter correct username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        //enter wrong password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!&&&&&&");
        //click on log in button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        //we expect this message after using wrong password for login
        String expectedResult="Your password is invalid!";
        //obtain invalid password message
        String invalidMessage=driver.findElement(By.xpath("//div[@id='flash']")).getText();
        //remove × from the invalid p.message
        String invalidMessage1=String.valueOf(invalidMessage.replace("×",""));
        //this method will remove the trailing space
        String actualResult=(invalidMessage1.trim());
        System.out.println(actualResult);
        //compare the expected invalid result message with actual result
        Assert.assertEquals(expectedResult,actualResult);
    }


    public void userShouldNotBeAbleToLogInWithWrongUserNameAndCorrectPassword()
    {
        driver.get("http://the-internet.herokuapp.com/");
        //click on Form Authentication
        driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
        //enter wrong username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith&&&&");
        //enter correct password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        //click on log in button
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        //we expect this message after using wrong password for login
        String expectedResult="Your username is invalid!";
        //obtain invalid username message
        String invalidMessage=driver.findElement(By.xpath("//div[@id='flash']")).getText();
        //remove × from the invalid p.message
        String invalidMessage1=String.valueOf(invalidMessage.replace("×",""));
        //this method will remove the trailing space
        String actualResult=(invalidMessage1.trim());
        System.out.println(actualResult);
        //compare the expected invalid result message with actual result
        Assert.assertEquals(expectedResult,actualResult);
    }

    public void UserShouldBeAbleToLoginWithCorrectCredentialAndAbleToLogoutSuccessfully()
    {
        driver.get("http://the-internet.herokuapp.com/");
        //click on Form Authentication
        driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
        //enter correct username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        //enter correct password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //click on login
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        assertURL("http://the-internet.herokuapp.com/secure");
        //click on logout button
        driver.findElement(By.xpath("//i[@class=\"icon-2x icon-signout\"]")).click();
    }
}
