package Testcases;

import Pages.BookDetailsPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class ClickOrder_ClickOrderFinish extends DriverSetup {
    LoginPage SignUp= new LoginPage();
    HomePage homepage=new HomePage();
    BookDetailsPage bookdetails=new BookDetailsPage();
    @BeforeMethod
    public void LoadAndLogin() {
        HomePage.loadHomePage();
        SignUp.navigateToLoginPage();
        SignUp.writeOnElement(SignUp.LoginUsername,"farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
        homepage.clickOnElement(homepage.ClickBook);
        homepage.clickOnElement(homepage.AnyBook);


    }

    @Test
    public void OrderBook(){
        bookdetails.clickOnElement(bookdetails.ClickOrder);
        bookdetails.clickOnElement(bookdetails.FinishOrder);
    }
}
