public class Main {
    public static void main(String[] args) {
        FootballTeam ravens = new FootballTeam("Ravens", 3, "Raven");
        FootballTeam cowboys = new FootballTeam("Ravens", 1, "Rowdy");
        FootballTeam texans = new FootballTeam("Texans", 5, "Toro");

        Table<FootballTeam> afcWest = new Table<>("AFC West");
        afcWest.addTeam(ravens);
        afcWest.addTeam(cowboys);
        afcWest.addTeam(texans);

        afcWest.printTeamsInOrder();

        BaseballTeam marlins = new BaseballTeam("Marlins", 4, "AL");
        BaseballTeam astros = new BaseballTeam("Astros", 5, "AL");
        BaseballTeam orioles = new BaseballTeam("Orioles", 0, "NL");

        Table<BaseballTeam> worldSeries = new Table<>("World Series");

        worldSeries.addTeam(marlins);
        worldSeries.addTeam(astros);
        worldSeries.addTeam(orioles);

        worldSeries.printTeamsInOrder();

        marlins.teamChant();
        cowboys.teamChant();
    }
}

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.