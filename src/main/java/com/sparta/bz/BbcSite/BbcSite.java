package com.sparta.bz.BbcSite;

import com.sparta.bz.BbcSite.BbcPages.BbcHomePage;
import com.sparta.bz.BbcSite.BbcPages.BbcSignInPage;
import org.openqa.selenium.WebDriver;

public class BbcSite {

    private WebDriver driver;
    private BbcHomePage bbcHomePage;
    private BbcSignInPage bbcSignInPage;

    public BbcSite(WebDriver driver) {
        this.driver = driver;
        bbcHomePage = new BbcHomePage(driver);
        bbcSignInPage = new BbcSignInPage(driver);
    }
    public void getCurrentURL(){
       driver.getCurrentUrl();
    }
    public void quit(){
        driver.quit();
    }
    //page accessors

    public BbcHomePage bbcHomePage(){
        return bbcHomePage;
    }

    public BbcSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }
}