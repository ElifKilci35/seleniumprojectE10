package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropdownList_Multiple {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        //identify the dropdown with multiple select options
        WebElement multiItemDrop = driver.findElement(By.name("Languages"));

        //wrap this element into select object
        Select multiItemSelect = new Select(multiItemDrop);

        //check if this element has multi select option
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());

        //select items
        multiItemSelect.selectByIndex(2);
        multiItemSelect.selectByValue("ruby");
        multiItemSelect.selectByVisibleText("Python");

        //deselected item
        //multiItemSelect.deselectByIndex(2);
        //multiItemSelect.deselectByValue("ruby");
        //multiItemSelect.deselectByVisibleText("Python");
        multiItemSelect.deselectAll();






    }


}
