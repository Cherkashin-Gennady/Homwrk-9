import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Задача 1");
        int[] monthlyReport = {56000, 70500, 31270, 90121, 77665};
        int sum = 0;
        for (int index = 0; index < monthlyReport.length; index++) {
            sum += monthlyReport[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Task 2
        System.out.println("Задача 2");
        int[] monthlyReportTvo = {88000, 72500, 111270, 66121, 80665};
        int min = monthlyReportTvo[0];
        int max = monthlyReportTvo[0];

        for (int i = 1; i < monthlyReportTvo.length; i++) {
            if (monthlyReportTvo[i] > max) max = monthlyReportTvo[i];
            else if (monthlyReportTvo[i] < min) min = monthlyReportTvo[i];
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей.");

        //Task 3
        System.out.println("Задача 3");
        int[] arrExpenses = {56000, 70500, 31270, 90121, 77665};
        sum = 0;
        for (int i = 0; i < arrExpenses.length; i++) {
            sum += arrExpenses[i];
        }
        double average = (double) sum / arrExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Task 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
