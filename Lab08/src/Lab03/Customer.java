package Lab03;

import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    
    public Customer(){
        this("", "");
        
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    
    public Account getAccount(int index){
        return (Account)acct.get(index);    
    }
    
    public void addAccount(Account acct){
        this.acct.add(acct);
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
