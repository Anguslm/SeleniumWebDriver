package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.DriverUtilities;

import java.io.FileNotFoundException;

public class SpartaPOM {
    DriverUtilities myDriverUtilities = new DriverUtilities();
    WebDriver driver = myDriverUtilities.getDriver();

    public void open(String page){
        driver.get(page);
        driver.manage().window().maximize();
    }

    public void setFirstName(String firstName){
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lastName);
    }

    public void setAge(String age){
        driver.findElement(By.xpath("/html/body/div/form/div[3]/div/input")).sendKeys(age);
    }

    public void setDOB(String dob){
        driver.findElement(By.xpath("/html/body/div/form/div[4]/div/input")).sendKeys(dob);
    }

    public void setGender(Boolean male){
        if (male==true){
            driver.findElement(By.xpath("/html/body/div/form/div[5]/label")).click();
        }
        else {
            driver.findElement(By.xpath("/html/body/div/form/div[6]/label")).click();
        }
    }

    public void setDegree(String degree){
        driver.findElement(By.xpath("/html/body/div/form/div[7]/div/input")).sendKeys(degree);
    }

    public void setUniversity(String university){
        driver.findElement(By.xpath("//*[@id=\"inputUni\"]")).click();
        if (university.equalsIgnoreCase("oxford")){
            driver.findElement(By.xpath("//*[@id=\"inputUni\"]/option[2]")).click();
        }
        else if (university.equalsIgnoreCase("cambridge")){
            driver.findElement(By.xpath("//*[@id=\"inputUni\"]/option[3]")).click();
        }
        else if (university.equalsIgnoreCase("sheffield")){
            driver.findElement(By.xpath("//*[@id=\"inputUni\"]/option[4]")).click();
        }
        else if (university.equalsIgnoreCase("roehampton")){
            driver.findElement(By.xpath("//*[@id=\"inputUni\"]/option[5]")).click();
        }
    }

    public void setAddress(String address){
        driver.findElement(By.xpath("//*[@id=\"inputAddress\"]")).sendKeys(address);
    }

    public void setAddress2(String address2){
        driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]")).sendKeys(address2);
    }

    public void setCity(String city){
        driver.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys(city);
    }

    public void setCountry(String country){
        driver.findElement(By.xpath("//*[@id=\"inputCounty\"]")).click();
        if (country.equalsIgnoreCase("buckinghamshire")){
            driver.findElement(By.xpath("//*[@id=\"inputCounty\"]/option[2]")).click();
        }
        else if (country.equalsIgnoreCase("hertfordshire")){
            driver.findElement(By.xpath("//*[@id=\"inputCounty\"]/option[3]")).click();
        }
        else if (country.equalsIgnoreCase("south yorkshire")){
            driver.findElement(By.xpath("//*[@id=\"inputCounty\"]/option[4]")).click();
        }
        else if (country.equalsIgnoreCase("bristol")){
            driver.findElement(By.xpath("//*[@id=\"inputCounty\"]/option[5]")).click();
        }
    }

    public void setPostcode(String postcode){
        driver.findElement(By.xpath("//*[@id=\"inputPostcode\"]")).sendKeys(postcode);
    }

    public void setEmail(String email){
        driver.findElement(By.xpath("//*[@id=\"inputemailaddress\"]")).sendKeys(email);
    }

    public void setSkills(String skills){
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys(skills);
    }

    public void setPhone(String phone){
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput1\"]")).sendKeys(phone);
    }

    public void setLinkedIn(String linkedIn){
        driver.findElement(By.xpath("/html/body/div/form/div[17]/div/input")).sendKeys(linkedIn);
    }

    public void setCV(String cv){
        try {
            //driver.findElement(By.xpath("/html/body/div/form/div[18]/div/input")).sendKeys(cv);
            //driver.findElement(By.xpath("/html/body/div/form/div[18]/div/input")).click();
            WebElement upload=driver.findElement(By.xpath("/html/body/div/form/div[18]/div/input"));
            upload.sendKeys(cv);
            upload.click();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }

    public void setStream(Boolean sdet){
        if (sdet==true){
            driver.findElement(By.xpath("/html/body/div/form/div[20]/div[1]/label")).click();
        }
        else {
            driver.findElement(By.xpath("/html/body/div/form/div[20]/div[2]/label")).click();
        }
    }

    public void setTerms(){
        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
    }

    public void setRating(int rating){
        WebElement rateSlider=driver.findElement(By.xpath("//*[@id=\"experienceSlider\"]"));
        Dimension sliderSize=rateSlider.getSize();
        int sliderWidth=sliderSize.width;
        int Xcoord = rateSlider.getLocation().getX();
        Actions builder=new Actions(driver);
        builder.moveToElement(rateSlider).click().dragAndDropBy(rateSlider,(rating-50)*sliderWidth/107,0).build().perform();
    }
}
