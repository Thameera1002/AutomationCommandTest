package com.testng;

import java.lang.reflect.Method;

public class ExcelHandler {

    public static Object[][] commonDataProvider(Method method){
        //ExcelFileName == Current executing test class name
        //Excel Sheet name == Current executing test method name
        String testClassName = method.getDeclaringClass().getSimpleName();
        String testMethodName = method.getName();
        String excelFile = testClassName+".xlsx";

    }
}
