package lesson1;

import lesson1.Animals.*;
import lesson1.Obstractles.*;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Lala", new Cat("Barsik"), new Human("Filipp"), new Dog("Bobik"), new Cat("Musya"));
        Couse couse = new Couse(new Obstracle[]{new Wall(20), new Cross(200), new Water(300)});

        couse.doIt(team);
        team.onDist();




    }
}
