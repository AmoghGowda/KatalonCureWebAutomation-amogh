package ActionClass;

import ModuleObject.HomePageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    static WebDriver driver=null;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        // project website visit
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //Click on hamburgerMenu
        HomePageObject.hamburgerMenu(driver).click();


    }
}
