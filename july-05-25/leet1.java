import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int num : arr) {

            ans.put(num, ans.getOrDefault(num, 0) + 1);

        }
        int l = 0;
        for (Map.Entry<Integer, Integer> en : ans.entrySet()) {
            if (en.getValue() == en.getKey() && en.getKey() > l) {
                l = en.getKey();
            }
        }
        if (l == 0) {
            return -1;
        } else {
            return l;
        }
    }
}