package com.packt.webdriver.ch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class GoogleSearchPageByTagName {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println(buttons.size());
        System.out.println(buttons.get(0).getAttribute("name"));
    }

}
