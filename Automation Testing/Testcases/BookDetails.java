package Testcases;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;


public class BookDetails extends DriverSetup {
    LoginPage SignUp= new LoginPage();
    HomePage homepage=new HomePage();
    @BeforeMethod
    public void LoadAndLogin() {
        HomePage.loadHomePage();
        SignUp.navigateToLoginPage();
        SignUp.writeOnElement(SignUp.LoginUsername,"farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);

    }

    @Test
    public void ViewBookDetails(){

        homepage.clickOnElement(homepage.ClickBook);
        homepage.clickOnElement(homepage.AnyBook);
        homepage.getDisplayStatus(homepage.ReadBook);
    }
}
