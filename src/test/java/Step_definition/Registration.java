package Step_definition;

import Base.TestBase;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class Registration extends TestBase {
    @And("I navigate to the registration page")
    public void iNavigateToTheRegistrationPage() throws InterruptedException {
        RegistrationPage page = PageFactory.initElements(driver, RegistrationPage.class);
        page.clickRegistrationLink();
    }

    @When("I enter valid registration details")
    public void iEnterValidRegistrationDetails() throws InterruptedException {
        RegistrationPage page = PageFactory.initElements(driver, RegistrationPage.class);
        page.inputName();
        page.chooseCountry();
        page.inputAccount();
        page.enterEmailField();
        page.enterPasswordField();
        page.enterConfirmPasswordField();
    }

    @And("I click on the signup button")
    public void iClickOnTheSignupButton() throws InterruptedException {
        RegistrationPage page = PageFactory.initElements(driver, RegistrationPage.class);
        page.clickSignupButton();
    }

    @Then("I should see a confirmation message indicating successful registration")
    public void iShouldSeeAConfirmationMessageIndicatingSuccessfulRegistration() throws InterruptedException {
        RegistrationPage page = PageFactory.initElements(driver, RegistrationPage.class);
        page.confirmRegistrationSuccessMessage();
    }
}
