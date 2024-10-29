import java.time.LocalDate;

public class mhetod {
    public static void main(String[] args) {

        printIsLeapYear(2024);
    }


    public static void printIsLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "год високосный");
        } else {
            System.out.println(year + "год не високсный");


        }


        public static void printRecommendedAppVersion ( int deviceType, int deviceYear){
            int currentYear = LocalDate.now().getYear();
            if (deviceYear < currentYear) {
                if (deviceType == 0) {
                    System.out.println("Установите облегченную версию для Ios");
                } else {
                    System.out.println("Установите облегченную версию для Android");
                }
            } else {
                if (deviceType == 0) {
                    System.out.println("Установите версию для IOS");
                } else {
                    System.out.println("Установите версию для Android");

                }

            }
        }

        public static int calculateDeliveryDays ( int distance){
            if (distance < 20) {
                return 1;
            } else if (distance < 60) {
                return 2;
            } else if (distance < 100) {
                return 3;
            }
            return -1;
        }
        public static void printDeliveryDays ( int days){
            if (days >= 0) {
                System.out.println("Доставка займет" + days + "дней");
            } else {
                System.out.println("Доставки нет");
            }
        }

    }}



