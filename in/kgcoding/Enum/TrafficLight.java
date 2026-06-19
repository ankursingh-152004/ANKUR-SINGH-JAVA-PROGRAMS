package in.kgcoding.Enum;

public enum TrafficLight {
    RED("Stop"),GREEN("Go"),YELLOW("WAIT");
    private final String action;

    private TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
    
}
