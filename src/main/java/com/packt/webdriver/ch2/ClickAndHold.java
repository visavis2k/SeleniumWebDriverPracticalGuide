package com.packt.webdriver.ch2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class ClickAndHold {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 2/HTML/Selectable.html");

        Actions builder = new Actions(driver);
//        builder.moveByOffset(250, 20)
//                .clickAndHold()
//                .moveByOffset(-120, 0)
//                .perform();
//        WebElement three = driver.findElement(By.name("three"));
//        builder.clickAndHold(three)
//                .moveByOffset(-120, 0)
//                .perform();
        WebElement three = driver.findElement(By.name("three"));
        builder.moveToElement(three)
                .clickAndHold()
                .moveByOffset(-120, 0)
                .perform();
    }
}
