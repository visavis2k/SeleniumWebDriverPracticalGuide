package com.packt.webdriver.ch3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class WindowHandling {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 3/HTML/Window.html");

        String window1 = driver.getWindowHandle();
        System.out.println("First window handle is = " + window1);

        WebElement link = driver.findElement(By.linkText("Google Search"));
        link.click();

        String window2 = driver.getWindowHandle();
        System.out.println("Second window handle is = " + window2);
        System.out.println("Number of Window Handles so for = " + driver.getWindowHandles().size());

        Set<String> handles = driver.getWindowHandles();
        handles.forEach(handlerName -> {
            System.out.println("handlerName = " + handlerName);
        });
        
        WebDriver.TargetLocator locator = driver.switchTo();
        locator.window(window1);

    }
}
