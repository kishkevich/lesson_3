public class Task3 {

    public static void main(String[] args) {

        int[] array = {99, 44, 45, 23, 66};
        for (int i = 0; i < array.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = array.length;
        int temp;

        for (int i = 0; i < n / 2; i++) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}