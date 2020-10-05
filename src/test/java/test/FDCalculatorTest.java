package test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.WrapperClass;
import pages.FDCalculatorPage;

public class FDCalculatorTest extends WrapperClass{
	@BeforeClass
	public void openSite() {
		launchApplication();
		openWebsite();
	}
	@Test
	public void getMaturityValueTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("paymframe");
	FDCalculatorPage calculator= new FDCalculatorPage(driver);
	String maturityValue=calculator.getMaturityValue();
	System.out.println(maturityValue);
	}
	@AfterMethod
	public void close() throws IOException {
		quit();
	}
	

}
