package pageObjects.user;

import org.openqa.selenium.WebDriver;
import pageObjects.navigation.SideBarMyAccountPageObject;

public class MyProductReviewPageObject extends SideBarMyAccountPageObject {
    private WebDriver driver;
    public MyProductReviewPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


}
