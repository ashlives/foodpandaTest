package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ashish on 03-07-2017.
 */
public class NavigationMenuComponent extends BasePage{
    By aboutLink = By.xpath(".//*[@id='menu-item-1390']/a");

    public NavigationMenuComponent(WebDriver driver) {
        super(driver);
    }

    /*@FindBy(xpath = )
     WebElement aboutLink;
*/
    public void test() {
        System.out.println("Function called");
       wait.until(ExpectedConditions.visibilityOfElementLocated(aboutLink));
       System.out.println("Element found");
       driver.findElement(aboutLink).click();
       System.out.println("Element clicked");
    }
}
