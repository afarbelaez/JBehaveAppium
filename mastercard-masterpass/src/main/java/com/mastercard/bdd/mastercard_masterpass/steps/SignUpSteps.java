package com.mastercard.bdd.mastercard_masterpass.steps;

import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;

import com.mastercad.bdd.mastercard_masterpass.pages.MainPage;
import com.mastercad.bdd.mastercard_masterpass.pages.SignUpPage;
import com.mastercard.bdd.core.TestBase;

public class SignUpSteps extends TestBase {

    private MainPage mainPage;
    private SignUpPage signUpPage;
    private Map<String, String> message;

    @Given("home mastercard page $url")
    public void openSite(String url) throws InterruptedException {
        mainPage = new MainPage();
        mainPage.open(url);

    }

    @Given("I select country")
    public void select() throws InterruptedException {
        mainPage.selectCountry();
    }

    @Given("Open SignUp page")
    public void signUp() throws InterruptedException {
        signUpPage = mainPage.openSignUp();

    }

    @Then ("message on the top of screen should appeared: $screenText")
    public void testAppeared(ExamplesTable screenText){
        message = screenText.getRow(0);
        Assert.assertEquals(message.get("message"), signUpPage.getMessage());
    }

    @Given("search Masterpass")
    public void search() throws InterruptedException {
        signUpPage.searchMasterpass();
    }

    @When("agree with Terms")
    public void agreeWithTerms() throws InterruptedException {
        signUpPage.acceptAndSignUp();
    }
    @Then("check message text: $screenText")
    public void check(ExamplesTable screenText) throws InterruptedException {
        message = screenText.getRow(0);
        Assert.assertEquals(message.get("message"), signUpPage.messageNext());
    }

	
}
