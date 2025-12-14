package com.npav.net.pages;

import com.npav.net.page.base.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage
{
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
}

