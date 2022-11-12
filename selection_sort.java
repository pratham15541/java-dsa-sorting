public class selection_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 9, -4, 10, 3 };
        int smallest;
        for (int i = 0; i < arr.length - 1; i++) {
            smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]>arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }            
        // }
        printArray(arr);

    }
}
