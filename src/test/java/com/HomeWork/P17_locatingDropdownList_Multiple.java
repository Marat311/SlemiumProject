package com.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_locatingDropdownList_Multiple {
    public static void main(String[] args) {

        //set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        //identify the dropdown with multiple select options
        WebElement multiItemDropdown = driver.findElement(By.name("Languages"));

        //wrap this element into Select object
        Select numliItemSelect = new Select(multiItemDropdown);
        //check if this element has multiple select option
        System.out.println("numliItemSelect.isMultiple() = " + numliItemSelect.isMultiple());

        //check if this is a multi select list
        numliItemSelect.selectByIndex(3);
        numliItemSelect.selectByValue("c#");
        numliItemSelect.selectByVisibleText("Java");

        //dselect items
        numliItemSelect.deselectByIndex(3);
        numliItemSelect.selectByValue("c#");
        numliItemSelect.deselectByVisibleText("Java");
        numliItemSelect.deselectByVisibleText("Python");
        numliItemSelect.deselectAll();


    }
}
