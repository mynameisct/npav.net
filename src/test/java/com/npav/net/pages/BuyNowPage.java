package com.npav.net.pages;

import com.npav.net.page.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BuyNowPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://npav.net/buynow']/button")
    WebElement buyNowBtn;

    @FindBy(xpath = "//ul[@class='tabs nav nav-tabs']")
    List<WebElement> allOptions;

    public BuyNowPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickBuyNow()
    {
        buyNowBtn.click();
    }

    public String titleAfterClickingBuyNowBtn()
    {
        String titleisBuyNow = driver.getTitle();

        return titleisBuyNow;
    }
}