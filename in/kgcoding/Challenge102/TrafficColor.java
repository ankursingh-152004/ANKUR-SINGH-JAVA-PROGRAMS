package in.kgcoding.Challenge102;

public enum TrafficColor {
    RED(7000),YELLOW(2000),GREEN(4000);

    private final int onTimeInMillis;

    private TrafficColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }

    

}
