import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Ashish on 03-07-2017.
 */
public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeClass(alwaysRun = true)
    public void init() {
        homePage = PageFactory.initElements(getDriver(), HomePage.class);
    }

    @Test(groups = "home-page")
    public void verifyFirstPage() {
        Assert.assertTrue(homePage.verifyHomePage());
    }
}
