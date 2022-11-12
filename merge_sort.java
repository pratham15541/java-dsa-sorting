class merge_sort {
    public static void conquer(int arr[], int startingIndex, int mid, int endingIndex) {
        int merged[] = new int[endingIndex - startingIndex + 1];

        int idx1 = startingIndex;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endingIndex) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= endingIndex) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = startingIndex; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int startingIndex, int endingIndex) {
        // base
        if (startingIndex >= endingIndex) {
            return;
        }

        int mid = startingIndex + (endingIndex - startingIndex) / 2; // (startingIndex + endingIndex) / 2
        divide(arr, startingIndex, mid);// first part
        divide(arr, mid + 1, endingIndex);// second part
        conquer(arr, startingIndex, mid, endingIndex);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 9, -4, 10, 3 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}