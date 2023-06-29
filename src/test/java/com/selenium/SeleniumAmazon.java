package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAmazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//*[@id='p_89/realme']/span/a/span")).click();

    }
}