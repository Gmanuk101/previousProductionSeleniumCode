package someCompany.Tests.Access_Tests;



import someCompany.Page_Object_Models.Login_Logout_Pages.Login_Logout_Page;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;
/*Author:  Graeme Phillips
Date: 31/05/2018
Purpose:  This test will verifiy the login on the People Admin page.

At the time of writing it is incomplete and should have a negative test case to account for failed log ins
 */


public class Verify_Login_Logout_Test extends Browser_Choices_BaseClass
{

    User_Login_Levels masterLogin = new User_Login_Levels();
    Login_Logout_Page login = new Login_Logout_Page(driver);
    //ServerURL_HelperClassChoices server = new ServerURL_HelperClassChoices(driver);

    @Before  //runs before each instance of @Test
    public  void masterLogin()
    {
        masterLogin.gotoLoginPageAsSystemAdmin(); //we goto the login page, login and every method after this will check button labels
    }


    @Test  //this test navigates to test server, and logs in a the master sys admin user
    public void verifyValidLogin()
    {

        //need to add the assertion that userIsOn the main home screen
        String homePage = driver.getCurrentUrl();
        Assert.assertEquals( "http:////OBFUSTICATED/index.php/Person/",homePage );

    }

    @Test
    public void verifyValidLogOut()
    {
        login.clickLogOutButton();
        String logoutPage = driver.getCurrentUrl();
        Assert.assertEquals( "OBFUSTICATED",logoutPage );
    }



}
