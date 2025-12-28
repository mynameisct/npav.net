package com.npav.net.pages;

import com.npav.net.page.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://npav.net/downloads']")
    WebElement downloadBtn;

    public DownloadsPage(WebDriver driver)
    {
        super(driver);
    }

    public String clickOnDownloads()
    {
        downloadBtn.click();
        String titleforDownload = driver.getTitle();
        return titleforDownload;
    }
}
