public class Main {
    public static void main(String[] args) {
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task4() {
        System.out.println("Задание 4");
        int contribution = 12_000_000;
        int bankAccount = 15000;
        int percent = 7;
        for (int year = 1; bankAccount <= contribution; year++) {
            System.out.println("Месяц " + year + ", на счету " + bankAccount);
            bankAccount = bankAccount + (bankAccount * percent/100);
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int contribution = 12_000_000;
        int bankAccount = 15000;
        int percent = 7;
        for (int year = 1; bankAccount <= contribution; year++) {
            if (year % 6 == 0) {
                System.out.println("Месяц " + year + ", на счету " + bankAccount);
            }
            bankAccount = bankAccount + (bankAccount * percent/100);
        }
        System.out.println(bankAccount);
    }
    public static void task6() {
        System.out.println("Задание 6");
        int bankAccount = 15000;
        int percent = 7;
        int saveUp = 9*12;
        for (int year = 1; year <= saveUp; year++) {
            if (year % 6 == 0) {
                System.out.println("Месяц " + year + " Итого: " + bankAccount);
            }
            bankAccount = bankAccount + (bankAccount * percent / 100);
        }
    }
    public static void task7() {
        System.out.println("Задание 7");
        for (int friday = 5; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет!");
        }
    }
    public static void task8() {
        System.out.println("Задание 8");
        int now = 2022;
        int before = now-200;
        int future = now + 100;
        for (int year = 0; year<=future; year = year +79){
            if (year >= before) {
                System.out.println(year);
            }
        }
    }
    public static void task9() {
        // 2-ой способ 8-го задания через while
        System.out.println("Задание 8.1");
        int year = 79;
        int now = 2022;
        int before = now-200;
        int future = now + 100;
            while (year <= future) {
                if (year >= before) {
                    System.out.println(year);
                }
                year = year + 79;
            }
    }
}