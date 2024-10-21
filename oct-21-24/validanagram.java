import java.util.*;

class validanagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.next();
            String b = sc.next();
            char[] p = a.toCharArray();
            char[] q = b.toCharArray();
            Arrays.sort(p);
            Arrays.sort(q);
            if (Arrays.equals(p, q)) {
                System.out.print("true");
            } else {
                System.out.print("false");
            }
        }
    }
}
