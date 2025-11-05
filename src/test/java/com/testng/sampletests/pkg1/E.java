package com.testng.sampletests.pkg1;

import com.testng.SeleniumHelpers;
import org.testng.annotations.Test;

public class E extends SeleniumHelpers {

    @Test
    public void d() {
        System.out.println("I'm Test Method d from Class E");
        driver.get("https://www.github.com");
    }
}
