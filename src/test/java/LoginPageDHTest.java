import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.*;

class LoginPageDHTest {

    WebDriver driver;
    String baseUrl = "http://fe.deitech.online/login";

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumWEbDriverChrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void loginDH() throws InterruptedException {
        driver.get(baseUrl);
        LoginPageDH page = PageFactory.initElements(driver, LoginPageDH.class);
        page.login_dh("jhon.freddy@mail.com", "123456");
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3500);
        driver.quit();
        System.out.println("driver has been closed");
    }
}