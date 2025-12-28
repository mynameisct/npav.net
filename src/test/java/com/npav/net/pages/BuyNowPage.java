package com.npav.net.pages;

import com.npav.net.page.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyNowPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://npav.net/buynow']/button")
    WebElement buyNowBtn;

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