package com.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P13_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        driver.manage().window().maximize();

        //print out the page title
        String title = driver.getTitle();
        System.out.println("title = " + title);
        //Enter username provided standart_user
        WebElement userName = driver.findElement(By.name("user-name")); //name was same as id
        userName.sendKeys("standard_user");

        //Enter password provided: secret_sauce
        WebElement password = driver.findElement(By.name("password"));//name was same as id
        password.sendKeys("secret_sauce");
        //click the loggin button to login -id = login button
        WebElement loginBtn = driver.findElement(By.name("login-button"));//name was same as id
        loginBtn.submit();
        //Get the name and price of first product
        WebElement firstProductLink = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLink.getAttribute(\"id\") = " + firstProductLink.getAttribute("id"));
        //assuming we dont know the product name but we know we want to get first item anyway
WebElement firstProductLInk1 = driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProductLInk1.getText() = " + firstProductLInk1.getText());

        WebElement firstProductLink2 = driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProductLink2 = " + firstProductLink2.getText());

        //Get all product names into List<WebElement>
        List<WebElement> allProductName = driver.findElements(By.className("inventory_item_name"));
        //get the count
        System.out.println("allProductName.size() = " + allProductName.size());
        //print out the all product title


        List<WebElement> allPrice = driver.findElements(By.className("inventory_item_price"));
        System.out.println("allPrice.size() = " + allPrice.size());
        int index = 0;
        for (WebElement webElement : allProductName) {
            System.out.println("product title text: "+webElement.getText()+" price: "+allPrice.get(index).getText());
            index++;
        }


        //click on the shopping cart link top right corner
        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        cart.click();
        //Click on continue to shop button to come back to product page
        WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
        continueShopping.click();

        driver.quit();


    }
}
