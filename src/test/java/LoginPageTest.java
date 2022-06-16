import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class LoginPageTest {

    WebDriver driver;
    String baseUrl = "https://auth.riotgames.com/login#acr_values=urn%3Ariot%3Agold&client_id=accountodactyl-prod&redirect_uri=https%3A%2F%2Faccount.riotgames.com%2Foauth2%2Flog-in&response_type=code&scope=openid%20email%20profile%20riot%3A%2F%2Friot.atlas%2Faccounts.edit%20riot%3A%2F%2Friot.atlas%2Faccounts%2Fpassword.edit%20riot%3A%2F%2Friot.atlas%2Faccounts%2Femail.edit%20riot%3A%2F%2Friot.atlas%2Faccounts.auth%20riot%3A%2F%2Fthird_party.revoke%20riot%3A%2F%2Fthird_party.query%20riot%3A%2F%2Fforgetme%2Fnotify.write%20riot%3A%2F%2Friot.authenticator%2Fauth.code%20riot%3A%2F%2Frso%2Fmfa%2Fdevice.write&state=c027bae0-5e53-47fd-9cb7-6ec9f82834b1";
    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumWEbDriverChrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    void testFull() throws InterruptedException {

        driver.get(baseUrl);
        LoginPage page = new LoginPage(driver);
        Thread.sleep(600);
        page.typeUsername("farsisha");
        Thread.sleep(600);
        page.typePassword("Jhonfreddy15");
        Thread.sleep(600);
        page.clickOnLoginButton();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3500);
        driver.quit();
        System.out.println("driver has been closed");
    }
}