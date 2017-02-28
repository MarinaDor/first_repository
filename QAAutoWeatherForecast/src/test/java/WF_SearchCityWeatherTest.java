import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WF_CityPage;
import pages.WF_MainPage;

public class WF_SearchCityWeatherTest extends BaseTest{

    @Test
    public void searchCityTest(){
        WF_MainPage mainPage = new WF_MainPage(driver);
        mainPage.searchCityField.click();
        mainPage.searchCityField.sendKeys("Madrid");
        String actualText = mainPage.searchCityDropDownList.getText();
        Assert.assertEquals (actualText, "Madrid, Spain");
        mainPage.searchCityDropDownList.click();


        WF_CityPage cityPage = new WF_CityPage(driver);
        String actualDate = cityPage.todayDateField.getText();
        String actualMinTempC = cityPage.todayMinTempC.getText();
        String actualMaxTempC = cityPage.todayMaxTempC.getText();

        System.out.printf(actualText,actualDate,actualMinTempC,actualMaxTempC);






//        public Wait<WebDriver> wait = new WebDriverWait(driver, 5).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);
//        wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(mainPage.searchCityDropDownList))).click();
//        mainPage.searchBtn.click();
    }
}
