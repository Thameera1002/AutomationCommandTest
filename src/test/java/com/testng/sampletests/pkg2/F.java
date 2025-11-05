package com.testng.sampletests.pkg2;

import com.testng.SeleniumHelpers;
import org.testng.annotations.Test;

public class F extends SeleniumHelpers {
    @Test
    public void a() {
        System.out.println("I'm Test Method a from Class F");
        driver.get("https://www.google.com");
    }
    @Test
    public void b() {
        System.out.println("I'm Test Method b from Class F");
        driver.get("https://www.youtube.com");
    }
    @Test
    public void c() {
        System.out.println("I'm Test Method c from Class F");
        driver.get("https://www.wikipedia.org");
    }
}
