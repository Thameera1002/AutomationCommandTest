package com.testng.sampletests.pkg1;

import com.testng.SeleniumHelpers;
import org.testng.annotations.Test;

public class D extends SeleniumHelpers {

    @Test
    public void c() {
        System.out.println("I'm Test Method c from Class D");
        driver.get("https://www.wikipedia.org");
    }
    @Test
    public void d() {
        System.out.println("I'm Test Method d from Class D");
        driver.get("https://www.github.com");
    }
}
