package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {
    //WebDriverWait wait;
    static WebDriverWait wait;
    //static WebDriverManager Browser;

    public static void clickOnElement(By by, WebDriver driver) {
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();}

    public static void SetKeys(By by , WebDriver driver,String text ) {
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys();}


       // driver = new ChromeDriver();

}

