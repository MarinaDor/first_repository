package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WF_MainPage extends BasePage{

    public WF_MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "#location")
    public WebElement searchCityField;

    @FindBy (xpath = ".//*[@id='location_autocomplete']/div[2]")
    public WebElement searchCityDropDownList;

    @FindBy (css = "#searchbtn")
    public WebElement searchBtn;

}
