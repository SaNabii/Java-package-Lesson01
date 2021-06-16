import java.util.Arrays;

public class HomeworkDZ3 {

    public static void main(String[] args){
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] s = {0, 1, 1, 0, 1, 0, 1, 0, 0, 1};
        System.out.println("Original array - " + Arrays.toString(s));
        System.out.println("Array inverted - " + Arrays.toString(invert(s)));
        System.out.println("******** ");
//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] a = new int[100];
        System.out.println("New array filled - " + Arrays.toString(fill(a)));
        System.out.println("*********** ");
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Original array     - "+ Arrays.toString(mas));
        System.out.println("Change less than 6 - "+ Arrays.toString(findAndMultiply(mas)));
        System.out.println("**************** ");
// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int size =10;
        int[][]  arr = new int[size][size];
        crossFill(arr);
        printArray2("4. Result fill diagonals",arr);
        System.out.println("***********");
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;
        int[]returningArray=returningArray(15,444);
        System.out.print("returning Array\t"+Arrays.toString(returningArray(15,444)));
        System.out.println("***********");
      //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] MaxMin= findMax(mas);


    }
    public static int[] returningArray  (int len, int initialValue){
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
            System.out.print("[" + i + "]" + a[i] + " ");
        }
        return a;
    }

    public static void printArray2(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void crossFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    public static int[] findAndMultiply(int[]mas){
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6){
                mas[i] = mas[i]*2;
            }
        }

        return mas;
    }


    public static int[] fill(int[] a) {
        for (int i = 0, j = 1; i < a.length; i++, j=j+1) {
            a[i] = j;
        }
        return a;
    }

    public static int[] invert(int[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != 0) {
                s[i] = 0;
            } else s[i] = 1;
        }
        return s;



    }

    public static int[] findMax(int[]b) {
        int[] mas = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
        for(i = 0; i != mas.length; i++)
        {
            if(mas[i] < min){
                min = mas[i];
                imin = i;
            }
            if(mas[i] > max){
                max = mas[i];
                imax = i;
            }
            System.out.println("max = "+max+" min = "+min);
            System.out.println("imax = "+imax+" imin = "+imin);
        }
        return mas;

    }
}










