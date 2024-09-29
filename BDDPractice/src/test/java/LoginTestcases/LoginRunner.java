package LoginTestcases;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(glue = "LoginTestcases",
        features ="src/test/java/LoginTestcases/Login.feature")
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
