package navigation;

import org.openqa.selenium.WebDriver;

public class Navigator {
    //this class doesn't make tons of sense yet, it will once we expand our error-ing, custom logins, and reporting.
    private final WebDriver driver;

    public Navigator(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToGivenUrl(String url){
        try {
            driver.navigate().to(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
