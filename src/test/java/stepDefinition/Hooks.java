package stepDefinition;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

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