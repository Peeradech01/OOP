package Lab02;

public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public Customer(){
        this("", "");
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    
    public Account getAccount(int index){
        return acct[index];    
    }
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount ++;
    
    }
    
    public int getNumOfAccount(){
        return numOfAccount;
    }    
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
        
    public String getLastName(){
        return lastName;
    }
    
    @Override
    public String toString(){
        return firstName+ " " + lastName + " has " +numOfAccount+ " Accounts.";
    }

    
}
