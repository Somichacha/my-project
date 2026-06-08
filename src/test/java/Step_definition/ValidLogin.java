package Step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import static Base.TestBase.driver;

public class ValidLogin {


    @When("I enter valid username and password")
    public void iEnterValidUsernameAndPassword() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("qa_testers@qabrains.com");
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("Password123");

    }
    @And("I click the login button")
    public void iClickTheLoginButton() throws InterruptedException {
     Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/button")).click();
    }
    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
       String Expected= "LOGIN SUCCESSFUL";
       String Actual= driver.findElement(By.xpath("//*[@id=\"success-msg\"]/div[2]/h2")).getText();
       Assertions.assertEquals(Expected,Actual);
       System.out.println(Actual);

    }

}
