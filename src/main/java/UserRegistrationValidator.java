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

    public boolean validateLastName(String lastName) {
        boolean result = Pattern.compile("^[A-Z][a-z]{2,}").matcher(lastName).matches();
        if (result == true)
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");
        return result;
    }

    public boolean validateEmail(String email) {
        boolean result = Pattern.compile("^[a-z]+([+_.-]?[a-zA-Z0-9])*[@][a-zA-Z0-9]+([.][a-z]{2,3}){1,2}$").matcher(email).matches();
        if (result == true)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
        return result;
    }
}

