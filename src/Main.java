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
        int bankAccount = 15000;
        for (int i = 1; bankAccount <= 12_000_000; i++) {
            System.out.println("Месяц " + i + ", на счету " + bankAccount);
            bankAccount = bankAccount + (bankAccount * 7 / 100);
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int contribution = 15000;
        int bankAccount = 0;
        bankAccount = bankAccount + contribution;
        for (int i = 1; bankAccount < 12_000_000; i++) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого: " + bankAccount);
            }
            bankAccount = bankAccount + bankAccount * 7 / 100;
        }
        System.out.println(bankAccount);
    }
    public static void task6() {
        System.out.println("Задание 6");
        int bankAccount = 15000;
        for (int year = 1; year <= 108; year++) {
            if (year % 6 == 0) {
                System.out.println("Месяц " + year + " Итого: " + bankAccount);
            }
            bankAccount = bankAccount + (bankAccount * 7 / 100);
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
        for (int year = 0; year<=2122; year = year +79){
            if (year >= 1822) {
                System.out.println(year);
            }
        }
    }
    public static void task9() {
        // 2-ой способ 8-го задания через while
        System.out.println("Задание 8.1");
            int i = 79;
            while (i<=2122) {
                if (i >= 1822) {
                    System.out.println(i);
                }
                i = i + 79;
            }
    }
}