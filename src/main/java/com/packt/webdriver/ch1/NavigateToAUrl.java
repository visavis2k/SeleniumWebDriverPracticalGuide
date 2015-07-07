package com.packt.webdriver.ch1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class NavigateToAUrl {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
}
