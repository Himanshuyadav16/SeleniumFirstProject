package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjectModel.utils.ApplicationProperties;

import java.time.Duration;

public class SeleniumFacebookRegister {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    String driverPath = "src/main/resources/chromedriver";
    public WebDriver driver ;
    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chorme.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void GetTest() {

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Suryakumar");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Yadav");

        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
        email.sendKeys("yadav1607@gmail.com");

        WebElement reEnterEmail = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input"));
        reEnterEmail.sendKeys("yadav1607@gmail.com");

        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("password12@");

        WebElement day = driver.findElement(By.id("day"));
        Select select = new Select(day);
        select.selectByVisibleText("30");

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("Jun");

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("1980");

        WebElement gender = driver.findElement(By.cssSelector("input[value='-1']"));
        gender.click();

        WebElement pronoun = driver.findElement(By.name("preferred_pronoun"));
        Select selectPronoun = new Select(pronoun);
        selectPronoun.selectByValue("1");

        WebElement optionalGender = driver.findElement(By.name("custom_gender"));
        optionalGender.sendKeys("Male");

        WebElement submitButton = driver.findElement(By.name("websubmit"));
        submitButton.click();

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='scrollview']/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/span/span"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='scrollview']/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/span/span")));
        continueButton.click();

       WebElement codeVerification = driver.findElement(By.id("code_in_cliff"));
        codeVerification.sendKeys("12345");
    }
    @AfterSuite
    public void afterSuite() {
        driver.close();
    }
}