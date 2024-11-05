import java.util.PriorityQueue;

public class kthlargest {
    static int find(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            p.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (p.peek() < nums[i]) {
                p.remove();
                p.add(nums[i]);
            }
        }
        return p.peek();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 5, 6, 4 };
        int k = 2;
        int ans = find(nums, k);
        System.out.println(ans);
    }
}
