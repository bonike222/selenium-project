package org.example.ecomtestcase.locators;

import org.openqa.selenium.By;

public class RegisterPageLocators {
    public static final By FIRST_NAME = By.id("input-firstname");
    public static final By LAST_NAME = By.id("input-lastname");
    public static final By EMAIL = By.id("input-email");
    public static final By TELEPHONE = By.id("input-telephone");
    public static final By PASSWORD = By.id("input-password");
    public static final By PASSWORD_CONFIRM = By.id("input-confirm");
    public static final By NEWSLETTER = By.xpath("//input[@name='newsletter' and @value='1']");
    public static final By PRIVACY_POLICY = By.xpath("//input[@name='agree' and @value='1']");
    public static final By CONTINUE_BUTTON = By.xpath("//input[@value='Continue']");
}