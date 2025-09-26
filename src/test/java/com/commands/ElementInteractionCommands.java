package com.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementInteractionCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();

        driver.navigate().to("https://demo.phppointofsale.com/");
        //find an element
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("pointofsale");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("set_employee_current_location_after_login")).click();

        Thread.sleep(3000);

        //use find elements
        List<WebElement> elements = driver.findElements(By.cssSelector("#mainMenu span[class='text']"));

        //normal for loop
        for (int i = 0; i < elements.size(); i++) {
            //print all values
            System.out.println(elements.get(i).getText());

//            //click on sales
//            if(elements.get(i).getText().equalsIgnoreCase("Sales")){
//                elements.get(i).click();
//                //Thread.sleep(3000);
//                break;
//            }

        }

        System.out.println("\n\n");

        //for-each loop
        for(WebElement element: elements){
            //print all values
            System.out.println(element.getText());

//            //click on sales
//            if(element.getText().equalsIgnoreCase("Sales")){
//                element.click();
//                //Thread.sleep(3000);
//                break;
//            }
        }
    }
}
