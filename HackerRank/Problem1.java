import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int query = scanner.nextInt();
       
         for (int i = 0; i < query; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int result = a;
            int base = 1;
            for (int j = 0; j < n;j++){
                result +=  base * b;
                 System.out.print(" "+result);
                 base *= 2;
                
            }
           
         }
         scanner.close();
    }
}