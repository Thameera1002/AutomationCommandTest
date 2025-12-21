package com.testng;

import java.lang.reflect.Method;

public class ExcelHandler {

    public static Object[][] commonDataProvider(Method method){
        //ExcelFileName == Current executing test class name
        //Excel Sheet name == Current executing test method name
        String testClassName = method.getDeclaringClass().getSimpleName();
        String testMethodName = method.getName();
        String excelFile = testClassName+".xlsx";

        Class<?> modelClass = getModelClass(testClassName);

        return new Object[][]{};

    }

    private static Class<?> getModelClass(String testClassName){
        String modelClassName = testClassName + "Data";
        try{
            return Class.forName("com.model."+modelClassName);
        }catch (ClassNotFoundException e){
            throw new RuntimeException("Model class not found! ");
        }
    }
}
