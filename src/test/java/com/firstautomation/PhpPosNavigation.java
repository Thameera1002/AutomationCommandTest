package com.firstautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhpPosNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();

        driver.navigate().to("https://demo.phppointofsale.com/");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("pointofsale");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("set_employee_current_location_after_login")).click();

        Thread.sleep(3000);
        driver.findElement(By.className("waves-effect waves-light")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("dashboard-stats")).click();
        //driver.navigate().refresh();
        //driver.navigate().back();
    }
}
