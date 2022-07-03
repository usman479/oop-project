import java.io.*;

public class MyFiler {

    static boolean setUser(Student obj){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir").toString() + "\\src\\files\\currentuser.txt")));
            oos.writeObject(obj);
            oos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    static boolean setUser(Admin obj){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir").toString() + "\\src\\files\\currentuser.txt")));
            oos.writeObject(obj);
            oos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    static boolean setUser(Teacher obj){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(System.getProperty("user.dir").toString() + "\\src\\files\\currentuser.txt")));
            oos.writeObject(obj);
            oos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public static Admin getAdmin(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir").toString() + "\\src\\files\\currentuser.txt")));
            Admin gotIt = (Admin)ois.readObject();
            return gotIt;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static Student getStudent(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir").toString() + "\\src\\files\\currentuser.txt")));
            Student gotIt = (Student)ois.readObject();
            return gotIt;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public static Teacher getTeacher(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(System.getProperty("user.dir").toString() + "\\src\\files\\currentuser.txt")));
            Teacher gotIt = (Teacher)ois.readObject();
            return gotIt;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    static boolean readFile(Student students[]){
        File file = new File(System.getProperty("user.dir").toString() + "\\src\\files\\studentfile.txt");
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            for(int i=0; i<50; i++){
                students[i] = (Student)ois.readObject();
                System.out.println(students[i].name);
            }
            ois.close();
            return true;
        } catch (EOFException e){
            System.out.println(e + "UUUU");
            return true;
        } catch (Exception e){
            System.out.println(e + "SSSS"); // Snake sound
            return false;
        }
    }

    static boolean readFile(File file, Admin admins[]){

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            for(int i=0; i<50; i++){
                admins[i] = (Admin)ois.readObject();
            }
            ois.close();
            return true;
        } catch (EOFException e){
            System.out.println(e);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    static boolean readFile(Teacher teachers[]){
        File file = new File(System.getProperty("user.dir").toString() + "\\src\\files\\teacherfile.txt");

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            for(int i=0; i<50; i++){
                teachers[i] = (Teacher) ois.readObject();
            }
            ois.close();
            return true;
        } catch (EOFException e){
            System.out.println(e);
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    static void deleteObject(Student obj,Student students[]){
        File file = new File(System.getProperty("user.dir").toString() + "\\src\\files\\studentfile.txt");

        try{
            for (int i=0; i<50; i++){
                if(students[i].id.compareTo(obj.id) == 0){
                    for(int j=i; j<50; j++){
                        students[j] = students[j+1];
                    }
                    break;
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }

        try{
            FileWriter foo = new FileWriter(file);
            foo.write("");
            foo.close();
        } catch (Exception e){
            System.out.println(e+" kiun");
        }

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file,true));
            for(int i=0; i<50; i++) {
                oos.writeObject(students[i]);
            }
            oos.close();
        } catch (Exception e){

        }
    }

    static void deleteObject(Teacher obj,Teacher teachers[]){
        File file = new File(System.getProperty("user.dir").toString() + "\\src\\files\\teacherfile.txt");

        try{
            for (int i=0; i<50; i++){
                if(teachers[i].id.compareTo(obj.id) == 0){
                    for(int j=i; j<50; j++){
                        teachers[j] = teachers[j+1];
                    }
                    break;
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }

        try{
            FileWriter foo = new FileWriter(file);
            foo.write("");
            foo.close();
        } catch (Exception e){
            System.out.println(e+" kiun");
        }

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file,true));
            for(int i=0; i<50; i++) {
                oos.writeObject(teachers[i]);
            }
            oos.close();
        } catch (Exception e){

        }
    }

    static boolean myAppendObject(Student obj,Student students[]){
        File file = new File(System.getProperty("user.dir").toString() + "\\src\\files\\studentfile.txt");
        try{
            MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream(file,true));
            oos.writeObject(obj);
            readFile(students);
            oos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }



    }

    static boolean myAppendObject(Teacher obj,Teacher teachers[]){
        File file = new File(System.getProperty("user.dir").toString() + "\\src\\files\\teacherfile.txt");
        try{
            MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream(file,true));
            oos.writeObject(obj);
            readFile(teachers);
            oos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public static void changeObject(Student obj,Student students[]){
        File file = new File(System.getProperty("user.dir").toString() + "\\src\\files\\studentfile.txt");
//        try{
//            for (int i=0; i<50; i++){
//                if((students[i].id.compareTo(obj.id)) == 0){
//                    System.out.println("AO AO  " + students[i].name);
//                    students[i] = obj;
//                }
//            }
//        } catch (Exception e){
//            System.out.println(e);
//        }

        try{
            FileWriter foo = new FileWriter(file);
            foo.write("");
            foo.close();
        } catch (Exception e){
        }

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file,true));
            for(int i=0; i<50; i++) {
                if (students[i] == null) {
                    oos.close();
                    break;
                }


                oos.writeObject(students[i]);
                System.out.println("JAO JAO  " + students[i].name);
            }
            oos.close();
        } catch (Exception e){

        }
//        readFile(students);
    }
}
