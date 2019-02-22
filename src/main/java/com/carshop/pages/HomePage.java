package com.carshop.pages;

import com.carshop.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class HomePage extends TestBase {

      @FindBy(xpath = "//a[@ ng-click='cc.svc.utils.openMenu()']")
       WebElement menubutton;

       /*@FindBy(xpath = "//a[@href='/mycarshop/signup']")
         Webelement singUpLink;*/

       @FindBy(xpath = "//a[@href='/mycarshop/recently-viewed'][contains(.,'Recently Viewed (2)')]")
       WebElement recentlyvieweditem;

    public HomePage(){
         PageFactory.initElements(driver , this);
     }

    public void menuBar() {

        menubutton.click();
        //singUpLink.click();
    }

    public void setRecentlyviewed() {

        recentlyvieweditem.click();




    }


}
