public class Main {

  public static void main(String[] args) {

    CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);

    a1.showAccount();

    a1.deposit(500);

    System.out.println(a1);

    a1.withdraw("55500");

    System.out.println(a1.toString()); 

  }

}