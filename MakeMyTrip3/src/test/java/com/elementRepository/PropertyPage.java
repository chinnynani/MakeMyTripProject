package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PropertyPage extends BasePage {

	public PropertyPage(WebDriver driver) {
		super(driver);
	}

	public BookingPage goToBookingPage(WebDriver driver) {
		clickElement(getClickingTheProperty());
		return new BookingPage(driver);
	}

	public void clickElement(WebElement element) {
		element.click();
	}

// choose currency type to INR

	@FindBy(xpath = "//p[@class='currencyLabel']")
	private WebElement inrButton;

	public WebElement getInrButton() {
		return inrButton;
	}

	@FindBy(xpath = "//input[@placeholder='Search Currency']")
	private WebElement indianRupeeOption;

	public WebElement getIndianRupeeOption() {
		return indianRupeeOption;
	}

	public void getCurrency() {
		indianRupeeOption.click();
	}

//To change the check out date  
	@FindBy(xpath = "//label[@class='lbl_input latoBold  font12 blueText capText']")
	private WebElement changeCheckOutOption;

	public WebElement getChangeCheckOutOption() {
		return changeCheckOutOption;
	}

	public WebElement getDate(WebDriver driver, int date2) {
		return driver.findElement(By.xpath("//div[contains(text(),'December')]/../..//div[contains(@aria-label,'" + date2 + "')]"));
	}


	@FindBy(xpath = "//button[@class='primaryBtn btnApplyNew pushRight capText ']")
	private WebElement againClickApply;

	public WebElement getAgainClickApply() {
		return againClickApply;
	}

// validation for the navigation to homestays and villas   

	@FindBy(xpath = "//a[text()='Homestays and more in Bangalore']")
	private WebElement bangloreProperties;

	public WebElement getBangloreProperties() {
		return bangloreProperties;
	}

	@FindBy(xpath = "//span[text()='Popular']")
	private WebElement sortByOption_Popular;

	public WebElement getSortByOption_Popular() {
		return sortByOption_Popular;
	}

	public String getActiveSortOptionForPopular() {
		return getSortByOption_Popular().getText();
	}

	@FindBy(xpath = "//span[text()='User Rating ']")
	private WebElement sortByOption_Rating;

	public WebElement getSortByOption_Rating() {
		return sortByOption_Rating;
	}

	public String getActiveSortOptionForRating() {
		return getSortByOption_Rating().getText();
	}

	@FindBy(xpath = "//span[text()='(Highest First)']/../..//span[text()='Price ']")
	private WebElement sortByOption_PriceHeighestFirst;

	public WebElement getSortByOption_PriceHeighestFirst() {
		return sortByOption_PriceHeighestFirst;
	}

	public String getActiveSortOptionForHighest() {
		return getSortByOption_PriceHeighestFirst().getText();
	}

	@FindBy(xpath = "//span[text()='(Lowest First)']/../..//span[text()='Price ']")
	private WebElement sortByOption_PriceLowestFirst;

	public WebElement getSortByOption_PriceLowestFirst() {
		return sortByOption_PriceLowestFirst;
	}

	public String getActiveSortOptionForLowest() {
		return getSortByOption_PriceLowestFirst().getText();
	}

	// for explore map

	@FindBy(xpath = "//img[@class='mapEntry__map']")
	private WebElement exploreMap;

	public WebElement getExploreMap() {
		return exploreMap;
	}

	@FindBy(xpath = "//input[@placeholder='Search in Area, Property or Locality in Bangalore']")
	private WebElement searchText;

	public WebElement getSearchText() {
		return searchText;
	}

	@FindBy(xpath = "//button[@title='Zoom in']")
	private WebElement clickPlus;

	public WebElement getClickPlus() {
		return clickPlus;
	}

	@FindBy(xpath = "//span[@class='cm__modalClose modalCloseCenter']")
	private WebElement closeMap;

	public WebElement getCloseMap() {
		return closeMap;
	}

	@FindBy(xpath = "//a[text()='Homestays and more in Bangalore']")
	private WebElement returnBack;

	public WebElement getReturnBack() {
		return returnBack;
	}

	@FindBy(xpath = "//span[text()='Sri Tirumala Paradise near KSR Bengaluru Railway Station']")
//	@FindBy(id = "htl_id_seo_202204071302205878")
//	@FindBy(id ="htl_id_seo_202404151215582698")

	private WebElement clickingTheProperty;

	public WebElement getClickingTheProperty() {
		return clickingTheProperty;
	}

	public WebElement getPropertyTitle() {
		return clickingTheProperty;
	}

	@FindBy(xpath = "//h1[text()='Sri Tirumala Paradise near KSR Bengaluru Railway Station']")
	private WebElement particularPropertyTitle;

	public WebElement getParticularPropertyTitle() {
		return particularPropertyTitle;
	}

	@FindBy(id = "htl_id_seo_202404151215582698")
	private WebElement property;

	public WebElement getProperty() {
		return property;
	}
	

}
