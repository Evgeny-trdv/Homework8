import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task one");
        int [] arrayFirst = new int [3];
        arrayFirst[0] = 1;
        arrayFirst[1] = 2;
        arrayFirst[2] = 3;
        System.out.println(Arrays.toString(arrayFirst)); //для проверки

        double [] arraySecond = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arraySecond)); //для проверки

        boolean [] arrayThird = {true, true, false, 3<2, arrayFirst[2]<arraySecond[2]};
        System.out.println(Arrays.toString(arrayThird)); //для проверки

        System.out.println("Task two");
        for (int i = 0; i < arrayFirst.length-1; i++) {
            if (i < arrayFirst.length) {
                System.out.print(arrayFirst[i] + ", ");
            }
        }
        System.out.print(arrayFirst[arrayFirst.length-1]);
        System.out.println();

        for (int i = 0; i < arraySecond.length-1; i++) {
            if (i < arraySecond.length) {
                System.out.print(arraySecond[i] + ", ");
            }
        }
        System.out.print(arraySecond[arraySecond.length-1]);
        System.out.println();

        for (int i = 0; i < arrayThird.length-1; i++) {
            if (i < arrayThird.length) {
                System.out.print(arrayThird[i] + ", ");
            }
        }
        System.out.print(arrayThird[arrayThird.length-1]);
        System.out.println();

        System.out.println("Task three");
        for (int i = arrayFirst.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayFirst[i] + ", ");
            }
        }
        System.out.print(arrayFirst[0]);
        System.out.println();

        for (int i = arraySecond.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arraySecond[i] + ", ");
            }
        }
        System.out.print(arraySecond[0]);
        System.out.println();

        for (int i = arrayThird.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayThird[i] + ", ");
            }
        }
        System.out.print(arrayThird[0]);
        System.out.println();

        System.out.println("Task four");
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 != 0) {
                arrayFirst[i]++;
                System.out.print(arrayFirst[i] + " ");
            }
        }
        //System.out.print(Arrays.toString(arrayFirst));
    }
}