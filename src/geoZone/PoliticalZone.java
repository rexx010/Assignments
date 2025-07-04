package geoZone;

public enum PoliticalZone {
    NORTH_CENTRAL("Benue","FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Aba", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"),
    ;
    private String[] state;
    PoliticalZone(String... state){
        this.state = state;
    }

    public String[] getZone() {
        return state;
    }
   public static PoliticalZone getPoliticalZone(String state){
        for (PoliticalZone politicalZone : PoliticalZone.values()) {
            for(String statename : politicalZone.getZone()) {
                if(statename.equalsIgnoreCase(state)){
                    System.out.println("State: " + state + " belongs to " + politicalZone);
                    return politicalZone;
                }
            }
        }
        return null;
   }

}
