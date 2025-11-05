package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class SeleniumHelpers {
    protected WebDriver driver;
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
        if (driver != null) {
            driver.quit();
        }
    }
    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }

}
