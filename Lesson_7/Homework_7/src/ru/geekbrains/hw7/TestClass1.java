package ru.geekbrains.hw7;

public class TestClass1 {

    @AfterSuite
    //@Test(priority = 1)
    public void method0() {
        System.out.println("method0");
    }

    @Test(priority = 1)
    public void method1() {
        System.out.println("method1");
    }

    @Test(priority = 8)
    public void method2() {
        System.out.println("method2");
    }

    @Test(priority = 6)
    public void method3() {
        System.out.println("method3");
    }

    @Test(priority = 4)
    public void method4() {
        System.out.println("method4");
    }

    @Test(priority = 4)
    public void method5() {
        System.out.println("method5");
    }

    @Test(priority = 3)
    public void method6() {
        System.out.println("method6");
    }

    @Test
    public void method7() {
        System.out.println("method7");
    }

    @Test
    public void method8() {
        System.out.println("method8");
    }

    @BeforeSuite
    //@Test(priority = 10)
    public void method9() {
        System.out.println("method9");
    }
}