import java.util.Scanner;

public class Task4 {

    public static void main(String[] arg) {

        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        char[] array = number.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {

                if (array[i] % 10 < array[i+1]%10) {
                    System.out.println(number + " - не образуют");
                }

                //
                return;
            }
        }
        System.out.println(number + " - образуют");
    }
}
