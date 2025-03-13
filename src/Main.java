public class Main {
    public static void main(String[] args) {
        //Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalMass = firstBoxer + secondBoxer;
        System.out.println(totalMass);
        var differenceWeights = secondBoxer - firstBoxer;
        System.out.println(differenceWeights);

        //Задание 7
        var boxersRemains = secondBoxer % firstBoxer;
        System.out.println(boxersRemains);

        //Задание 8
        var workingHours = 640;
        var workingDay = 8;
        var numberEmployees = workingHours / workingDay;
        System.out.println("Всего работников в компании — " + numberEmployees + " человек");

        numberEmployees = numberEmployees + 94;
        workingHours = numberEmployees * workingDay;
        System.out.println("Если в компании работает " + numberEmployees + " человека, то всего " + workingHours + " часов работы может быть поделено между сотрудниками");


    }
}

