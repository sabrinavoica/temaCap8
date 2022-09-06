package tests;

import driver.ConfigBrowser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseTest {

       protected ChromeDriver driver = null;
       @BeforeMethod
       public void beforeMethod(){
           driver = ConfigBrowser.getChromeDriverManager ();
           ChromeOptions chromeOptions = new ChromeOptions ();
           chromeOptions.addArguments ("incognito");

}
       @AfterMethod
       public void afterMethod(){
           if (driver != null){
               driver.quit ();
           }
       }



    protected FluentWait<RemoteWebDriver> fluentWait(RemoteWebDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500));
    }
}
