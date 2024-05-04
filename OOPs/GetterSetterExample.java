import java.util.*;

public class GetterSetterExample   
{  
    private salary;  
      
    // a setter method that assign a   
    // value to the salary variable  
    void setSalary(int s)  
    {  
        if(s < 0 )  
        {  
            s = -s;  
        }  
          
        this.salary = s;  
    }  
      
      
    // a getter mehtod to retrieve   
    // the salary  
    int getSalary()  
    {  
        return this.salary;  
    }  
      
    public storeSalaryDB(int salary)  
    {  
        // code for storing the salary in the database  
         System.out.println("The ")  
    }  
      
    // main method  
    public static void main(String argvs[])   
    {  
        // creating an object of the class GetterSetterExample          
        GetterSetterExample obj = new GetterSetterExample();      
        
      obj.setSalary(-50000);  
        
      int salary = obj.getSalary();  
        
      // storing salary in database  
      obj.storeSalaryDB(salary);  
  
    }  
}  