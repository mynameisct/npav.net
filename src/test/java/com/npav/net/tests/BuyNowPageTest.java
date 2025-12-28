package com.npav.net.tests;

import com.npav.net.pages.BuyNowPage;
import com.npav.net.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyNowPageTest extends BaseTest
{
    private BuyNowPage buyNowPage;

    @Test
    public void verifyTitle()
    {
        buyNowPage = new BuyNowPage(driver);
        buyNowPage.clickBuyNow();
        String currentPageTitle = buyNowPage.titleAfterClickingBuyNowBtn();

        Assert.assertEquals(currentPageTitle.trim()," Buy Now | Net Protector Antivirus ".trim());
    }
}
