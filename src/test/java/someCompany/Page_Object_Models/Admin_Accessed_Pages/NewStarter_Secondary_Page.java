package someCompany.Page_Object_Models.Admin_Accessed_Pages;

import org.openqa.selenium.WebDriver;

public class NewStarter_Secondary_Page
{
    //local variable object
    protected static WebDriver driver;

    //create this class as an object and pass webdriver object arguments to it
    public NewStarter_Secondary_Page(WebDriver driver)
    {
        NewStarter_Secondary_Page.driver = driver;
    }


}
