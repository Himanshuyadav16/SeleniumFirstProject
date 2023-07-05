package pageObjectModel.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjectModel.BaseClass;
import pageObjectModel.pages.HomePage;
import pageObjectModel.pages.LoginPage;
import pageObjectModel.pages.SignUpPage;
import pageObjectModel.pages.SingUpPasswordPage;

public class LoginTestCase extends BaseClass {

    @Test
    public void loginPageTest() {
        WebDriver driver = getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.signUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.createAccount();

    }
    @Test
    public void homePageTest(){
        WebDriver driver = getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.signUp();
    }
    @Test
    public void signUpTest(){
        WebDriver driver=getDriver();
        HomePage homePage=new HomePage(driver);
        homePage.signUp();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.signIn();

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

    }

}