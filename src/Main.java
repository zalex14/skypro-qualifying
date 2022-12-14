public class Main {
    public static void main(String[] args) {
        task1_0(); // helloworld
        task1_1(); //
        task1_2(); //
        task1_3(); //
        task1_4(); //
        task1_5(); //
        task1_6(); //
        task1_7(); //
        task1_8(); //
    }

    public static void task1_0() {
        System.out.println("\n1.0 helloworld");
        System.out.println("Привет, Мир!");
    }

    public static void task1_1() {
        System.out.println("\n1.1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);
    }

    public static void task1_2() {
        var dog = 8;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4.0;
        var paper = 763789;
        paper = paper + 4;

        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);
    }

    public static void task1_3() {
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }


    public static void task1_4() {
        System.out.println("\n1.4");
        var friend = 19;
        System.out.println("friend = " + friend);

        friend = friend * 2;
        System.out.println("friend * 2 = " + friend);

        friend = friend / 7;
        System.out.println("Целочисленный остаток деления friend / 7 = " + friend);
    }

    public static void task1_5() {
        System.out.println("\n1.5");
        var frog = 3.5;
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);

        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);

        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
    }

    public static void task1_6() {
        System.out.println("\n1.6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        var differenceWeight1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами бойцов (вычитание) = " + differenceWeight1 + " кг");

        var differenceWeight2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между весами бойцов (остаток деления) = " + differenceWeight2 + " кг");
    }

    public static void task1_7() {
        var weightBoxer1 = 70.2;
        var weightBoxer2 = 80.7;

        var differenceWeight1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами бойцов (вычитание) = " + differenceWeight1 + " кг");

        var differenceWeight2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между весами бойцов (остаток деления) = " + differenceWeight2 + " кг");
    }

    public static void task1_8() {
        System.out.println("\n1.8");
        var workingHours = 640;
        var durationHours = 8;

        var totalWorkers = workingHours / durationHours;
        System.out.println("Всего работников в компании –  " + totalWorkers + " человек");

        var newWorkers = totalWorkers + 94;
        var newWorkingHours = newWorkers * durationHours;
        System.out.println("Если в компании работает  " + newWorkers + " человек, то всего " + newWorkingHours + " часов работы может быть поделено между сотрудниками");
    }

}