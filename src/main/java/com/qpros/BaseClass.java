package com.qpros;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){
        driver = new ChromeDriver();
    }

    public static void startBrowser(){

        driver.get("https://petclincqpros.herokuapp.com/vets.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public static void closeDriver(){
        driver.quit();
    }

}






