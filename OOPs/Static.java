import java.util.*;

public class Static {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "OIPS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    static int returnpercentage(int phy, int chem, int maths){
        return (maths+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}
