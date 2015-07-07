package com.packt.webdriver.ch2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class ContextClick {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 2/HTML/ContextClick.html");

        WebElement contextMenu = driver.findElement(By.id("div-context"));
        Actions builder = new Actions(driver);
//        contextClick(WebElement) used
//        builder.contextClick(contextMenu).click(driver.findElement(By.name("Item 4"))).perform();
        builder.moveToElement(contextMenu)
                .contextClick()
                .click(driver.findElement(By.name("Item 4")))
                .perform();
    }

}
