package com.packt.webdriver.ch3;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kyutae on 2015-07-07.
 */
public class TakesScreenShotExample {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.packtpub.com/");
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        System.out.println("srcFile.getAbsolutePath() = " + srcFile.getAbsolutePath());
        FileCopyUtils.copy(srcFile, new File(System.getProperty("java.io.tmpdir") + "/ScreenShot.png"));
    }
}
