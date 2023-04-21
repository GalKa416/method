public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        //task 1
        System.out.print("Задача 1. ");
        int year = 2100;
        printLeapYear(year);

    }

    private static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


    }

}
