package com.mastercad.bdd.mastercard_masterpass.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.mastercard.bdd.core.Driver;

public class MainPage extends Page{

    @FindBy(css = ".country-list>li>a[data-abbr='US']")
    WebElement selectCountryUSA;

    @FindBy(name = "Continue")
    WebElement continueButoon;

    @FindBy(css =".cta.flat-red.choose-wallet")
    WebElement signUpButton;

    @FindBy(css = ".touch-nav-drawer")
    WebElement menuButton;

    @FindBy(css = "li.partners.main-nav-item>a>span[data-localize='global.navigation.partners']")
    WebElement walletButton;

    public void open(String url) throws InterruptedException {
        Driver.driver.get(url);
        Thread.sleep(1000);
    }

    public void selectCountry() throws InterruptedException {
        selectCountryUSA.click();
        Thread.sleep(5000);
    }

    public SignUpPage openSignUp() throws InterruptedException {
        signUpButton.click();
        Driver.driver.switchTo().frame("iframe#MasterPass_frame");
        return new SignUpPage();
    }
}
