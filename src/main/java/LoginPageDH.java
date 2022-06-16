import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageDH {

    WebDriver webDriver;

    public LoginPageDH(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @CacheLookup
    @FindBy(how = How.LINK_TEXT, using = "Iniciar sesión")
    WebElement linkToLog;

    @CacheLookup
    @FindBy(id = "email")
    WebElement username;

    @CacheLookup
    @FindBy(how = How.ID, using = "password")
    WebElement password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    @CacheLookup
    WebElement buttonLogin;

    public void login_dh(String usermail, String userpass) throws InterruptedException {
        username.clear();
        username.sendKeys("jhon.freddy@mail.com");
        Thread.sleep(650);
        password.sendKeys("123456");
        Thread.sleep(650);
        buttonLogin.click();
    }
}
