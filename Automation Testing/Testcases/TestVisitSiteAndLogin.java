package Testcases;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TestVisitSiteAndLogin extends DriverSetup {


    LoginPage SignUp = new LoginPage();


    @BeforeMethod
    public void LoginloadPage() {

        SignUp.navigateToLoginPage();
    }
    @Test
    public void RegisterWithValidCredentials(){
    SignUp.writeOnElement(SignUp.RegisterName,"Fara");
    SignUp.writeOnElement(SignUp.RegisterPhone,"01798178034");
    SignUp.writeOnElement(SignUp.RegisterEmail,"farihahoque1610@gmail.com");
    SignUp.writeOnElement(SignUp.Registerpassword,"Farihahoque123");
    SignUp.writeOnElement(SignUp.RegisterConfirmPassword,"Farihahoque123");
    SignUp.clickOnElement(SignUp.RegisterButton);
    }

    @Test
    public void TestLoginWithName(){
        SignUp.writeOnElement(SignUp.LoginUsername,"Fara");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
        Assert.assertEquals(SignUp.getElementText(SignUp.NameErrMsg), "Error: The username Fara is not registered on this site. If you are unsure of your username, try your email address instead.");

    }

    @Test
    public void TestLoginWithEmail(){
        SignUp.writeOnElement(SignUp.LoginUsername,"farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
    }

    @Test
    public void TestLoginWithWrongEmail(){
        SignUp.writeOnElement(SignUp.LoginUsername,"farihahoque10@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
        Assert.assertEquals(SignUp.getElementText(SignUp.EmailErrMsg), "Unknown email address. Check again or try your username.");
    }

    @Test
    public void TestLoginWithWrongPassword(){
        SignUp.writeOnElement(SignUp.LoginUsername,"farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farih123");
        SignUp.clickOnElement(SignUp.LoginButton);
        Assert.assertEquals(SignUp.getElementText(SignUp.PasswordErrMsg), "Error: The password you entered for the email address farihahoque1610@gmail.com is incorrect. Lost your password?");
    }





}
