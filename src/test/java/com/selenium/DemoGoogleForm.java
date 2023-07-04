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

public class DemoGoogleForm {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    String driverPath = "src/main/resources/chromedriver";
    public WebDriver driver ;
    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chorme.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        System.out.println(baseUrl);
    }
    @Test
    public void GetTest() {

        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Rohit");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Sharma");

        WebElement gender = driver.findElement(By.id("sex-0"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(gender));
        gender.click();

        WebElement yearOfExperience = driver.findElement(By.id("exp-2"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("exp-2")));
        yearOfExperience.click();


        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("03/07/2023");

        WebElement profession = driver.findElement(By.name("profession"));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait1.until(ExpectedConditions.elementToBeClickable(profession));
        profession.isSelected();
        profession.click();

        WebElement tool = driver.findElement(By.id("tool-0"));
        wait1.until(ExpectedConditions.elementToBeClickable(tool));
        tool.isSelected();
        tool.click();

        WebElement continents = driver.findElement(By.name("continents"));
        continents.click();
        Select selectContinents = new Select(continents);
        selectContinents.selectByVisibleText("Africa");
        wait1.until(ExpectedConditions.elementToBeClickable(continents));
        continents.click();

        WebElement command = driver.findElement(By.id("selenium_commands"));
        Select selectCommand = new Select(command);
        selectCommand.selectByVisibleText("WebElement Commands");
        wait1.until(ExpectedConditions.elementToBeClickable(command));
        command.click();

//        WebElement image= driver.findElement(By.id("photo"));
//        image.click();

        WebElement sumbit = driver.findElement(By.id("submit"));
        sumbit.click();
    }
        @AfterSuite
        public void afterSuite() {
            driver.close();
    }
}
