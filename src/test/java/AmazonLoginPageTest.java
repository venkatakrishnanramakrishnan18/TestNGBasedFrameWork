package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;

public class AmazonLoginPageTest extends BaseTest{
    public void enteringEmailAddress() throws Exception{
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.amazonHomeScreenValidation();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.amazonLoginScreenValidation();
        loginPageEvents.enterEmailAddress("vkr@vkr.com");
    }
}
