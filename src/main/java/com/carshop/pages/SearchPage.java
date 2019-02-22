package com.carshop.pages;

import com.carshop.base.TestBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends TestBase {

       @FindBy(xpath = "//input[@name=\"freeText\"]")
       WebElement BMWsearch;
       @FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
       WebElement submit1;
       @FindBy(xpath = "//input[contains(@name,'freeText')]")
       WebElement jaguarsearch;
       @FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
       WebElement submit2;

    public SearchPage()
       { PageFactory.initElements(driver, this);}


    public void searchBmw(String Carname1){

         BMWsearch.sendKeys(Carname1);
         submit1.click();
    }

         public  void searchJaguar(String Carname2){

         jaguarsearch.sendKeys(Carname2);
         submit2.click();
         }
}
