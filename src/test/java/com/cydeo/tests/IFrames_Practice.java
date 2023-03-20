package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IFrames_Practice extends TestBase {



    @Test
    public void iframeTest(){

        driver.get("https://practice.cydeo.com/iframe");

        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame("mce_0_ifr");

        //driver.switchTo().frame(iframe);
        //driver.switchTo().frame(0);

        WebElement textArea = driver.findElement(By.tagName("p"));
        assertTrue(textArea.isDisplayed());

        driver.switchTo().parentFrame();




    }

}
