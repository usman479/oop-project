import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try {

    public static boolean isValidPassword(String password) {

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

    public static void main(String[] args) throws Exception{


//        Student array[] = new Student[50];
//        Teacher array1[] = new Teacher[50];
//        Admin array2[] = new Admin[50];

//        Course chi = new Course("OOP","D300");
//        stud.assignCourse(chi);

//            MyFiler.readFile(array;
//            MyFiler.myAppendObject(stud,array);


//        MyFiler.myAppendObject(stud,array1);
//        MyFiler.readFile(array1);
//        System.out.println(array1[0].courses[1].title);

//
//        try{
//            for(int i=0; i<50; i++){
////                if(array[i].name.compareTo("saad") == 0){
////                    array[i].name = "ayesha";
////                }
//                System.out.println(array[i].name);
//            }
//        } catch (Exception e){
//            System.out.println(e+" why");
//        }
//        MyFiler.myChangeObject(studentPath,array);
    }
}