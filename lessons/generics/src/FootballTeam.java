public class FootballTeam extends Team {
    private String mascot;

    public FootballTeam(String name, int points, String mascot) {
        super(name, points);
        this.mascot = mascot;
    }

    @Override
    public void teamChant() {
        System.out.println("D Fence! D Fence!");
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }
}
