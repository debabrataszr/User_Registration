import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertTrue(userRegistrationValidator.validateFirstName("Debabrata"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        assertFalse(userRegistrationValidator.validateFirstName("De"));
    }

    @Test
    public void givenFirstName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        assertFalse(userRegistrationValidator.validateFirstName("debabrata"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertTrue(userRegistrationValidator.validateLastName("Sahoo"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validateLastName("Sa"));
    }

    @Test
    public void givenLastName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        assertFalse(userRegistrationValidator.validateLastName("sahoo"));
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertTrue(userRegistrationValidator.validateEmail("debabrat.a@bl.co.in"));
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        assertFalse(userRegistrationValidator.validateEmail("deba.brat@bl.co."));
    }
    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        assertFalse(userRegistrationValidator.validateMobileNumber("91 78058968"));
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        assertFalse(userRegistrationValidator.validateMobileNumber("917978058968"));
    }
}