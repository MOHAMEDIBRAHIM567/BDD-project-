package LoginTestcases;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class stepDefinition {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    SoftAssert softAssert = new SoftAssert();

    @Given("navigate to login page")
    public void navigate_to_login_page() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.clickLoginButton();
        loginPage =new LoginPage(driver);

    }

    @When("valid username and password are entered")
    public void valid_username_and_password_are_entered() {
        loginPage.enterEmail("esraa123@gmail.com");
        loginPage.enterPassword("esraa123");

    }

    @When("invalid username and password are entered")
    public void invalid_username_and_password_are_entered() {
        loginPage.enterEmail("esraa8855@gmail.com");
        loginPage.enterPassword("esraa123");

    }

    @When("clicked on submit button")
    public void clicked_on_submit_button() {
       loginPage.ClickLogin();

    }

    @Then("error message will be displayed")
    public void home_page_is_displayed (){
       // softAssert.assertEquals(loginPage.getText(), "Welcome to our store");
        softAssert.assertAll();
    }

    @Then("user's home page is displayed")
    public void userSHomePageIsDisplayed() {
        softAssert.assertEquals(loginPage.getText(), "Welcome to our store");

    }
}
