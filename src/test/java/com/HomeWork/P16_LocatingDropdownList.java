package com.HomeWork;

import com.cybertek.SeleniumDryRun;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropdownList {
    public static void main(String[] args) {

        //set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        //identify the select element
        WebElement dropdownElm = driver.findElement(By.id("dropdown"));
        //wrap this element inside Select object
        Select selectObj = new Select(dropdownElm);
        selectObj.selectByIndex(2); //select 3rd item at index 2
        selectObj.selectByValue("1"); //select item with value attribute 1
        selectObj.selectByVisibleText("Option 2"); //select item with visible text

        driver.quit();

    }
}
