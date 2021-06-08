public class lesson1 {
    public static void main(String[] args){

        printThreeWords();
        checkSumSign();
        String printColor; int value;


        System.out.println(printColor(105));
        System.out.println(printColor(-5));
        System.out.println(printColor(20));

        System.out.println(compareNumbers(20, 15));

        if (checkSumSign(20, 50)) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }



    }
    public static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0; //10+15 >= 0
    }

    public static void checkSumSign() {
        int a = 20;
        int b = 50;
        int sum = 70;
        if ((a + b) >= 0) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }

    }
    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 && value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }
    }
    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
}}



