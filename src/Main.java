public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int savings = 15_000;
        int depositAmount = 0;
        int needToAccumulate = 2_459_000;
        int month = 0;
        double clientPercentPerMonth = 1.01;
        while (depositAmount < needToAccumulate){
            depositAmount += savings;
            month += 1;
            System.out.println("Месяц " + month + "-й, сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int digit = 0;
        while (digit < 10){
            digit += 1;
            System.out.print(digit + " ");
        }
        System.out.print("\n");
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static void task3() {
        System.out.println("Задание 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10){
            year += 1;
            population = population + (population/1000 * fertility) - (population/1000 * mortality);
            System.out.println("Год " + year + ", численность населения составляет: " + population);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int depositAmount = 15_000;
        int needToAccumulate = 12_000_000;
        int month = 0;
        double clientPercentPerMonth = 1.07;
        while (depositAmount < needToAccumulate){
            depositAmount *= clientPercentPerMonth;
            month += 1;
            System.out.println("Месяц " + month + "-й, сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int depositAmount = 15_000;
        int needToAccumulate = 12_000_000;
        int month = 0;
        double clientPercentPerMonth = 1.07;
        while (depositAmount < needToAccumulate){
            depositAmount *= clientPercentPerMonth;
            month += 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + "-й, сумма накоплений равна " + depositAmount + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        double depositAmount = 15_000;
        int years = 9;
        int month = years * 12;
        double clientPercentPerMonth = 1.07;
        while (month > 1){
            depositAmount *= clientPercentPerMonth;
            month -= 1;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + "-й, сумма накоплений равна " + depositAmount + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int friday = 2;
        int monthDays = 31;
        int weekDays = 7;
        System.out.print("Пятницы текущего месяца по числам: ");
        while (friday <= monthDays){
            System.out.print(friday + " ");
            friday += weekDays;
        }
        System.out.println("\n");
    }

    public static void task8() {
        System.out.println("Задание 8");
        int start = 1823;
        int end = 2123;
        int year = 0;
        int cometFlyBy = 79;
        while (year + cometFlyBy - 1 < end){
            year += cometFlyBy;
            if (year > start){
                System.out.println(year);
            }
        }
    }
}