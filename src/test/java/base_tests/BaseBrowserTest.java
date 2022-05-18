package base_tests;

import navigation.Navigator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import page_objects.login.*;
import page_objects.entrata_page_objects.universal_modals.DelinquencyNoticeWindow;
import webdriver_builder.WebDriverBuilder;

import static org.junit.Assert.assertTrue;

public class BaseBrowserTest {
    public WebDriver driver;
    String loginUrl;
    String loginCreds;
    String username;
    String password;

    public BaseBrowserTest(String client) {
        loginUrl = "https://" + client + System.getProperty("login.url");
        loginCreds = "entrata";
       // loginCreds = "CLIENTADMIN";
    }

    public BaseBrowserTest(String client, SitesEnum site, String username, String password) {
        switch (site) {
            case CLIENTADMIN: {
                loginUrl = "https://" + client + System.getProperty("login.url");
                loginCreds = "ca";
                this.username = username;
                //Added System.getProperty in CA usage as it will not change.
                this.password = System.getProperty("clientadmin.login.password");
                break;
            }
            case RESIDENTPORTAL: {
                loginUrl = "https://" + client + System.getProperty("resident.url");
                loginCreds = "resPortal";
                this.username = username;
                this.password = password;
                break;
            }
            case PROSPECTPORTAL: {
                loginUrl = "https://" + client + System.getProperty("prospect.url");
                loginCreds = "prosPortal";
                this.username = username;
                this.password = password;
                break;
            }
            case ENTRATA: {
                loginUrl = "https://" + client + System.getProperty("login.url");
                loginCreds = "ent";
                this.username = username;
                this.password = password;
                break;
            }
            case DEPLOYADMIN: {
                loginUrl = "https://" + client + System.getProperty("login.url");
                loginCreds = "da";
                this.username = username;
                this.password = password;
                break;
            }
        }
    }

        @Before
        public void driverSetup() {
            WebDriverBuilder wdb = new WebDriverBuilder();
            driver = wdb.getDriver();
            Navigator nav = new Navigator(driver);
            nav.navigateToGivenUrl(loginUrl);

            switch (loginCreds) {
                case "entrata":
                    EntrataLoginPage loginPage = new EntrataLoginPage(driver);
                    DelinquencyNoticeWindow del = new DelinquencyNoticeWindow(driver);
                    assertTrue("Unable to enter Username on Entrata Login Page!",
                            loginPage.enterEntrataUsername(System.getProperty("login.username")));
                    assertTrue("Unable to enter Password on Entrata Login Page!",
                            loginPage.enterEntrataPassword(System.getProperty("entrata.login.password")));
                    assertTrue("Unable to click Login button on Entrata Login Page!",
                            loginPage.clickLoginButton());
                    assertTrue("Unable to click close on Delinquency Notice Window",
                            del.confirmDelinquencyNoticeWindow());
                    break;
                case "ca":
                    ClientAdminLoginPage loginToClientAdmin = new ClientAdminLoginPage(driver);
                    assertTrue("Unable to enter Username on ClientAdmin Login Page!",
                            loginToClientAdmin.enterClientAdminUsername(username));
                    assertTrue("Unable to enter Password on ClientAdmin Login Page!",
                            loginToClientAdmin.enterClientAdminPassword(password));
                    assertTrue("Unable to click Login button on ClientAdmin Login Page!",
                            loginToClientAdmin.pressEnterOnPassword());
                    break;
                case "resPortal":
                    ResidentPortalLoginPage resPortalLogin = new ResidentPortalLoginPage(driver);
                    assertTrue("Unable to enter Username on Resident Portal Login Page!",
                            resPortalLogin.enterEmailToResidentLogin(username));
                    assertTrue("Unable to enter Password on Resident Portal Login Page!",
                            resPortalLogin.enterPasswordToResidentLogin(password));
                    assertTrue("Unable to click Login button on Resident Portal Login Page!",
                            resPortalLogin.clickLogInButton());
                    break;
                case "prosPortal":
                    ProspectPortalLoginPage prosPortalLogin = new ProspectPortalLoginPage(driver);
                    assertTrue("Unable to enter Username on Prospect Portal Login Page!",
                            prosPortalLogin.enterUsername(username));
                    assertTrue("Unable to enter Password on Prospect Portal Login Page!",
                            prosPortalLogin.enterPassword(password));
                    assertTrue("Unable to click Login button on Prospect Portal Login Page!",
                            prosPortalLogin.clickLoginButton());
                    break;
                case "ent":
                    EntrataLoginPage entrataloginPage = new EntrataLoginPage(driver);
                    assertTrue("Unable to enter username on Entrata Login Page!",
                            entrataloginPage.enterEntrataUsername(username));
                    assertTrue("Unable to enter Password on Entrata Login Page!",
                            entrataloginPage.enterEntrataPassword(password));
                    assertTrue("Unable to click Login button on Entrata Login Page!",
                            entrataloginPage.clickLoginButton());
                    break;
                case "da":
                    DeployAdminLoginPage deployAdminLogin = new DeployAdminLoginPage(driver);
                    assertTrue("Unable to enter username on DeployAdmin login page!",
                            deployAdminLogin.enterUsernameInTextField(username));
                    assertTrue("Unable to enter password on DeployAdmin login page!",
                            deployAdminLogin.enterPasswordInTextField(password));
                    assertTrue("Unable to click login button on DeployAdmin login page!",
                            deployAdminLogin.clickLoginButton());
                    break;
            }
        }

       /* @After
        public void driverCleanup () {
            driver.quit();
        }*/
    }


