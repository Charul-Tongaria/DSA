import java.util.*;

public class CopyConstructor {

    public static void main(String arg[]){
        Student s1 = new Student();
        s1.name = "Charul";
        s1.roll = 36;
        s1.passw = "xyz";
        s1.marks[0] = 99;
        s1.marks[1] = 98;
        s1.marks[2] = 97;
        
        Student s2 = new Student(s1);
        s2.passw = "abc";
        s1.marks[2] = 100;// only refern
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
    
}

class Student{
    String name;
    int roll;
    String passw;
    int marks[];

    //shallow copy constructor
    // Student(Student s1){//copy constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1){//copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            System.out.println(s1.marks[i]);
        }
    }


    Student(){
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        this.passw = passw;
    }
}
