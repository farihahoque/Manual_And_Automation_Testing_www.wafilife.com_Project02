package Testcases;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TestLogOut extends DriverSetup {
    LoginPage SignUp = new LoginPage();
    HomePage homepage = new HomePage();

    @BeforeMethod
    public void LoadAndLogin() {

        HomePage.loadHomePage();
        SignUp.navigateToLoginPage();
        SignUp.writeOnElement(SignUp.LoginUsername, "farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword, "Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
    }

    @Test
    public void LogOut() {
        SignUp.clickOnElement(SignUp.LogOut);
        Assert.assertTrue(SignUp.getDisplayStatus(SignUp.LoginButton));

    }

}
