package com.npav.net.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.npav.net.pages.HomePage;
import com.npav.net.reports.ExtentManager;
import com.npav.net.test.base.BaseTest;
import com.npav.net.utilities.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Listeners(com.npav.net.utilities.TestListener.class)
public class HomePageTest extends BaseTest {

    private HomePage homePage;
    private static final Logger log = LogManager.getLogger(HomePageTest.class);

    @Test
    public void verifyHomePageTitle() {
        log.info("==== Starting verifyHomePageTitle Test =====");
        TestListener.getTest().log(Status.INFO, "Navigating to Home Page");

        homePage = new HomePage(driver);
        log.debug("HomePage object initialized with driver instance");
        TestListener.getTest().log(Status.INFO, "HomePage object initialized with driver instance");

        String actualPageTitle = homePage.getPageTitle();
        log.info("Fetched page title: {}", actualPageTitle);
        TestListener.getTest().log(Status.INFO, "Fetched page title: " + actualPageTitle);

        Assert.assertTrue(actualPageTitle.contains("Best Antivirus for Your PC"),
                "Title did not contain expected text");
        log.info("Assertion passed: Title contains expected text");
        TestListener.getTest().log(Status.PASS, "Assertion passed: Title contains expected text");

        log.info("===== Completed verifyHomePageTitle Test =====");
        TestListener.getTest().log(Status.INFO, "===== Completed verifyHomePageTitle Test =====");
    }


    @Test
    public void verifyCurrentUrl() {
        log.info("===== Starting verifyCurrentUrl Test =====");

        homePage = new HomePage(driver);
        log.debug("HomePage object initialized with driver instance");
        TestListener.getTest().log(Status.INFO, "HomePage object initialized with driver instance");

        String getCurrentUrl = homePage.getPageUrl();
        log.info("Fetched current URL: {}", getCurrentUrl);
        TestListener.getTest().log(Status.INFO, "Fetched current URL: " + getCurrentUrl);

        Assert.assertEquals(getCurrentUrl, "https://npav.net/",
                "Current URL did not match expected");
        log.info("Assertion passed: Current URL matched expected value");
        TestListener.getTest().log(Status.PASS, "Assertion passed: Current URL matched expected value");

        log.info("===== Completed verifyCurrentUrl Test =====");
        TestListener.getTest().log(Status.INFO, "===== Completed verifyCurrentUrl Test =====");
    }

    @Test
    public void verifyClickOnBrandIcon() {
        log.info("===== Starting verifyClickOnBrandIcon Test =====");

        homePage = new HomePage(driver);
        log.debug("HomePage object initialized with driver instance");
        TestListener.getTest().log(Status.INFO, "HomePage object initialized with driver instance");
        homePage.clickBrandIcon();
        log.info("Clicked on Brand Icon");
        TestListener.getTest().log(Status.INFO, "===== Clicked on Brand Icon ====");
        String pageTitleAfterRedirection = homePage.getPageTitle();
        log.info("Fetched Page Title After Clicking on Brand Icon",pageTitleAfterRedirection);
        Assert.assertTrue(pageTitleAfterRedirection.contains("Best Antivirus for Your PC"),
                "Title did not contain expected text");
        TestListener.getTest().log(Status.PASS, "Assertion passed: Current Title matched expected value");
        log.info("===== Completed verifyClickOnBrandIcon Test =====");
        TestListener.getTest().log(Status.INFO, "===== Completed verifyClickOnBrandIconTest =====");
    }
}
