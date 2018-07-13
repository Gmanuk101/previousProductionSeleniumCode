package someCompany.Tests.Label_Verification_Tests.Compliance_Page_Verification_Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Compliance_Page.Compliance_IndemnityTAB_Page;
import someCompany.Tests.Access_Tests.User_Login_Levels;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

import java.util.concurrent.TimeUnit;

public class Verify_CompliancePage_IndemnityTAB_Verification_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements(driver);
    Compliance_IndemnityTAB_Page indem = new Compliance_IndemnityTAB_Page( driver );


    @Before //runs before each instance of @Test
    public void loginToSysNavToAbsencePage()//logs into system as master, then clicks manage people, then click 1st person returned
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
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        indem.clickIndemnityTab();

        //wait until elements load
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void checkSectionHeaderLabel()
    {
        String lab = indem.getMainHeaderText();
        Assert.assertEquals( "Indemnities", lab );
    }

    @Test
    public void checkGreyAreaHeaderText()
    {
        String greyMain = indem.getGreyAreaHeaderText();
        Assert.assertEquals( "Indemnities" , greyMain);
    }

    @Test
    public void checkGreyAreaSubText()
    {
        String subby = indem.getGreyAreaSubTxt();
        Assert.assertEquals( "Enter details below", subby );
    }

    @Test
    public void checkProviderLabel()
    {
        String prov = indem.getProviderLabel();
        Assert.assertEquals( "Provider", prov );
    }

    @Test
    public void checkNumberLabel()
    {
        String num = indem.getNumberLabel();
        Assert.assertEquals( "Number", num );
    }

    @Test
    public void checkEffectiveFromLabel()
    {
        String eff = indem.getEffectiveFromLabel();
        Assert.assertEquals( "Effective From", eff );
    }

    @Test
    public void checkExpiresAtLabel()
    {
        String exp = indem.getExpiresAtLabel();
        Assert.assertEquals( "Expires At", exp );
    }

}
