package someCompany.Page_Object_Models.Admin_Accessed_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
Author: G.Phillips
Date: 31/05/2018
Purpose:  Page model that contains all elements on Manage People admin, each field is set up using the By class (JUnit) - xPath has been chose as the locator
however this can be changed by the automation coder if required, as xPath is not 100% reliable over different DOMS - please consider use of class names or IDs.
Due to an automated form builder being used, we currently have to use xPath in most cases.

*/

public class ManagePeople_Admin_Page
{
        //local variable object
        protected static WebDriver driver;

        public ManagePeople_Admin_Page(WebDriver driver)
        {
            ManagePeople_Admin_Page.driver = driver;
        }

        //pages, buttons, toggles and optionViews
        By newStarterButton = By.xpath( "//h5[contains(text(),'New Starter')]" );
        By searchMenuOptionButton = By.xpath( "//a[contains(text(),'Search')]" );
        By locationsMenuOptionButton = By.xpath( "//a[contains(text(),'Locations')]" );

        //field labels - typically used for checking labels have not changed
        By personIdFieldLabel = By.xpath( "//label[contains(text(),'Person ID')]" );
        By titleFieldLabel = By.xpath( "//label[contains(text(),'Title')]" );
        By firstNameFieldLabel = By.xpath( "//label[contains(text(),'First Name')]" );
        By surnameFieldLabel = By.xpath( "//label[contains(text(),'Surname')]" );
        By prevSurnameFieldLabel = By.xpath( "//label[contains(text(),'Previous Surname')]" );
        By knownAsFieldLabel = By.xpath( "//label[contains(text(),'Known As')]" );
        By niNumberFieldLabel = By.xpath( "//label[contains(text(),'NI Number')]" );
        By otherOptionsFieldLabel = By.xpath( "//h3[contains(text(),'Other Options')]" );
        By inactiveOnlyToggleLabel = By.xpath( "//div[@class='generated-form-element']//span//span//label[contains(text(),'Inactive')]" );
        //By leaversOnlyToggleLabel = By.xpath( "//label[contains(text(),'Leavers Only')]" );
        By showActiveToggleLabel = By.xpath( "//label[contains(text(),'Show Active')]" );
        By showLeaversToggleLabel = By.xpath( "//label[contains(text(),'Show Leavers')]" );
        By showInactiveToggleLabel = By.xpath( "//label[contains(text(),'Show Inactive')]" );

        By searchButtonLabel = By.xpath( "//*[starts-with(@class,'ui green button big')]");

        //probable error here with compound class name
        By searchButtonToClick = By.xpath( "//button[@class='ui green button big']" );

        By peopleAdminBannerText = By.xpath( "//h1[contains(text(),'People Admin')]" );

        //each page element's input field - used for interrogation tests
        By personIdTextField = By.xpath( "" );
        By titleTextField = By.xpath( "" );
        By firstNameTextField = By.xpath( "" );
        By surnameTextField = By.xpath( "" );
        By prevSurnameTetField = By.xpath( "" );
        By knownAsTextField = By.xpath("");
        By natInsNumbTextField = By.xpath( "" );
        //other fields need to be completed
        //need some mechanism to return or check for a return of people to this page, perhaps a check on anything being displayed, or the message returned if we have the api down

        //start list of methods to get label values and return them for Test method consume

        //get the person id field label
        public String checkPersonIdLabel()
        {
            String persId = driver.findElement(personIdFieldLabel).getText();
            return persId;
        }

        //get the title field label
        public String checkTitleFieldLabel()
        {
            String titField = driver.findElement( titleFieldLabel ).getText();
            return titField;
        }

        //get the firstname field label
        public String checkFirstNameFieldLabel()
        {
            String fName = driver.findElement( firstNameFieldLabel ).getText();
            return fName;
        }

        //get the surname field label
        public String checkSurnameFieldLabel()
        {
            String sName = driver.findElement( surnameFieldLabel ).getText();
            return sName;
        }

        //get the previous surname field label
        public String checkPrevSnameFieldLabel()
        {
            String prevSname = driver.findElement( prevSurnameFieldLabel ).getText();
            return prevSname;
        }

        //get the knownAs field label
        public String checkKnownAsFieldLabel()
        {
            String knownAs = driver.findElement( knownAsFieldLabel ).getText();
            return knownAs;
        }

        //get the natInsurance field label
        public String checkNatInsFieldLabel()
        {
            String ni = driver.findElement( niNumberFieldLabel ).getText();
            return ni;
        }

        //get the other options text value
        public String checkOtherOptionsText()
        {
            String otherOps = driver.findElement( otherOptionsFieldLabel ).getText();
            return otherOps;
        }

        //get the inactiveOnly toggle field label
        public String checkShowInActiveToggleText()
        {
            String inacToggle = driver.findElement( showInactiveToggleLabel ).getAttribute("innerText");
            return inacToggle;
        }

        public String checkShowActiveToggleText()
        {
            String showActive = driver.findElement( showActiveToggleLabel ).getAttribute( "innerText" );
            return showActive;
        }



        //get the leaversOnly toggle field label
        public String checkLeaverToggleFieldLabel()
        {
            String leaverToggleLabel = driver.findElement(showLeaversToggleLabel).getAttribute( "innerText" );
            return leaverToggleLabel;
        }

        //get the people admin banner text value
        public String checkPeopleAdminTextPresent()
        {
                String peepText = driver.findElement( peopleAdminBannerText ).getText();
                return peepText;
        }

        //get searchbutton txt
        public String checkSearchButtonTxt()
        {
            String searchButtTxt = driver.findElement( searchButtonLabel ).getText();
            return searchButtTxt;
        }

}
