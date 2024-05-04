import java.util.*;

public class AccessSpecifier{
    public static void main(String args[]){
        BankAccount ba = new BankAccount();
        ba.username = "CharulTongaria";
        ba.password = "xyz";// can not be accessed
        ba.setPassword("xyz");// canbe changes but not accessed
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}