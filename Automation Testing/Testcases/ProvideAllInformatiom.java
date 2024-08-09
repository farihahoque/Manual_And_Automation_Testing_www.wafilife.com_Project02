package Testcases;

import Pages.BookDetailsPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.time.Duration;

public class ProvideAllInformatiom extends DriverSetup {

    LoginPage SignUp = new LoginPage();
    HomePage homepage = new HomePage();
    BookDetailsPage bookdetails = new BookDetailsPage();
    CheckoutPage checkout=new CheckoutPage();
    @BeforeMethod
    public void LoadAndLogin() {
        HomePage.loadHomePage();
        SignUp.navigateToLoginPage();
        SignUp.writeOnElement(SignUp.LoginUsername, "farihahoque1610@gmail.com");
        SignUp.writeOnElement(SignUp.LoginPassword, "Farihahoque123");
        SignUp.clickOnElement(SignUp.LoginButton);
        homepage.clickOnElement(homepage.ClickBook);
        homepage.clickOnElement(homepage.AnyBook);
        bookdetails.clickOnElement(bookdetails.ClickOrder);
        bookdetails.clickOnElement(bookdetails.FinishOrder);
    }

    @Test
    public void Provide_All_Info_With_Bkash0rRocketORNogod(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement AreaSelect = wait.until(ExpectedConditions.elementToBeClickable(checkout.Area));
        Actions actions = new Actions(getDriver());
        Select select = new Select(AreaSelect);
        select.selectByVisibleText("মিরপুর-১");
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        checkout.clickOnElement(checkout.BkashPay);
        checkout.clickOnElement(checkout.RocketPay);
        checkout.clickOnElement(checkout.NagadPay);
        checkout.writeOnElement(checkout.Address,"block:E,Mirpur 1");
        actions.scrollByAmount(0, 300).build().perform();
        checkout.writeOnElement(checkout.OtherInfo,"Only deliver after 3 pm");
        checkout.clickOnElement(checkout.ShipToOffice);
        checkout.clickOnElement(checkout.GiftPaper);
    }

    @Test
    public void Provide_All_Info_With_Cardpay(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        WebElement AreaSelect = wait.until(ExpectedConditions.elementToBeClickable(checkout.Area));
        Actions actions = new Actions(getDriver());
        Select select = new Select(AreaSelect);
        select.selectByVisibleText("মিরপুর-১");
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        checkout.writeOnElement(checkout.Address,"block:E,Mirpur 1");
        actions.scrollByAmount(0, 300).build().perform();
        checkout.writeOnElement(checkout.OtherInfo,"Only deliver after 3 pm");
        checkout.clickOnElement(checkout.VisaAndMaster);
        checkout.clickOnElement(checkout.ShipToOffice);
        checkout.clickOnElement(checkout.GiftPaper);

    }
    @Test
    public void Provide_All_Info_SendToOtherAddress(){
        Actions actions = new Actions(getDriver());
        checkout.clickOnElement(checkout.NagadPay);
        actions.scrollByAmount(0, 600).build().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        checkout.clickOnElement(checkout.ShipToDifferentAddress);
        checkout.writeOnElement(checkout.OtherAddressName,"Naba");
        checkout.writeOnElement(checkout.Otherphone,"02125678934");
        checkout.writeOnElement(checkout.AlternativePhone,"023452138945");
        WebElement AreaSelect = wait.until(ExpectedConditions.elementToBeClickable(checkout.AltArea));
        Select select = new Select(AreaSelect);
        select.selectByVisibleText("মিরপুর-১");
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();




    }




}
