package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DataProvider {

    @org.testng.annotations.DataProvider
    public Object[][] loginDataProvider(){
        Object[][] testDataArray = new Object[][]{
                {"Test User 0","00123"},
                {"Test User1","12345"},
                {"Test User2","67890"},

        };
        return testDataArray;
    }

    @Test(dataProvider = "loginDataProvider")
    public void loginTest(String userName,String password){
        System.out.println("Username is :"+userName+"\nPassword is : "+password+"\n\n");
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);


    }
}
