package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    @FindBy(id = "createAccountSubmit")
    private WebElement createButton;
    @FindBy(id = "ap_customer_name")
    private WebElement customerName;
    @FindBy(id = "ap_phone_number")
    private WebElement mobileNumber;
    @FindBy(id = "ap_email")
    private WebElement email;
    @FindBy(id = "ap_password")
    private WebElement password;
    @FindBy(id = "continue")
    private WebElement continueButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void createAccount() {
        createButton.click();
        customerName.sendKeys("Himanshu Yadav");
        mobileNumber.sendKeys("7987231445");
        email.sendKeys("yadav1607@gmail.com");
        password.sendKeys("Himanshu@12");
        continueButton.click();


    }
}
