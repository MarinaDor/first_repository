package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WF_CityPage extends BasePage{

    public WF_CityPage(WebDriver driver) {
        super(driver);
    }
//.date-header.day-end
    @FindBy (css = ".date-header.day-end")
    public WebElement todayDateField;

    @FindBy (css = ".min-temp-row>th")
    public WebElement todayMinTempC;

    @FindBy (css = ".max-temp-row>th")
    public WebElement todayMaxTempC;


}
