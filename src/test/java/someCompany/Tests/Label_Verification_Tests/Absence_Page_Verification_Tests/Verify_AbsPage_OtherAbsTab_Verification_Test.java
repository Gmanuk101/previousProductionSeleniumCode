package someCompany.Tests.Label_Verification_Tests.Absence_Page_Verification_Tests;
/*
Author:  Graeme Phillips
Date: 07/06/2018
Purpose:  This test will check all the static text and labels on the Absence >> Other Absense.  It does not pass values to the form nor interrogate
it other than getting label values

 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Absence_Page.Absence_OtherAbsenceTAB_Page;
import someCompany.Tests.Access_Tests.User_Login_Levels;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

import java.util.concurrent.TimeUnit;


public class Verify_AbsPage_OtherAbsTab_Verification_Test extends Browser_Choices_BaseClass {

    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements( driver );
    Absence_OtherAbsenceTAB_Page other = new Absence_OtherAbsenceTAB_Page( driver );

    @Before //runs before each instance of @Test
    public void loginToSysNavToAbsencePage()//logs into system as master, then clicks manage people, then click 1st person returned
    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels
        //click the manage people button
        dash.clickManagePeopleButton();
        //click the personalProfile of a user

        //click a person from the search returned
        stat.clickPersonFromSearch();


        //now click the Absence icon to get to the absence page
        stat.clickAbsenceButton();
        //put in a wait
        driver.manage().timeouts().implicitlyWait( 1, TimeUnit.SECONDS );
        other.clickOtherAbsButton();

        driver.manage().timeouts().implicitlyWait( 3, TimeUnit.SECONDS );


    }

    @Test
    public void checkSicknessTabLabe() {
        String sickTab = other.getSicknessTabLabel();
        Assert.assertEquals( "Sickness", sickTab );
    }

    @Test
    public void checkFItNoteTabLabel() {
        String fitTab = other.getFitNoteTabLabel();
        Assert.assertEquals( "Fit Notes", fitTab );
    }

    @Test
    public void checkMatPatAdoptLabel() {
        String mat = other.getMatPatAdoptTabLabel();
        Assert.assertEquals( "Maternity/Paternity/Adoption Leave", mat );
    }

    @Test
    public void checkOtherAbsenceTabLabel() {

        String oth = other.getOtherAbsenceTabLabel();
        Assert.assertEquals( "Other Absence", oth );
    }

    @Test
    public void checkSectionHeader() {
        String header = other.getOtherAbsSectionHeader();
        Assert.assertEquals( "Other Absence", header );
    }

    @Test
    public void checkSaveSectionButtonLabel() {
        String saveButt = other.getSaveSectionButtLabel();
        Assert.assertEquals( "Save Section", saveButt );
    }

    @Test
    public void checkAddButtLabel()
    {
        String addB = other.getAddButtonLabel();
        Assert.assertEquals( "Add", addB );
    }

    @Test
    public void checkStartDateofAbsLabel()
    {
        String startDate = other.getStartDateOfAbsLabel();
        Assert.assertEquals( "Start Date Of Absence",startDate );
    }

    @Test
    public void checkEndDateofAbsence()
    {
        String endDate = other.getEndDateOfAbsLabel();
        Assert.assertEquals( "End Date Of Absence", endDate);
    }

    @Test
    public void checkLengthLabel()
    {
        String length = other.getLengthLabel();
        Assert.assertEquals( "Length",length );
    }

    @Test
    public void checkAbsenceTypeDropDownLabel()
    {
        String drop = other.getAbsenceTypeDropDownLabel();
        Assert.assertEquals( "Absence Type", drop );
    }

    @Test
    public void checkPaperWorkReceivedLabel()
    {
        String paper = other.getPaperWorkRecLabel();
        Assert.assertEquals( "Paperwork Received", paper );
    }

    @Test
    public void checkRemoveButtLabel()
    {
        String rem = other.getRemoveButtLab();
        Assert.assertEquals( "Remove", rem );
    }

    @Test
    public void checkHistButtLabel()
    {
        String his = other.getHistoryButtLab();
        Assert.assertEquals( "History", his );
    }
}

