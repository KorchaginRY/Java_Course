public class InsertSort {
    public static void main(String[] args) {

        int mas[] = { 4, 8, 11, 2, 10, 1, 9, 3 };
        InsertSort ob = new InsertSort();
        ob.Sort(mas);
        ob.PrintMas(mas);
    }

    public void Sort(int arr[]) {
        int l = arr.length;

        for (int i = 1; i < l; i++) {
            int current = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > current) {
                    arr[j + 1] = arr[j];
                    arr[j] = current;
                }
            }

        }
    }

    void PrintMas(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
