import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {10, 7, 4, 2, 6, 9, 10, 3, 2, 1};
        int count = 1;


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Элемент [" + array[i] + "] повторяется " + count + " раз(а)");
                i = i + count - 1;

            }
            count = 1;
        }
    }

}