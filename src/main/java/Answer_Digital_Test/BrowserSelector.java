package Answer_Digital_Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelector extends Utils
{
    LoadProps loadProps = new LoadProps();

    public void setUpBrowser()
    {
        //browser will be initiated from TestDataConfig
        String browser = loadProps.getProperty("browser");
        //source of drivers
        System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
        //driver object
        driver = new ChromeDriver();
    }
}
