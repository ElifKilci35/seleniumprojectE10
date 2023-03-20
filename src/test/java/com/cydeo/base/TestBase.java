package com.cydeo.base;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


    public WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver = WebDriverFactory.getDriver("chrome"); //utilitiesden çağırdık methodu

        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

    }

    @AfterMethod
    public void teardown(){
        driver.quit();

    }
}
