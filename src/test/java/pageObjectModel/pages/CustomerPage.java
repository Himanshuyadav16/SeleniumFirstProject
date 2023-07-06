package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage extends BasePage {
   // WebElement e = driver.findElement(By.xpath("//*[text()='Get started free']"));
   // @FindBy(xpath = "//*[text()='Track packages']")
    //@FindBy(linkText = "Track packages")
    @FindBy(xpath ="//*[contains(text(),'Edit or cancel orders')]")
  //  @FindBy(xpath = "//*[(text()='Your Orders','Track packages','Edit or cancel orders')]")
     //@FindBy(xpath ="//*[contains(text(),'Get started ')]")
 // @FindBy(xpath = "//*[text()='Track, return, or buy things again']")
  //@FindBy(xpath = "//*[@id='a-page']/div[2]/div[5]/div/div[1]/div[1]/div[1]/a/div/div/div/div[2]/h3")
    private WebElement order;

    public CustomerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void yourOrder() {
        order.click();
    }

}
