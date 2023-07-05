package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class BaseClass {
    public WebDriver driver;

    public WebDriver getDriver(){
        System.setProperty("webdriver.chorme.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    @AfterTest
    public void afterTest() {
      //  driver.close();
    }
}
