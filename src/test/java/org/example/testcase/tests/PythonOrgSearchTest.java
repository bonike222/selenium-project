package org.example.testcase.tests;

import org.example.testcase.pages.MainPage;
import org.example.testcase.pages.SearchResultsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PythonOrgSearchTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.python.org/");
    }

    @Test
    public void testSearchPython() {
        MainPage mainPage = new MainPage(driver);
        mainPage.inputTextBox();
        mainPage.clickGoButton();
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        assertTrue(searchResultsPage.isResultsFound());
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
}
