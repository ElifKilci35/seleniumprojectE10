package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.testng.Assert.assertTrue;

public class Synchronization_ExplicitWait extends TestBase {


    @Test
    public void test_WaitForExpectedTitle(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(titleIs("Dynamic title"));

        WebElement doneMsj = driver.findElement(By.id("alert"));
        assertTrue(doneMsj.isDisplayed());
        
        




    }

    }



