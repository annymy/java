package lesson1.Obstractles;

import lesson1.Animals.Participant;
import lesson1.Animals.Team;

public class Couse {
    private Obstracle[] obstracles;

    public Couse(Obstracle [] obstracles){
        this.obstracles = obstracles;
    }

    public void doIt(Team team){
        for (Participant p: team.getTeam()){
            for (Obstracle o:obstracles){
                o.doIt(p);
                if (!p.isOnDistance()) break;
            }
        }
    }
}
