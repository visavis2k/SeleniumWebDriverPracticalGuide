package com.packt.webdriver.ch3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class SwitchBetweenFrames {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 3/HTML/Frames.html");

        Actions builder = new Actions(driver);

//        driver.switchTo().frame(0);
//        WebElement txt = driver.findElement(By.name("1"));
//        txt.sendKeys("I'm Frame One");
//
//        driver.switchTo().defaultContent();
//
//        driver.switchTo().frame(1);
//        txt = driver.findElement(By.name("2"));
//        txt.sendKeys("I'm Frame Two");

        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        WebElement firstFrame = frames.get(0);
        WebElement secondFrame = frames.get(1);

        driver.switchTo().frame(firstFrame);

        WebElement txt = driver.findElement(By.name("1"));
        txt.sendKeys("I'm Frame One");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(secondFrame);

        txt = driver.findElement(By.name("2"));
        txt.sendKeys("I'm Frame Two");
    }
}
