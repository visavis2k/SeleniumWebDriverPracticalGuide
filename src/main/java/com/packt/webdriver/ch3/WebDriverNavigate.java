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
public class WebDriverNavigate {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        searchBox.clear();
        searchBox.sendKeys("Packt Publishing");
        searchButton.click();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
