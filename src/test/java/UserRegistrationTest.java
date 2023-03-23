import org.example.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertTrue(userRegistrationValidator.validateFirstName("Debabrata"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse()  {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();

            Assert.assertFalse(userRegistrationValidator.validateFirstName(" dev"));
        }catch(UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenFirstLetterIsNotCapital_ShouldReturnFalse()  {
        try{
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validateFirstName("debabrata"));
        }catch(UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validateFirstName("debabrat@");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validateFirstName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertTrue(userRegistrationValidator.validateLastName("Sahoo"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validateLastName("Sa"));
    }

    @Test
    public void givenLastName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validateLastName("sahoo"));
    }

    @Test
    public void givenLastName_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validateLastName("sah12");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenLastName_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validateLastName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validateMobileNumber("91 78058968"));
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException{
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validateMobileNumber("917978058968"));
    }
    @Test
    public void givenMobileNumber_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validateMobileNumber(" " );
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator= new UserRegistrationValidator();
            userRegistrationValidator.validateMobileNumber("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }



    @Test
    public void givenPassWord_WhenShort_ShouldReturnFalse() throws UserRegistrationException{
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validatePassword("Dev@25"));
    }

    @Test
    public void givenPassword_WhenNotHavingAtLeastOneUpperCaseLetter_ShouldReturnFalse() throws UserRegistrationException{
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validatePassword("debabrata@25"));
    }

    @Test
    public void givenPassword_WhenNotHavingAtLeastOneNumber_ShouldReturnFalse() throws UserRegistrationException{
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertFalse(userRegistrationValidator.validatePassword("Debabrata@sahoo"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
        Assert.assertTrue(userRegistrationValidator.validatePassword("Deba@9at"));
    }
    @Test
    public void givenPassword_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validatePassword("  ");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenPassword_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validatePassword("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenValidEmailSamples_WhenProper_ShouldReturnTrue() throws UserRegistrationException{

        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        for (int i = 0; i < validEmails.length; i++) {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            Assert.assertTrue(userRegistrationValidator.validateEmail(validEmails[i]));
        }
    }

    @Test
    public void givenInvalidEmailSamples_WhenProper_ShouldReturnFalse() throws UserRegistrationException {
        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        for (int i = 0; i < inValidEmails.length; i++) {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            Assert.assertFalse(userRegistrationValidator.validateEmail(inValidEmails[i]));
        }
    }


    @Test
    public void givenEmail_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validateEmail("sdebab6191");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidator userRegistrationValidator = new UserRegistrationValidator();
            userRegistrationValidator.validateEmail("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

}

