package someCompany.Tests.Label_Verification_Tests.Compliance_Page_Verification_Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Compliance_Page.Compliance_Right2WorkTAB_Page;
import someCompany.Tests.Access_Tests.User_Login_Levels;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

import java.util.concurrent.TimeUnit;

public class Verify_CompliancePage_Right2WrkTAB_Test  extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements(driver);
    Compliance_Right2WorkTAB_Page right = new Compliance_Right2WorkTAB_Page( driver );

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

       right.clickRight2WorkTab();

        //wait until elements load
        driver.manage().timeouts().implicitlyWait( 3, TimeUnit.SECONDS );
    }



    @Test
    public void checkDbsTabLabel()
    {
        String dbs = right.getDbsTabLabel();
        Assert.assertEquals( "DBS Details", dbs );
    }

    @Test
    public void checkPerformListTabLabel()
    {
        String perform = right.getPerformListTabLabel();
        Assert.assertEquals( "Performers List", perform );
    }

    @Test
    public void checkRight2WorkLabel()
    {
        String rig = right.getRight2WorkTabLabel();
        Assert.assertEquals( "Right to Work in UK", rig );
    }

    @Test
    public void checkMainHeaderLabel()
    {
        String head = right.getMainHeaderText();
        Assert.assertEquals( "Right to Work in UK", head );
    }

    @Test
    public void checkSaveSectButtLab()
    {
        String saveButt = right.getSaveSectionButtLabel();
        Assert.assertEquals( "Save Section", saveButt );
    }

    @Test
    public void checkHistoryButtLabel()
    {
        String hist = right.getHistoryButtLabel();
        Assert.assertEquals( "Show History",hist );
    }

    @Test
    public void checkGreyAreaMainHeadTxt()
    {
        String greyHead = right.getGreyAreaMainText();
        Assert.assertEquals( "Right to Work in UK", greyHead );
    }

    @Test
    public void checkGreyAreaSubTxt()
    {
        String sub = right.getGreyAreaSubTxt();
        Assert.assertEquals( "Enter details below", sub );
    }
    @Test
    public void checkTypeLabel()
    {
        String type = right.getTypeLabel();
        Assert.assertEquals( "Type", type );
    }

    @Test
    public void checkDateOfCheckLabel()
    {
        String dateCheck = right.getDateOfCheckLabel();
        Assert.assertEquals( "Date Of Check", dateCheck );
    }

    @Test
    public void checkStatusLabel()
    {
        String stat = right.getStatusLabel();
        Assert.assertEquals( "Status", stat );
    }

    @Test
    public void checkExpiresAtLabel()
    {
        String exp = right.getExpiresAtLabel();
        Assert.assertEquals( "Expires At",exp );
    }

    @Test
    public void checkNotesLabel()
    {
        String notes = right.getNotesLabel();
        Assert.assertEquals( "Notes", notes );
    }

}
