package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
//       driver.findElement(By.id("email")).sendKeys("yourusername@gmail.com");
//       driver.findElement(By.id("pass")).sendKeys("password");
//       Thread.sleep(3000);
//        driver.findElement(By.name("login")).click();
        //  WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        //  System.out.println(email.getTagName());
        //  System.out.println(email.getLocation());
        //   System.out.println(email.isDisplayed());
        //  System.out.println(email.isEnabled());
        // System.out.println(email.isSelected());
        //Forgotten password?
        //  driver.close();
        // driver.quit();
        //*[@id="email"]
      //  WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        //System.out.println(email.getAttribute("id"));
        //email.sendKeys("user@gmail.com");

        driver.findElement(By.cssSelector("#email")).sendKeys("user@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("pass");
       // Thread.sleep(11000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //driver.findElement(By.linkText("Forgotten password?")).click();
        //driver.findElement(By.partialLinkText("Forgotten password?")).click();

    }
}