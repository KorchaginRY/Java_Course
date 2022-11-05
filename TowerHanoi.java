// Написать программу, показывающую последовательность действий для игры “Ханойская башня”
// n - высота пирамиды
// i - начальная позиция
// k - куда нужно переместить
// temp - доп. позиция

public class TowerHanoi {
    public static void main(String[] args) {

        Change(3, 1, 2);

    }

    static void Change(int n, int i, int k) {
        if (n == 1) {
            System.out.printf("Переместить OOOдиск 1 c %d -> %d \n ", i, k);
        } else {
            int temp = 6 - i - k;
            Change(n - 1, i, temp);
            System.out.printf("Переместить диск %d c %d -> %d \n ", n, i, k);
            Change(n - 1, temp, k);
        }
    }
}
