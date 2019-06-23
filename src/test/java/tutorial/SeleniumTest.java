package tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverUtilities;
//import java.util.function.*;

public class SeleniumTest {
    DriverUtilities myDriverUtilities = new DriverUtilities();
    WebDriver driver = myDriverUtilities.getDriver();

    @Before
    public void preCondition(){
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void openWebBrowser(){
        String testemail="amacdougall@spartaglobal.com";
        String testpassword="Sparta2019";
        WebElement signIn=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        signIn.click();
        WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys(testemail);
        WebElement password=driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        password.sendKeys(testpassword);
        WebElement createAccount=driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
        createAccount.click();
        WebElement navToDress =driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        navToDress.click();
        Actions action = new Actions(driver);
        WebElement chooseDress =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img"));
        action.moveToElement(chooseDress).perform();
        WebElement addToCart =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span"));
        addToCart.click();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
        }
        WebElement proceedToCheckout=driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        proceedToCheckout.click();
        WebElement proceedToCheckout2=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
        proceedToCheckout2.click();
        WebElement proceedToCheckout3=driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
        proceedToCheckout3.click();

    }


    @After
    public void tearDown(){
        //driver.quit();
        //driver.close();
    }
}
