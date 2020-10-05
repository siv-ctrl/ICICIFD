package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FDCalculatorPage {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'FD Calculator')]")
	private WebElement fdCal;
	@FindBy(xpath="//select[@id='ddlTypeOfFixedDeposit']")
	private WebElement typeOfFD;
	@FindBy(xpath="//select[@id='ddlTypeOfFixedDeposit']")
	private WebElement fdType;
	@FindBy(xpath="//input[@id='loanAmount']")
	private WebElement depositAmt;
	@FindBy (xpath="//input[@id='idDays']")
	private WebElement days;
	@FindBy (xpath="//input[@id='tenureDay']")
	private WebElement tenureDays;
	@FindBy (xpath="//span[@id='spnMaturityValue']")
	private WebElement maturityValue;
	
	public FDCalculatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getMaturityValue() throws InterruptedException {
		Thread.sleep(5000);
		//fdCal.click();
		typeOfFD.click();
		Select fdType= new Select(typeOfFD);
		fdType.selectByIndex(2);
		Thread.sleep(2000);
		depositAmt.clear();
		Thread.sleep(1000);
		depositAmt.sendKeys("200000");
		Thread.sleep(4000);
		days.click();
		Thread.sleep(2000);
		tenureDays.clear();
		Thread.sleep(1000);
		tenureDays.sendKeys("400");
		Thread.sleep(2000);
		String maturityAmount=maturityValue.getText();	
		Thread.sleep(1000);
	    return maturityAmount;	
	}
}


