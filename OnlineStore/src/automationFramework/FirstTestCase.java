package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

    public static void main(String[] args) throws InterruptedException {
        
        
        // Gecko webdriver C:\Users\Pablo\Desktop
        System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\Pablo\\Desktop\\Drivers\\geckodriver.exe");
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        //Store the URL in a variable
        String URL = "http://www.store.demoqa.com";
        
        //Start the page
        driver.get(URL);
        
        String title =driver.getTitle();
        
        int titleLength=driver.getTitle().length();
        
        System.out.println("Title of the page is : " + title);
        System.out.println("Length of the title is : "+ titleLength);
        
        String actualUrl = driver.getCurrentUrl();
        
        if(actualUrl.equals(URL)) {
            System.out.println("Verification succesful - the correct Url is opened");
        }
        
        else {
            System.out.println("Verification Failed - An incorrect Url is opened.");
            //In case of Fail, you like to print the actual an expected URL for the record purpouse
            System.out.println("Actual Url is :" +actualUrl);
            System.out.println("Expected URL is :" + URL);
        }
        
        //Storing Page Source in String variable
        String pageSource= driver.getPageSource();
        
        //Launch the Online Store Website
        int pageSourceLength = pageSource.length();
        
        System.out.println("Total length of the Page Source is: " +pageSourceLength);
        
        driver.get("http://demoqa.com/frames-and-windows/");
        driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
        
        driver.quit();
    }

}
