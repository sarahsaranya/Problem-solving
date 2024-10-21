import java.util.*;
import java.util.ArrayList;

class twosum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> l = new ArrayList<>();
            int p = 0;
            while (p <= 3) {
                l.add(sc.nextInt());
                p += 1;
            }
            int target = sc.nextInt();
            for (int i = 0; i < l.size(); i++) {
                for (int j = 0; j < l.size(); j++) {
                    if (j != i && l.get(i) + l.get(j) == target) {
                        System.out.print(i + " " + j);
                        return;
                    }
                }
            }
            // another method to find two sum
            for (int i = 0; i < l.size(); i++) {
                int k = l.get(i);
                int find = target - k;
                if (l.contains(find)) {
                    System.out.print(k + " " + find);
                    return;
                }
            }
        }

    }
}