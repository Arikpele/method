import java.time.LocalDate;

public class Main {
    public static void printIsleapYearResult(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printApplicationVersion(int currentYear, int clientOS, int clientDeviceYear) {
        if (clientOS == 0)
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите  версию приложения для iOS по ссылке.");
            }
        else {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int printTotalDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            day++;
        }
        if (deliveryDistance > 20 || deliveryDistance < 60) {
            day++;
        }
        if (deliveryDistance > 60 || deliveryDistance < 100) {
            day++;
        }
        if (deliveryDistance > 100){
            day++;
        }
            return day;
    }



    public static void main(String[] args) {
      //  task1();
        task2();
     //   task3();
    }

    public static void task1() {
        System.out.println("задача 1");
        int year = 2024;
        printIsleapYearResult(year);
    }

    public static void task2() {
        System.out.println("задача 2");
        int clientDeviceYear = 2024;
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        printApplicationVersion(currentYear, clientOS,clientDeviceYear);
    }

    public static void task3() {
        System.out.println("задача 3");
        int deliveryDistance = 120;
        printTotalDays(deliveryDistance);
        if (printTotalDays(deliveryDistance) < 4)
        {
            System.out.println("Потребуется " + printTotalDays(deliveryDistance) + " дней:");
        }
        else {
            System.out.println("доставки нет");
        }
    }
}
