package com.carshop.pages;


import com.carshop.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUp extends TestBase {

    @FindBy(xpath = "//input[@ id=\"firstName\"]")
    WebElement firstname;
    @FindBy(xpath = "//input[@ id=\"lastName\"]")
    WebElement lastname;
    @FindBy(xpath = "//input[@ id=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//input[@ id=\"password\"]")
    WebElement password;
    @FindBy(xpath = " //input[@ id=\"confirmPassword\"]")
    WebElement confirmpassword;
    @FindBy(xpath = "//button[@class=\"c-button c-button--block u-brand-primary\"]")
    WebElement signupbutton;


    public SignUp(){
        PageFactory.initElements(driver,this);
    }



    public void signUpPage (String a, String b, String id, String pwd , String cpwd){
        firstname.sendKeys(a);
        lastname.sendKeys(b);
        email.sendKeys(id);
        password.sendKeys(pwd);
        confirmpassword.sendKeys(cpwd);
        signupbutton.click();

    }
}
