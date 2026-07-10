
import java.util.*;
public class twosumII {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of Array: ");
     int n = sc.nextInt();
     int[] num = new int[n];
     System.out.println("Enter" + " " + n +" "+ "Elements of array: ");
     for(int i=0;i<n;i++){
        num[i] = sc.nextInt();
     }
     System.out.println("Enter your target value: ");
     int target = sc.nextInt();
     boolean found = false;
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(num[i] + num[j] == target){
                System.out.println("Target values are: ");
                System.out.print(i+1);
                System.out.print(" ");
                System.out.print(j+1);
                found = true;
                break;
            }
        }
        if(found){
            break;
        }
     }
     if(!found){
        System.out.println("No pair found");
     }

    }
    
}
