
import java.util.Scanner;

public class first_index_occerence_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        for(int i=0;i<=str1.length()-str2.length();i++){
            int j=0;
            while(j<str2.length() && str1.charAt(i+j) == str2.charAt(j)){
                j++;
            }
                    if(j == str2.length()){
            System.out.println(i);
            break;
             }
            if (i > str1.length() - str2.length()) {
            System.out.println(-1);
        }
    }
    }
}

