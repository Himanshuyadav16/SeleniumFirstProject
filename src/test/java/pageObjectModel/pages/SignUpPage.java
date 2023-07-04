package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{

    @FindBy(id ="ap_email")
    private WebElement email;
    @FindBy(id="continue")
    private WebElement continueButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void signIn() {
        email.sendKeys("himanshuyadav1607@gmail.com");
        continueButton.click();
    }



}
