package com.npav.net.pages;

import com.npav.net.page.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage
{
    @FindBy(xpath = "//a[contains(@href,'/')]//img[@src='https://npav.net/public/backend/assets/logo/logo.svg']")
    WebElement homePageIcon;

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }

    public String getPageUrl()
    {
        return driver.getCurrentUrl();
    }

    public void clickBrandIcon()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", homePageIcon);
    }

}

