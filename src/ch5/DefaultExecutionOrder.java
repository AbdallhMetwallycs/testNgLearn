package ch5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.HighLighter;

public class DefaultExecutionOrder {
    WebDriver driver;
    @BeforeClass
    public void setup() throws Exception{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void signIn(){

        driver.findElement(By.xpath("//div[@class='header_user_info']/a")).click();

        WebElement emailAddress = driver.findElement(By.id("email"));
        HighLighter.highlightElement(driver,emailAddress);
        emailAddress.sendKeys("TestNG@Framwork.com");


        WebElement password = driver.findElement(By.id("passwd"));
        HighLighter.highlightElement(driver,password);
        password.sendKeys("TestNG1234");

        WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
        HighLighter.highlightElement(driver, buttonSignIn);
        buttonSignIn.click();

        System.out.println("1.  Sign In ");


    }

}
