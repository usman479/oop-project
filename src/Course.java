import java.io.Serializable;

public class Course implements Serializable {
    protected String title;
    protected String courseId;
    String assignment;
    private String grade=null;
    int marks = -1;

    boolean setGrade(int m) {
        if (m > 100 || m < 0) {
            return false;
        }

        if(m >89){
            grade = "A+";
            return true;
        }
        if(m > 79){
            grade = "A";
            return true;
        }
        if(m > 69){
            grade = "B";
            return true;
        }
        if(m > 49){
            grade = "C";
            return true;
        }
        if(m > 39){
            grade = "D";
            return true;
        }
        grade = "F";
        return true;

    }

    String getGrade(){
        return grade;
    }

    static String seeGrade(int m){
        if (m > 100 && m < 0) {
            return null;
        }

        if(m >89){
            return "A+";
        }
        if(m > 79){
            return "A";
        }
        if(m > 69){
            return  "B";
        }
        if(m > 49){
            return "C";
        }
        if(m > 39){
            return "D";
        }
        return "F";
    }


    Course(String t,String c){
        title = t;
        courseId = c;
    }

    void setAssignment(String a){
        assignment = a;
    }


}
