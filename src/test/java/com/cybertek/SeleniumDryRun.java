package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {

        //1. setup Chrome driver using webdriver manager
        //so selenium can send interruption request
        WebDriverManager.chromedriver().setup();
        //2. Create webdriver instance using Chrome Driver object
        WebDriver driver = new ChromeDriver();

        //3. Navigate to https://google.com
       driver.navigate().to("https://google.com");




    }
}
