import java.util.*;

class Deletemidstack {

    static void delete(Stack<Integer> a) {
        int len = a.size();
        Vector<Integer> b = new Vector<>();
        while (!a.isEmpty()) {
            b.add(a.pop());
        }
        if (len % 2 == 0) {
            int target = len / 2;
            for (int i = 0; i < len; i++) {
                if (i == target)
                    continue;
                a.push(b.get(i));
            }
        } else {
            int target = (int) Math.ceil(len / 2);
            for (int i = 0; i < len; i++) {
                if (i == target)
                    continue;
                a.push(b.get(i));
            }

        }
        while (!a.isEmpty()) {
            System.out.print(a.pop() + " ");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Stack<Integer> a = new Stack<>();
            for (int i = 0; i < n; i++) {
                a.push(sc.nextInt());
            }
            delete(a);
        }

    }
}
