package com.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementInformationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        //getText()
        String elementText = driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
        Thread.sleep(3000);
        System.out.println(elementText);

        //getAttribute()
        String attributeText = driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).getAttribute("value");
        Thread.sleep(3000);
        System.out.println(attributeText);

        //isDisplayed()
        boolean displayed = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
        Thread.sleep(3000);
        System.out.println(displayed);
    }
}
