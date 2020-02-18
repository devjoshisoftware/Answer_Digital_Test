package Answer_Digital_Test;

import org.testng.annotations.Test;


public class TestSuit extends BaseTest {

    TestCase_1 testCase1 =new TestCase_1();
    TestCase_2 testCase_2 =new TestCase_2();
    TestCase_3 testCase_3 =new TestCase_3();

    @Test(priority = 1)
    public void userShouldNotBeAbleToLogInWithCorrectCredential(){
        testCase1.userShouldNotBeAbleToLogInWithCorrectUserNameAndWrongPassword();
        testCase1.userShouldNotBeAbleToLogInWithWrongUserNameAndCorrectPassword();
        testCase1.UserShouldBeAbleToLoginWithCorrectCredentialAndAbleToLogoutSuccessfully();

    }
    @Test(priority = 2)
    public void clickOnInfiniteScrollToBottomOfThePage() throws InterruptedException {

        testCase_2.clickOnInfiniteScrollToBottomOfThePageTwiceAndScrollBackToTopOfThePage();
    }

    @Test(priority = 3)
    public void clickOn4KeysAndAssertTheTextDisplayed(){
        testCase_3.clickOn4KeysAndAssertTheTextDisplayedAfterEveryKeyPress();
    }

}
