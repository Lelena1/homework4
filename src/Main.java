public class Main {
    public static void main(String[] args) {

        // ДЗ1 Задание 1
        System.out.println("ДЗ1. Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю тебя с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        // ДЗ1 Задание 2
        System.out.println("ДЗ1. Задание 2");
        int age1 = 12;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        if (age1 < 7) {
            System.out.println("Ребенок еще слишком мал, чтобы ходить в школу");
        }

        // ДЗ1 Задание 3
        System.out.println("ДЗ1. Задание 3");
        int capacity = 102;
        int seatPlaces = 60;
        int standPlaces = capacity - seatPlaces;

        int seatUsed = 58;
        int standUsed = 42;
        if (seatUsed < seatPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (standUsed < standPlaces) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (seatUsed >= seatPlaces && standUsed >= standPlaces) {
            System.out.println("Вагон полностью забит");
        }

        // ДЗ2 Задание 1
        System.out.println("ДЗ2. Задание 1");
        int age2 = 19;
        if (age2 >= 18) {
            System.out.println("Поздравляю тебя с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        // ДЗ2 Задание 2
        System.out.println("ДЗ2. Задание 2");
        int age3 = 19;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else if (age3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Ребенок еще слишком мал, чтобы ходить в школу"); //этого условия не было, но без него задача неполная
        }

        // ДЗ2 Задание 3
        System.out.println("ДЗ2. Задание 3");
        int capacity1 = 102;
        int seatPlaces1 = 60;
        int standPlaces1 = capacity1 - seatPlaces1;

        int seatUsed1 = 58;
        int standUsed1 = 40;
        if (seatUsed1 < seatPlaces1) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (standUsed1 < standPlaces1) {
            System.out.println("В вагоне есть стоячие места");
        } else if (seatUsed1 >= seatPlaces1 && standUsed1 >= standPlaces1) {
            System.out.println("Вагон полностью забит");
        }

        // ДЗ3 Задание 1
        System.out.println("ДЗ3. Задание 1");
        int age4 = 25;
        boolean childIsBaby = age4 < 2;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека " + age4 + ", то ему нужно ходить в детский сад");
        } else if (age4 > 6 && age4 <= 18) {
            System.out.println("Если возраст человека " + age4 + ", то ему нужно ходить в школу");
        } else if (age4 > 18 && age4 <= 24) {
            System.out.println("Если возраст человека " + age4 + ", то его место в университете");
        } else if (childIsBaby) {
            System.out.println("Ребенок еще слишком мал, чтобы ходить в детский сад"); // в условии не было, но без этого задача неполная
        } else {
            System.out.println("Если возраст человека " + age4 + ", то ему пора ходить на работу");
        }

        // ДЗ3 Задание 2
        System.out.println("ДЗ3. Задание 2");
        int age5 = 22;
        if (age5 < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (age5 < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Можно кататься на аттракционе без сопровождения взрослого");
        }

        // ДЗ3 Задание 3
        System.out.println("ДЗ3. Задание 2");
        int one = -50;
        int two = 50;
        int three = 150;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        } else if (three > one && three > two) {
            System.out.println("Наибольшее число " + three);
        } else if (one == two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (one == three && one > two) {
            System.out.println("Наибольшее число " + one);
        } else if (two == three && two > one) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Все числа равны");
        }
    }
}