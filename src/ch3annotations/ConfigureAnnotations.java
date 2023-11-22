package ch3annotations;

import org.testng.annotations.*;

public class ConfigureAnnotations {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Chrome- set up System property");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Open Chrome");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Open Test Application");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Sign in ");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("Sign out");
    }
    @AfterClass
    void afterClass(){
        System.out.println("Close Test Application");
    }
    @AfterTest
    void afterTest(){
        System.out.println("Close chrome");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("Clean up all cookies");
    }
    @Test
    void searchCustomer(){
        System.out.println("Search For Customer");
    }
    @Test
    void searchProduct(){
        System.out.println(" Search For Product");
    }
}
