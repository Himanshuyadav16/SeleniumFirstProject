package pageObjectModel.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjectModel.BaseClass;
import pageObjectModel.pages.*;

public class LoginTestCase extends BaseClass {

    @Test
    public void loginPageTest() {
        WebDriver driver = getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.signUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.createAccount();
        driver.close();

    }
    @Test
    public void homePageTest(){
        WebDriver driver = getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.signUp();
        homePage.searchButton();
        homePage.customerService();
        homePage.searchAddress();
        driver.close();
    }
    @Test
    public void signUpTest(){
        WebDriver driver=getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.signUp();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.signIn();
        driver.close();

    }

    @Test
    public  void password(){
        WebDriver driver=getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.signUp();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.signIn();
        SingUpPasswordPage singUpPasswordPage=new SingUpPasswordPage(driver);
        singUpPasswordPage.password();
        driver.close();

    }

    @Test
    public void phonesSearchTest(){
        WebDriver driver=getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.searchButton();
        PhonesPages phonesPages=new PhonesPages(driver);
        phonesPages.phoneSearch();
        driver.close();

    }
     @Test
     public void customerService(){
         WebDriver driver=getDriver();
         HomePage homePage=new HomePage(driver);
         homePage.customerService();
         CustomerPage customerPage=new CustomerPage(driver);
         customerPage.yourOrder();
         driver.close();

     }

}