package Base;

import Pages.Homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
    public WebDriver driver;
    public Homepage homepage;

    public static String signIn= "https://time.com/iframe/login";
    public static String baseurl= "https://time.com/";


    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://time.com");
        driver.manage().window().maximize();

        homepage = new Homepage(driver);

    }

    @AfterClass
    public void down(){
        driver.quit();
    }
}
