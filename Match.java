public class Match {
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = 0;
        this.score2 = 0;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void playMatch() {

        this.score1 = (int)(Math.random() * 5);
        this.score2 = (int)(Math.random() * 5);

        // Güncelleme istatistikleri
        team1.updateStats(score1, score2);
        team2.updateStats(score2, score1);
    }

    public String getResult() {
        return team1.getName() + " " + score1 + " - " + score2 + " " + team2.getName();
    }
}
