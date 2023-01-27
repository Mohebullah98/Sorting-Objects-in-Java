class Player implements Comparable<Player> {
    private String name;
    private int goals;
    private int assists;

    Player(String name, int goals, int assists) {
        this.name = name;
        this.goals = goals;
        this.assists = assists;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    // Sorting by implementing Comparable and overriding compareTo method
    public int compareTo(Player other) {
        int result = other.goals - goals;
        // If goals are equal, order by assists, otherwise return original result.
        return result == 0 ? other.assists - assists : result;
    }
}