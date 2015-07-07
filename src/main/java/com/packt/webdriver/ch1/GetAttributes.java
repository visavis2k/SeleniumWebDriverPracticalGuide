package com.packt.webdriver.ch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class GetAttributes {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println("searchButton@name = " + searchButton.getAttribute("name"));
        System.out.println("searchButton@id = " + searchButton.getAttribute("id"));
        System.out.println("searchButton@jsaction = " + searchButton.getAttribute("jsaction"));
        System.out.println("searchButton@aria-label = " + searchButton.getAttribute("aria-label"));
    }
}
