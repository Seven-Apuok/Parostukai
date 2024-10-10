package com.example;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class egzaminaitest extends egzaminaitestnustatymai
{
    /**
     * Rigorous Test :-)
     */
    @Test
    void registerTest() throws InterruptedException{
        egzaminaipage appLogin = new egzaminaipage(driver);
        appLogin.clickonCrtButton();
        appLogin.enterEmai();
        appLogin.enterUseName();
        appLogin.enterPass();
        appLogin.enterConPass();
        appLogin.clickonCrt();
    }

    @Test
    void logTest() throws InterruptedException{
        egzaminaipage appLogin = new egzaminaipage(driver);
        appLogin.clickonLog();
        appLogin.enterEmai();
        appLogin.enterPass();
        appLogin.clickonLogIn();



    }

}
