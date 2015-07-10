package com.mastercard.bdd.core;

import java.net.MalformedURLException;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import com.mastercard.bdd.core.Driver;

public class TestBase {
    @BeforeScenario
    public void initialization() throws MalformedURLException {
        Driver.init();
    }

    @AfterScenario
    public void cleanup(){
        Driver.tearDown();
    }
}
