package someCompany.Page_Object_Models.Admin_Accessed_Pages;

/*
Author: G.Phillips
Date: 31/05/2018
Purpose:  Page model that contains all elements on the hamburger menu, each field is set up using the By class (JUnit) - xPath has been chose as the locator
however this can be changed by the automation coder if required, as xPath is not 100% reliable over different DOMS - please consider use of class names or IDs.
Due to an automated form builder being used, we currently have to use xPath in most cases.

PLEASE NOTE THIS CLASS IS INCOMPLETE

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HamburgerMenu
{
    //local variable object
    protected static WebDriver driver;

    //set up the By class to find the named elements on the loginPage
    By hamburgerMenuMain = By.xpath( "//i[@class='sidebar icon sidebar-button big']" );

    By hamburgerUserDisplayName = By.xpath( "//div[@class='menu-header']//h3" );
    By hamburgerPeopleSectionHeaderLabel = By.xpath("//h4[contains(text(),'People')]");
    By hamburgerHomeMenuButtonLabel = By.xpath( "//html//div[@class='ui left vertical menu sidebar uncover visible']/a[1]" );
    By hamburgerHomeMenuButton = By.xpath( "/html[1]/body[1]/div[1]/a[1]/i[1]" );
    By hamburgerAdminSectionHeaderLabel = By.xpath( "//h4[contains(text(),'Admin')]" );
    By hamburgerAdminPeopleLinkLabel = By.xpath( "//html//div[@class='ui accordion']//a[1]" );
    By hamburgerAdminPeopleLink = By.xpath( "THIS NEEDS A VALUE TO CLICK" );
    By hamburgerAdminRolesLinkLabel = By.xpath( "//html//div[@class='ui accordion']//a[2]" );
    By hamburgerAdminSectionRolesLink = By.xpath( "//html//div[@class='ui accordion']//a[2]" );
    By hamburgerAdminNewStarterLinkLabel = By.xpath( "/html[1]/body[1]/div[1]/div[3]/div[2]/a[3]" );
    By hamburgerAdminNewStarterLink = By.xpath( "//html//a[3]" );
    By hamburgerSettingsHeaderLabel = By.xpath( "//html//div[4]/h4[1]" );
    By hamburgerSettingsLogOutLink = By.xpath( "//html//div[@class='ui left vertical menu sidebar uncover visible']/a[2]" );
    By hamburgerSettingsLogOutLinkLabel = By.xpath( "//*[contains(text(), 'Logout')]" );

    public HamburgerMenu(WebDriver driver)
    {
        HamburgerMenu.driver = driver;
    }

    //start of all the Get label value methods
    //method to GET the logged in user label (depends on which user has been logged in via the User_Login_Levels test)
    public String getUserLoggedInValue()
    {
        String loggedInUserText = driver.findElement( hamburgerUserDisplayName ).getText();
        return loggedInUserText;
    }

    //method to GET People section label value
    public String getPeopleSectionLabelValue()
    {
        String peopleSectionLabel = driver.findElement( hamburgerPeopleSectionHeaderLabel ).getText();
        return peopleSectionLabel;
    }

    //method to GET the Home menu Label value
    public String getHomeMenuLabelValue()
    {
        String homemenu = driver.findElement( hamburgerHomeMenuButtonLabel ).getText();
        return homemenu;
    }

    //method to GET the Admin Section header label
    public String getAdminSectionHeaderValue()
    {
        String adminSectionHeader = driver.findElement( hamburgerAdminSectionHeaderLabel ).getText();
        return adminSectionHeader;

    }

    //method to GET the Admin section People label
    public String getAdminSectionPeopleLabel()
    {
        String adSecHead = driver.findElement( hamburgerAdminPeopleLinkLabel ).getText();
        return adSecHead;
    }

    //method to GET the Admin section Roles label
    public String getAdminSectionRolesLabel()
    {
        String adSectRolesLab = driver.findElement( hamburgerAdminRolesLinkLabel ).getText();
        return adSectRolesLab;
    }

    //method to GET the Admin section New Starter label
    public String getAdminSectionNewStarterLabel()
    {
        String newStartLabel = driver.findElement( hamburgerAdminNewStarterLinkLabel).getText();
        return newStartLabel;
    }

    //method to GET the Settings section header value
    public String getSettingsSectionHeaderVal()
    {
        String getVal = driver.findElement( hamburgerSettingsHeaderLabel ).getText();
        return getVal;
    }

    //method to GET the Settings section Logout label value
    public String getLogoutLabelValue()
    {
        String logLab = driver.findElement( hamburgerSettingsLogOutLinkLabel ).getText();
        return logLab;
    }

    //start of all methods that click something on the page

    //method to click the Hamburger Menu Button
    public void clickHamburgerMenu()
    {
       driver.findElement(hamburgerMenuMain).click();
    }


    //method to CLICK the Home menu link
    public void clickTheHomeMenuLink()
    {
        driver.findElement( hamburgerHomeMenuButton ).click();
    }


    //method to CLICK the AdminSection People link
    public void clickAdminSectionPeopleLink()
    {
        driver.findElement( hamburgerAdminPeopleLink ).click();
    }

    //method to CLICK the AdminSection Roles link
    public void clickAdminSectionRolesLink()
    {
        driver.findElement(hamburgerAdminSectionRolesLink).click();
    }

    //Method to CLICK the AdminSection New Starter link
    public void clickAdminSectionNewStarterLink()
    {
        driver.findElement( hamburgerAdminNewStarterLink ).click();
    }

    //method to CLICK the Settings section Logout link
    public void clickSettingsSectionLogoutLink()
    {
        driver.findElement( hamburgerSettingsLogOutLink ).click();
    }







}
