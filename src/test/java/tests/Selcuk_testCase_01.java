package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Selcuk_testCase_01 {

    @Test
    public void test01(){

        //1- Launch the website https://automationexercise.com/
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

        //2- Click on the "Login" button on the top right corner of the page
        //3- Enter a valid email address and password in the respective fields
        //4- Click on the "Sign in" button
        //5- Verify that the user is logged in by checking if the "My account" page is displayed 6- Logout of the website

    }



}
