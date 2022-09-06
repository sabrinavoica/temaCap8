package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAjax {
    public static final String CATEGORY_CSS = "#combo1 > option:nth-child(1)";
    public static final String LANGUAGE_CSS = "#combo2 > option:nth-child(2)";



    public BasicAjax(ChromeDriver driver) {
        PageFactory.initElements (driver, this);
    }


    @FindBy(css = CATEGORY_CSS)
    private WebElement category;

    public WebElement getCategory() {
        return category;
    }

    @FindBy(css = LANGUAGE_CSS)
    private WebElement language;

    public WebElement getLanguage() {
        return language;
    }

    @FindBy(css = ".styled-click-button")
    private WebElement codeInItButton;


    public WebElement getCodeInItButton() {
        return codeInItButton;
    }

    @FindBy(id = "_valueid")
    private WebElement categorryId;

    public WebElement getCategorryId() {
        return categorryId;
    }


    @FindBy(id = "_valuelanguage_id")
    private WebElement languageId;

    public WebElement getLanguageId() {
        return languageId;
    }

}


