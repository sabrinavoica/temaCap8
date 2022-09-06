package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import page.SimpleDynamicButtons;

import static org.testng.Assert.assertEquals;
import static page.SimpleDynamicButtons.THREE_BUTTON_ID;
import static page.SimpleDynamicButtons.TWO_BUTTON_ID;

public class simpleDynamicTest extends baseTest{

    @Test(description = "At the end will check the message displayed.")
    public void butons(){
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        SimpleDynamicButtons simpleDynamicButtons = new SimpleDynamicButtons( driver);
        simpleDynamicButtons.getStartButton().click();
        simpleDynamicButtons.getOneButton().click();
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(TWO_BUTTON_ID)));
        simpleDynamicButtons.getTwoButton().click();
        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.id(THREE_BUTTON_ID)));
        simpleDynamicButtons.getThreeButton().click();
        assertEquals(simpleDynamicButtons.getMessage().getText().toLowerCase(),
                "all buttons clicked", "The message is not displayed");
    }
}
