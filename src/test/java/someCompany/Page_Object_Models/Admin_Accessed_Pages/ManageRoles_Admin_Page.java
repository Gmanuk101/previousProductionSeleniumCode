package someCompany.Page_Object_Models.Admin_Accessed_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/*
Author: G.Phillips
Date: 31/05/2018
Purpose:  Page model that contains all elements on Manage Roles admin, each field is set up using the By class (JUnit) - xPath has been chose as the locator
however this can be changed by the automation coder if required, as xPath is not 100% reliable over different DOMS - please consider use of class names or IDs.
Due to an automated form builder being used, we currently have to use xPath in most cases.

*/

public class ManageRoles_Admin_Page
{
    //local variable object
    protected static WebDriver driver;

    public ManageRoles_Admin_Page(WebDriver driver)
    {
        ManageRoles_Admin_Page.driver = driver;
    }

    //set up page label variables

    //main Head Text
    By mainBannerTxt = By.xpath( "//h1[contains(text(),'Roles Admin')]" );

    //main banner sub Text
    By mainBannerSubTxt = By.xpath("//p[contains(text(),'Add new roles, and edit existing roles from here')]");

    //newRoleButtonLabel
    By newRoleButtonLabel = By.xpath( "//a[@class='ui button green large']" );

    //Search header text
    By searchHeaderText = By.xpath( "//h3[contains(text(),'Search')]" );

    //Search subText
    By searchSubText = By.xpath( "//footer[contains(text(),'Select some search terms then click search.')]" );

    //Role Name field label
    By roleNameLabel = By.xpath( "//label[contains(text(),'Role Name')]" );

    //otherOptions header
    By otherOptionsHeader = By.xpath("//h3[contains(text(),'Other Options')]");

    //Line Managers text
    By lineManagersText = By.xpath( "//footer[contains(text(),'Line Managers')]" );  //this is the Line Managers text that sits below the Other Options header text

    //LineManagerOnly toggle label
    By lineManagerOnlyToggle = By.xpath( "//label[contains(text(),'Line Manager Only')]" );

    //searchButtonText
    By searchButtonText = By.xpath("//button[@class='ui green button big']");

    //set up clickable element & text entry variables

    //New Role clickable Button
    By newRoleClickableButton = By.xpath( "//a[@class='ui button green large']" );

    //Role Name field text entry
    By roleNameFieldTextEntry = By.xpath( "//div[@class='ui input']//input" );

    //Line Manager Only clickable toggle
    By lineManagerOnlyToggleSwitch = By.xpath( "//input[@type='checkbox']" );

    //Search button clickable
    By searchButtonClickable = By.xpath( "//button[@class='ui green button big']" );

    //The Search bar (this contains numbers 1 - 16 for first page)
    By searchBarNumberList = By.xpath( "//div[@class='search-bar']" );

    //the role despatcher will always be present?
    By roleDespatcherValueReturned = By.xpath( "//h4[contains(text(),'Despatcher')]" );

    //now we have the methods to return label values
    //get the new role button value
    public String getNewRoleButtonLabel()
    {
        String newRoleLabel = driver.findElement(newRoleButtonLabel  ).getText();
        return newRoleLabel;
    }

    //get the search header text
    public String getSearchHeaderText()
    {
        String searchHeadTxt = driver.findElement( searchHeaderText ).getText();
        return searchHeadTxt;
    }

    //get the search header's subText
    public String getSearchSubText()
    {
        String searchSubTxt = driver.findElement( searchSubText ).getText();
        return searchSubTxt;
    }

    //get the role field name label
    public String getRoleNameLabel()
    {
        String roleNameLab = driver.findElement( roleNameLabel ).getText();
        return roleNameLab;
    }

    //get the otherOptionsHeader text
    public String getOtherOptionsHeader()
    {
        String getOtherOptions = driver.findElement( otherOptionsHeader ).getText();
        return getOtherOptions;
    }

    //get the Lne Managers txt value that is held beneath Other Options Header Txt
    public String getLineManagersText()
    {
        String getLineManagersTextValue = driver.findElement( lineManagersText ).getText();
        return getLineManagersTextValue;
    }

    //get the line manager toggle label value
    public String getLineManagerOnlyToggle()
    {
        String lineManToggleTxt = driver.findElement( lineManagerOnlyToggle ).getText();
        return lineManToggleTxt;
    }

    //search button label
    public String getSearchButtonText()
    {
        String searchButtTxt = driver.findElement( searchButtonText ).getText();
        return searchButtTxt;
    }

    //now for the clickable and txt entry elements on the page
    //new role button
    public void clicknNewRoleClickableButton()
    {
        driver.findElement(newRoleClickableButton).click();
    }

    //Role Name txt entry field
    public void enterRoleNameTxtSearch(String searchEntryByUser)
    {
        driver.findElement(roleNameFieldTextEntry).sendKeys(searchEntryByUser);
    }

    //line manager only toggle switch click
    public void clickTheLineManagerOnlyToggle()
    {
        driver.findElement( lineManagerOnlyToggleSwitch ).click();
    }

    //clicking the Search button
    public void clickTheSearchButton()
    {
        driver.findElement(searchButtonClickable).click();
    }

    //checking the search bar is returned - if the API is down this will NOT be returned
    public Boolean checkSearchBarNumberListPresent()
    {
        boolean searchBar = driver.findElement( searchBarNumberList ).isDisplayed();
        return searchBar;
    }

    //check the despatcher role is present on page
    public String getDespatcherRoleTxt()
    {
        String despatcher = driver.findElement( roleDespatcherValueReturned ).getText();
        return despatcher;
    }

    public String getPageBannerTxt()
    {
        String bannerTxt = driver.findElement( mainBannerTxt ).getText();
        return bannerTxt;
    }

    public String getManHeadSubTxt()
    {
        String sub = driver.findElement( mainBannerSubTxt ).getText();
        return sub;
    }
}
