package com.packt.webdriver.ch2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.logging.Logger;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class MoveByOffsetAndClick {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("file://D:/dev/repos_book/Selenium WebDriver Practical Guide/Chapter 2/HTML/Selectable.html");

        WebElement one = driver.findElement(By.name("one"));
        WebElement eleven = driver.findElement(By.name("eleven"));
        WebElement five = driver.findElement(By.name("five"));

        int tileWidth = 100;
        int tileHeight = 80;
        int border = 1;

        Actions builder = new Actions(driver);
        builder.moveToElement(one, border, border).click();
        builder.moveToElement(eleven, border, border).click();
        builder.perform();
        builder.moveToElement(five, border, border).click();
        builder.moveByOffset(one.getLocation().getX() + tileWidth + 30, one.getLocation().getY() + tileHeight + 30).click();
//        builder.moveByOffset(one.getLocation().getX() + border, one.getLocation().getY() + border).click();
//        builder.build().perform();
//        builder.moveByOffset(2 * tileWidth + 4 * border, 2 * tileHeight + 4 * border).click();
//        builder.build().perform();
//        builder.moveByOffset(-2 * tileWidth - 4 * border, -tileHeight + 2 * border).click();
        builder.perform();
        System.out.println("one.getLocation() = " + one.getLocation());
        System.out.println("eleven.getLocation() = " + eleven.getLocation());
        System.out.println(one.getLocation().getX() + tileWidth + border);
        System.out.println(one.getLocation().getY() + tileHeight + border);
    }
}
