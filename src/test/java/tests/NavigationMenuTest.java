package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.NavigationMenuComponent;

/**
 * Created by Ashish on 03-07-2017.
 */
public class NavigationMenuTest extends BaseTest {

    NavigationMenuComponent navigationMenuComponent;

    @BeforeClass
    public void init() {
        navigationMenuComponent = new NavigationMenuComponent(getDriver());
    }

    @Test
    public void verifyAboutLink() {
        navigationMenuComponent.test();
    }
}
