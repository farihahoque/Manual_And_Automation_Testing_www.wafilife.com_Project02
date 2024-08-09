package Testcases;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.time.Duration;

public class SelectWriter_Scroll_GotoNextPage extends DriverSetup {

    HomePage homePage = new HomePage();
    LoginPage SignUp=new LoginPage();

    @BeforeMethod
    public void LoadAndLogin() {

        HomePage.loadHomePage();
        SignUp.navigateToLoginPage();
        SignUp.writeOnElement(SignUp.LoginUsername,"farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword,"Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
    }

    @Test
    public void GotoWriter() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.WriterSelect)).click();
        //Scroll and go to next page
        Actions actions=new Actions(getDriver());
        actions.scrollByAmount(0, 1000).build().perform();
        //No next page
    }

}
