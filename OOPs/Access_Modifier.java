package OOPs;

public class Access_Modifier {
    public static void main(String[] args) {
    
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Akshat Rawat" ;
        myAcc.setPassword("Akshat12345");
    }
    
}

class BankAccount{
    public String username;
    private String password ;

    public void setPassword(String pwd){
        password  = pwd ;
    }
}
