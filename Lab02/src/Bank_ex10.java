import java.util.Scanner;
public class Bank_ex10 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double money = sc1.nextDouble();
        char type = sc2.next().charAt(0);
        double total = 0;
        switch (type) {
            case 'A', 'C':
                total = money * 0.015;
                break;
            case 'B':
                total = money * 0.02;
                break;
            case 'X':
                total = money * 0.05;
                break;
            default:
                break;
        }
        System.out.println("Input your money : "+money);
        System.out.println("Input your account type(Please type A B C or X in uppercase) : "+type);
        System.out.println("Your total money in one year = "+(total+money));
    }
    
}
