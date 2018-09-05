package lesson1.Animals;

public class Human implements Participant {
    String name;
    int maxRunDist;
    int maxJumpDist;
    int maxSwimDist;

    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDist = 1000;
        this.maxJumpDist = 2500;
        this.maxSwimDist = 1000;
        this.active = true;
    }
    public void run(int distance){
        if(distance <= maxRunDist){
            System.out.println(name + " Пробежал");

        }else {
            System.out.println(name + " Не пробежал");
            active = false;
        }

    }

    public void jump(int distance){
        if(distance <= maxJumpDist){
            System.out.println(name + " Перепрыгнул");

        }else {
            System.out.println(name + " Не перепрыгнул");
            active = false;
        }

    }
    public void swim(int distance){
        if(distance <= maxSwimDist){
            System.out.println(name + " Проплыл");

        }else {
            System.out.println(name + " Не проплыл");
            active = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void info() {
        System.out.print(name);
    }

}
