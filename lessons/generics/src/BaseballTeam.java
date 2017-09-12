public class BaseballTeam extends Team {
    private String league;

    public BaseballTeam(String name, int points, String league) {
        super(name, points);
        this.league = league;
    }

    @Override
    public void teamChant() {
        System.out.println("Take me out to the ball game...");
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }
}
