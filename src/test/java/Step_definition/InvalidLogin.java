package Step_definition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Base.TestBase.driver;

public class InvalidLogin {


    @When("I enter valid username and invalid password")
    public void iEnterValidUsernameAndInvalidPassword() throws InterruptedException {
        Thread.sleep(5000);
   driver.findElement(By.id("email")).sendKeys("qa_testers@qabrains.com");
   driver.findElement(By.id("password")).sendKeys("Password12");
    }

    @And("I click  login button")
    public void iClickLoginButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/button")).click();
    }

    @Then("I should see an error message indicating invalid login")
    public void iShouldSeeAnErrorMessageIndicatingInvalidLogin() throws InterruptedException {
        Thread.sleep(5000);
       String Expected= "Your password is invalid!";
       String Actual= driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/div[1]/div/span[1]")).getText();
        Assertions.assertEquals(Expected,Actual);
        System.out.println(Actual);
    }


}
