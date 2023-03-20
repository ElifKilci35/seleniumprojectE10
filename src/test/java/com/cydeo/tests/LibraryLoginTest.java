package com.cydeo.tests;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    @Test
    public void positiveLoginTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("Library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

        loginPage.login("library3.student.email", "library3.student.password");

       //loginPage.email.sendKeys(ConfigurationReader.getProperty("library3.student.email "));
       // loginPage.password.sendKeys(ConfigurationReader.getProperty("library3.student.password "));
        // /LoginPage.signInBtn.click();


    }

    @Test
    public void negativeLoginTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("Library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

        loginPage.login("abc@gmail.com","abcd");

        //loginPage.email.sendKeys("abc@gmail.com ");
        //loginPage.password.sendKeys("abcd ");
        //loginPage.signInBtn.click();

}

}