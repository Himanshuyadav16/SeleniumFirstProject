package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface DemoGoogleForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Rohit");

        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Sharma");

    }
}
