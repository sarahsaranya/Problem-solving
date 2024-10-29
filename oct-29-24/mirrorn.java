import java.util.*;

public class mirrorn {

    static boolean mirror(int n, int m, int[] nn, int[] ns, int[] ms, int[] mm) {
        HashMap<Integer, Stack<Integer>> y = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!y.containsKey(nn[i])) {
                y.put(nn[i], new Stack<Integer>());
            } else {
                y.get(nn[i]).push(ns[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            if (y.containsKey(mm[i]) && y.get(mm[i]).size() > 0) {
                if (y.get(mm[i]).peek() != ms[i])
                    return false;

                y.get(mm[i]).pop();
            }
        }
        return true;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nn = new int[n];
            for (int i = 0; i < n; i++) {
                nn[i] = sc.nextInt();
            }
            int[] ns = new int[n];
            for (int i = 0; i < n; i++) {
                ns[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] mm = new int[m];
            for (int j = 0; j < m; j++) {
                mm[j] = sc.nextInt();
            }
            int[] ms = new int[m];
            for (int i = 0; i < m; i++) {
                ms[i] = sc.nextInt();
            }
            if (mirror(n, m, nn, ns, mm, ms)) {
                System.out.print("True");
            } else {
                System.out.print("false");
            }
        }
    }

}
