package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AgreementPage extends BasePage{

	public AgreementPage(WebDriver driver) {
		super(driver);
	}
	public void clickElement(WebElement element) {
		element.click();
	}

	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/legal/in/eng/user_agreement.html#1']")
	private WebElement agreement;

	public WebElement getAgreement() {
		return agreement;
	}
	public WebElement feesAndPayment(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='FEES AND PAYMENT']"));
	}

	
}
