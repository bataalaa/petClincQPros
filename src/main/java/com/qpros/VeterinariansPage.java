package com.qpros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VeterinariansPage extends BaseClass{

    private static final String tblVeterinarians="vets";
    private static final String clmName=".//tr/td[1]";
    private static final String btnVeterinarians="//a[@title='veterinarians']";



    public static void getDataFromTable(){
        WebElement table = driver.findElement(By.id(tblVeterinarians));
        var rows = table.findElements(By.xpath(clmName));
        rows.forEach(firstCell->System.out.println("Veterinarian --> " + firstCell.getText()));

    }

    public static void navigateToVeterinariansPage() {

        WebElement lnkHomePage=driver.findElement(By.xpath(btnVeterinarians));
        lnkHomePage.click();
    }
}
