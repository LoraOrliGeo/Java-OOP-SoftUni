package WorkingWithAbstraction.P04_TrafficLights;

public class TrafficLight {
    private LightStates state;

    public TrafficLight(LightStates state) {
        this.state = state;
    }

    public void update(){
        switch (this.state){
            case RED:
                this.state = LightStates.GREEN;
                break;
            case GREEN:
                this.state = LightStates.YELLOW;
                break;
            case YELLOW:
                this.state = LightStates.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
