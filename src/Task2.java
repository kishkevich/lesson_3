import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {10, 7, 4, 2, 6, 9, 10, 3, 2, 10};
        int i;
        int j;
        int num = 0;
        int count_repeat = 0;
        int max_repeat = 0;

        System.out.println(Arrays.toString(arr));

        for (i = 0; i < array.length; i++) {
            count_repeat = 1;

            for (j = i + 1; j < array.length; j++) {
                num = array[i];

                if (array[i] == array[j] && (j != i)) {
                    count_repeat++;
                }
            }
            if ((max_repeat <= count_repeat) && (count_repeat != 1)) {
                max_repeat = count_repeat;
                System.out.println("Число [" + num + "] встречается: " + max_repeat);
            }
        }
        if (max_repeat == 0) {
            System.out.println("Числа в массиве НЕ повторяются ");


        }
    }

}