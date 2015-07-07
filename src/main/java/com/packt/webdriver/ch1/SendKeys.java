package com.packt.webdriver.ch1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class SendKeys {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(Keys.chord(Keys.SHIFT, "packt publishing"));
        searchBox.sendKeys(Keys.ESCAPE);
        searchBox.clear();
    }
}
