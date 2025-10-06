package com.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
        Thread.sleep(3000);

        //Store parent window
        String parentWindow = driver.getWindowHandle();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[class='btn btn-info']:nth-child(1)")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        Set<String> allWindows = driver.getWindowHandles();
        Thread.sleep(3000);
        for(String window: allWindows){
            if(window.equalsIgnoreCase(parentWindow)){
                continue;
            }else {
                driver.switchTo().window(window);
                break;
            }
        }
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
    }
}
