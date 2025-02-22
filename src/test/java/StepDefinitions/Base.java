package StepDefinitions;

import Helper.BrowserChoice;
import Helper.SnapShot;
import PageObject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Base
{
    BrowserChoice browserChoice = new BrowserChoice();

    final WebDriver driver = browserChoice.browseChoice("chrome", "https://www.saucedemo.com/");

    SnapShot snapShot = PageFactory.initElements(driver, SnapShot.class);

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

}

