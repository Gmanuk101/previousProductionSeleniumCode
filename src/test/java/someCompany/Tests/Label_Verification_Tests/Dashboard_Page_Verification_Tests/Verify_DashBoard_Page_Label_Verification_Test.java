package someCompany.Tests.Label_Verification_Tests.Dashboard_Page_Verification_Tests;

import org.junit.Before;
import org.junit.Test;
/*
Author:  Graeme Phillips
Date: 29/05/2018
Test Purpose:  Verification of DashBoard page element labels
Summary
--------
This test is a verification test only.  No interrogation nor manipulation tales place, it just checks labels
It uses the DashBoard_Page.java class to get the label value of each page element
and checks to see if the element's label is as expected.
The JUNIT Assert.assertEquals method has been invoked as if this fails, you will get a better description of the failure.
The assertEquals method takes in an expected result and compares to the actual result.  It is recommended that this approach be continued
for whomever will take over Test Code maintenance.
It inherits from the Browser_Choices_BaseClass
 */

import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import org.junit.Assert;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;
import someCompany.Tests.Access_Tests.User_Login_Levels;


public class Verify_DashBoard_Page_Label_Verification_Test extends Browser_Choices_BaseClass
{

    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dashboard = new DashBoard_Page(driver);

    @Before  //runs before each instance of @Test
    public  void masterLogin()
    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels
    }


    @Test  //check the Manage People label is correct
    public void checkManagePeopleButtonLabelCorrect()
    {
        String managePeopleButtonLabel = dashboard.getManagePeopleButtonLabel();
        Assert.assertEquals( "Manage People",managePeopleButtonLabel);

    }

    @Test //check the newstarter button label is correct
    public void checkNewStarterButtonPresent()
    {
        String newStarterButtonLabelCorrect = dashboard.getNewStarterButtonLabel();
        Assert.assertEquals( "New Starter", newStarterButtonLabelCorrect );

    }

    @Test //check the man button has the correct label
    public void checkManageRolesButtonPresent()
    {
        String manageRoleButtonLabel = dashboard.getManageRolesButtonLabel();
        Assert.assertEquals( "Manage Roles", manageRoleButtonLabel );

    }

    @Test //check the ChangeLog button has the correct label
    public void checkChangeLogButtonPresent()
    {
        String changeLogButtonLabel = dashboard.getChangeRolesButtonLabel();
        Assert.assertEquals( "Change Log", changeLogButtonLabel );
    }

    @Test //check the loginButton has the correct label
    public void checkLogButtonPresent()
    {
        String logOutButtonLabel = dashboard.getLogOutButtLabel();
        Assert.assertEquals( "Logout",logOutButtonLabel );
    }
    @Test //check the dashboard icon has the correct label
    public void checkDashBoardIconPresent()
    {
        String dashIconLabel = dashboard.getDashboardIconLabel();
        Assert.assertEquals( "Dashboard", dashIconLabel );

    }



}
