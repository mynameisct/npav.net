package com.npav.net.tests;

import com.npav.net.pages.HomePage;
import com.npav.net.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{

    private HomePage homePage;

    @Test
    public void verifyHomePageTitle()
    {
        homePage = new HomePage(driver);

        String actualPageTitle = homePage.getPageTitle();

        Assert.assertTrue(actualPageTitle.contains("Best Antivirus for Your PC"), "Title did not contain expected text");
    }

    @Test
    public void verifyCurrentUrl()
    {
        homePage = new HomePage(driver);

        String getCurrentUrl = homePage.getPageUrl();

        Assert.assertEquals(getCurrentUrl, "https://npav.net/", "Current URL did not match expected");
    }
}

