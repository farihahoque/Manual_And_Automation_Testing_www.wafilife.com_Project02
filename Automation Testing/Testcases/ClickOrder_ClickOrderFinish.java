package Testcases;

import Pages.BookDetailsPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.elementToBeClickable(bookdetails.ClickOrder)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bookdetails.FinishOrder)).click();
     
    }
}
