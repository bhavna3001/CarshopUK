package com.carshop.pages;

import com.carshop.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends TestBase {

    //@FindBy(xpath="//a[@onclick=\"window.CarShop.Utils.PushEvent('mcs menu sign up click')\"]")
    //WebElement signupnow;
    //@FindBy(xpath = "//span[@class='u-center-block  u-text-80'][contains(.,'Menu')]")
    //WebElement menubar;


    public MenuPage() {PageFactory.initElements(driver, this);}

    public void menuButton(){

        //signupnow.click();
        //menubar.click();



    }


}
