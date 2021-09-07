package com.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatingCheckboxes {
    public static void main(String[] args) {

        //set up Chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to checkbox page from practice site
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        //isSelected is checked if the checkbox is selected or not
        System.out.println("Before click checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After click checkbox1.isSelected() = " + checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.id("box2"));
        //getAttribute("checked) -> checked if the checkbox is checked or not
        System.out.println("Before click checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));
        checkbox2.click();

        System.out.println("After click checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));

        //if we want to check the checkbox
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }else{
            System.out.println("Checkbox 1 is already selected");
        }



    }
}
