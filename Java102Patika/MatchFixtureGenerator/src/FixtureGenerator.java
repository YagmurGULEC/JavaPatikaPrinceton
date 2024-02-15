import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class FixtureGenerator {
    private List<String> teams;
    FixtureGenerator(List<String> teams){
        //check if the number of teams is even
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
        this.teams = teams;
    }
    public List<List<String>> generateFixtures(){
        List<List<String>> rounds = new ArrayList<>();

        int numberOfRounds = teams.size() - 1;
        int halfSize = teams.size() / 2;
        List<String> teamsCopy = new ArrayList<>(teams);
        teamsCopy.remove(0);
        int teamsSize = teamsCopy.size();
        for (int round = 0; round < numberOfRounds; round++) {
            List<String> roundList = new ArrayList<>();
            int teamIdx = round % teamsSize;
            roundList.add(teams.get(0));
            roundList.add(teamsCopy.get(teamIdx));
            for (int idx = 1; idx < halfSize; idx++) {
                int firstTeam = (round + idx) % teamsSize;
                int secondTeam = (round + teamsSize - idx) % teamsSize;
                roundList.add(teamsCopy.get(firstTeam));
                roundList.add(teamsCopy.get(secondTeam));

            }
            rounds.add(roundList);
        }
        return rounds;
    }

    public static void main(String[] args) {
        List <String> teams = new ArrayList<>(List.of("Galatasaray", "Bursaspor", "Fenerbahce", "Besiktas", "Basaksehir", "Bursaspor","Boluspor"));
        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);
        List<List<String>> rounds = fixtureGenerator.generateFixtures();
        for (List<String> round : rounds)
        {
            System.out.println(round);
        }
    }
}
