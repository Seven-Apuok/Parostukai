package com.example;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class egzaminaitestnustatymai {
    protected WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("Weeb-url");
    }

    @AfterEach
    void closeDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    
}
}