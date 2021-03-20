package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // objeto do selenium Webdriver

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
