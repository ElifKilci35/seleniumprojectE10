package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_LocateElementByXPATH {

    public static void main(String[] args) {

    //set up chrome and create WebDriver instance
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    //navigate to google.com
    driver.get("https://google.com");

    //search for cydeo
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
searchBox.sendKeys("cydeo"+ Keys.ENTER);

        //verify Cydeo LinkText is appeared in the results
   WebElement cydeoText = driver.findElement(By.xpath("//h3[.='Cydeo']"));
   if(cydeoText.getText().equals("cydeo")) {
        System.out.println("cydeo text is appeared");
    }else{
        System.out.println("cydeo text did not appeared");
    }
    //close the browser
    driver.quit();
    }
    }