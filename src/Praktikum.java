import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: (чтобы выйти из программы нажмите 0)");
        int year = scanner.nextInt();
        while (true) {
            if (year == 0) {
                break;
            } else if (isLeapYear(year) == true) {
                System.out.println("12.09." + year);
            } else {
                System.out.println("13.09." + year);
            }
            System.out.println("Введите год:");
            year = scanner.nextInt();
        }
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if (year % 4 != 0) { // делится с остатком
            return false;
        } else if (year % 100 != 0) { // делится с остатком
            return true;
        } else if (year % 400 == 0) { // без остатка
            return true;
        }
        return false;

    }
}