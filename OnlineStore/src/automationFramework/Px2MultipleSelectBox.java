package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Px2MultipleSelectBox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Pablo\\Desktop\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        
        WebElement SeleniumCom = driver.findElement(By.name("selenium_commands"));
        Select SelectionCom = new Select(SeleniumCom);
        SelectionCom.selectByIndex(0);
        Thread.sleep(2000);
        SelectionCom.deselectByIndex(0);
        Thread.sleep(2000);
        
        SelectionCom.selectByVisibleText("Navigation Commands");
        Thread.sleep(2000);
        SelectionCom.deselectByVisibleText("Navigation Commands");
        Thread.sleep(2000);
        
        List<WebElement> MultiBox = SelectionCom.getOptions();
        int iSize = MultiBox.size();
        
        for(int i=0; i<iSize; i++) {
            String sValue = SelectionCom.getOptions().get(i).getText();
            System.out.println(sValue);
            SelectionCom.selectByIndex(i);;
            Thread.sleep(2000);
        }
        
        SelectionCom.deselectAll();
        
        
    }

}
