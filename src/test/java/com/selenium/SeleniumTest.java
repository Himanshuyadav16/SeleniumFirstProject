package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("password");
       Thread.sleep(3000);
        driver.findElement(By.name("login")).click();
    }
}