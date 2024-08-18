package my_proj_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
