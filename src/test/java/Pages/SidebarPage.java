package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage {
    WebDriver driver;
    WebDriverWait wait;

    WebElement practiceButton;
    public SidebarPage(WebDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait=wait;
    }

    public SidebarPage(WebDriver driver) {
    }

    public WebElement getPracticeButton() {
        return driver.findElement(By.id("menu-item-20"));
    }
    //-----------------------------------

    public void clickPracticeButton(){
        getPracticeButton().click();
    }

    public void clickOnPracticeButton() {
    }
}