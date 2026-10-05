
import java.util.*;
public class FindElement {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Element to Search: ");
        int searchingElement = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == searchingElement){
                found = true;
               System.out.println("Element found at index: " + i);
        }
            }
        if (!found){
            System.out.println("Enter Valid Element");
            }
        }
    }

