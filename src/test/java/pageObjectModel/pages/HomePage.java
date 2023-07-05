package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.utils.ApplicationProperties;

import java.time.Duration;

public class HomePage extends BasePage {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    @FindBy(id="nav-link-accountList-nav-line-1")
    private  WebElement helloClick;

    @FindBy(id="twotabsearchtextbox")
    private  WebElement search;

    @FindBy(id="nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(id="glow-ingress-line2")
    private WebElement selectAddress;


    @FindBy(css="input[id=GLUXZipUpdateInput]")
    private WebElement pincode;

    @FindBy(className = "a-button-input")
    private WebElement applyButton;

  @FindBy(linkText = "Customer Service")
    //  @FindBy(xpath="//*[@id='nav-xshop']/a[6]")
    private WebElement customerService;

    public HomePage(WebDriver driver) {
       super(driver);
        PageFactory.initElements(driver, this);
    }

    public void signUp() {
        driver.get(baseUrl);
        helloClick.click();
    }

    public void searchButton(){
        driver.get(baseUrl);
        search.sendKeys("phones");
        searchButton.click();
    }

    public void searchAddress(){
        driver.get(baseUrl);
        selectAddress.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(pincode));
        pincode.sendKeys("452001");
        applyButton.click();
    }

    public void customerService(){
        driver.get(baseUrl);
        customerService.click();
    }

}
