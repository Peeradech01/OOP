import java.util.Scanner;
public class Tax_ex09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double total=0;
        if (salary > 50000){
            total = salary * 0.1; 
        }
        else if (salary <= 50000){
            total = salary * 0.05;
        }
        
        System.out.println(total);
    }
}
