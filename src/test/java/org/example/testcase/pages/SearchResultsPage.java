package org.example.testcase.pages;

import org.example.testcase.base.BasePage;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isResultsFound() {
        return !driver.getPageSource().contains("No results found.");
    }
}
