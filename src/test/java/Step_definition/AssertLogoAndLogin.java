package Step_definition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertLogoAndLogin {
    public WebDriver driver;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
      System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
       driver = new ChromeDriver();
     driver.manage().window().maximize();
    }

    @When("I enter application URL")
    public void iEnterApplicationURL() {
        driver.get("https://practice.qabrains.com/");

    }

    @And("I wait for {int} seconds")
    public void iWaitForSeconds(int arg0) throws InterruptedException {
       Thread.sleep(5000);
    }

    @Then("I should see the logo and login button on the homepage")
    public void iShouldSeeTheLogoAndLoginButtonOnTheHomepage() {
        driver.findElement(By.xpath("//*[@id=\"page-header\"]/div/div/a/img")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"login\"]/span")).isDisplayed();

        driver.quit();
    }
}
