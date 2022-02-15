package com.Test;

import com.Pages.ObjFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    protected static ObjFactory obj;
    protected static ObjFactory obje;
    protected static ObjFactory objec;
    protected static ObjFactory hom;
    protected static ObjFactory atc;
    @BeforeSuite
    public void launch_browser() throws Exception {
            obj = new ObjFactory();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Environment specific properties file loading
        InputStream ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\" +
                "java\\com\\Config\\data.properties");
        prop = new Properties();
        prop.load(ip);
    }
    @BeforeMethod()
    public void loadBaseUrl() {
        obj = new ObjFactory();
        driver.get(prop .getProperty("url"));
        driver.manage().deleteAllCookies();
    }
    @AfterSuite
    public void suiteTearDown() {
        driver.quit();
    }
}
