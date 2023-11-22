package ch4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.HighLighter;

public class BC_AC_OrangeHRM
{
    WebDriver driver;

    @BeforeClass
    public void setUp ()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Open Chrome & Application");
    }

    @Test
    public void signIn ()
    {
        WebElement textUsername = driver.findElement(By.id("txtUsername"));
        HighLighter.highlightElement(driver, textUsername);
        textUsername.sendKeys("Admin");

        WebElement textPassword = driver.findElement(By.id("txtPassword"));
        HighLighter.highlightElement(driver, textPassword);
        textPassword.sendKeys("admin123");

        WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
        HighLighter.highlightElement(driver, buttonLogin);
        buttonLogin.click();

        System.out.println("2. Sign In");
    }

    @Test
    public void userSearch ()
    {
        WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        HighLighter.highlightElement(driver, menuAdmin);
        menuAdmin.click();

        WebElement textUserName = driver.findElement(By.id("searchSystemUser_userName"));
        HighLighter.highlightElement(driver, textUserName);
        textUserName.sendKeys("Admin");

        WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
        HighLighter.highlightElement(driver, buttonSearch);
        buttonSearch.click();

        System.out.println("3. Search For User");
    }

    @Test
    public void userSignOut ()
    {
        WebElement linkWelcome = driver.findElement(By.id("welcome"));
        HighLighter.highlightElement(driver, linkWelcome);
        linkWelcome.click();

        WebElement linkLogout = driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
        HighLighter.highlightElement(driver, linkLogout);
        linkLogout.click();

        System.out.println("4. Sign Out");
    }

    @AfterClass
    public void tearDown ()
    {
        System.out.println("5. Close Chrome & Application");
        driver.quit();
    }
}