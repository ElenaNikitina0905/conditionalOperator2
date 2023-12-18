public class Main {
    public static void main(String[] args) {

        // 1
        boolean clientOS = true;

        if (!clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // 2
        boolean clientOS2015 = true;
        int year = 2009;

        if (clientOS2015) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (!clientOS2015) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        // 3
        int Year = 2023;

        if (Year < 1584) {
            System.out.println(Year + " год не определен");
        } else if (Year > 1584 && Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println(Year + " год является високосным");
        } else {
            System.out.println(Year + " год не является високосным");
        }

        // 4
        int deliveryDistance = 110;
        int day = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            day++;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }

        // 5
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}



