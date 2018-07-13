package someCompany.Tests.Access_Tests;

/*
Author: Graeme Phillips
Date: 29/05/2018
Purpose: This is the class used to login as the system admin user.
 */

import someCompany.Application_URL_Helpers.ServerURL_HelperClassChoices;
import someCompany.Page_Object_Models.Login_Logout_Pages.Login_Logout_Page;
import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;

import java.util.concurrent.TimeUnit;

public class User_Login_Levels extends Browser_Choices_BaseClass
{
    Login_Logout_Page login = new Login_Logout_Page(driver);
    ServerURL_HelperClassChoices server = new ServerURL_HelperClassChoices(driver);

    public void gotoLoginPageAsSystemAdmin()
    {
        server.inputTestServerUrl(server.inputTestServerUrl("///////////" ));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        login.loginToVPeople( "master", "///////////" );
        login.clickOnLoginButton();
    }


}
