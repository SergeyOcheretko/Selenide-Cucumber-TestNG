import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import net.thucydides.core.annotations.Feature;

@Feature
@CucumberOptions(
        features = {"C:\\Users\\Sergey\\IdeaProjects\\Selenide-Cucumber-TestNG\\src\\test\\resources\\feature"},
        glue = {"settings"})


public class RunCucumberTests extends AbstractTestNGCucumberTests{



}
