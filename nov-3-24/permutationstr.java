import java.util.*;

class permutationstr {
    static void permutation(String k, String ans) {
        if (k.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < k.length(); i++) {
            char ch = k.charAt(i);
            String rr = k.substring(0, i) + k.substring(i + 1);

            permutation(rr, ans + ch);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.next();
            permutation(a, "");
        }
    }
}
