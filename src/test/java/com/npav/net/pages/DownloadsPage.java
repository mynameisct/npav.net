package com.npav.net.pages;

import com.npav.net.page.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class DownloadsPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://npav.net/downloads']")
    WebElement downloadBtn;

    public DownloadsPage(WebDriver driver)
    {
        super(driver);
    }

    public String clickOnDownloads()
    {
        // Use JavaScriptExecutor instead of normal click
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", downloadBtn);
        String titleforDownload = driver.getTitle();
        return titleforDownload;
    }
}
