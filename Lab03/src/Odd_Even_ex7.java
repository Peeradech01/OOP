import java.util.Scanner;
public class Odd_Even_ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        
        while (true){
            int num = sc.nextInt();
            if (num == -1)
                break;
            else if(num%2 == 0)
                even += 1;
            else
                odd += 1;
        }
        System.out.println("Odd number = "+odd +" and Even number = "+even);
    
    }
    
}
