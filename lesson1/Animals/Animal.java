package lesson1.Animals;

public class Animal implements Participant {
    String name;
    String type;

    int maxRunDist;
    int maxJumpDist;
    int maxSwimDist;

    boolean onDIstanse;

    public Animal(String name, String type, int maxRunDist, int maxJumpDist, int maxSwimDist) {
        this.name = name;
        this.type = type;
        this.maxRunDist = maxRunDist;
        this.maxJumpDist = maxJumpDist;
        this.maxSwimDist = maxSwimDist;
        this.onDIstanse = true;
    }

    public void run(int distanse) {
        if (distanse <= maxRunDist) {
            System.out.println(type + " " + name + " Успешно пробежал");

        } else {
            System.out.println(type + " " + name + " Не пробежал");
            //onDIstanse = false;
        }
    }


    public void jump(int distanse) {
        if (distanse <= maxJumpDist) {
            System.out.println(type + " " + name + " Успешно перепрыгнул");

        } else {
            System.out.println(type + " " + name + " Не перепрыгнул");
            //onDIstanse = false;
        }
    }

    public void swim(int distanse) {
        if (maxSwimDist == 0) {
            System.out.println(type + " " + name + " Не умеет плавать");
            onDIstanse = false;
            return;
        }
        if (distanse <= maxSwimDist) {
            System.out.println(type + " " + name + " Успешно переплыл");

        } else {
            System.out.println(type + " " + name + " Не переплыл");
            //onDIstanse = false;
        }

    }

    @Override
    public boolean isOnDistance() {
        return onDIstanse;
    }

    @Override
    public void info() {
        System.out.println(type+ " " + name + " " + onDIstanse);
    }

}

