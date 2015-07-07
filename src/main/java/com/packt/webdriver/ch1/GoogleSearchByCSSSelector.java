package com.packt.webdriver.ch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class GoogleSearchByCSSSelector {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.cssSelector(".jsb>center>input:nth-child(2)"));
        System.out.println("searchButton@value = " + searchButton.getAttribute("value"));
        System.out.println("searchButton = " + searchButton);

        WebElement aboutLink = driver.findElement(By.cssSelector("span#fsl a._Gs:nth-child(3)"));
        System.out.println("aboutLink.text = " + aboutLink.getText());
        System.out.println("aboutLink = " + aboutLink);
    }

}
