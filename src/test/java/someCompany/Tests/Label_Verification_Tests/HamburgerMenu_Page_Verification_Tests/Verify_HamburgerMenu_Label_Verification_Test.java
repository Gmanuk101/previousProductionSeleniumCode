package someCompany.Tests.Label_Verification_Tests.HamburgerMenu_Page_Verification_Tests;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import someCompany.Page_Object_Models.Admin_Accessed_Pages.HamburgerMenu;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;
import someCompany.Tests.Access_Tests.User_Login_Levels;

import java.util.concurrent.TimeUnit;

public class Verify_HamburgerMenu_Label_Verification_Test extends Browser_Choices_BaseClass
{

    User_Login_Levels masterLogin = new User_Login_Levels();
    HamburgerMenu menu = new HamburgerMenu( driver );

    @Before  //runs before each instance of @Test
    public  void masterLogin()//logs into system as master, then clicks hamburger menu

    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels
        menu.clickHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //start of the tests to check label values
    //check userName is as expected
    @Test
    public void checkMasteruserNameAsExpected()
    {
        String username = menu.getUserLoggedInValue();
        Assert.assertEquals( "master",username );
    }

    //check People section header label is correct
    @Test
    public void checkPeopleSectionHeader()
    {
        String peepSectHead = menu.getPeopleSectionLabelValue();
        Assert.assertEquals( "People",peepSectHead );
    }

    //check PeopleSection Home label is correct
    @Test
    public void checkPeopleSectionHomeLabel()
    {
        String home = menu.getHomeMenuLabelValue();
        Assert.assertEquals( "Home",home );
    }

    //check AdminSection header label is correct
    @Test
    public void checkAdminSectionHeader()
    {
        String adminSect = menu.getAdminSectionHeaderValue();
        Assert.assertEquals( "Admin*",adminSect );
    }

    //check AdminSection People label is correct
    @Test
    public void checkAdminSectPeopleLabel()
    {
        String peepLabel = menu.getAdminSectionPeopleLabel();
        Assert.assertEquals( "People",peepLabel );
    }

    //check AdminSection Roles label is correct
    @Test
    public void checkAdminSectRolesLabel()
    {
        String rolesLab = menu.getAdminSectionRolesLabel();
        Assert.assertEquals( "Roles", rolesLab );
    }

    //check AdminSection New Starter label is correct
    @Test
    public void checkAdminSectNewStarterLabel()
    {
        String newStart = menu.getAdminSectionNewStarterLabel();
        Assert.assertEquals( "New Starter", newStart );
    }

    //check Setting header label is correct
    @Test
    public void checkSettingsHeaderLabel()
    {
        String settings = menu.getSettingsSectionHeaderVal();
        Assert.assertEquals( "Settings", settings );
    }

    //check Logout link label is correct
    @Test
    public void checkLogOutLinkLabel()
    {
        String logout = menu.getLogoutLabelValue();
        Assert.assertEquals( "Logout", logout );
    }


}
