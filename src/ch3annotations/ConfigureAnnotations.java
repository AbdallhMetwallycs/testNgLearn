package ch3annotations;

import org.testng.annotations.*;

public class ConfigureAnnotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Chrome- set up System property");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Open Chrome");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Open Test Application");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Sign in ");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Sign out");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Close Test Application");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Close chrome");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Clean up all cookies");
    }
    @Test
    public void searchCustomer(){
        System.out.println("Search For Customer");
    }
    @Test
    public void searchProduct(){
        System.out.println(" Search For Product");
    }
}
