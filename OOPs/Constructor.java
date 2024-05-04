import java.util.*;

public class Constructor {

    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Charul");
        System.out.println(s2.name);
        Student s3 = new Student(36);
        System.out.println(s3.roll);

    }
    

}


class Student{
    String name;
    int roll;

    Student(){//non parameterized
        System.out.println("Constructor is called");
    }

    Student(String name){//parameterized
        this.name = name;
    }

    Student(int roll){//parameterized
        this.roll = roll;
    }
}