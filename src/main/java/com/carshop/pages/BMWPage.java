package com.carshop.pages;

import com.carshop.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BMWPage extends TestBase {

        @FindBy(xpath = "(//strong[contains(.,'BMW X5')])[1]")
        WebElement selectBMW;
        @FindBy(xpath = "(//i[contains(@class,'c-option__heart')])[2]")
        WebElement saveCar;

    public BMWPage(){ PageFactory.initElements(driver, this);}

    public void sortPrice(){
        WebElement element=driver.findElement(By.xpath("//select[@name='sortBy']"));
        Select sel=new Select(element);
        sel.selectByIndex(3);
    }
    public void carSave(){

        selectBMW.click();
        saveCar.click();
    }
}
