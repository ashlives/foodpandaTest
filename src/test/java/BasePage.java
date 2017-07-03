import org.openqa.selenium.WebDriver;

/**
 * Created by Ashish on 03-07-2017.
 */
public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
