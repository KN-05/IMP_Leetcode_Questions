import java.util.*;

public class adjacentzeroes3211 {

    static void generate(String str, int n) {

        // Base case
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        // 1 add kar sakte hain
        generate(str + "1", n);

        // 0 tabhi add hoga jab last character 0 na ho
        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {
            generate(str + "0", n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        generate("", n);

        sc.close();
    }
}