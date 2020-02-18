package Answer_Digital_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoadProps extends BasePage{
    static Properties props;

    static FileInputStream inputStream;

    //this method will connect the information from TestDataConfog
    public String getProperty (String key)
    {
        props = new Properties();
        try
        {
            inputStream = new FileInputStream("src\\test\\TestData\\TestDataConfig.properties");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            props.load(inputStream);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return props.getProperty(key);
    }


}
