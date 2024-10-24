//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] f = {300, 600, 900, 1200, 1500};
        int total = 0;
        for (int value : f) {
            total += value;
        }
        System.out.println("Сумма трат за месяц составила" + total + "рубли");


        System.out.println("Tsk2");
        int[] f1 = {300, 600, 900, 1200, 1500};
        int min = f1[0];
        int max = f1[0];
        for (int value : f1) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;

            }
        }
        System.out.println("Минимальная сумма трат за день составила" + min + "рублей");
        System.out.println("Максимальная сумма трат за день составила" + max + "рублей");

        System.out.println("Task3");
        int[] f2 = {300, 600, 900, 1200, 1500};
        int total1 = 0;
        for (int value1 : f2) {
            total1 += value1;
        }
        int a = f2.length;
        double average = total1 / a;
        System.out.println("Средняя Сумма трат  за месяц составила" + average + "рублей");

        System.out.println("Task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}
