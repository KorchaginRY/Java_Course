
public class HeapSort {
    public static void main(String[] args) {

        int[] mas = { 4, 8, 3, 17, 11, 2, 1 };

        
        HeapSort ob = new HeapSort();
        ob.PrintMas(mas);
        System.out.println();
        System.out.println("Sorted mas :");
        ob.sort(mas);
        ob.PrintMas(mas);
        
    }

    public void sort(int arr[]) {
        // формируем дерево
        int len = arr.length;

        for (int i = len /2 -1; i >= 0; i--) {
            modify(arr, len, i);
        }

        for (int j = len - 1; j >= 0; j--) {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;

            modify(arr, j, 0);
        }
    }

    public void modify(int arr[], int n, int i) {

        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[max])
            max = left;

        if (right < n && arr[right] > arr[max])
            max = right;

        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;

            modify(arr, n, max);
        }
    }

    public void PrintMas(int arr[]) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}