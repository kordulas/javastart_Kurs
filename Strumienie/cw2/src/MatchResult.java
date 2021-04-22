public class MatchResult{

    private String home;
    private String away;
    private int homeGoals;
    private int awayGoals;

    public MatchResult(String home, String away, int homeGoals, int awayGoals) {
        this.home = home;
        this.away = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public int getGoalDef(){
        return homeGoals - awayGoals;
    }

    boolean containsTeam(String team){
        return home.equals(team) || away.equals(team);
    }

    String[] getTeamNames(){
        return new String[]{home,away};
    }

    int getGoalsSum(){
        return homeGoals + awayGoals;
    }

    @Override
    public String toString() {
        return home + " - " + away + "(" + homeGoals + ":" + awayGoals + ")";
    }
}
