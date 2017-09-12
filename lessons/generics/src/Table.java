import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table<T extends Team> {
    private String name;
    private List<T> teams = new ArrayList<>();

    public Table(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
       if (teams.contains(team)) {
           System.out.println("Team " + team.getName() + " is already a part of this table.");
           return false;
       }

       teams.add(team);
       return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printTeamsInOrder() {
        Collections.sort(teams);

        for (Team team : teams) {
            System.out.println("Team: " + team.getName() + " with " + team.getPoints() + " points.");
        }
    }
}
