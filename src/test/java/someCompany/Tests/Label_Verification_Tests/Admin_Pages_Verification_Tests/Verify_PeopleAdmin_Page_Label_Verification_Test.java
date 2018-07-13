package someCompany.Tests.Label_Verification_Tests.Admin_Pages_Verification_Tests;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Admin_Accessed_Pages.ManagePeople_Admin_Page;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;
import someCompany.Tests.Access_Tests.User_Login_Levels;

import java.util.concurrent.TimeUnit;

/*Author:  Graeme Phillips
Date: 31/05/2018
Purpose:  This test will verifiy the labels on the People Admin page.
This test does not perform any manipulation nor interrogation of fields
NOTE: as per other Hamburger menu items , due to the form build not invoking static IDs for elements, currently we are getting to the People via
logging in as master user (whom is admin) and clicking the Mangage People link from the dashboard screen.
 */

public class Verify_PeopleAdmin_Page_Label_Verification_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dashBoard = new DashBoard_Page( driver );
    ManagePeople_Admin_Page managePeople = new ManagePeople_Admin_Page( driver );


    @Before  //runs before each instance of @Test
    public  void masterLogin()
    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels

        dashBoard.clickManagePeopleButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //list of tests here

    @Test  //check the Person ID label is correct
    public void checkPersonIDLabelCorrect()
    {
        String  personID = managePeople.checkPersonIdLabel();
        Assert.assertEquals( "Person ID",personID);
    }

    //check titleFieldLabel
    @Test
    public void checkTitleFieldLabel()
    {
        String titField = managePeople.checkTitleFieldLabel();
        Assert.assertEquals( "Title", titField );
    }

    //check firstName fieldLabel
    @Test
    public void checkFirstNameFieldLabel()
    {
        String fName = managePeople.checkFirstNameFieldLabel();
        Assert.assertEquals( "First Name", fName );
    }

    //check surname fieldLabel
    @Test
    public void checkSurnameFieldLabel()
    {
        String sName = managePeople.checkSurnameFieldLabel();
        Assert.assertEquals( "Surname", sName );
    }

    //check previous surname field label
    @Test
    public void checkPrevSurnameFieldLabel()
    {
        String prevSname = managePeople.checkPrevSnameFieldLabel();
        Assert.assertEquals( "Previous Surname", prevSname );
    }

    //check knownAs field label
    @Test
    public void checkKnownAsFieldLabel()
    {
        String knownAs = managePeople.checkKnownAsFieldLabel();
        Assert.assertEquals( "Known As",knownAs );
    }

    //check NI number field label
    @Test
    public void checkNatInsNumFieldLabel()
    {
        String ni = managePeople.checkNatInsFieldLabel();
        Assert.assertEquals( "NI Number", ni );
    }

    //check Other options text present
    @Test
    public void checkOtherOptionsText()
    {
        String otherOps = managePeople.checkOtherOptionsText();
        Assert.assertEquals( "Other Options", otherOps );
    }

    //check Search Button present
    @Test
    public void checkSearchButton()
    {
        String butt = managePeople.checkSearchButtonTxt();
        Assert.assertEquals( "Search", butt );
    }

    //check People Admin text present
    public void checkPeopleAdminTextPresent()
    {
        String peopleAdminTxt = managePeople.checkPeopleAdminTextPresent();
        Assert.assertEquals( "People Admin", peopleAdminTxt );
    }



}
