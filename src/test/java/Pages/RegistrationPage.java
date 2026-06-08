package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    //Declaring Locators

    @FindBy(how = How.XPATH, using = "//*[@id=\"registration\"]/span")
    public WebElement registrationLink;

    @FindBy(how = How.ID_OR_NAME, using = "name")
    public WebElement nameField;

    @FindBy(how = How.ID_OR_NAME, using = "country")
    public WebElement countryField;

    @FindBy(how = How.ID_OR_NAME, using = "account")
    public WebElement accountType;

    @FindBy(how = How.ID_OR_NAME, using = "email")
    public WebElement emailField;

    @FindBy(how = How.ID_OR_NAME, using = "password")
    public WebElement passwordField;

    @FindBy(how = How.ID_OR_NAME, using = "confirm_password")
    public WebElement ConfirmPasswordField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"inner-body\"]/div/div[1]/form/button")
    public WebElement signupButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"success-msg\"]/div[1]/div/span[1]")
    public WebElement RegistrationSuccessMessage;


    //Declaring Method

    public void clickRegistrationLink() throws InterruptedException {
        registrationLink.click();
        Thread.sleep(5000);
    }

    public void inputName() {
        nameField.sendKeys("Jhon Doe");
    }

    public void chooseCountry() {
        Select country = new Select(countryField);
        country.selectByVisibleText("Nigeria");
    }

    public void inputAccount() {
        Select account = new Select(accountType);
        account.selectByVisibleText("Private Job");
    }

    public void enterEmailField() {
        emailField.sendKeys("qa_testers@qabrains.com");
    }

    public void enterPasswordField() {
        passwordField.sendKeys("Password123");
    }

    public void enterConfirmPasswordField() throws InterruptedException {
        ConfirmPasswordField.sendKeys("Password123");
        Thread.sleep(5000);
    }

    public void clickSignupButton() throws InterruptedException {
        Thread.sleep(5000);
        signupButton.click();
        Thread.sleep(5000);
    }

    public void confirmRegistrationSuccessMessage() throws InterruptedException {
        String Expected = "Registration Successful";
        Thread.sleep(5000);
        String Actual = RegistrationSuccessMessage.getText();
        Assertions.assertEquals(Expected, Actual);
        System.out.println(Actual);
    }

}
