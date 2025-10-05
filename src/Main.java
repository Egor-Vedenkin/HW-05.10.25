import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] arrayInt = new int[]{1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        int[] myArray = {12, 55, 31, 10, 0, 0, 0};

        // Задача 2
        for (int i = 0; i < arrayInt.length; i++) {
            if (i != arrayInt.length-1) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }

        for (int i = 0; i < arrayDouble.length; i++) {
            if (i != arrayDouble.length-1) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.println(arrayDouble[i]);
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            if (i != myArray.length-1) {
                System.out.print(myArray[i] + ", ");
            } else {
                System.out.println(myArray[i]);
            }
        }

        // Задача 3
        for (int i = arrayInt.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }

        for (int i = arrayDouble.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.println(arrayDouble[i]);
            }
        }

        for (int i = myArray.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(myArray[i] + ", ");
            } else {
                System.out.println(myArray[i]);
            }
        }

        // Задача 4
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}