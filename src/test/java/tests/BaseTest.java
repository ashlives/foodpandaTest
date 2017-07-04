package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ashish on 03-07-2017.
 */
public class BaseTest {
    private WebDriver driver;
    private final String chromeDriverPath = "C:\\\\selenium-java-3.4.0/chromedriver.exe";
    private final String firefoxDriverPath = "src//main//resources//geckodriver.exe";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    @Parameters({"browser", "baseURL"})
    public void setUp(String browser, String baseURL) {
        driver = getBrowserType(browser);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Window Maximized");
        driver.navigate().to(baseURL);
        System.out.println("Opened "+baseURL);
    }

    private WebDriver getBrowserType(String browserType) {
        if (driver == null ) {
            if (browserType.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
                return  new FirefoxDriver();
            }
            else if (browserType.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                return new ChromeDriver();
            }
        }
        return driver;
    }

    @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}