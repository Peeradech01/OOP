public class CheckingAccount extends Account{
    private double credit;

    public CheckingAccount(){
        this(0, "", 0);
        
    }
    
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
        
    }
    
    public void setCredit(double credit){
        if (credit >= 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }    
    }
    
    public double getCredit(){
        return credit;
    }
    
    @Override
    public void withdraw(double a) throws WithdrawException{
        if (a > 0){
            
            if (this.balance - a >= 0){
                this.balance -= a;
                System.out.println(a + " baht is withdrawn from "+this.name+" and your credit balance is "+this.credit+".");
            }
            
            else if ((this.balance - a < 0) &&(this.balance - a + this.credit >= 0)){
                this.credit = this.balance - a + this.credit;
                this.balance = 0;
                System.out.println(a + " baht is withdrawn from "+this.name+" and your credit balance is "+this.credit+".");
            }
        
            else if ((this.balance - a < 0) &&(this.balance - a + this.credit < 0)){
                throw new WithdrawException("Account "+ this.name + " has not enough money!");
            }
        }
        
        else{
            super.withdraw(a);
        }
    }
    
    public void withdraw(String a) throws WithdrawException{
        this.withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return "The "+this.name+" account has "+this.balance+" baht and "+this.credit+" credits.";
    }
    
}
