package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\Pablo\\Desktop\\Drivers\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        Thread.sleep(10);
        driver.close();
    }

}
