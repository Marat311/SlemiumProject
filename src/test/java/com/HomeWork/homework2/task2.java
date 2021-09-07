package com.HomeWork.homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

    public static void main(String[] args) {
        //1. open chrome and navigate to http://zero.webappsecurity.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");

        //  2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
        if (driver.getTitle().equals("Zero - Personal Banking - Loans - Credit Cards")) {
            System.out.println("Title is: "+driver.getTitle());
        } else {
            System.out.println("Test failed, Invalid Title");
        }

        //3. click on `signin button`
        WebElement signIn = driver.findElement(By.cssSelector("#signin_button"));
        signIn.click();

        // 4. verify the title is "Zero- Log in"
        if (driver.getTitle().equals("Zero- Log in")) {
            System.out.println("Title is: "+driver.getTitle());
        } else {
            System.out.println("Test failed, Invalid Title");
        }
        //5. enter text as "username" into username box
        driver.findElement(By.id("user_login")).sendKeys("username");

        //6.6. enter text "password" into password box
        driver.findElement(By.id("user_password")).sendKeys("password");

        //7. submit by clicking login button
        driver.findElement(By.name("submit")).click();
        //8. verify you are at "Zero - Account Summary" page by checking title
        if (driver.getTitle().equals("Zero - Account Summary")){
            System.out.println(driver.getTitle());
        }else{
            System.out.println("Test failed, Invalid Title");
        }
        driver.quit();
    }
}
/*
1. open chrome and navigate to http://zero.webappsecurity.com/
2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
3. click on `signin button`
4. verify the title is "Zero- Log in"
5. enter text as "username" into username box
6. enter text "password" into password box
7. submit by clicking login button
8. verify you are at "Zero - Account Summary" page by checking title
9. now use your imagination to play around here and explore , automate within the capacity we already have so far.
 */
