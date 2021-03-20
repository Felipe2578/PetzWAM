package general;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base;

    public Hooks(Base base)  {
        super();
        this.base = base;
    }

    //Before
    @Before
    public void setup(){
        // Onde está o driver do browser
        System.setProperty("webdriver.chrome.driver","drivers/Chrome/88/chromedriver");
        // Instanciar o driver do Chrome
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);

    }
    
    //After
    @After
    public void tearDown(){
        base.driver.quit(); // Destruir objeto do Selenium
        
    }


}
