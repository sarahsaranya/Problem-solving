import java.util.*;

class celebrityproblem {

    static boolean find(int i, int j, int[][] matrix) {
        return matrix[i][j] == 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int[][] m = new int[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    m[i][j] = sc.nextInt();
                }
            }
            int[] inner = new int[a];
            int[] outer = new int[a];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    int k = find(i, j, m) ? 1 : 0;
                    inner[j] += k;
                    outer[i] += k;
                }
            }
            int flag = 0;
            for (int i = 0; i < a; i++) {
                if (inner[i] == a - 1 && outer[i] == 0) {
                    System.out.print(i);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.print("-1");
            }

        }

    }
}
