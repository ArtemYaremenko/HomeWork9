import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int[] monthPayOuts = {45000, 57000, 85000, 63000, 71000};
        int amountOfPayout = 0;
        for (int sum : monthPayOuts) {
            amountOfPayout += sum;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", amountOfPayout);

        //Task 2
        System.out.println("\nTask 2");
        int[] weekPayOut = {7000, 2000, 4500, 5000, 3500};
        int minWeekPayOut = 999_999_999;
        int maxWeekPayout = -1;
        for (int el : weekPayOut) {
            if (el > maxWeekPayout) {
                maxWeekPayout = el;
            } else if (el < minWeekPayOut) {
                minWeekPayOut = el;
            }
        }
        //Arrays.sort(weekPayOut);
        //minWeekPayOut = weekPayOut[0];
        //maxWeekPayout = weekPayOut[weekPayOut.length - 1];
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей.\n", minWeekPayOut, maxWeekPayout);

        //Task 3
        System.out.println("\nTask 3");
        int[] allMonthPayOuts = {6000, 13000, 10000, 8000, 5000};
        int sumMonthPayOuts = 0;
        double averageMonthPayOut;
        for (int sum : allMonthPayOuts) {
            sumMonthPayOuts += sum;
        }
        averageMonthPayOut = (double)sumMonthPayOuts / allMonthPayOuts.length;
        System.out.printf("Средняя сумма трат за есяц составила %.2f рублей.\n", averageMonthPayOut);

        //Task 4
        System.out.println("\nTask 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int el = reverseFullName.length - 1; el >= 0; el--) {
            System.out.print(reverseFullName[el]);
        }
    }
}
