package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {


    @Test
    public void testFileUpload() throws InterruptedException{

        driver.get("http://practice.cydeo.com/upload");

 String filePath ="/Users/cybertek/Desktop/some-file.txt";

 driver.findElement(By.id("file-upload")).sendKeys(filePath);

 Thread.sleep(3000);

 driver.findElement(By.id("file-submit")).click();

Thread.sleep(3000);


    }

}
