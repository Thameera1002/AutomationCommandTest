package com.testng.sampletests.pkg1;

import com.testng.SeleniumHelpers;
import org.testng.annotations.Test;

public class C extends SeleniumHelpers {
    @Test
    public void b() {
        System.out.println("I'm Test Method b from Class C");
        driver.get("https://www.youtube.com");
    }
    @Test
    public void c() {
        System.out.println("I'm Test Method c from Class C");
        driver.get("https://www.wikipedia.org");
    }
    @Test
    public void d() {
        System.out.println("I'm Test Method d from Class C");
        driver.get("https://www.github.com");
    }
}
