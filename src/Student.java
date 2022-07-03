import java.io.Serializable;

public class Student extends UserDetails implements Serializable {

    private int numberOfCourses=0;
    String department;
    Course courses[] = new Course[10];

    Student(String i,String p,String n,String d){
        id=i;
        password=p;
        name=n;
        department=d;
    }

    public boolean assignCourse(Course obj) {
        try{
            courses[numberOfCourses] = obj;
            numberOfCourses++;
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
