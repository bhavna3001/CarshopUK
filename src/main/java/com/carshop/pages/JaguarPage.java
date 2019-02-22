package com.carshop.pages;

import com.carshop.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JaguarPage extends TestBase {


       @FindBy(xpath = "(//strong[contains(.,'JAGUAR XF')])[1]")
       WebElement selectJaguar;
       @FindBy(xpath = "(//i[contains(@class,'c-option__heart')])[2]")
       WebElement saveCar;

    public void sortPrice(){
        WebElement element=driver.findElement(By.xpath("//select[@name='sortBy']"));
        Select sel=new Select(element);
        sel.selectByIndex(2);
    }

    public JaguarPage(){
        PageFactory.initElements(driver,this);
    }

    public void jaguarSave(){
        selectJaguar.click();
        saveCar.click();

    }

    }


