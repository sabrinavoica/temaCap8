package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import page.BasicAjax;

import static org.testng.Assert.assertEquals;
import static page.BasicAjax.CATEGORY_CSS;
import static page.BasicAjax.LANGUAGE_CSS;

public class basicAjaxMobileTest extends baseTest {

    @Test(description = "The items will be checked for correctness on the next page after pressing the Code it in button.")
    public void testCodeIn() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        BasicAjax basicAjax = new BasicAjax(driver);
//        basicAjax.getCategory().selectByIndex(1);


//        basicAjax.getList().get(0).click();

        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CATEGORY_CSS)));
        basicAjax.getCategory().click();
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LANGUAGE_CSS)));
        basicAjax.getLanguage().click();
        basicAjax.getCodeInItButton().click();
        System.out.println(basicAjax.getCategorryId().getText());
        assertEquals(basicAjax.getCategorryId().getText(), "1", "Id incorrect.");
        System.out.println(basicAjax.getLanguageId().getText());
        assertEquals(basicAjax.getLanguageId().getText(),"2", "Id incorrect.");

}}
