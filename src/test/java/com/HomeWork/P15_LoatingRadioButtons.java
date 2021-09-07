package com.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P15_LoatingRadioButtons
{
    public static void main(String[] args) {
        //set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to checkbox page from prictice site
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioBtn = driver.findElement(By.id("blue"));
        //check if it's already selected or not
        System.out.println("After click blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        blueRadioBtn.click();

        //click on red btn
        WebElement redBtn = driver.findElement(By.id("red"));
        System.out.println("Before click  redBtn.isSelected() = " + redBtn.isSelected());
        redBtn.click();

        //identify green radio btn
        WebElement greenRadioBtn = driver.findElement(By.id("green"));
        System.out.println("greenRadioBtn.isSelected() = " + greenRadioBtn.isSelected());
        greenRadioBtn.click();
        System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());

        List<WebElement>allColorRadios = driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());

        for (WebElement radio : allColorRadios) {
            System.out.println("radio.getAttribute(\"id\") = " + radio.getAttribute("id"));
            System.out.println("radio.isEnabled() = " + radio.isEnabled());
            radio.click();
            System.out.println("radio.isSelected() = " + radio.isSelected());
        }

        driver.quit();
    }
}
