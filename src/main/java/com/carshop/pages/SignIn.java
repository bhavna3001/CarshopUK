package com.carshop.pages;

import com.carshop.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends TestBase {
       @FindBy(xpath = "//a[contains(.,'Sign In')]")
       WebElement signInbutton;
       @FindBy(xpath = "//input[@ id=\"username\"]")
       WebElement username;
       @FindBy(xpath = "//input[@name='password']")
       WebElement password1;
       @FindBy(xpath = "//button[@type='submit']")
       WebElement signin;
       @FindBy(xpath = "(//img[@alt='CarShop Logo'])[1]")
       WebElement logo;

    public SignIn(){ PageFactory.initElements(driver, this);}

    public void setSignInButton(String userName, String passWord) {
        signInbutton.click();
        username.sendKeys(userName);
        password1.sendKeys(passWord);
        signin.click();

    }
    public void logoClick(){
         logo.click();

    }

}

