package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaRedirection {

    public static final String EXPLANATION = "body > div > div.explanation";

    public JavaRedirection(ChromeDriver driver){
        PageFactory.initElements( driver, this);
    }


    @FindBy(id = "delaygotobasic")
    private WebElement transportIn5Seconds;

    public WebElement getTransportIn5Seconds() {
        return transportIn5Seconds;
    }

    @FindBy(css = EXPLANATION)
    public WebElement explanation;

    public WebElement getExplanation() {
        return explanation;
    }

    @FindBy(className = "styled-click-button")
    private WebElement goBackButton;

    public WebElement getGoBackButton() {
        return goBackButton;
    }

    @FindBy(id = "delaygotobounce")
    private WebElement transportedIn2Seconds;

    public WebElement getTransportedIn2Seconds() {
        return transportedIn2Seconds;
    }
}
