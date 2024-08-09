package Testcases;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class SelectAuthor extends DriverSetup {
 LoginPage SignUp= new LoginPage();
 HomePage homepage=new HomePage();
    @BeforeMethod
    public void LoadAndLoginSelectWriter() {
        HomePage.loadHomePage();
        SignUp.navigateToLoginPage();
        SignUp.writeOnElement(SignUp.LoginUsername,"farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
        SignUp.clickOnElement(homepage.WriterSelect);
    }

    @Test
    public void AuthorSelect(){
        SignUp.clickOnElement(homepage.AuthorSelect);
    }
}
