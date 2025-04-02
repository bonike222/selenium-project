package org.example.ecomtestcase.tests;

import org.example.ecomtestcase.pages.MainPage;
import org.example.ecomtestcase.pages.RegisterPage;
import org.example.ecomtestcase.pages.RegisterResultsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountRegistrationTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        // maximize window
        driver.manage().window().maximize();
    }

    @Test
    public void testAccountRegistration() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAccountOptions();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputAccountInformation();
        assertTrue(registerPage.isInputError());
        registerPage.reinputAccountInformation();

        RegisterResultsPage registerResultsPage = new RegisterResultsPage(driver);
        assertTrue(registerResultsPage.isAccountCreated());
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}