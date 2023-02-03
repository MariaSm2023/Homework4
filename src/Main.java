public class Main {
    public static void main(String[] args) {
        int age = 18;
        System.out.println("Тебе 18 лет");
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Ты несовершеннолетний, нужно подождать");
        }
        int temp = 3;
        System.out.println("На улице " + temp + " градуса");
        if (temp <= 3) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp > 3) {
            System.out.println("Можно гулять без шапки");
        }
        int speed = 70;
        System.out.println("Твоя скорость " + speed);
        if (speed > 60) {
            System.out.println("Ты нарушил правила, тебе выпишут штраф");
        }
        if (speed <= 60) {
            System.out.println("Можно ездить спокойно");
        }
        int age2 = 9;
        System.out.println("Тебе " + age2 + " лет");
        int age3 = 8;
        System.out.println("Твой возраст " + age3);
        if (age3 > 2 && age3 < 6) {
            System.out.println("Ты можешь ходить в детский сад");
        } else {
            System.out.println("Ты не можешь ходить в детский сад");
        }
        int age4 = 8;
        System.out.println("Твой возраст " + age4);
        if (age4 > 7 && age4 < 18) {
            System.out.println("Ты должен ходить в школу");
        } else {
            System.out.println("Ты не должен ходить в школу");
        }
        int age5 = 22;
        System.out.println("Твой возраст " + age5);
        if (age5 > 18 && age5 < 24) {
            System.out.println("Твое место в университете");
        } else {
            System.out.println("Ты не студент");
        }
        int age6 = 27;
        if (age6 > 25) {
            System.out.println("Тебе пора на работу");
        }
        int age7 = 8;
        System.out.println("Твой возраст " + age7);
        if (age7 < 5) {
            System.out.println("Тебе нельзя кататься на атракционе");
        }
        if (age7 > 5 && age7 < 14) {
            System.out.println("Тебе можно кататься только в сопровождении взрослого");
        } else {
            System.out.println("Тебе нельзя кататься");
        }
        if (age7 > 14) {
            System.out.println("Тебе можно кататься одному");

        }

        int train = 102;
        int sit = 60;
        int standUp = train - sit;
        int people = 59;
        System.out.println("В вагоне " + people + " человек");
        if (people > sit) {
            System.out.println("остались только места стоя");
        } else {
            System.out.println("ты можешь найти сидячее место");
        }

        int one = 3;
        int two = 5;
        int three = 8;
        if (one > two && one > three) {
            System.out.println("Наибольшее число из трех равно " + one);
        }
        if (two > one && two > three) {
            System.out.println("Наибольшее число из трех равно " + two);
        } else {
            System.out.println("Наибольшее число из трех равно " + three);
        }
    }
}
