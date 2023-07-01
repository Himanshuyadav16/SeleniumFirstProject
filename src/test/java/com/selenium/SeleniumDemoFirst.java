package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoFirst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        WebElement documentation= driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[4]/a"));
        documentation.click();
    }
}
