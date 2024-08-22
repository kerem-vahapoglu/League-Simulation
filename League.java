import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class League {
    private List<Team> teams;
    private List<Match> fixtures;
    private List<String> results;

    public League() {
        teams = new ArrayList<>();
        fixtures = new ArrayList<>();
        results = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void generateFixtures() {
        int numTeams = teams.size();
        if (numTeams < 2) {
            throw new IllegalArgumentException("En az iki takım olmalıdır.");
        }

        fixtures.clear(); // Önceki fikstürleri temizle

        // İç saha ve deplasman eşleşmeleri oluşturulacak
        List<Team> homeTeams;
        List<Team> awayTeams;

        // İlk yarı fikstürlerini oluştur
        List<Team> scheduledMatches = new ArrayList<>(teams);
        for (int round = 0; round < numTeams - 1; round++) {
            homeTeams = new ArrayList<>(scheduledMatches);
            awayTeams = new ArrayList<>(scheduledMatches);

            for (int i = 0; i < numTeams / 2; i++) {
                Team home = homeTeams.get(i);
                Team away = awayTeams.get(numTeams - 1 - i);

                if (!home.equals(away)) {
                    fixtures.add(new Match(home, away));
                }
            }

            rotateTeams(scheduledMatches);
        }

        // İkinci yarı fikstürlerini oluştur (saha değişimi)
        List<Match> firstHalfFixtures = new ArrayList<>(fixtures);
        fixtures.clear(); // Önceki fikstürleri temizle

        // İlk yarı iç saha ve deplasman maçlarını ekle
        fixtures.addAll(firstHalfFixtures);

        // İkinci yarı: ev sahibi ve deplasman değiştirilir
        for (Match match : firstHalfFixtures) {
            Team team1 = match.getTeam1();
            Team team2 = match.getTeam2();
            fixtures.add(new Match(team2, team1)); // Ev sahibi ve deplasman değiştirilir
        }
    }

    private void rotateTeams(List<Team> teams) {
        Team last = teams.remove(teams.size() - 1);
        teams.add(1, last);
    }

    public void playLeague() {
        int totalWeeks = fixtures.size() / (teams.size() / 2);
        int week = 1;
        int matchesPerWeek = teams.size() / 2;
        int matchIndex = 0;

        while (matchIndex < fixtures.size()) {
            System.out.println("Hafta " + week + " maçları:");
            int matchesThisWeek = 0;

            while (matchesThisWeek < matchesPerWeek && matchIndex < fixtures.size()) {
                Match match = fixtures.get(matchIndex);
                match.playMatch();
                String result = match.getResult();
                System.out.println(result);
                results.add("Hafta " + week + ": " + result);
                matchesThisWeek++;
                matchIndex++;
            }

            System.out.println();
            printStandings(week); // Haftalık puan durumu
            week++;
        }
    }

    public void printStandings(int week) {
        System.out.println(week + ". hafta puan sıralaması");
        System.out.println("Güç  İsim         Maç İstatistikleri");

        teams.sort(Comparator.comparingInt(Team::getPoints)
                .thenComparingInt(Team::getGoalDifference)
                .thenComparingInt(Team::getGoalsFor)
                .thenComparing(Team::getWins)
                .reversed());

        for (Team team : teams) {
            System.out.printf("%2d %-12s O:%d G:%d B:%d M:%d A:%d Y:%d AVG:%d P:%d%n",
                    team.getTeamStrength(),
                    team.getName(),
                    team.getPlayed(),
                    team.getWins(),
                    team.getDraws(),
                    team.getLosses(),
                    team.getGoalsFor(),
                    team.getGoalsAgainst(),
                    team.getGoalDifference(),
                    team.getPoints());
        }
        System.out.println();
    }
}
