import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Ashish on 03-07-2017.
 */
public class NavigationMenuTest extends BaseTest{

    private NavigationMenuComponent navigationMenuComponent;

    @BeforeClass
    public void init() {
        navigationMenuComponent = PageFactory.initElements(getDriver(), NavigationMenuComponent.class);
    }

    @Test(groups = "about-page")
    public void verifyAboutLink() {
        navigationMenuComponent.test();
    }
}
