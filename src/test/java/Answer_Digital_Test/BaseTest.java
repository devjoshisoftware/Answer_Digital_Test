package Answer_Digital_Test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    LoadProps loadProps = new LoadProps();
    BrowserSelector browserSelector=new BrowserSelector();

    @BeforeMethod

    public void setUp()
    {
        browserSelector.setUpBrowser();
        //open the browser
        driver.manage().window().fullscreen();
        //set implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void close()
    {
        driver.quit();
    }


}
