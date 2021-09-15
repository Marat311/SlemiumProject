package com.HomeWork.test_Util;

import com.HomeWork.Utility.WebDriverFactory1;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public  abstract class TestBase {
    protected WebDriver driver;

    @BeforeAll
    public static void initBrowserDriver(){
        System.out.println("Before All run only once before all tests");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("After all run only once after all tests");
    }

    @BeforeEach
    public void setUpBrowser(){
        driver = WebDriverFactory1.get("chrome");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.close();
    }

}
