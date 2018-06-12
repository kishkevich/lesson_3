
import java.util.Arrays;

public class Task3_1 {
    public static void main(String[] args) {
        int[] numberArray = {54, -956, 2, 0, 4567, -5, 224, -89, 345, 1};
        int min = numberArray[0];
        int max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
                System.out.println(min);
                numberArray[i] = 0;
            }
            if (max < numberArray[i]) {
                max = numberArray[i];
                System.out.println(max);
                numberArray[i] = 99;
            }
        }
        System.out.println(Arrays.toString(numberArray));

    }
}
