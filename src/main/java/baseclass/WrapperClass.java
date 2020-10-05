package baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperClass {
	protected WebDriver driver;
	
	public void launchApplication() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.switchTo().frame("paymframe");
	}
	
	public void openWebsite() {
		driver.get("https://www.icicibank.com/calculator/fd-calculator.page?#toptitle");
	}
	public void quit() throws IOException {
		TakesScreenshot image=((TakesScreenshot)driver);
		File SrcFile=image.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./image.jpg");
        FileUtils.copyFile(SrcFile, DestFile);
		driver.close();
	}
}
