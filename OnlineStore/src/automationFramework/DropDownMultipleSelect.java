package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelect {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Pablo\\Desktop\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String URL = "http://toolsqa.wpengine.com/automation-practice-form";
        driver.get(URL);
        
        
        WebElement Dropdwn =driver.findElement(By.id("continents"));
        Select opSelect = new Select(Dropdwn);
        opSelect.selectByIndex(1);
        opSelect.selectByVisibleText("Africa");
        
        List<WebElement> continentes = opSelect.getOptions();
        int iSize = continentes.size();
        
        for(int i=0; i<iSize; i++) {
            String sValue = continentes.get(i).getText();
            System.out.println(sValue);
            opSelect.selectByIndex(i);
        }
        opSelect.selectByVisibleText("North America");
    }

}
