public class Main {
    public static void main(String[] args) {

//Задача №1
        int years = 17;
        if (years >= 18) {
            System.out.println("Если возраст человека равен " + years + " то вам 18 или более лет!");
        } else {
            System.out.println("Вам " + years + " лет возраст совершеннолетия"
                    + " еще не наступил, нужно немного подождать.!");
        }
        System.out.println();
        //Задача №2
        int tempOnOutside = 15;
        if (tempOnOutside < 5) {
            System.out.println("На улице " + tempOnOutside + " на улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + tempOnOutside + " Сегодня тепло, можно идти без шапки");
        }
        System.out.println();
        //Задача №3
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + " то можно ехать спокойно!");
        }
        System.out.println();
        //Задача №4
        int kid = 6;
        int young = 15;
        int youngMan = 22;
        int workMan = 35;

        if (kid >= 2 && kid <= 6) {
            System.out.println("Если возраст человека равен " + kid + " , то ему " + "нужно ходить в детский сад!");
        }
        if (young >= 7 && kid <= 17) {
            System.out.println("Если возраст человека равен " + young + " , то ему " + "нужно ходить в школу!");
        }
        if (youngMan >= 18 && youngMan <= 24) {
            System.out.println("Если возраст человека равен " + youngMan + " , то ему " + "нужно ходить в университет!");
        }
        if (workMan > 24) {
            System.out.println("Если возраст человека равен " + workMan + " , то ему " + "нужно ходить на работу!");
        }
        System.out.println();
//Задача №5


        int kids = 3;
        int youngs = 10;
        int youngMans = 17;
        if (kids < 5) {
            System.out.println("Если возраст ребенка равен " + kids + " то ему нельзя кататься на аттракционе");
        }
        if (youngs >= 5 && youngs <= 14) {
            System.out.println("Если возраст ребенка равен " + youngs + " то может кататься только в сопровождении взрослого");
        }
        if (youngMans >= 14) {
            System.out.println("Если возраст ребенка равен " + youngMans + " то может кататься без сопровождении взрослого");
        }
        System.out.println();
        //Задача №6
        int carriage = 102;
        int sittingPlace = 60;
        int peopleInCarriage = 17;

        if (peopleInCarriage < sittingPlace) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        if (peopleInCarriage >= sittingPlace && peopleInCarriage < carriage) {
            System.out.println("В вагоне есть только стоячие места");
        }
        if (peopleInCarriage >= carriage) {
            System.out.println("В вагоне нет мест");
        }
        System.out.println();
        //Задача №7
        int one = 1000;
        int two = 200;
        int three = 100;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else {
            if (two > three) {
                System.out.println("Наибольшее число " + two);
            } else {
                System.out.println("Наибольшее число " + three);
            }
        }
    }
}