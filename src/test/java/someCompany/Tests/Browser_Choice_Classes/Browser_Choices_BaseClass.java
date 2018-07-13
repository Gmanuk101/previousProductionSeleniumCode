package someCompany.Tests.Browser_Choice_Classes;

/*Author: Graeme Phillips
Date: 29/05/2018
Purpose: This is the instantiation of a the driver base class, for the whole test suite we are, at the time of writing, using Chrome.
However should you wish to use other browsers simply invoke the methods listed in this class.
You must endure the correct environment drivers are installed prior to execution (Please refer to Selenium HQ documentation for further resource.

Summary
-------
A class that should be inherited and methods called to specify which WWW browser to use.
This class with instantiate a browser of choice, then quit the browser after each instance.

 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;

/*Author:  Graeme Phillips
Date: 31/05/2018
Purpose:  This class will allow the automator to instantiate a browser of their choosing
The automation expert must have the necessary Selenium Drivers installed on the envronment they are running tests on (Eg, local machine, server, cluster)
 */

public class Browser_Choices_BaseClass
{

    public static WebDriver driver;

     //change this BeforeClass annotated method to instantiate whichEver browser you wish, then make a call to each method as required.
     @BeforeClass
     public static void startChromeBrowser()
    {
       driver = new ChromeDriver();
    }

    //if you want to use fireFox as the driver, then change the annotation to have the @BeforeClass
    //you must have the marionette, ghecko or firefox drivers installed on your test environment prior to calling this method
    //in your test classes


    public static void startFireFoxBrowser()
    {
        System.setProperty( "webdriver.gecko.driver", "C:\\vPeople_Automation\\driver\\geckodriver.exe" );
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary( "C:\\Users\\graeme.phillips\\AppData\\Local\\Mozilla Firefox\\firefox.exe" );
        driver = new FirefoxDriver(options);
    }

    public static void startPhantonJS()
    {

    }

    //opera driver
    public static void startOperaBrowser()
    {
        driver = new OperaDriver();
    }

    //Edge Driver
    public static void startEdgeDriver()
    {
        driver = new EdgeDriver();
    }

    //IE driver
    public static void startInternetExplorerDriver()
    {
        driver = new InternetExplorerDriver();
    }

    //apple safari browser
    public static void startSafariBrowser()
    {
        driver = new SafariDriver();
    }

    //headless htmlUnitDriver

    public static void startHtmlUnitHeadlessDriver()
    {
        driver = new HtmlUnitDriver();
    }




   @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }



}
