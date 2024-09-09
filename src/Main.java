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
        System.out.println(arrayFirst[0] + ", " + arrayFirst[1] + ", " + arrayFirst[2]);
        System.out.println(arraySecond[0] + ", " + arraySecond[1] + ", " + arraySecond[2]);
        System.out.println(arrayThird[0] + ", " + arrayThird[1] + ", " + arrayThird[2] + ", " + arrayThird[3] + ", " + arrayThird[4]);

        System.out.println("Task three");
        System.out.println(arrayFirst[2] + ", " + arrayFirst[1] + ", " + arrayFirst[0]);
        System.out.println(arraySecond[2] + ", " + arraySecond[1] + ", " + arraySecond[0]);
        System.out.println(arrayThird[4] + ", " + arrayThird[3] + ", " + arrayThird[2] + ", " + arrayThird[1] + ", " + arrayThird[0]);

        System.out.println("Task four");
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 != 0) {
                arrayFirst[i]++;
            }
        }
        System.out.print(Arrays.toString(arrayFirst));
    }
}