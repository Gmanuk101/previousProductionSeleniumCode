package someCompany.Application_URL_Helpers;


import someCompany.Tests.Browser_Choice_Classes.Browser_Choices_BaseClass;
import org.openqa.selenium.WebDriver;
/*
Author:G.Phillips
Date: 28/05/2018
Purpose: A class that permits instantiation of browsers and servers to be invoked should user wish
 */

public class ServerURL_HelperClassChoices extends Browser_Choices_BaseClass
{

    public ServerURL_HelperClassChoices(WebDriver driver)
    {
        Browser_Choices_BaseClass.driver =driver;
    }

    public String inputTestServerUrl(String testServer)
    {
        driver.navigate().to(testServer );
        return testServer;
    }

    public String inputUAT_ServerUrl(String uatServer)
    {
        driver.navigate().to(uatServer);
        return uatServer;
    }

    public String inputProductionUrl(String productionServer)
    {
        driver.navigate().to(productionServer);
        return productionServer;
    }





}


