package in.kgcoding.Challenge97;

public enum Day {
    SUNDAY(false),MONDAY(true),TUESDAY(true),WEDNESDAY(true),THURSDAY(true),FRIDAY(true),SATURDAY(false);


    private boolean isWeekday;

    private Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    
    public String getType(){
        return isWeekday?"Weekday":"Weekend";
    }
}
