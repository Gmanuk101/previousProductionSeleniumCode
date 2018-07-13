package someCompany.Tests.API_Elements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Page_Object_Models.Homescreen_Access_Pages.DashBoard_Page;
import someCompany.Page_Object_Models.Static_Multi_Page_Elements_API.Static_Api_Generated_Main_Page_Elements;
import someCompany.Tests.Access_Tests.User_Login_Levels;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

/*
Author: Graeme Phillips
Date: 04/06/2018
Purpose: to test all the elements on a person's main page are present, if they are not present then the API is down and the test will fail
Note: this test will verify all the labels on the screen, it will NOT click them and check they are working
 */

public class Api_Elements_Main_Persons_Page_Test extends Browser_Choices_BaseClass
{
    //which classes do we need are constructed here
    User_Login_Levels login = new User_Login_Levels();
    DashBoard_Page dash = new DashBoard_Page( driver );
    Static_Api_Generated_Main_Page_Elements stat = new Static_Api_Generated_Main_Page_Elements( driver );


    //login, click ManagePeople, then start checking the label values
    @Before
    public void gotoPersonMainPage()
    {
        login.gotoLoginPageAsSystemAdmin();
        dash.clickManagePeopleButton();
        stat.clickPersonFromSearch();
    }

    //now tests to check each label
    @Test
    public void getPersProfileButtLabel()
    {
        String persB = stat.getPersonalProfileButtonLabel();
        Assert.assertEquals( "Personal Profile",persB );
    }

    @Test
    public void getHealthWellBeingButtLabel()
    {
        String healthW = stat.getHealthAndWellBeingButtonLabel();
        Assert.assertEquals( "Health & Wellbeing",healthW );
    }

    @Test
    public void getPayrollInformationButtLabel()
    {
        String payR = stat.getPayrollInformationButtonLabel();
        Assert.assertEquals( "Payroll Information", payR );
    }

    @Test
    public void getComplianceButtLabel()
    {
        String comp = stat.getComplianceButtonLabel();
        Assert.assertEquals( "Compliance",comp );
    }

    @Test
    public void getRolesButtonLabel()
    {
        String roles = stat.getRolesButtonLabel();
        Assert.assertEquals( "Roles", roles);
    }

    @Test
    public void getGeneralTermsButtLabel()
    {
        String gen = stat.getGeneralTermsCondButtonLabel();
    }

    @Test
    public void getPersDevButtLabel()
    {
        String persDev = stat.getPersDevButtonLabel();
        Assert.assertEquals( "Personal Development",persDev );
    }

    @Test
    public void getAbsenceButtLabel()
    {
        String abs = stat.getAbsenceButtonLabel();
        Assert.assertEquals( "Absence", abs );
    }

    @Test
    public void getTrainingButtLabl()
    {
        String train = stat.getTrainingButtonLabel();
        Assert.assertEquals( "Training", train);
    }

    @Test
    public void getEmployeeRelButtLabel()
    {
        String empRel = stat.getEmpRelationsButtonLabel();
        Assert.assertEquals( "Employee Relations", empRel );
    }

    @Test
    public void getUserAccButtLabel()
    {
        String userAcc = stat.getUserAccessButtonLabel();
        Assert.assertEquals( "User Access", userAcc );
    }

    @Test
    public void getExitButtLabel()
    {
        String exitButt = stat.getExitButtonLabel();
        Assert.assertEquals( "Exit", exitButt );
    }
}
