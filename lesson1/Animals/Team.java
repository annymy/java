package lesson1.Animals;

import lesson1.Obstractles.Obstracle;

public class Team{
    String name;
    Participant []team;

    public Participant[] getTeam(){
        return team;
    }

    public Team(String name, Participant... participants){
        this.name = name;
        this.team = participants;
    }

    public void display(){
        System.out.println(name);
        for (Participant a:team) {
            a.info();
        }
        System.out.println();
    }

    public void onDist(){
        for (Participant a:team) {
                if (a.isOnDistance()) {
                   a.info();
                }
            }

    }

}
