
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void beforeTest (){
        System.setProperty("webdriver.chrome.driver", "c:\\Temp\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.weather-forecast.com/");
    }

    @AfterClass
    public void afterTest (){
        driver.quit();
    }
}
