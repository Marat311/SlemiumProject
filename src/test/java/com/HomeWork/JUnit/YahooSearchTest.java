package com.HomeWork.JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchTest {
    WebDriver driver;

    @BeforeAll
    public static void initBrowserDriver(){
        System.out.println("Before all runs only once before all tests ");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupWebDriver(){
        System.out.println("Before each to open browser and navigate");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");

    }

    @AfterEach
    public void closeBrowser(){
        System.out.println("AfterEach is closing browser");
        driver.quit();
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("AfterAll run only once after all tests");
    }

    @Test
    public void testYahooSearchHomePage(){

        String expectedResult = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        //assertion
        assertEquals(expectedResult, actualTitle);


    }

    @Test
    public void testYahooSerchResultPage(){

        //search for selenium hit enter
        WebElement searchBox= driver.findElement(By.xpath("//input[@name='p']"));
        searchBox.sendKeys("Selenium"+ Keys.ENTER);

        //assert the title starts with selenium

        String actual = driver.getTitle();
        assertTrue(actual.startsWith("Selenium"));



    }
}
