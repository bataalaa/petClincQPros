package com.qpros.StepsDefinitions;


import com.qpros.BaseClass;
import com.qpros.HomePage;
import com.qpros.OwnersPage;
import com.qpros.PetPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class AddOwnerStepsDefinition extends BaseClass {

    @Before
    public void setup(){
        setDriver();
    }

    @After
    public void teardown(){
        closeDriver();
    }


    @Given("The user launches the website")
    public void UserOpensTheWebsite(){
        BaseClass.startBrowser();
        HomePage.navigateToHomePage();
        HomePage.verifyImage();
    }

    @And  ("The user is on find owners page")
    public void userOpensFindOwnersPage(){
        OwnersPage.navigateToFindOwnersPage();
    }



    @When ("The user clicks on add owner")
    public void userClicksAddOwner(){
        OwnersPage.clickAddOwner();
    }

    @And("The user fills the owners details")
    public void userEntersOwnersDetails(Map<String, String> strTable){
        OwnersPage.setOwnersFirstName(strTable.get("First Name"));
        OwnersPage.setOwnersLastName(strTable.get("Last Name"));
        OwnersPage.setOwnersAddress(strTable.get("Address"));
        OwnersPage.setOwnersCity(strTable.get("City"));
        OwnersPage.setOwnersTelephone(strTable.get("Telephone"));
    }


    @Then ("^The owner \"([^\"]*)\" should be added successfully with the correct Information$")
    public void verifyAddedOwner(String strOwnerName,Map<String, String> strTable){
       OwnersPage.verifyAddedOwner(strOwnerName, strTable);
    }

    @And ("The user clicks submit")
    public void userClicksSubmit(){
        OwnersPage.clickSubmit();
    }

    @Then ("The user clicks on add pet")
    public void userClickAddPet(){
        OwnersPage.clickAddPet();

    }

    @And ("The user fills the pet details")
    public void userEntersPetDetails(Map<String, String> strTable){
        PetPage.setPetName(strTable.get("Name"));
        PetPage.setBirthDate(strTable.get("Birth Date"));
        PetPage.setPetType(strTable.get("Type"));

    }

    @Then ("^The pet \"([^\"]*)\" should be added successfully with the correct Information$")
    public void verifyAddedPet(String strPetName,Map<String, String> strTable){
        OwnersPage.verifyAddedPet(strPetName,strTable);


    }

    @Then ("All owners should be displayed and printed")
    public void printAllOwners(){
        OwnersPage.getDataFromTable();
    }


}
