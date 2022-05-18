package page_objects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Login_SK extends BasePage {


   // private final By UserName_Input = By.xpath("//input[@name = 'company_user[username]']");
   private final By UserName_Input = By.name("ctl00$ContentPlaceHolder1$UsernameTextBox");
   // private final By Password_Input = By.xpath("//input[@name = 'company_user[password]']");

    private final By Password_Input = By.name("ctl00$ContentPlaceHolder1$PasswordTextBox");
   // private final By Login_Button = By.xpath("//a[text()='Login']");
    private final By Login_Button = By.name("ctl00$ContentPlaceHolder1$SubmitButton");
    private final By chk_All = By.xpath("//input[@id = 'checkAll']");


    public Login_SK(WebDriver driver) {
        super(driver);

    }

    public boolean insert_username(String username) {

        return sendKeysToElement(UserName_Input, username);
    }

    public boolean insert_password(String password) {
        return sendKeysToElement(Password_Input, password);
    }

    public boolean Login_Click() {
        return clickElement(Login_Button);
    }

    public boolean check_All()
    {
        return clickElement(chk_All);
    }



}
