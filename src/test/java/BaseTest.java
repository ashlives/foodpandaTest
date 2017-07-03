import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ashish on 03-07-2017.
 */
public class BaseTest {
    private WebDriver driver;
    private final String chromeDriverPath = "src//main//resources//chromedriver.exe";
    private final String firefoxDriverPath = "src//main//resources//geckodriver.exe";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeTest
    @Parameters({"browser", "baseURL"})
    public void setUp(@Optional String browser, @Optional String baseURL) {
        driver = getBrowserType(browser);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(baseURL);
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

    @AfterTest
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}