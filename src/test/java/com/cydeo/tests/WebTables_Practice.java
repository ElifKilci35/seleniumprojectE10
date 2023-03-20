package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables_Practice extends TestBase {


    @Test
    public void webTablesTest() throws InterruptedException {

        driver.get("https://practice.cydeo.com/tebles");

        //print out Jason from row and cell number
        WebElement row3Cell2 = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("row3Cell2.getText() = " + row3Cell2.getText());

        WebElement firstName= driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

        row3Cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("After clicking First Name row3Cell2.getText() = " + row3Cell2.getText());



        //print out the Jason from text
        WebElement jasonCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonCell.getText() = " + jasonCell.getText());



        //print out all cells in row 3
        List <WebElement> allRow3Cells = (List<WebElement>) driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));

        for(WebElement eachCell : allRow3Cells){
            System.out.println("eachCell.getText() = " + eachCell.getText());

        }



        //challenge yourself to print out each and every cell values
        //challenge yourself to store the table column names into a List of String





    }
    
}
