import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Ashish on 03-07-2017.
 */
public class NavigationMenuComponent extends BasePage{

    public NavigationMenuComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='right']//a[contains(@href, '/about')]")
    private WebElement aboutLink;

    public void test() {
        aboutLink.click();
    }
}
