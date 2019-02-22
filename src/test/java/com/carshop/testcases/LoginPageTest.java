package com.carshop.testcases;

import com.carshop.pages.*;
import com.carshop.util.ScreenshotUtility;
import com.carshop.util.SendAttachmentInEmail;
import org.testng.annotations.*;

import com.carshop.base.TestBase;

public class LoginPageTest extends TestBase {

   HomePage homePage;
   MenuPage menuPage;
   SearchPage searchPage;
   SignUp signUp;
   SignIn signIn;
   BMWPage bmwPage;
   JaguarPage jaguarPage;

   public LoginPageTest()
   {
      super();
   }
   
   @BeforeMethod
   public void setUp()
   {
      initialization();
       homePage=new HomePage();
       signUp=new SignUp();
       signIn=new SignIn();
       searchPage=new SearchPage();
       bmwPage=new BMWPage();
       jaguarPage=new JaguarPage();
       menuPage=new MenuPage();

   }
   @Test
   public void homePageMenuTest() {

      try {
         //Go to Menubar on the right corner of Home page
         homePage.menuBar();

         //Sign up with the valid credentials
         //signUp.signUpPage( prop.getProperty("firstname") , prop.getProperty("lastname"),
         //prop.getProperty("username"),prop.getProperty("password"),prop.getProperty("password"));

         //SignIn with the valid credentails
         signIn.setSignInButton(prop.getProperty("username"), prop.getProperty("password"));

         //Click on CarShop logo to go to Home Page
         signIn.logoClick();

         //Search the car from search Bar(BMW)
         //Sort the price and Save the Car
         searchPage.searchBmw(prop.getProperty("Carname1"));
         bmwPage.sortPrice();
         bmwPage.carSave();

         //Click on CarShop logo to go to Home Page
         signIn.logoClick();

         //Search the car from search Bar(jaguar)
         //Sort the price and Save the Car
         searchPage.searchJaguar(prop.getProperty("Carname2"));
         jaguarPage.jaguarSave();
         signIn.logoClick();

         //Go to Menubar and view recent items and take Screenshot
         homePage.menuBar();
         homePage.setRecentlyviewed();
         ScreenshotUtility screenshotUtility = new ScreenshotUtility();
         screenshotUtility.takeSnapShot(driver, prop.getProperty("screenshotPath"));

         //Send email
         SendAttachmentInEmail sendAttachmentInEmail = new SendAttachmentInEmail();
         sendAttachmentInEmail.sendScreenShot();
      }catch (Exception e){
         e.printStackTrace();
      }


   }

   @AfterMethod
   public void tearDown()
   {
      driver.quit();
   }


}

