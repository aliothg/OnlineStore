package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Pablo\\Desktop\\Drivers\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        
        String appUrl= "http://www.DemoQA.com";
        driver.get(appUrl);
        
        driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
        
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.navigate().to("http://www.DemoQA.com");
        
        driver.navigate().refresh();
        
        driver.close();
    }

}
