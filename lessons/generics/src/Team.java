public abstract class Team implements Comparable<Team> {
    private String name;
    private int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int compareTo(Team team) {
       if (this.points > team.getPoints())  {
          return -1;
       }

       if (this.points < team.getPoints()) {
           return 1;
       }

       return 0;
    }

    public abstract void teamChant();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
