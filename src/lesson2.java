public class lesson2 {

    public static void main(String[] args) {

        // doThree(6,18);
        doSeven(8, 2);
        printPositiveOrNegative(-3, 5);
        printWordNTimes ("Hi" , 6);
        isPositiveOrNegative(-6);
        within10and20(5,15);
    }


    //3. Написать метод, которому в качестве параметра передается целое число.
//* Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static void printPositiveOrNegative(int num, int num1) {
        System.out.println("\ntasks 3.");
        String word = "Positive";
        if (num < 0) word = "Negative";
        String word1 = "Positive";
        if (num > 0) word1 = "Negative";

        System.out.println(word);
        System.out.println(word1);
    }


    //5.* Написать метод, который определяет, является ли год високосным,
//* и возвращает boolean (високосный - true, не високосный - false).
//* Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void doSeven(int year, int year2) {
        System.out.println("\ntasks 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " year. not high");
        else System.out.println(year + " year. leap year");
        if (!(year2 % 4 == 0) || ((year2 % 100 == 0) && !(year2 % 400 == 0)))
            System.out.println(year + " year2. not high");
        else System.out.println(year + " year2. leap year");

    }

//4. Написать метод, которому в качестве аргументов передается строка и число,
//* метод должен отпечатать в консоль указанную строку, указанное количество раз
    public static void printWordNTimes(String value, int b) {
        System.out.println("\ntasks 4.");
        for (int i = 0; i < b; i++){
            System.out.println("String #" + i + ": " + value);
        }

    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    //* метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    public static void isPositiveOrNegative(int a) {
        System.out.println("\ntasks 2.");
        if (a >= 0 ) {
            System.out.println(a + "is positive");
        } else {
            System.out.println(a + "is negative");
        }
    }
//1. Написать метод, принимающий на вход два целых числа и проверяющий,
//* что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//* в противном случае – false.
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;

    }



}












