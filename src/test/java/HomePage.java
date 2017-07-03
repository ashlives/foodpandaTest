import org.openqa.selenium.WebDriver;

/**
 * Created by Ashish on 03-07-2017.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyHomePage() {
        return driver.getCurrentUrl().contains("foodpanda.com");
    }
}
