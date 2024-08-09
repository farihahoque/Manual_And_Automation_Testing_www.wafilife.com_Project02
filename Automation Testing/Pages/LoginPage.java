package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class LoginPage extends BasePage {

    public By RegisterName=By.xpath("//input[@id='reg_billing_first_name']");
    public By RegisterPhone=By.xpath("//input[@id='reg_billing_phone']");
    public By RegisterEmail=By.xpath("//input[@id='reg_email']");
    public By Registerpassword =By.xpath("//input[@id='reg_password']");
    public By RegisterConfirmPassword=By.xpath("//input[@id='reg_confirm_password']");
    public By RegisterButton=By.xpath("//input[@name='register']");
    public By LoginUsername= By.xpath("//input[@id='username']");
    public By LoginPassword=By.xpath("//input[@id='password']");
    public By LoginButton=By.xpath("//input[@name='login']");
    public By NameErrMsg=By.xpath("//li[contains(text(),'The username')]");
    public By EmailErrMsg=By.xpath("//li[contains(text(),'Unknown email address. Check again or try your use')]");
    public By PasswordErrMsg=By.xpath("//li[contains(text(),'The password you entered for the email address')]");
    public By LogOut=By.xpath("//a[contains(text(),'লগ অউট করুন')]");
   HomePage homePage= new HomePage();

    public void navigateToLoginPage(){
        homePage.loadHomePage();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage.loginorReg)).click();

    }

}
