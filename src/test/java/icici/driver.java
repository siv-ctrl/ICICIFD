package icici;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
                public static WebDriver driver;
                
                public static String url ="https://www.icicibank.com/calculator/fd-calculator.page?#toptitle";
                public static WebDriver chrome()
                {
                                System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
                                WebDriver driver = new ChromeDriver();
                                driver.navigate().to(url);
                                driver.manage().window().maximize();
                                //driver.deleteAllCookies();
                                
                                return driver;
                                                           
                }
                

}