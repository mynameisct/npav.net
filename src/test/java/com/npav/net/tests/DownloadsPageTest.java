package com.npav.net.tests;

import com.npav.net.pages.DownloadsPage;
import com.npav.net.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadsPageTest extends BaseTest
{
    private DownloadsPage downloadsPage;

    @Test
    public void  verifyClicktoDownload()
    {
        downloadsPage = new DownloadsPage(driver);

        downloadsPage.clickOnDownloads();

        String actualTitle = downloadsPage.clickOnDownloads();

        Assert.assertEquals(actualTitle.trim()," Download best antivirus for pc | Net Protector Antivirus ".trim());
    }
}
