package com.HomeWork.homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class task1 {
    public static void main(String[] args) {
        //1. navigate to https://google.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        //2. search for `selenium`
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium");
        //3. click google search button
        WebElement searchBtn = driver.findElement(By.className("iblpc"));
        search.submit();
        //4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
        WebElement text = driver.findElement(By.cssSelector("#result-stats"));
        //5. get the text of that element
        System.out.println("text.getText() = " + text.getText());
        //6. Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
        String test = text.getText();
        String str = test.substring(0, test.indexOf("("));
        String nums = "";
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                nums+=ch;
            }
        }
        long r = Long.parseLong(nums);
        System.out.println("result ="+r);
        //7. get all the link that contain text `selenium` into a List<WebElement>
        List <WebElement> list = driver.findElements(By.partialLinkText("selenium"));
        //8. get the count
        System.out.println("list.size() = " + list.size());
        //9. get the first one text
        System.out.println("list.size(0) = " + list.get(0).getText());
        System.out.println("list.get(list.size()-1) = " + list.get(list.size() - 1).getText());
        //11. iterate over the list and print the text of each link
        System.out.println("--------------------------");
        for (WebElement each:list) {
            System.out.println(each.getText());
        }
        System.out.println("--------------------------");
        driver.quit();
    }
    }
    /*1. navigate to https://google.com
2. search for `selenium`
3. click google search button
4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
5. get the text of that element
6. Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
7. get all the link that contain text `selenium` into a List<WebElement>
8. get the count
9. get the first one text
10. get the last one text
11. iterate over the list and print the text of each link
12. watch the short to learn more about `findElement(By.tagName("tag here"))`
13. watch the short to learn more about `element.getAttribute("attribute goes here")`
     */
