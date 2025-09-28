package com.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertCommands {
    public static void main(String[] args) throws InterruptedException {
        alertWithOK();
    }

    public static void alertWithOK() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space(text())='Alert with OK']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
    }
}
