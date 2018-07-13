package someCompany.Tests.Label_Verification_Tests.Absence_Page_Verification_Tests;

/*
Author:  Graeme Phillips
Date: 05/06/2018
Purpose:  This test will check all the static text and labels on the Absence >> FitNote tab page only.  It does not pass values to the form nor interrogate
it other than getting label values

 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Page_Object_Models.User_Accessed_Tabbed_Pages.Absence_Page.Absence_FitNotesTAB_Page;
import someCompany.Tests.Access_Tests.User_Login_Levels;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

import java.util.concurrent.TimeUnit;

public class Verify_AbsPage_FitNoteTab_Label_Verification_Test extends Browser_Choices_BaseClass
{
    User_Login_Levels masterLogin = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements(driver);
    Absence_FitNotesTAB_Page fitNote = new Absence_FitNotesTAB_Page( driver );

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
        fitNote.clickFitNotesTab();
        //wait until elements load
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void checkFitNoteSectionHeader()
    {
        String test = fitNote.getFitNotesSectionTextLabel();
        Assert.assertEquals( "Fit Notes", test );
    }

    //fitnote save section button
    @Test
    public void checkFitNoteSaveSectionButtonLabel()
    {
        String saveLabel = fitNote.getSaveSectionButtonLabel();
        Assert.assertEquals( "Save Section",saveLabel );
    }

    @Test   //fitnote add button
    public void checkFitNoteAddButtonLabel()
    {
        String addLabel = fitNote.getAddButtonLabel();
        Assert.assertEquals( "Add",addLabel );
    }

    @Test //fitnote start date label
    public void checkFitNoteStartDateLabel()
    {
        String startDateLabel = fitNote.getFitNoteStartDateLabel();
        Assert.assertEquals( "Fit Note Start Date",startDateLabel );
    }

    //fitnote end date label
    @Test
    public void checkFitNoteEndDateLabel()
    {
        String endLabel = fitNote.getFitNoteEndDateLabel();
        Assert.assertEquals( "Fit Note End Date", endLabel );
    }

    @Test  //fitnote sickness episodes label
    public void checkFitNoteSickenessEpisodesLabel()
    {
        String sicknessEp = fitNote.getFitNoteSicknessEpisodesLabel();
        Assert.assertEquals( "Sickness Episodes", sicknessEp );
    }

    @Test //fitnote remove button
    public void checkFitNoteRemoveButtonLabel()
    {
        String removeButt = fitNote.getRemoveButtonLabel();
        Assert.assertEquals( "Remove", removeButt );
    }

    @Test //fitnote history button
    public void checkFitNoteHistoryButtonLabel()
    {
        String hisButtLabel = fitNote.getHistoryButtonLabel();
        Assert.assertEquals( "History", hisButtLabel );
    }




}
