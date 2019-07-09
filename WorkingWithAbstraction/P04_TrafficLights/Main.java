package WorkingWithAbstraction.P04_TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] initialState = reader.readLine().split("\\s+");

        int n = Integer.parseInt(reader.readLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String state : initialState) {
            TrafficLight trafficLight = new TrafficLight(LightStates.valueOf(state));
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < n; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight.toString() + " ");
            }
            System.out.println();
        }
    }
}
