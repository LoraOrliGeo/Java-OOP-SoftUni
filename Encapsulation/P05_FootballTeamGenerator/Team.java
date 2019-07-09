package Encapsulation.P05_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public boolean hasPlayer(String name) {
        boolean res = false;
        for (Player player : this.players) {
            if (player.getName().equals(name)) {
                res = true;
                break;
            }
        }
        return res;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        this.players.removeIf(pl -> pl.getName().equals(name));
    }

    public double getRating() {
        return this.players.stream().mapToDouble(Player::overallSkillLevel).sum() / this.players.size();
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.name, Math.round(this.getRating()));
    }
}