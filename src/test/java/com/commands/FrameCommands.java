package com.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        Thread.sleep(3000);
        driver.switchTo().frame("singleframe");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input")).sendKeys("ABCD");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
