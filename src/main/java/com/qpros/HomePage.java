package com.qpros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {



    public static void verifyImage()
    {

        WebElement image = driver.findElement(By.xpath(".//div[1]/div/img"));
        boolean imagePresent = image.isDisplayed();

        Assert.assertTrue(imagePresent, "Test Failed, the image does not exist");
    }


    public static void navigateToHomePage() {

        WebElement lnkHomePage=driver.findElement(By.xpath("//a[@title='home page']"));
        lnkHomePage.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
