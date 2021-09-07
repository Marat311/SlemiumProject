package com.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_LocatingDropdownList_WithNoSelectTag {
    public static void main(String[] args) throws InterruptedException{
        //set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

        //Click to open "unusual" dropdown without selecting tag
        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown link"));
        dropdownLink.click();

        //click item Google
        WebElement google = driver.findElement(By.linkText("Google"));
        google.click();
        driver.navigate().back();
        Thread.sleep(1000);
        WebElement dropdownLink2 = driver.findElement(By.linkText("Dropdown link"));
        dropdownLink2.click();
        driver.findElement(By.linkText("Amazon")).click();

        driver.navigate().back();
        Thread.sleep(3000);
        WebElement dropdownLink3 = driver.findElement(By.linkText("Dropdown link"));
        dropdownLink3.click();
        driver.findElement(By.linkText("Yahoo")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement dropdownLink4 = driver.findElement(By.linkText("Dropdown link"));
        dropdownLink4.click();


        driver.findElement(By.linkText("Facebook")).click();
        driver.navigate().back();
      //
       // driver.findElement(By.linkText("Etsy")).click();



    }
}
