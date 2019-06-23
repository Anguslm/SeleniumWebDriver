package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.DriverUtilities;

import java.io.FileNotFoundException;

public class SpartaRegistration {
    //DriverUtilities myDriverUtilities = new DriverUtilities();
    //WebDriver driver = myDriverUtilities.getDriver();
    SpartaPOM s=new SpartaPOM();

    @Before
    public void preCondition(){
        s.open("http://automation-form.spartaglobal.education/");
    }
    @Test
    public void CorrectFill() {
        s.setFirstName("Angus");
        s.setLastName("Lindsay-MacDougall");
        s.setAge("23");
        s.setDOB("01/07/1995");
        s.setGender(true);
        s.setDegree("Theoretical physics");
        s.setUniversity("Oxford");
        s.setAddress("Meadowview");
        s.setAddress2("Lower Road");
        s.setCity("Forest Row");
        s.setCountry("Bristol");
        s.setPostcode("RH185HE");
        s.setEmail("amacdougall@spartaglobal.com");
        s.setSkills("Some stuff");
        s.setPhone("0000000000");
        s.setLinkedIn("www.linkedin");
        s.setCV("C:\\Users\\amacdougall\\Documents\\AngusMacDougallSpartaProfile.docx");
        s.setStream(true);
        s.setTerms();
        s.setRating(51);
    }
}
