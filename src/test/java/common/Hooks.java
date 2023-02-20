package common;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Hooks {


    public static void main(String[] args){}


    protected static WebDriver driver;

    @Before
    public void setUp(){
    Configuration.browserSize = "1920x1080";
    Configuration.browserPosition = "0x0";
    Configuration.browser = "chrome";
    Configuration.timeout = 2000;



}
    public static WebDriver getDriver() {
        return driver;
    }
}
