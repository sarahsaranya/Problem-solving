class greaterelement {

    static void print(int arr[], int l) {
        int next;
        for (int i = 0; i < l; i++) {
            next = -1;
            for (int j = i + 1; j < l; j++) {
                if (arr[j] > arr[i]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "--" + next);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        int len = arr.length;
        print(arr, len);
    }
}
