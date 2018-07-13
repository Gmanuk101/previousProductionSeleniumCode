package someCompany.Tests.Label_Verification_Tests.Admin_Pages_Verification_Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Admin_Accessed_Pages.ManageRoles_Admin_Page;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;
import someCompany.Tests.Access_Tests.User_Login_Levels;

import java.util.concurrent.TimeUnit;

/*
Author: Graeme Phillips
Date: 01/06/2018
Purpose: To verify all the labels and text is as expected on the Manage Roles admin page.
This test does not interrogate fields nor input into fields, it simply checks label values take from the ManageRoles_Admin_Page.class
NOTE:  It has not been possible to use the hamburger menu to invoke a click due to the formBuilders build actions.
So we this test currently used the manageRoles like - it is worth considering invoking a change at a future date.
 */

public class Verify_ManageRolesAdmin_Label_Verification_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    ManageRoles_Admin_Page man = new ManageRoles_Admin_Page( driver );
    DashBoard_Page dashBoard = new DashBoard_Page( driver );


    @Before  //runs before each instance of @Test
    public  void masterLogin()//logs into system as master, then clicks hamburger menu

    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels
        dashBoard.clickManageRolesButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //the follow methods will check label values - interrogation of fields will occur in different tests
    @Test
    public void checkNewRoleButtonLabel()
    {
        String buttLab = man.getNewRoleButtonLabel();
        Assert.assertEquals( "New role", buttLab );
    }

    @Test
    public void checkSearchHeaderTextValue()
    {
        String searchTxt = man.getSearchHeaderText();
        Assert.assertEquals( "Search",searchTxt );
    }

    @Test
    public void checkSearchSubText()
    {
        String searchSubTxt = man.getSearchSubText();
        Assert.assertEquals( "Select some search terms then click search.", searchSubTxt );
    }

    @Test
    public void checkRoleNameLabelValue()
    {
        String roleName = man.getRoleNameLabel();
        Assert.assertEquals( "Role Name", roleName );
    }

    @Test
    public void checkOtherOptionsBannerText()
    {
        String other = man.getOtherOptionsHeader();
        Assert.assertEquals( "Other Options",other );
    }

    @Test
    public void checkLineManagersTxt()
    {
        String line = man.getLineManagersText();
        Assert.assertEquals( "Line Managers", line );
    }

    @Test
    public void checkLineManagerToggleText()
    {
        String toggleTxt = man.getLineManagerOnlyToggle();
        Assert.assertEquals( "Line Manager Only", toggleTxt );
    }

    @Test
    public void checkSearchButtonTxt()
    {
        String searchTxt = man.getSearchButtonText();
        Assert.assertEquals( "Search", searchTxt );
    }

    @Test
    public void despatcherRolePresent()
    {
        String desp = man.getDespatcherRoleTxt();
        Assert.assertEquals( "Despatcher", desp );
    }

    @Test
    public void checkSearchBannerButtonsRendered() //this test will check for the search banner, if banner not present API is down
    {
        Boolean sBan = man.checkSearchBarNumberListPresent();
        Assert.assertTrue( true );
        //the expected condition returned is true, if false then test will fail
    }

    @Test
    public void rolesAdminPageHeaderTxt()
    {
        String mainHeaderTxt = man.getPageBannerTxt();
        Assert.assertEquals( "Roles Admin", mainHeaderTxt );
    }

    @Test
    public void checkMainHeaderSubTxt()
    {
        String mainHeadSubTxt = man.getManHeadSubTxt();
        Assert.assertEquals( "Add new roles, and edit existing roles from here", mainHeadSubTxt );
    }
}
