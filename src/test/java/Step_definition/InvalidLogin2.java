package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Base.TestBase.driver;

public class InvalidLogin2 {



    @When("I enter invalid username and valid password")
    public void iEnterInvalidUsernameAndValidPassword() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("qa_testers@qabrains.co");
        driver.findElement(By.id("password")).sendKeys("Password123");

    }

    @And("I click the login")
    public void iClickTheLogin() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/button")).click();
    }

    @Then("I should see an error message invalid login")
    public void iShouldSeeAnErrorMessageInvalidLogin() throws InterruptedException {
        Thread.sleep(5000);
        String Expected= "Your email is invalid!";
        String Actual= driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/div[1]/div/span[1]")).getText();
        Assertions.assertEquals(Expected,Actual);
        System.out.println(Actual);
    }
}
