import java.util.Scanner;
public class Line_ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        String total = "";
        for (int i=1; i <= num; ++i){
            if (i%5 == 0)
                total += "/";
            
            else
                total += "|";
        }
        System.out.println(total);
        
    }
}
