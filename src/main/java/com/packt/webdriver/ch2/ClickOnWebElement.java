package com.packt.webdriver.ch2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class ClickOnWebElement {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 2/HTML/Selectable.html");

        WebElement one = driver.findElement(By.name("one"));
        WebElement eleven = driver.findElement(By.name("eleven"));
        WebElement five = driver.findElement(By.name("five"));

        Actions builder = new Actions(driver);

        builder.click(one);
        builder.perform();
        builder.click(eleven);
        builder.perform();
        builder.click(five);
        builder.perform();
    }
}
