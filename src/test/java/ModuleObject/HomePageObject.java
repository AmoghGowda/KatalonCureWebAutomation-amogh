package ModuleObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
    private static WebElement element=null;
    //WebDriver driver=null;

    // hamburgerMenu button
    public static WebElement hamburgerMenu(WebDriver driver)
    {
        element=driver.findElement(By.id("menu-toggle"));
        return element;
    }

    // Home button
    public static WebElement Home(WebDriver driver)
    {
        element=driver.findElement(By.linkText("Home"));
        return element;
    }

    // Login button
    /*public static WebElement Login(WebDriver driver)
    {
        element=driver.findElement(By.linkText("Login"));
        return element;
    }

    // Make appointment button
    public static WebElement MakeAppointment(WebDriver driver)
    {
        element=driver.findElement(By.id("btn-make-appointment"));
        return element;
    }

    // to-top button
    public static WebElement ToTop(WebDriver driver)
    {
        element=driver.findElement(By.id("to-top"));
        return element;
    }

     */
}
