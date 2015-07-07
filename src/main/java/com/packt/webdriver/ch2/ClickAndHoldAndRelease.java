package com.packt.webdriver.ch2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class ClickAndHoldAndRelease {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 2/HTML/Selectable.html");

        WebElement three = driver.findElement(By.name("three"));
        WebElement two = driver.findElement(By.name("two"));

        Actions builder = new Actions(driver);

        //Move tile3 to the position of tile2
//        builder.clickAndHold(three)
//                .moveByOffset(-120, 0)
//                .release()
//                .perform();
        builder.clickAndHold(three)
                .release(two)
                .perform();

    }
}
