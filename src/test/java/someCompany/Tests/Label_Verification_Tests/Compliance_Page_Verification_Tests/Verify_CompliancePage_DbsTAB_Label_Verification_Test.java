package someCompany.Tests.Label_Verification_Tests.Compliance_Page_Verification_Tests;

import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Compliance_Page.Compliance_DbsDetailsTAB_Page;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Tests.Access_Tests.User_Login_Levels;

import java.util.concurrent.TimeUnit;

public class Verify_CompliancePage_DbsTAB_Label_Verification_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements(driver);
    Compliance_DbsDetailsTAB_Page comp = new Compliance_DbsDetailsTAB_Page( driver );


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

        comp.clickDBsTABButton();

        //wait until elements load
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void checkDbsDetailsTabLabel()
    {
        String dbs = comp.getDBS_DetailsLabel();
        Assert.assertEquals( "DBS Details",dbs );
    }

    @Test
    public void checkPerformersListTabLabel()
    {
        String perf = comp.getPerformersListLabel();
        Assert.assertEquals( "Performers List", perf );
    }

    @Test
    public void checkProfReggTabLabel()
    {
        String prof = comp.getProfessionalRegistrationTabLabel();
        Assert.assertEquals( "Professional Registration", prof );

    }

    @Test
    public void checkIndemnityTabLabel()
    {
        String ind = comp.getIndemnityTabLabel();
        Assert.assertEquals( "Indemnity",ind );
    }

    @Test
    public void checkRight2WorkTabLabel()
    {
        String right = comp.getRight2WorkTabLabel();
        Assert.assertEquals( "Right to Work in UK",right );
    }

    @Test
    public void checkSaveButtonLabel()
    {
        String saveButt = comp.getSaveSectionButtonLabel();
        Assert.assertEquals( "Save Section", saveButt );
    }

    @Test
    public void checkHistoryButtonLabel()
    {
        String hisButt = comp.getHistoryButtonLabel();
        Assert.assertEquals( "Show History", hisButt );
    }

    @Test
    public void checkMainSectionText()
    {
        String headerTxt = comp.getMainSectionHeaderText();
        Assert.assertEquals( "Disclosure and Barring Service", headerTxt );
    }

    @Test
    public void checkGreyAreaMainText()
    {
        String greyMain = comp.getGreySectionHeaderLabel();
        Assert.assertEquals( "Disclosure and Barring Service",greyMain );
    }

    @Test
    public void checkGreaAreaSubText()
    {
        String greySubTxt = comp.getGreySectionHeaderSUB_Label();
        Assert.assertEquals( "DBS check details", greySubTxt);
    }

    @Test
    public void checkTypeDropDownLabel()
    {
        String type = comp.getTypeLabel();
        Assert.assertEquals( "Type", type );
    }

    @Test
    public void checkDBsNumberLabel()
    {
        String dbs = comp.getDbsNumberLabel();
        Assert.assertEquals( "DBS Number", dbs );
    }

    @Test
    public void checkDateOfCheckLabel()
    {
        String dateCheck = comp.getDateOfCheckLabel();
        Assert.assertEquals( "Date Of Check", dateCheck );
    }

    @Test
    public void checkExpiresAtLabel()
    {
        String exp = comp.getExpiresAtLabel();
        Assert.assertEquals( "Expires At", exp);
    }

    @Test
    public void checkReceivedAtLabel()
    {
        String rec = comp.getReceivedAtLabel();
        Assert.assertEquals( "Received At", rec );
    }

    @Test
    public void checkUpdateServiceToggleLabel()
    {
        String up = comp.getUpdateServiceToggleLabel();
        Assert.assertEquals( "Update Service", up );
    }

    @Test
    public void checkDateOfRiskAss()
    {
        String riskyAss = comp.getDateOfRiskAssLabel();
        Assert.assertEquals( "Date of Risk Assessment (if any convictions)",riskyAss );
    }


}
