public class lesson1 {
    // 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
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
    // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    // 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
    // которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0; 

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
    // 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
}}



