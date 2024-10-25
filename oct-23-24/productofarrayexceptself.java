
import java.util.Scanner;

class productofarrayexceptself {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int b = sc.nextInt();
            int[] j = new int[b];
            for (int i = 0; i < b; i++) {
                j[i] = sc.nextInt();
            }
            int[] l = new int[b];

            for (int i = 0; i < b; i++) {
                int sum = 1;
                for (int k = 0; k < b; k++) {
                    if (i != k) {
                        sum *= j[k];
                    }
                }
                l[i] = sum;
            }
            for (int i = 0; i < b; i++) {
                System.out.print(l[i] + " ");
            }
        }
    }
}
