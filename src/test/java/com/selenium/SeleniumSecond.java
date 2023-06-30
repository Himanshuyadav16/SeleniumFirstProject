package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSecond {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");

        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(3000);
        System.out.println("back");

        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("forward");

        driver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println("refresh");
    }
}