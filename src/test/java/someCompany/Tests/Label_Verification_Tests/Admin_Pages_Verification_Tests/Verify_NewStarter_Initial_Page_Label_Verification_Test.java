package someCompany.Tests.Label_Verification_Tests.Admin_Pages_Verification_Tests;

import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Admin_Accessed_Pages.NewStarter_Initial_Page;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;
import someCompany.Tests.Access_Tests.User_Login_Levels;

import java.util.concurrent.TimeUnit;
/*Author:  Graeme Phillips
Date: 31/05/2018
Purpose:  This test will verifiy the labels on the New starter Page.
This test does not perform any manipulation nor interrogation of fields - checks labels only
 */


//to complete this class we need to change the methods in the NewStarterPage class
public class Verify_NewStarter_Initial_Page_Label_Verification_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    NewStarter_Initial_Page newStarter = new NewStarter_Initial_Page(driver);
    DashBoard_Page dashBoard = new DashBoard_Page( driver );

    @Before  //runs before each instance of @Test - login as master then click newStarter button
    public void masterLogin()
    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels
        dashBoard.clickNewStarterButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test  //check the NewStarter title label is correct
    public void checkTitleLabelCorrect()
    {
        String  titleLabel = newStarter.checkTitleFieldName();
        Assert.assertEquals( "Title",titleLabel);

    }

    @Test //check the FirstName label is correct
    public void checkForeNameLabelCorrect()
    {
        String firstName = newStarter.checkFirstNameLabel();
        Assert.assertEquals("Forename*", firstName);
    }

    @Test
    public void checkSurnameLabelCorrect()
    {
        String surNameLabel = newStarter.checkSurnameLabel();
        Assert.assertEquals( "Surname*",surNameLabel );

    }

    @Test
    public void checkDateOfBirthLabelCorrect()
    {
        String dobLabel = newStarter.checkDateOfBirthFieldLabel();
        Assert.assertEquals( "DOB*",dobLabel );

    }

    @Test
    public void checkNatInsNumberLabelCorrect()
    {
        String natInsNumb = newStarter.checkNatInsFieldLabel();
        Assert.assertEquals( "NI Number*", natInsNumb );
    }

    @Test
    public void checkgenderLabelCorrect()
    {
        String genderLabel = newStarter.checkGenderFieldLabel();
        Assert.assertEquals( "Gender", genderLabel );

    }

    @Test
    public void checkMaritalStatusLabelCorrect()
    {
        String maritalStatusLabel = newStarter.checkMaritalStatusFieldLabel();
        Assert.assertEquals( "Marital Status", maritalStatusLabel );

    }

    @Test
    public void checkCreateNewStarterButtonLabelCorrect()
    {
        String createNewStarterButtonLabel = newStarter.getCreateNewStarterButtonLabel();
        Assert.assertEquals( "Create New Starter",createNewStarterButtonLabel );
    }

    @Test
    public void checkPayProvLabel()
    {
        String payprv = newStarter.getPayProviderLabel();
        Assert.assertEquals( "Payment Provider*", payprv );
    }


}
