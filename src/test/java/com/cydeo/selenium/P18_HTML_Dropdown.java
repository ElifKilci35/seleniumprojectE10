package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_HTML_Dropdown {

    public static void main(String[] args) {

        //set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");


        //click to open dropdown which has no select tag
        WebElement dropdownLink = driver.findElement(By.id("dropdownMenuLink"));
        dropdownLink.click();


        //click item(link) with text Yahoo
       WebElement itemYahoo = driver.findElement(By.linkText("Yahoo"));
       itemYahoo.click();


        //quit the browser
        driver.quit();





    }


}
