package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RefreshPage {

    public RefreshPage(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "refreshdate")
    private WebElement refreshDate;

    public WebElement getRefreshDate() {
        return refreshDate;
    }

    @FindBy(id = "refreshdate")
    private WebElement refreshDate1;

    public WebElement getRefreshDate1() {
        return refreshDate1;
    }
}
