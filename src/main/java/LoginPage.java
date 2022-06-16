import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    private final By username= By.name("username");
    private final By password = By.name("password");
    private final By loginButton = By.className("mobile-button__submit");

    public LoginPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void typeUsername(String st){
        driver.findElement(username).sendKeys(st);
    }

    public void typePassword(String st){
        driver.findElement(password).sendKeys(st);
    }

    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }

}
