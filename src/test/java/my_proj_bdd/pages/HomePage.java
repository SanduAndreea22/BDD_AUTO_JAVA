package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Elemente

    @FindBy(xpath = "//button[@data-testid='cookie-popup-accept']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//h2[@data-testid='cookie-popup-title']")
    private WebElement cookieHeader;

    @FindBy(xpath = "//button[@data-testid='header-myhub-toggle']")
    private WebElement contulMeuButton;

    //actiuni

    public void clickAcceptCookiesButton() {
        acceptCookiesButton.click();
    }

    public void openHomePage() {
        driver.get("https://www.mega-image.ro/");
    }

    public void clickContulMeuButton() {
        contulMeuButton.click();
    }

    // validari
    public void validationCookieHeader() {
        Assert.assertEquals("cookie header title incorect", "Cookie-uri pe mega-image.ro", cookieHeader.getText());
    }

}





