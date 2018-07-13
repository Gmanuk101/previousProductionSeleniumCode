package someCompany.Tests.Label_Verification_Tests.Compliance_Page_Verification_Tests;

import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Compliance_Page.Compliance_ProfRegTAB_Page;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Tests.Access_Tests.User_Login_Levels;

import java.util.concurrent.TimeUnit;


public class Verify_CompliancePage_ProfRegTAB_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements(driver);
    Compliance_ProfRegTAB_Page pro = new Compliance_ProfRegTAB_Page(driver);


    @Before //runs before each instance of @Test
    public void loginToSysNavToCompliancePage()//logs into system as master, then clicks manage people, then click 1st person returned
    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels
        //click the manage people button
        dash.clickManagePeopleButton(); //click the managePeople button
        //click the personalProfile of a user

        //click a person from the search returned
        stat.clickPersonFromSearch();


        //now click the compliance icon to get to the absence page
        stat.clickComplianceButton();

        //put in a wait
        driver.manage().timeouts().implicitlyWait( 1, TimeUnit.SECONDS );

        pro.clickProfRegTab();

        //wait until elements load
        driver.manage().timeouts().implicitlyWait( 3, TimeUnit.SECONDS );
    }

    @Test
    public void checkHeaderLabel()
    {
        String head = pro.profRegHeaderText();
        Assert.assertEquals( "Professional Registration", head );
    }

    @Test
    public void checkHeaderSubText()
    {
        String sub = pro.profRegHeaderSubText();
        Assert.assertEquals( "Enter details below", sub );
    }

    @Test
    public void checkBodyLabel()
    {
        String body = pro.getBodyLabel();
        Assert.assertEquals( "Body", body );
    }

    @Test
    public void checkNumberLabel()
    {
        String numbLab = pro.getNumberLabel();
        Assert.assertEquals( "Number", numbLab );
    }

    @Test
    public void checkDateofCheckLabel()
    {
        String checkLab = pro.getDateOfCheckLabel();
        Assert.assertEquals( "Date Of Check", checkLab );
    }

    @Test
    public void checkExpiresAtLabel()
    {
        String exp = pro.getExpiresAtLabel();
        Assert.assertEquals( "Expires At", exp );
    }

    @Test
    public void checkNMCLabel()
    {
        String nmc = pro.getnmcLabel();
        Assert.assertEquals( "NMC re-validation date", nmc );
    }
}
