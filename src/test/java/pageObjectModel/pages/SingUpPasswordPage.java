package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPasswordPage extends BasePage{
    @FindBy(id="ap_password")
    private WebElement password;
    @FindBy(id="signInSubmit")
    private  WebElement signInButton;

    public SingUpPasswordPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void password(){
        password.sendKeys("Himanshu@12");
        signInButton.click();
    }
}
