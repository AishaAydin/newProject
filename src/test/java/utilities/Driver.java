package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.security.auth.login.Configuration;
import java.util.concurrent.TimeUnit;

public class Driver {

    public Driver(){}

    public static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){
            String browser =ConfigurationReader.getProperties("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

            }

        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!= null){
            driver.quit();
            driver=null;
        }

    }



}
