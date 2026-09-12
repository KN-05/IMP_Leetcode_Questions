import java.util.*;

public class designhashset705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] hashSet = new boolean[1000001];

        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();
            int key = sc.nextInt();

            if (operation == 1) {
                hashSet[key] = true;
            } else if (operation == 2) {
                hashSet[key] = false;
            } else if (operation == 3) {
                System.out.println(hashSet[key]);
            }
        }
    }
}