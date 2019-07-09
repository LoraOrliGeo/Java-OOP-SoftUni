package Encapsulation.P05_FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        Map<String, Team> teams = new LinkedHashMap<>();

        while (!"END".equals(line = bf.readLine())) {
            String[] tokens = line.split(";");

            String command = tokens[0];
            String teamName = tokens[1];

            try {
                switch (command) {
                    case "Encapsulation.P05_FootballTeamGenerator.Team":
                        teams.putIfAbsent(teamName, new Team(teamName));
                        break;
                    case "Add":
                        String playerName = tokens[2];
                        int endurance = Integer.parseInt(tokens[3]);
                        int sprint = Integer.parseInt(tokens[4]);
                        int dribble = Integer.parseInt(tokens[5]);
                        int passing = Integer.parseInt(tokens[6]);
                        int shooting = Integer.parseInt(tokens[7]);

                        if (!teams.containsKey(teamName)) {
                            System.out.println("Encapsulation.P05_FootballTeamGenerator.Team " + teamName + " does not exist.");
                        } else {
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teams.get(teamName).addPlayer(player);
                        }
                        break;
                    case "Remove":
                        String playerToRemove = tokens[2];

                        if (teams.get(teamName).hasPlayer(playerToRemove)) {
                            teams.get(teamName).removePlayer(playerToRemove);
                        } else {
                            System.out.println("Encapsulation.P05_FootballTeamGenerator.Player " + playerToRemove + " is not in " + teamName + " team.");
                        }
                        break;
                    case "Rating":
                        if (!teams.containsKey(teamName)) {
                            System.out.println("Encapsulation.P05_FootballTeamGenerator.Team " + teamName + " does not exist.");
                        } else {
                            System.out.println(teams.get(teamName).toString());
                        }
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}