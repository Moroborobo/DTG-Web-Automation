package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebActions {
    public boolean checkObject(WebDriver driver, By element){
        try {
            Thread.sleep(1250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean exists = false;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            if(driver.findElement(element).isDisplayed()){
                exists = true;
            }
        return exists;
    }
    public boolean checkObject(WebDriver driver, By element, int seconds){
        boolean exists = false;
        try{
            scrollToObject(driver,element);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            if(driver.findElement(element).isDisplayed()){
                exists = true;
            }
        } catch (Exception e){
            e.getStackTrace();
        }
        return exists;
    }
    public void enterText(WebDriver driver, By element, String text){
        if(checkObject(driver, element)){
            driver.findElement(element).sendKeys(text);
        }
    }
    public void clickObject(WebDriver driver, By element){
        if(checkObject(driver, element)){
            driver.findElement(element).click();
        }
    }
    public void scrollToObject(WebDriver driver, By element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView({block:'center'});", driver.findElement(element));
    }
    public void selectByText(WebDriver driver, By element, String visibleText){
        Select select = new Select(driver.findElement(element));
        select.selectByVisibleText(visibleText);
    }
    public void selectByValue(WebDriver driver, By element, String value){
        Select select = new Select(driver.findElement(element));
        select.selectByValue(value);
    }
    public void selectByIndex(WebDriver driver, By element, int index){
        Select select = new Select(driver.findElement(element));
        select.selectByIndex(index);
    }
}
