public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
        int[] cash = {1500, 1700, 1730, 1650, 1520};
        int sum = 0;
        for (int j : cash) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        int min = 10000;
        int max = 0;
        for (int i : cash) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("Задача 3");
        int days = 30;
        int average = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName =  {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}