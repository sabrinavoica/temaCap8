package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleDynamicButtons {

    public static final String TWO_BUTTON_ID = "button02";
    public static final String THREE_BUTTON_ID = "button03";

    public SimpleDynamicButtons(ChromeDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "button00")
    private WebElement startButton;

    public WebElement getStartButton() {
        return startButton;
    }

    @FindBy(id = "button01")
    private WebElement oneButton;

    public WebElement getOneButton() {
        return oneButton;
    }

    @FindBy(id = TWO_BUTTON_ID)
    private WebElement twoButton;

    public WebElement getTwoButton() {
        return twoButton;
    }

    @FindBy(id = THREE_BUTTON_ID)
    private WebElement threeButton;

    public WebElement getThreeButton() {
        return threeButton;
    }

    @FindBy(id = "buttonmessage")
    public WebElement message;

    public WebElement getMessage() {
        return message;
    }
}
