package com.selenium;

import com.sun.tools.javac.main.Option;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumFacebookDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        WebElement day = driver.findElement(By.id("day"));

        Select select = new Select(day);

     //  select.selectByValue("22");
      //  select.selectByVisibleText("Day");
       select.selectByIndex(28);
      //  System.out.println(day.getAttribute("value"));

        List <WebElement> date=select.getOptions();
        System.out.println(date.size());

        for (int i=0;i< date.size();i++){
            String text= date.get(i).getText();
           // System.out.println(text);
            Thread.sleep(1000);
            date.get(i).click();
        }

//        List <WebElement> gender=driver.findElements(By.name("sex"));
//      //  System.out.println(gender.size());
//        for (int i=0;i< gender.size();i++) {
//            String text = gender.get(i).getText();
//            Thread.sleep(4000);
//            if (i == 1) {
//                gender.get(i).click();
//                System.out.println(gender.get(i));
//            }
      //  }






    }
}