package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MoveTo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Actions actions = new Actions(driver);
        WebElement email = driver.findElement(By.id("email"));

        WebElement password = driver.findElement(By.id("pass"));

        WebElement login = driver.findElement(By.name("login"));
        int x = login.getLocation().getX();
        int y = login.getLocation().getY();

            actions.moveToElement(email).sendKeys("lise@gmail.com").build().perform();
            Thread.sleep(5000);

            actions.moveToElement(password).sendKeys("password").build().perform();
            actions.moveByOffset(x, y).click().build().perform();
            // actions.moveToElement(login).click();
    }
}
