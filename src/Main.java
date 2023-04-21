public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        //task 1

        int year = 2100;
        printLeapYear(year);
        //task 2
        installApp();
        //task 3
        deliveryTime();
    }

    private static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println(" Задача 1. Год является високосным");
        } else {
            System.out.println(" Задача 1. Год не является високосным");
        }


    }

    public static void installApp() {
        int clientOS = 0;
        int currentYear = 2011;
        if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Задача 2. Установите версию приложения для  IOS по ссылке ");
        } else if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Задача 2.Установите облегченную версию приложения для  IOS по ссылке ");
        }
        if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Задача 2.Установите версию приложения для  Android  по ссылке");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Задача 2.Установите облегченную версию приложения для  Android  по ссылке");
        }
    }

    public static void deliveryTime()

    {
        int deliveryDistance = 95;
        int days = -1;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        }
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}