package com.mastercad.bdd.mastercard_masterpass.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Page{

	  @FindBy(css = "#walletSearch")
	    WebElement searchWalletField;

	    @FindBy(css = "#searchWallets")
	    WebElement searchWallet;

	    @FindBy(css = ".frame-header-bottom>h2")
	    WebElement messageText;

	    @FindBy(css = "button[data-param='Mobile']")
	    WebElement masterPass;

	    @FindBy(css = "#acceptedT")
	    WebElement checkBoxReadTerms;

	    @FindBy(css = "#acceptedP")
	    WebElement checkBoxReadPrivacy;

	    @FindBy(css = ".button.command")
	    WebElement signUpButton;

	    @FindBy(css = ".button.disabled.command")
	    WebElement nextButtonFirst;
	    @FindBy(css = ".main>h1")
	    WebElement text;

	    @FindBy(css = ".command")
	    List<WebElement> listCards;


	    public String getMessage() {
	        waitExplicitlyWebElement(messageText, 120);
	        return messageText.getText();
	    }

	    public void searchMasterpass() throws InterruptedException {
	        Assert.assertEquals(messageText.getText(), "Select your wallet below.");
	        waitExplicitlyWebElement(searchWalletField, 120);
	      //  type(searchWalletField, "Masterpass");
	      //  searchWallet.click();
	        masterPass.click();
	        Assert.assertEquals(text.getText(), "Let’s get your MasterPass");
	    }

	    public void acceptAndSignUp() throws InterruptedException {
	        Thread.sleep(3000);
	        waitExplicitlyWebElement(checkBoxReadTerms, 60);
	        checkBoxReadTerms.click();
	        checkBoxReadPrivacy.click();
	        signUpButton.click();
	    }

	    public String messageNext() {
	        return nextButtonFirst.getText();
	    }
	
}
