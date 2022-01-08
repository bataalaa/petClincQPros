package com.qpros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Map;


public class OwnersPage extends BaseClass{


    private static final String btnAddOwner= "Add Owner";
    private static final String btnSubmitOwner= "//button[@type='submit']";
    private static final String txtFirstName="firstName";
    private static final String txtLastName="lastName";
    private static final String txtAddress="address";
    private static final String txtCity="city";
    private static final String txtTelephone="telephone";
    private static final String searchResultsGrid="owners";


    public static void setOwnersFirstName(String strFirstName){

        driver.findElement(By.id(txtFirstName)).sendKeys(strFirstName);
    }
    public static void setOwnersLastName(String strLastName){

        driver.findElement(By.id(txtLastName)).sendKeys(strLastName);
    }
    public static void setOwnersCity(String strCity){

        driver.findElement(By.id(txtCity)).sendKeys(strCity);
    }
    public static void setOwnersAddress(String strAddress){

        driver.findElement(By.id(txtAddress)).sendKeys(strAddress);
    }

    public static void setOwnersTelephone(String strTelephone){

        driver.findElement(By.id(txtTelephone)).sendKeys(strTelephone);
    }


    public static void verifyAddedOwner(String strOwnerName, Map<String, String> strTable){

        String name= driver.findElement(By.xpath(".//tr[1]/td/b")).getText();
        Assert.assertEquals(strOwnerName,name,"The owner wasn't added successfully");

        String address= driver.findElement(By.xpath(".//tr[2]/td")).getText();
        Assert.assertEquals(strTable.get("Address"),address,"The owners address wasn't added successfully");

        String city= driver.findElement(By.xpath(".//tr[3]/td")).getText();
        Assert.assertEquals(strTable.get("City"),city,"The owners city wasn't added successfully");

        String telephone= driver.findElement(By.xpath(".//tr[4]/td")).getText();
        Assert.assertEquals(strTable.get("Telephone"),telephone,"The owners telephone wasn't added successfully");



    }

    public static void clickAddPet(){

        driver.findElement(By.linkText("Add New Pet")).click();
    }



    public static void clickAddOwner(){

        driver.findElement(By.linkText(btnAddOwner)).click();
    }


    public static void clickSubmit(){
        driver.findElement(By.xpath(btnSubmitOwner)).click();
    }


    public static void verifyAddedPet(String strPetName,Map<String, String> strTable){

        String name= driver.findElement(By.xpath(".//td[1]/dl/dd[1]")).getText();
        Assert.assertEquals(strPetName,name,"The pet wasn't added successfully");

        String birthDate= driver.findElement(By.xpath(".//td[1]/dl/dd[2]")).getText();
        Assert.assertEquals(strTable.get("Birth Date"),birthDate,"The pet's birth date wasn't added successfully");


        String type= driver.findElement(By.xpath(".//td[1]/dl/dd[3]")).getText();
        Assert.assertEquals(strTable.get("Type"),type,"The pet's type date wasn't added successfully");

    }


    public static void getDataFromTable(){
        WebElement table = driver.findElement(By.id(searchResultsGrid));
        var  rows = table.findElements(By.tagName("a"));
        rows.forEach(firstCell->System.out.println("Owner >>   " + firstCell.getText()));

    }

    public static void navigateToFindOwnersPage() {

        WebElement lnkHomePage=driver.findElement(By.xpath("//a[@title='find owners']"));
        lnkHomePage.click();
    }
}
