package Step_definition;

import Base.TestBase;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InvalidLogin3 extends TestBase {


    @When("I enter username {string}")
    public void iEnterUsername(String Username) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys(Username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String Password) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys(Password);

    }

    @And("I click submit button")
    public void iClickSubmitButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/button")).click();
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String errorMessage) throws InterruptedException {
        Thread.sleep(5000);
        String Expected = errorMessage;
        String Actual= driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/div[1]/div/span[1]")).getText();
        org.junit.jupiter.api.Assertions.assertEquals(Expected,Actual);
        System.out.println(Actual);

    }

    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I click on the submit button")
    public void iClickOnTheSubmitButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"home-page\"]/div/div[1]/form/button")).click();

    }

    @Then("I should see an email error message {string}")
    public void iShouldSeeAnEmailErrorMessage(String emailErrorMessage) throws InterruptedException{
        Thread.sleep(5000);
        String Expected1 = emailErrorMessage;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + emailErrorMessage + "']")));
        String Actual = driver.findElement(By.xpath("//p[text()='" + emailErrorMessage + "']")).getText();
        Assertions.assertEquals(Expected1, Actual);
        System.out.println(Actual);
    }

    @And("I should see a password error message {string}")
    public void iShouldSeeAPasswordErrorMessage(String passwordErrorMessage) throws InterruptedException{
        String Expected2 = passwordErrorMessage;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='" + passwordErrorMessage + "']")));
        String Actual = driver.findElement(By.xpath("//p[text()='" + passwordErrorMessage + "']")).getText();
        Assertions.assertEquals(Expected2, Actual);
        System.out.println(Actual);

    }
}
