package com.testng;

import org.testng.annotations.Test;

public class PriorityTestEx {
    @Test(priority = 3)
    public void a(){
        System.out.println("I'm Test Method a from Class PriorityTestEx");
    }

    @Test(priority = 1)
    public void b(){
        System.out.println("I'm Test Method b from Class PriorityTestEx");
    }

    @Test(priority = 2)
    public void c(){
        System.out.println("I'm Test Method c from Class PriorityTestEx");
    }

    @Test
    public void d(){
        System.out.println("I'm Test Method d from Class PriorityTestEx");
    }

    @Test
    public void e(){
        System.out.println("I'm Test Method e from Class PriorityTestEx");
    }
}
