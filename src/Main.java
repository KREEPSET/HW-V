public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ты совершеннолетний.");
        } else if (age1 < 18)
            System.out.println("Если возраст человека равен " + age1 + ", то ты не достиг совершеннолетния, нужно немного подождать.");
        System.out.println();

        System.out.println("Задание 2");
        int temperature1 = 18;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов" + ", нужно надеть шапку.");
        } else if (temperature1 > 5)
            System.out.println("На улице " + temperature1 + " градусов" + ", можно идти без шапки.");
        System.out.println();

        System.out.println("Задание 3");
        int speed1 = 56;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф.");
        } else if (speed1 < 60)
            System.out.println("Если скорость " + speed1 + ", можно ездить спокойно.");
        System.out.println();

        System.out.println("Задание 4");
        int Age = 3;
        if (Age >= 2 && Age <= 6) {
            System.out.println("Ваш возраст " + Age + " , Вы должны ходить в садик");
        } else if (Age >= 7 && Age <= 18) {
            System.out.println("Ваш возраст " + Age + " , Вы должны ходить в школу");
        } else if (Age > 18 && Age <= 24) {
            System.out.println("Ваш возраст " + Age + " , Вы должны ходить в университет");
        } else if (Age > 24) {
            System.out.println("Ваш возраст " + Age + " , Вы должны ходить на работу");
        } else if (Age == 0)
            System.out.println("Вы ввели некорректные данные");
        System.out.println();

        System.out.println("Задание 5");
        int ageKid = 16;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , то ему нельзя кататься на аттракционе.");
        } else if (ageKid > 5 && ageKid < 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , то ему можно кататься в сопровождении взрослого.");
        } else if (ageKid > 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , то ему можно кататься без сопровождения взрослого.");
            System.out.println();

            System.out.println("Задание 6");
            int people = 103;
            int carriageTrain = 102;
            int seating = 60;
            int standing = carriageTrain - seating;
            if (people < 102) {
                System.out.println("Места есть.");
                if (people < seating)
                    System.out.println("Сидячие места");
                if (people > seating)
                    System.out.println("Стоячие места");
                } else if (people > 102)
                    System.out.println("Мест нет");
                System.out.println();

                System.out.println("Задание 7");
                int one = 1;
                int two = 2;
                int three = 3;
                if (one < two && two < three) {
                    System.out.println("Three is biggest");
                } else if (one < two) {
                    System.out.println("Two biggest");
                } else if (two < three) {
                    System.out.println("Three biggest");
                }
            }
        }
    }




