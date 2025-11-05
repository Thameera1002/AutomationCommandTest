package com.testng.sampletests.pkg1;

import com.testng.SeleniumHelpers;
import org.testng.annotations.Test;

public class A extends SeleniumHelpers {
    @Test
    public void a() {
        System.out.println("I'm Test Method a from Class A");
        driver.get("https://www.google.com");
    }
    @Test
    public void b() {
        System.out.println("I'm Test Method b from Class A");
        driver.get("https://www.youtube.com");
    }
    @Test
    public void c() {
        System.out.println("I'm Test Method c from Class A");
        driver.get("https://www.wikipedia.org");
    }
    @Test
    public void d() {
        System.out.println("I'm Test Method d from Class A");
        driver.get("https://www.github.com");
    }
}
