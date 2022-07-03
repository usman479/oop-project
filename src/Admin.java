import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Admin extends UserDetails implements Serializable {

    public Admin(String i,String p,String n){
        this.id = i;
        this.password = p;
        this.name = n;
    }
    public boolean isValidPassword(String password) {

        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=!.])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        return m.matches();
    }


}
