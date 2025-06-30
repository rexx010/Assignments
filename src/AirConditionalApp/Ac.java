package AirConditionalApp;

public class Ac {
    private boolean isOff;
    private int acTemperature;

    public Ac(boolean state, int acTemperature) {
        this.isOff = state;
        if(acTemperature >= 16 && acTemperature <= 30){
            this.acTemperature = acTemperature;
        }
    }
    public void setAcCondition(boolean acSwitch){
        isOff = acSwitch;
    }
    public boolean getAcCondition(){
        return isOff;
    }

    public void increaseTemperature() {
        if(acTemperature >= 16 && acTemperature < 30){
            acTemperature++;
        }
    }
    public int getAcTemperature() {
        return acTemperature;
    }

    public void decreaseTemperature() {
        if(acTemperature > 16 && acTemperature <= 30){
            acTemperature--;
        }
    }
}
