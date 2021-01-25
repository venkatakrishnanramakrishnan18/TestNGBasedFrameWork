package main.java.pageEvents;

import main.java.pageObjects.HomePageObjects;
import main.java.pageObjects.LoginPageObjects;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class LoginPageEvents {
    public void amazonLoginScreenValidation() throws Exception{
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageObjects.loginText).size()>0,"Amazon");
    }

    public void enterEmailAddress(String emailId) throws Exception{
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID",LoginPageObjects.emailAddress).sendKeys(emailId);
        ///////elementFetch.getWebElement("ID",LoginPageObjects.emailAddress).
    }
}
