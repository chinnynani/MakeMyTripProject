package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends BasePage {

	public BookingPage(WebDriver driver) {
		super(driver);
	}

//for choosing the property
	@FindBy(xpath = "(//p[@itemprop='name'])[1]")
//	@FindBy(xpath="//span[text()='The Hosteller Bangalore, Indiranagar']")
	private WebElement choosingProperty;

	public WebElement getChoosingProperty() {
		return choosingProperty;
	}

// for booking button
	@FindBy(xpath = "//button[@class='appBtn filled large bkngOption__cta  ']")
	private WebElement bookThisNow;

	public WebElement getBookThisNow() {
		return bookThisNow;
	}

	public AgreementPage goToAgreementPage(WebDriver driver) {
		clickElement(getBookThisNow());
		return new AgreementPage(driver);
	}

	public void clickElement(WebElement element) {
		element.click();
	}
	
	@FindBy(xpath = "//span[@class='tooltip-button' and text()-'Got it']")
	private WebElement shareWithFriendsPopUp;

	public WebElement getShareWithFriendsPopUp() {
		return shareWithFriendsPopUp;
	}

//	public void shadowElement() {
//		WebElement outerShadowHost = driver.findElement(By.cssSelector("gamitee-button"));
//		SearchContext outerShadowRoot = outerShadowHost.getShadowRoot();
//		WebElement innerShadowHost = outerShadowRoot.findElement(By.cssSelector("joyned-tooltip"));
//		SearchContext innerShadowRoot = innerShadowHost.getShadowRoot();
//		WebElement shadowElement = innerShadowRoot.findElement(By.cssSelector("span.tooltip-button"));
//		shadowElement.click();
//	}

}
