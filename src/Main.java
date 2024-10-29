//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        System.out.println("Задача 2");
        for (int j = 10; j >= 0; j = j - 1) {
            System.out.println(j);
        }

        //Задача 3
        System.out.println("Задача 3");
        for (int k = 1; k <= 17; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int a = 10; a >= -10; a = a - 1) {
            System.out.println(a);
        }
        //Задача 5
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        //Задача 6
        System.out.println("Задача 6");
        for (int b = 1; b <= 14; b++) {
            System.out.println(b * 7);
        }
        //второй способ
        for (int b1 = 7; b1 <= 100; b1 = b1 + 7) {
            System.out.println(b1);
        }
        //Задача 7
        System.out.println("Задача 7");
        for (int c = 1; c <= 600; c = c * 2) {
            System.out.println(c);
        }
        //Задача 8
        System.out.println("Задача 8");
        int total = 0;
        int income = 29000;
        for (int d = 1; d <= 12; d++) {
            total = total + income;
            System.out.println("Месяц " + d + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 9
        System.out.println("Задача 9");
        int totalWithInterest = 0;
        for (int e = 0; e < 12; e++) {
            totalWithInterest = totalWithInterest + totalWithInterest/100;
            totalWithInterest = totalWithInterest + income;
            System.out.println("Месяц " + e + ", сумма накоплений равна " + totalWithInterest + " рублей");
        }
        //Задача 10
        System.out.println("Задача 10");
        for (int f = 1; f <= 10; f++) {
            System.out.println("2*" + f + "=" + f * 2);
        }
    }
}