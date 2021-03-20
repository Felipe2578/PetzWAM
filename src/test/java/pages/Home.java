package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    // 1 - Mapeamento de Elementos
    @FindBy(id ="search")
    private WebElement txtInputSearch;

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;
    // 2 - Constructor

    public Home(WebDriver driver) {
        super(driver);
    }


    // 3 - Ações dos Elementos

    public void search(String product){
        txtInputSearch.click(); //
        txtInputSearch.clear();
        txtInputSearch.sendKeys(product);
    }

    public void searchWithmagnifierButton(String product){
        search(product);
        btnSearch.click();
    }

    public void searchWithEnter(String product){
       search(product);
        txtInputSearch.sendKeys(Keys.ENTER);
    }
}

