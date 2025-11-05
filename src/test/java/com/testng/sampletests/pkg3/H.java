package com.testng.sampletests.pkg3;

import com.testng.SeleniumHelpers;
import org.testng.annotations.Test;

public class H extends SeleniumHelpers {
    @Test
    public void a() {
        System.out.println("I'm Test Method a from Class H");
        driver.get("https://www.google.com");
    }
}
