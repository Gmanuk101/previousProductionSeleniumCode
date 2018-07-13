package someCompany.Tests.Label_Verification_Tests.Absence_Page_Verification_Tests;

/*
Author:  Graeme Phillips
Date: 06/06/2018
Purpose:  This test will check all the static text and labels on the Absence >> Maternity/Paternity tab page only.  It does not pass values to the form nor interrogate
it other than getting label values

 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Absence_Page.Absence_MatPatAdoptLeaveTAB_Page;
import someCompany.Tests.Access_Tests.User_Login_Levels;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

import java.util.concurrent.TimeUnit;

public class Verify_AbsPage_MaternityTab_Label_Verification_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements(driver);
    Absence_MatPatAdoptLeaveTAB_Page mat = new Absence_MatPatAdoptLeaveTAB_Page( driver );

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
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        mat.clickMaternityTabButton();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

    @Test //check the page tab label
    public void checkMatPatAdopLeaveLabel()
    {
        String label = mat.getMatPatAdoptButtonClick();
        Assert.assertEquals( "Maternity/Paternity/Adoption Leave" ,label);
    }

    //check section header text
    @Test
    public void checkMaternitySectionHeader()
    {
        String header = mat.getMaternitySectonHeaderLabel();
        Assert.assertEquals( "Maternity", header );
    }

    //check save button label
    @Test
    public void checkSaveButtonLabel()
    {
        String saveSave = mat.getSaveButtonLabel();
        Assert.assertEquals( "Save Section", saveSave );
    }

    //check add button label
    @Test
    public void checkAddButton()
    {
        String addButt = mat.getAddButtonLabel();
        Assert.assertEquals( "Add", addButt );
    }

    //check startDateof Absence Label
    @Test
    public void checkStartDateOfAbs()
    {
        String startDateAbs = mat.getStartDateOfAbsLabel();
        Assert.assertEquals( "Start Date Of Absence",startDateAbs );
    }

    //check EndDateof Absence label
    @Test
    public void checkEndDateOfAbsenceLabel()
    {
        String endDate = mat.getEndDateOfAbsLabel();
        Assert.assertEquals( "End Date Of Absence", endDate );
    }

    //check absense type label
    @Test
    public void checkAbsenceTypeLabel()
    {
        String absType = mat.getAbsenceTypeDropDownLabel();
        Assert.assertEquals( "Absence Type", absType );
    }

    //check MATB1 recieved label
    @Test
    public void checkMATB1Label()
    {
        String matb1 = mat.getMatb1ReceivedLabel();
        Assert.assertEquals( "MATB1 Received", matb1 );
    }

    //check expected date of confinement label
    @Test
    public void checkExpectDateConfineLabel()
    {
        String confine = mat.getExpecDateOfConfineLabel();
        Assert.assertEquals( "Expected Date Of Confinement", confine );
    }

    //paperwork received label
    @Test
    public void checkPaperWorkRecLabel()
    {
        String paper = mat.getPaperWorkRecLabel();
        Assert.assertEquals( "Paperwork Received",paper );
    }

    //check risk assessment label
    @Test
    public void checkRiskAssLabel()
    {
        String riskyAss = mat.getRiskAssPerformedLabel();
        Assert.assertEquals( "Risk Assessment Performed", riskyAss );
    }

    //check actual dob label
    @Test
    public void checkActualDobLabel()
    {
        String dob = mat.getActualDobLabel();
        Assert.assertEquals( "Actual DOB", dob );
    }

    //check remove button label
    @Test
    public void checkRemoveButtLabel()
    {
        String removeButt = mat.getRemoveButtLabel();
        Assert.assertEquals( "Remove", removeButt );
    }

    //check history button label
    @Test
    public void checkHistoryButtLabel()
    {
        String hisButt = mat.getHistButtLabel();
        Assert.assertEquals( "History",hisButt);
    }


}
