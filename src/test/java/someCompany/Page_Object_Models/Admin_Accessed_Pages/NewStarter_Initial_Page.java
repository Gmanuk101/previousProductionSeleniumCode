package someCompany.Page_Object_Models.Admin_Accessed_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
Author: G.Phillips
Date: 31/05/2018
Purpose:  Page model that contains all elements on New Starter admin page, each field is set up using the By class (JUnit) - xPath has been chose as the locator
however this can be changed by the automation coder if required, as xPath is not 100% reliable over different DOMS - please consider use of class names or IDs.
Due to an automated form builder being used, we currently have to use xPath in most cases.

*/

public class NewStarter_Initial_Page
{
    //create local webdriver instance
    //local variable object
    protected static WebDriver driver;

    //create this class as an object and pass webdriver object arguments to it
    public NewStarter_Initial_Page(WebDriver driver)
    {
        NewStarter_Initial_Page.driver = driver;
    }

    //title dropDown field elements
    By titleFieldLabel = By.xpath( "//label[contains(text(),'Title')]" );
    By titleDropDownValues = new By.ByXPath( "" );


    //firstname field elements
    By foreNameFieldLabel = By.xpath( "//label[contains(text(),'Forename*')]" );
    By foreNameTextFieldUserEntry = By.xpath( "" );

    //surname field elements
    By surnameFieldLabel = By.xpath( "//label[contains(text(),'Surname*')]" );
    By surnameTextFieldUserEntry = By.xpath( "" );

    //date of birth calendar and manual data entry elements
    By dateOfBirthFieldLabel = By.xpath( "//label[contains(text(),'DOB*')]" );
    By dateOfBirthCalendarDatePicker = By.xpath( "" );
    By dateOfBirthFieldManualEntryUserText = By.xpath( "" );
    By dateOfBirthField_ClearButtonFunction = By.xpath( "" );

    //NI number field elements
    By nationalInsuranceNumberFieldLabel = By.xpath( "//label[contains(text(),'NI Number*')]" );
    By nationalInsuranceNumberAlphaNumericFieldEntry = By.xpath( "" );

    //Gender dropDown elements
    By genderFieldLabel = By.xpath( "//label[contains(text(),'Gender')]" );
    //check the Select class instances in each of the below elemets as we may have to use WebElement<List> for any nested DIV classes
    By genderFieldDropDown = new By.ByXPath( "" );

    //marital status field elements
    By maritalStatusFieldLabel = By.xpath( "//label[contains(text(),'Marital Status')]" );
    By maritalStatusFieldDropDown = new By.ByXPath( "" );


    //create new starter button
    By createNewStarterButtonLabel = By.xpath("//button[@id='submit-btn']" );
    By createNewStarterButtonClick = By.xpath("");

    //new field added 07/06/2018 - Payment Provider
    By paymentProviderDropDownLabel = By.xpath( "//label[contains(text(),'Payment Provider*')]" );
    By paymentProviderDropDownClickable = By.xpath( "//div[@class='ui fluid search selection dropdown upward']//i[@class='dropdown icon']" );


    //In this page object model I have decided to write methods that return the label's value 1st

    public  String getPayProviderLabel()
    {
        String pay = driver.findElement( paymentProviderDropDownLabel ).getAttribute( "innerText" );
        return pay;
    }

    public void clickPaymentProvDropMenu()
    {
        driver.findElement( paymentProviderDropDownClickable ).click();
    }

    //get the titleFieldName
    public String checkTitleFieldName()
    {
        String titleFieldName = driver.findElement(titleFieldLabel).getText();
        return  titleFieldName;
    }

    //get the FirstName field label
    public String checkFirstNameLabel()
    {
        String firstNameLabel = driver.findElement( foreNameFieldLabel ).getText();
        return  firstNameLabel;
    }

    //check the surname field label
    public String checkSurnameLabel()
    {
        String surnameLabel = driver.findElement(surnameFieldLabel).getText();
        return surnameLabel;
    }

    //check the dob field label
    public String checkDateOfBirthFieldLabel()
    {
        String dateOfBirthLabel = driver.findElement(dateOfBirthFieldLabel ).getText();
        return dateOfBirthLabel;
    }

    public String checkNatInsFieldLabel()
    {
        String natHealthLabel = driver.findElement( nationalInsuranceNumberFieldLabel ).getText();
        return natHealthLabel;
    }

    //check Gender Label
    public String checkGenderFieldLabel()
    {
        String genderLabel = driver.findElement( genderFieldLabel).getText();
        return genderLabel;
    }

    //get the marital status field label
    public String checkMaritalStatusFieldLabel()
    {
        String maritalStatusLabel = driver.findElement( maritalStatusFieldLabel ).getText();
        return maritalStatusLabel;
    }

    //check the create new starter button label
    public String getCreateNewStarterButtonLabel()
    {
        String createNewStarterButtLabel = driver.findElement( createNewStarterButtonLabel ).getText();
        return createNewStarterButtLabel;
    }


    /*below this point are incomplete methods that need completion - these will be used in a set of Interrogation tests



    //get the titleField dropDown and click it
    public void checkTitleFieldEntry()
    {
        //this method is incomplete - 30/05/2018
        driver.findElement(titleDropDownValues).click();
    }



    //take user entry in the test and insert into firstname field
    public void checkTextCanBeEnteredToFirstNameField(String fName)
    {
        //this method needs completing 30/05/2018
        driver.findElement(firstNameTextFieldUserEntry).sendKeys(fName);
    }




    public void checkTextCanBeEnteredToSurnameNameField(String sName)
    {
        //this method needs completing 30/05/2018
        driver.findElement(surnameTextFieldUserEntry).sendKeys(sName);
    }


    //checkDobFieldCanBeClicked
    public void dateOfBirthFieldCanBeSelected()
    { driver.findElement( dateOfBirthCalendarDatePicker ).click();
    }

    //check the dateOfBirthField can have some entry by user
    public void enterManualDateIntoDateOfBirthField(String dateOfBirthManualTextEntry)
    {
        driver.findElement(dateOfBirthFieldManualEntryUserText).sendKeys( dateOfBirthManualTextEntry );
    }

    //clicking the DOB field "clear' button
    public void checkDobButtonCanBeClicked()
    { driver.findElement( dateOfBirthField_ClearButtonFunction ).click();
    }



    //get the gender dropdown
    public void checkGenderDropdown()
    {
        driver.findElement(genderFieldDropDown).click();
    }



    //click the marital status dropdown menu
    public void getMaritalStatusDropDownVals()
    {
        driver.findElement( maritalStatusFieldDropDown ).click();
    }



    //get the new starter button and click is
    public void clickNewStarterButton()
    {
        driver.findElement( createNewStarterButtonClick ).click();
    }


    END BLOCK COMMENTS HERE      */


}