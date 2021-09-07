package com.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    public static void main(String[] args) throws InterruptedException{
        // 1. Open Chrome and Navigate to https://facebook.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
//3. Enter password `some password` password box
        WebElement UserName = driver.findElement(By.id("email"));
        UserName.sendKeys("invalid username");

        WebElement password= driver.findElement(By.id("pass"));
        password.sendKeys("some password");

        //4. Click on the Login button and wait few seconds until error comes back

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        Thread.sleep(3000);

        //5. Navigate back to login screen
        driver.navigate().back();

        //6. Click on `forget password` link
        WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password?"));

        //7. Click on `forget password` link
        forgotPassword.click();

        // Enter `something` into Mobile number text box `123456789`
Thread.sleep(1000);
        WebElement mobileBox = driver.findElement(By.id("identify_email"));
        mobileBox.sendKeys("100000000");

        // 8. Click on the search button
        WebElement searchButton = driver.findElement(By.name("did_submit"));
        searchButton.submit();
         Thread.sleep(2000);

        //9. Click on the cancel button
        WebElement cancel = driver.findElement(By.cssSelector("#identify_yourself_flow > div > div.uiInterstitialBar.uiBoxGray.topborder > div > div.rfloat._ohf > a"));
        System.out.println(cancel.getTagName());

        cancel.click();


        Thread.sleep(2000);
        driver.quit();



    }

  /*             2. Enter username `invalid username` into username box
3. Enter password `some password` password box
4. Click on the Login button and wait few seconds until error comes back
5. Navigate back to login screen
6. Click on `forget password` link
7. Enter `something` into Mobile number text box `123456789`
            8. Click on the search button
9. Click on the cancel button
10. Quit the browser

   */
}
