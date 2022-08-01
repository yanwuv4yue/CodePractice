package com.moemao.base.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestController {

    private TestService testService;

    public TestService getTestService()
    {
        return testService;
    }

    public void setTestService(TestService testService)
    {
        this.testService = testService;
    }

    public static void main(String[] args) throws Exception
    {
        TestController testController = new TestController();
        TestService testService = new TestService();

        System.out.println(testController.getTestService());

        Class<? extends TestController> testControllerClass = testController.getClass();

        Field testServiceFiled = testControllerClass.getDeclaredField("testService");

        testServiceFiled.setAccessible(true);

        String filedName = testServiceFiled.getName();
        String methodName = "set" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1, filedName.length());
        Method method = testControllerClass.getMethod(methodName, TestService.class);

        method.invoke(testController, testService);

        System.out.println(testController.getTestService());
    }
}
