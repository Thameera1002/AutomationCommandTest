package com.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.ebay.com");
        driver.findElement(By.id("gh-ac")).clear();
        driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
        driver.findElement(By.className("gh-search-button__label")).click();
        Thread.sleep(8000);
        driver.navigate().back();
        Thread.sleep(8000);
        driver.navigate().forward();
        Thread.sleep(8000);
        driver.navigate().refresh();
        Thread.sleep(8000);
    }
}
