import java.util.regex.Pattern;

public class UserRegistrationValidator {
    public boolean validateFirstName(String name) {
        boolean result = Pattern.compile("^[A-Z][a-z]{2,}").matcher(name).matches();
        if (result == true)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
     return result;
    }

}
