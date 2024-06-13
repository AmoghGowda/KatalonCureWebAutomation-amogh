package ActionClass;
import ModuleObject.loginPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFunctionalityTest {
    static WebDriver driver=null;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Project url
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();
        loginPageObject.appointmentButton(driver).click();
        loginPageObject.UserNameBtn(driver).sendKeys("");
        loginPageObject.PasswordBtn(driver).sendKeys("");
        loginPageObject.loginBtn(driver).click();
    }

}
