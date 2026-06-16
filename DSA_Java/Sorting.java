public class Sorting {

    public void bubbleSort() {
        int[] arr = { 13, 46, 24, 52, 20, 9 };

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            boolean didSwap = false;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    didSwap = true;
                }
            }

            if (!didSwap) {
                break;
            }
        }

        System.out.println("After Using Bubble sort");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        System.out.println();

    }

    public void InsertionSort(){

        

    }

}
