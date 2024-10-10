package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class egzaminainustatymai

{
    WebDriver driver;
public egzaminainustatymai(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
