package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("phones");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement selectPhones = driver.findElement(By.linkText("Apple iPhone 13 Mini (512GB) - Blue"));
        selectPhones.click();
    }
}