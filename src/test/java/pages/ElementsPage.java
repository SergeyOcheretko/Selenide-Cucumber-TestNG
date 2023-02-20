package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import common.BaseTest;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.*;
import static common.Locators.*;
public class ElementsPage extends BaseTest {
    public ElementsPage(WebDriver driver) {
        super(driver);
    }


    public boolean verifyThatTextBoxPageIsDisplayed() {
        return Selenide.$x("//div[text()='Text Box']").isDisplayed();
    }

    public void typeInTheField(String text, String text1) {
        Selenide.$x(UNIVERSAL_TEXT_BOX_XPATH.replace("$1", text1)).sendKeys(text);
    }

    public void clickOnTheButton(String text) {
        Selenide.$x(UNIVERSAL_ELEMENTS_TAB_XPATH.replace("$1", text)).click();
    }

    public boolean verifyThatPageIsDisplayed(String text) {
        return Selenide.$x(UNIVERSAL_ELEMENTS_PAGE_XPATH.replace("$1", text)).isDisplayed();
    }

    public void typeInTheTextArea(String text) {
        Selenide.$x("//textarea[@id='currentAddress']").sendKeys(text);
    }

    public void clickOnButton(String text) {
        Selenide.$x(UNIVERSAL_XPATH_FOR_CLICKABLE_BUTTONS.replace("$1", text)).click();
    }

    public boolean verifyThatResultsIsDisplayed() {
        return Selenide.$x("//div[@id='output']").isDisplayed();
    }

    public void clickOnTheRadioButton(String text) {
        Selenide.$x(UNIVERSAL_RADIO_BUTTONS_XPATH.replace("$1", text)).click();
    }

    public boolean verifyThatRadioButtonIsChosen(String text) {
        return Selenide.$x(TEXT_SUCCESS_RADIO_BUTTON_XPATH.replace("$1", text)).isDisplayed();
    }

    public void verifyThatNoRadioButtonIsnTClickable() {
        SelenideElement el =Selenide.$x ("//label[normalize-space()='No']");
        el.shouldBe(interactable);
    }
}