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
}