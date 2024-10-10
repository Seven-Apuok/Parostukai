package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class egzaminaipage extends egzaminainustatymai {

    public  egzaminaipage(WebDriver driver) {
        super(driver);
    }

    //Objektai ir ju lokatorei

    @FindBy(xpath="")
    WebElement wName;

    @FindBy(xpath="")
    WebElement wName;

    @FindBy(xpath="")
    WebElement wName;

    @FindBy(xpath="")
    WebElement wName;

    @FindBy(xpath="")
    WebElement wName;

    @FindBy(xpath = "")
    WebElement cowNames;

    @FindBy(xpath = "")
    WebElement wName;

    @FindBy(xpath = "")
    WebElement wName;

    //objektu savybes

    public void extraWName(){
        wName.click();
    }
    public void extraWName(){
        wName.sendKeys("");
    }

    
}
