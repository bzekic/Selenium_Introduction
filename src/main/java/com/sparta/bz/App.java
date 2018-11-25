package com.sparta.bz;

import com.sparta.bz.BbcSite.BbcSite;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main( String[] args ) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TECH-W91\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver chromeDriver = new ChromeDriver();
        BbcSite bbcSite = new BbcSite( chromeDriver );

        bbcSite.bbcSignInPage().goToSignInPage();
        bbcSite.bbcSignInPage().assertCurrentURLIsSignInPage();
        bbcSite.bbcSignInPage().inputUserName("email@email.com");
        bbcSite.bbcSignInPage().inputPassword("i8y8787y8778h");
        bbcSite.bbcSignInPage().clickSubmitButton();
        System.out.println(bbcSite.bbcSignInPage().getPasswordErrorText());
        bbcSite.quit();
    }

}
