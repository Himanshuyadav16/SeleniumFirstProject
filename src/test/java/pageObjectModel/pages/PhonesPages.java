package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonesPages extends BasePage{
      @FindBy(className = "s-image")
      private WebElement phones;


    public PhonesPages(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public  void phoneSearch(){
        phones.click();
    }

}
