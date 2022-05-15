package page_objects.entrata_page_objects.reports_tab;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.BasePage;

import java.io.File;
import java.time.Duration;

public class ReportsBasePage extends BasePage {
    //Variables:
    public static String innerText;
    public String numberOnly;

    //Constructor method:
    public ReportsBasePage(WebDriver driver) {
        super(driver);
    }

    //Methods for reporting product files/tests:
    public boolean pickFirstItemInAList (By locator) {
        try {
            new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            driver.findElements(locator).get(0).click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean pickFirstItemInAList (By locator, Duration waitTime) {
        try {
            new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            driver.findElements(locator).get(0).click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean moveToAndSelectItemInDropDown (By locator, By locator2) {
        try {
            WebElement locatedListItem =new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions moveToItem = new Actions(driver);
            moveToItem.moveToElement(locatedListItem).click().perform();
            clickElement(locator2);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean moveToAndSelectItemInDropDown (By locator, By locator2, Duration waitTime) {
        try {
            WebElement locatedListItem =new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            Actions moveToItem = new Actions(driver);
            moveToItem.moveToElement(locatedListItem).click().perform();
            clickElement(locator2);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public String locateNumberAndStoreAsString(By locator){
        try {
            WebElement locatedElement = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            innerText = locatedElement.getAttribute("innerHTML");
            System.out.println("Summarized number is "+ innerText);
            return innerText;
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String locateNumberAndStoreAsString(By locator, Duration waitTime){
        try {
            WebElement locatedElement = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            innerText = locatedElement.getAttribute("innerHTML");
            System.out.println("Summarized number is "+ innerText);
            return innerText;
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String doubleClickOnElementIfInnerTextNotEqualZero(By locator) {
        try {
            if (!innerText.equals("0")) {
                WebElement clickOccupiedDrillInSummarized = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
                Actions DrillA = new Actions(driver);
                DrillA.moveToElement(clickOccupiedDrillInSummarized).doubleClick().perform();
            }
            return innerText;
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String doubleClickOnElementIfInnerTextNotEqualZero(By locator, Duration waitTime) {
        try {
            if (!innerText.equals("0")) {
                WebElement clickOccupiedDrillInSummarized = new WebDriverWait(driver, waitTime)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
                Actions DrillA = new Actions(driver);
                DrillA.moveToElement(clickOccupiedDrillInSummarized).doubleClick().perform();
            }
            return innerText;
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String removeLettersFromString(By locator){
        try {
            if (!innerText.equals("0")) {
                WebElement locatedString = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
                String innerHTMLOfString = locatedString.getAttribute("innerHTML");
                System.out.println(innerHTMLOfString);
                numberOnly = innerHTMLOfString.replaceAll("[^0-9]", "");
                System.out.println("Refactored Drill in number is " + numberOnly);
                return numberOnly;
            } else
                return numberOnly = "0";
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String removeLettersFromString(By locator, Duration waitTime){
        try {
            if (!innerText.equals("0")) {
                WebElement locatedString = new WebDriverWait(driver, waitTime)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
                String innerHTMLOfString = locatedString.getAttribute("innerHTML");
                System.out.println(innerHTMLOfString);
                numberOnly = innerHTMLOfString.replaceAll("[^0-9]", "");
                System.out.println("Refactored Drill in number is " + numberOnly);
                return numberOnly;
            } else
                return numberOnly = "0";
        }  catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean checkDownloadsFileName(String fileName){
        try {
            WebDriverWait wait = new WebDriverWait(driver,waitTimes.UNREASONABLE_WAIT);
            wait.until(fileIsPresent(fileName));
            return true;
        }  catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public ExpectedCondition<Boolean> fileIsPresent(String fileName) {
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                File f = new File("/Users/"+System.getProperty("user.name")+"/Downloads/"+ fileName);
                return f.exists();
            }
            @Override
            public String toString() {
                return String.format("file to be present within the time specified");
            }
        };
    }
    public boolean deleteFileInDownloads(String fileName) {
        try {
            File f = new File("/Users/"+System.getProperty("user.name")+"/Downloads/"+ fileName);
            f.delete();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}