import java.util.*;

class sumoftwonos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            while (b != 0) {
                int carry = a ^ b;
                a = a ^ b;
                b = carry << 1;
            }
            System.out.println(a);
        }
    }
}
