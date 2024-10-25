public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int sum = 0;
        int [] payments = new int[5];
        payments [0] = 200;
        payments [1] = 400;
        payments [2] = 300;
        payments [3] = 250;
        payments [4] = 900;
        for (int i=0; i<payments.length;i++){
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        System.out.println("Задание №2");
        int [] expenses = new int[7];
        int maxExpense = expenses[0];
        int minExpense = expenses[0];
        expenses [0] = 200;
        expenses [1] = 400;
        expenses [2] = 300;
        expenses [3] = 250;
        expenses [4] = 900;
        expenses [5] = 150;
        expenses [6] = 180;
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
            if (expenses[i] < minExpense) {
                minExpense = expenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей");
        System.out.println("Задание №3");
        int meanExpenses = sum/payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + meanExpenses/7 +" рублей");

        System.out.println("Задание №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}