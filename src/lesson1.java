public class lesson1 {
    // 1. ������� ������ ������ � IntelliJ IDEA, ������� ����� HomeWorkApp, � ��������� � ��� ����� main().
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
    // 2. �������� ����� printThreeWords(), ������� ��� ������ ������ ���������� � ������� ��� �����: Orange, Banana, Apple.
    public static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    // 3. �������� ����� checkSumSign(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� �� ������ ����������,
    // �������� ��������. ����� ����� ������ �������������� ��� ����������, � ���� �� ����� ������ ��� ����� 0,
    // �� ������� � ������� ��������� ������ ��������������, � ��������� ������ - ������ ��������������;
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
    // 4. �������� ����� printColor() � ���� �������� ������� int ���������� value � ��������������� �� ����� ���������.
// ���� value ������ 0 (0 ������������), �� � ������� ����� ������ ������� ��������� ��������, ���� ����� � �������� �� 0 (0 �������������)
// �� 100 (100 ������������), �� �������, ���� ������ 100 (100 �������������) - ��������;
    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 && value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }
    }
    // 5. �������� ����� compareNumbers(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� �� ������ ����������, �������� ��������.
// ���� a ������ ��� ����� b, �� ���������� ������� � ������� ��������� �a >= b�, � ��������� ������ �a < b�;
    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
}}



