package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.utils.ApplicationProperties;

public class HomePage extends BasePage {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    @FindBy(id="nav-link-accountList-nav-line-1")
    private  WebElement helloClick;

    public HomePage(WebDriver driver) {
       super(driver);
        PageFactory.initElements(driver, this);
    }

    public void signUp() {
        driver.get(baseUrl);
        helloClick.click();
    }

}
