import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emailsToValidate = {
                "example@example.com",
                "user123@.mail.com",
                "invalid.email.com",
                "jennie@symbol.com",
                "9852464@number.com"
        };

        for (String email : emailsToValidate) {
            boolean isValid = validateEmail(email);
            System.out.println(email + " is valid: " + isValid);
        }
    }
}
