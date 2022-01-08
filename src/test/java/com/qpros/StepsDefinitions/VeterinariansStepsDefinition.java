package com.qpros.StepsDefinitions;

import com.qpros.BaseClass;
import com.qpros.VeterinariansPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class VeterinariansStepsDefinition extends BaseClass {

    @And("The user is on Veterinarians page")
    public void userOpensVeterinariansPage() {

        VeterinariansPage.navigateToVeterinariansPage();

    }


    @Then("All veterinarians should be displayed and printed")
    public void printAllVeterinarians() {
        VeterinariansPage.getDataFromTable();
    }
}
