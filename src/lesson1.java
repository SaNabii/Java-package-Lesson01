public class lesson1 {
    // 1. —оздать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
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
    // 2. —оздайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    // 3. —оздайте метод checkSumSign(), в теле которого объ€вите две int переменные a и b, и инициализируйте их любыми значени€ми,
    // которыми захотите. ƒалее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    // то вывести в консоль сообщение У—умма положительна€Ф, в противном случае - У—умма отрицательна€Ф;
    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0;
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
    // 4. —оздайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
// ≈сли value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение У расныйФ, если лежит в пределах от 0 (0 исключительно)
// до 100 (100 включительно), то У∆елтыйФ, если больше 100 (100 исключительно) - У«еленыйФ;
    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 && value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }
    }
    // 5. —оздайте метод compareNumbers(), в теле которого объ€вите две int переменные a и b, и инициализируйте их любыми значени€ми, которыми захотите.
// ≈сли a больше или равно b, то необходимо вывести в консоль сообщение Уa >= bФ, в противном случае Уa < bФ;
    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
}}



