package stepDefinition;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static Util.readFile.loadPropertiesFile;

public class Hooks extends Base {


    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        //WebDriver driver;
        driver = new ChromeDriver();
    }



    @After
    public void tearDown() throws InterruptedException {
        //Thread.sleep(20000);
        //driver.close(); //to close Current Tab of the Browser
        driver.quit();  //to close Browser Application or Window
    }
}