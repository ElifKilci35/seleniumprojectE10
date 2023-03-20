package com.cydeo.tests;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CMRLogin {

    @Test
    public void cmrLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        //3.Enter valid username
        WebElement inputUsername =  Driver.getDriver().findElement(By.xpath("//input[@name= 'USER_LOGIN']"));
     inputUsername.sendKeys(ConfigurationReader.getProperty("username"));


        //4.Enter valid password
        WebElement inputPassword =  Driver.getDriver().findElement(By.xpath("//input[@name= 'USER_PASSWORD']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        //5.Click to Log In Buttonm
        WebElement loginButton =  Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


    }


}

