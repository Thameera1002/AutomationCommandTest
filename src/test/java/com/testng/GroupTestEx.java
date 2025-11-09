package com.testng;

import org.testng.annotations.Test;

public class GroupTestEx {

    @Test(groups = {"smoke"})
    public void tc_001(){
        System.out.println("smoke - tc_001");
    }
    @Test(groups = {"smoke"})
    public void tc_002(){
        System.out.println("smoke - tc_002");
    }
    @Test(groups = {"regression"})
    public void tc_003(){
        System.out.println("regression - tc_003");
    }
    @Test(groups = {"regression"})
    public void tc_004(){
        System.out.println("regression - tc_004");
    }
    @Test(groups = {"smoke","regression"})
    public void tc_005(){
        System.out.println("smoke,regression - tc_005");
    }
    @Test(groups = {"smoke","regression"})
    public void tc_006(){
        System.out.println("smoke,regression - tc_006");
    }



}
