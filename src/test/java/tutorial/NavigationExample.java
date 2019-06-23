package tutorial;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.DriverUtilities;

public class NavigationExample {
    DriverUtilities myDriverUtilities = new DriverUtilities();
    WebDriver driver = myDriverUtilities.getDriver();

    @Before
    public void preCondition(){
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void openWebBrowser(){
        String username="HUTABARAT";
        String password="12345";
        WebElement userNameField=driver.findElement(By.name("userName"));
        userNameField.sendKeys(username);
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
        WebElement submitButton=driver.findElement(By.name("login"));
        submitButton.click();
        WebElement departingSelect=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
        Select departingOptionToSelect=new Select(departingSelect);
        departingOptionToSelect.selectByVisibleText("Sydney");
    }


    @After
    public void tearDown(){
        //driver.quit();
        //driver.close();
    }
}
