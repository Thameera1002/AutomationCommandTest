package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestEx {
    @Test
    public void testMethod1() {
        System.out.println("A");
        System.out.println("B");
        Assert.assertTrue(false);
        System.out.println("C");
        System.out.println("D");
    }

    @Test
    public void testMethod2() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("http://31.220.75.248:3000/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Library Management System - Admin Portal";
        Assert.assertEquals(actualTitle, expectedTitle);
        boolean displayed = driver.findElement(By.xpath("//span[text()='Library Portal']")).isDisplayed();
        Assert.assertTrue(displayed);
        System.out.println("Checkpoint reached");
        driver.quit();
    }

    @Test
    public void testMethod3() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("A");
        System.out.println("B");
        softAssert.assertTrue(false);
        System.out.println("C");
        System.out.println("D");
        softAssert.assertAll();
    }
}
