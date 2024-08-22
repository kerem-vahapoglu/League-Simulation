import java.util.List;
import java.util.ArrayList;

public class Team {
    private String name;
    private List<Player> players;
    private int teamStrength;
    private int played;
    private int wins;
    private int draws;
    private int losses;
    private int goalsFor;
    private int goalsAgainst;
    private int points;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.teamStrength = 0;
        this.played = 0;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
        this.points = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
        calculateTeamStrength();
    }

    public void calculateTeamStrength() {
        if (players.isEmpty()) {
            this.teamStrength = 0;
            return;
        }
        int totalStrength = 0;
        for (Player player : players) {
            totalStrength += player.getOverallStrength();
        }
        this.teamStrength = totalStrength / players.size(); // Ortalama güç hesaplama
    }

    public int getTeamStrength() {
        return teamStrength;
    }

    public String getName() {
        return name;
    }

    public void updateStats(int goalsFor, int goalsAgainst) {
        this.played++;
        this.goalsFor += goalsFor;
        this.goalsAgainst += goalsAgainst;

        if (goalsFor > goalsAgainst) {
            this.wins++;
            this.points += 3;
        } else if (goalsFor == goalsAgainst) {
            this.draws++;
            this.points += 1;
        } else {
            this.losses++;
        }
    }

    public int getPlayed() {
        return played;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalDifference() {
        return goalsFor - goalsAgainst;
    }

    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return String.format("%s - P: %d, W: %d, D: %d, L: %d, GF: %d, GA: %d, GD: %d, Pts: %d",
                name, played, wins, draws, losses, goalsFor, goalsAgainst, getGoalDifference(), points);
    }
}
