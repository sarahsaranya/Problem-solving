import java.util.*;

class besttimetobuystock {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int[] c = new int[a];
            for (int i = 0; i < a; i++) {
                c[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int max = 0;

            for (int k : c) {
                min = Math.min(min, k);
                max = Math.max(max, k - min);
            }
            System.out.print(max);
        }

    }
}
