package model.kata1.software.ulpgc.es;

public class Team {

    private String name;
    private int matchesPlayed;
    private int lostMatches;
    private int wonMatches;
    private int drawMatches;

    public String getName() {
        return name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getLostMatches() {
        return lostMatches;
    }

    public int getWonMatches() {
        return wonMatches;
    }

    public int getDrawMatches() {
        return drawMatches;
    }

    public Team(String name, int matchesPlayed, int lostMatches, int wonMatches, int drawMatches) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.lostMatches = lostMatches;
        this.wonMatches = wonMatches;
        this.drawMatches = drawMatches;
    }
}
