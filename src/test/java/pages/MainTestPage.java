package pages;

import com.codeborne.selenide.Selenide;
import common.BaseTest;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import static common.Locators.*;
public class MainTestPage extends BaseTest {
    public MainTestPage(WebDriver driver) {super(driver);
    }

    public void openDemoQaMainPage() {
       Selenide.open("https://demoqa.com/");
    }

    public boolean verifyThatDemoQaPageIsOpened() {
    return Selenide.$x("//img[@alt='Selenium Online Training']").isImage();
    }

    public void clickOnTheTab(String text) throws InterruptedException {
    Selenide.$x(UNIVERSAL_MAIN_PAGE_XPATH.replace("$1",text)).scrollTo().click();
    Thread.sleep(2000);
    }

    public boolean verifyThatPageIsOpened(String text) throws InterruptedException {
        Thread.sleep(2000);
        return Selenide.$x(UNIVERSAL_TAB_NAME_XPATH.replace("$1",text)).scrollTo().isDisplayed();

    }
}
