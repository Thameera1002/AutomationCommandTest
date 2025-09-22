package com.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserCommands {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();

        // driver.get("<url>") ----> navigate to specific url
        driver.get("https://www.ebay.com");

        //Retrieve the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //Retrieve the page title
        String title = driver.getTitle();
        System.out.println(title);

        //From selenium 4  , end of the script it executes this driver.quit() automatically.
        driver.quit();
    }
}
