package someCompany.Tests.Label_Verification_Tests.Absence_Page_Verification_Tests;
/*
Author:  Graeme Phillips
Date: 04/06/2018
Purpose:  This test will check all the static text and labels on the Absence >> Sickness tab page only.  It does not pass values to the form nor interrogate
it other than getting label values

//LengthLabel - I have removed this from the test as due to the form builder the xpath references keep changing on the fly at page render time
//SelfCertReceivedLabel - I am removing this from the tests as the FormBuilder is generating different xPath references on the fly at page render time

 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Absence_Page.Absence_SicknessTAB_Page;
import someCompany.Tests.Access_Tests.User_Login_Levels;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

import java.util.concurrent.TimeUnit;

public class Verify_AbsPage_SicknessTab_Label_Verification_Test extends Browser_Choices_BaseClass
{

    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Absence_SicknessTAB_Page absPage = new Absence_SicknessTAB_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements(driver);

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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void checkAbsPageHeaderText()
    {
        String work = absPage.getAbsencePageHeaderText();
        Assert.assertEquals( "Absence",work );
    }

    //page header subText
    @Test
    public void checkAbsPageHeaderSubText()
    {
        String subText = absPage.getAbsenceHeaderSubText();
        Assert.assertEquals( "sickness, fit notes, maternity, and other absence", subText );
    }

    //sickness tabButton
    @Test
    public void checkSicknessTabLabel()
    {
        String sickTab = absPage.getAbsTabSicknessTabLabelText();
        Assert.assertEquals( "Sickness",sickTab );
    }

    //fitNotes tab button
    @Test
    public void checkFitNoteTabLabel()
    {
        String fitNote = absPage.getAbsTabFitNotesLabelTxt();
        Assert.assertEquals( "Fit Notes", fitNote );
    }

    //maternity etc... tab button
    @Test
    public void checkMatPatAdopLeaveTabLabel()
    {
        String matPat = absPage.getSick_TabMaternityPaternityAdoptionLeave();
        Assert.assertEquals( "Maternity/Paternity/Adoption Leave",matPat );
    }

    //other absence tab button
    @Test
    public void checkOtherAbsenceTabLabel()
    {
        String otherAbs = absPage.GetAbsTabOtherAbsence();
        Assert.assertEquals( "Other Absence", otherAbs );
    }

    //sickness Section header text
    public void checkSicknessTabHeaderLabel()
    {
        String sickTxt = absPage.getSick_TabSicknessSectionHeaderText();
        Assert.assertEquals( "Sickness", sickTxt );
    }

    //save section button text
    public void checkSaveSectionButtLabel()
    {
        String saveSection = absPage.getAbsSickTabSaveSectionButtonLabel();
        Assert.assertEquals( "Save Section", saveSection );
    }

    //add button text
    public void checkAddButtonLabel()
    {
        String addButton = absPage.getAbsSickTabAddButtonLabel();
        Assert.assertEquals( "Add",addButton );
    }

    //startDateOfAbsenceLabel
    @Test
    public void checkStartDateOfAbsLabel()
    {
        String startDateAbs = absPage.getSick_TabStartDateOfAbsLabel();
        Assert.assertEquals( "Start Date Of Absence", startDateAbs );
    }

    //EndDateOfAbsenceLabel
    @Test
    public void checkEndDateOfAbsLabel()
    {
        String endAbs = absPage.getSick_TabEndDateOfAbsLabel();
        Assert.assertEquals( "End Date Of Absence",endAbs );
    }

    //ActualDateOfReturnLabel
    @Test
    public void checkActualDateReturnLabel()
    {
        String accDateRet = absPage.getSick_TabSickTabActualDateOfReturnLabel();
        Assert.assertEquals( "Actual Date Of Return", accDateRet );
    }

    /*LengthLabel - I have removed this from the test as due to the form builder the xpath references keep changing on the fly at page render time
    @Test
    public void checkLengthLabel()
    {
        String lengthLabel = absPage.getSick_TabLengthFieldLabel();
        Assert.assertEquals( "Length",lengthLabel );
    }     */

    //SicknessReasonLabel
    @Test
    public void checkSicknessReasonDropDownLabel()
    {
        String sickReason = absPage.getSick_TabSicknessReasonDropDownLabel();
        Assert.assertEquals( "Sickness Reason", sickReason );
    }

    /*SelfCertReceivedLabel - I am removing this from the tests as the FormBuilder is generating different xPath references on the fly at page render time
    @Test
    public void checkSelfCertReceivedLabel()
    {
        String selfCert = absPage.getSick_TabSelfCertReceivedDateLabel();
        Assert.assertEquals( "Self Cert Received",selfCert );
    } */

    //ReturnToWorkReceivedLabel
    @Test
    public void checkReturnToWorkReceivedLabel()
    {
        String retToWork = absPage.getSick_TabReturnToWorkReceivedLabel();
        Assert.assertEquals( "Return To Work Received", retToWork );
    }

    //SicknessStageLabel
    @Test
    public void checkSicknessStageLabel()
    {
        String sickStageLab = absPage.getSick_TabSicknessStageDropDownLabel();
        Assert.assertEquals( "Sickness Stage", sickStageLab );
    }


    //SicknessStageDocumentationReceivedLabel
    @Test
    public void checkSickStageDocReceivedLabel()
    {
        String sickStageDocRec = absPage.getSick_TabSicknessStageDocReceivedFieldLabel();
        Assert.assertEquals( "Sickness Stage Documentation Received", sickStageDocRec );
    }

    //OccHealthReferralRequiredToggleLabel
    @Test
    public void checkOccHealthToggleLabel()
    {
        String occHealthToggle = absPage.getSick_SickTabOccHealthToggleLabel();
        Assert.assertEquals( "Occ Health Referral Required", occHealthToggle );
    }

    //CommentsBoxLabel
    @Test
    public void checkCommentsBoxLabel()
    {
        String commentsBox = absPage.getSick_SickTabCommentsBoxLabel();
        Assert.assertEquals( "Comments",commentsBox );
    }
    //RemoveButtonLabel
    @Test
    public void checkRemoveButtonLabel()
    {
        String removeButt = absPage.getSick_SickTabRemoveButtonLabel();
        Assert.assertEquals( "Remove",removeButt );
    }

    /*HistoryButtonLabel - can not test this due to formBuilder autoElements and nested tag system
    @Test
    public void checkHistoryButtonLabel()
    {
        String hist = absPage.getSick_SickTabHistoryButtonLabel();
        Assert.assertEquals( "History", hist );
    }

    */






}
