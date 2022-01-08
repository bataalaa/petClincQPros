package com.qpros;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PetPage extends BaseClass{


    private static final String txtName="name";
    private static final String txtBirthDate="birthDate";
    private static final String ddlType="type";
    private static final String btnAddPet="//button[@type='submit']";


    public static void setPetName(String strPetType)  {
        driver.findElement(By.id(txtName)).sendKeys(strPetType);
    }

    public static void setBirthDate(String strBirthDate) {
        driver.findElement(By.id(txtBirthDate)).sendKeys(strBirthDate);
    }

    public static void setPetType(String strPetName) {
        Select drpPet= new Select (driver.findElement(By.id(ddlType)));
        drpPet.selectByVisibleText(strPetName.toLowerCase());
    }

    public static void clickAddPet(){

        driver.findElement(By.xpath(btnAddPet)).click();
    }


}
