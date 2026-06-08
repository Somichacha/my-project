package Hooks;

import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;



public class Common extends TestBase {
    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.qabrains.com/");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            }

        }

    }