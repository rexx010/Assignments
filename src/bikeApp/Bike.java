package bikeApp;

public class Bike {
    private String bikeStatus;
    private int speed;

    public Bike(int speed) {
        if (speed >= 0) this.speed = speed;
        bikeStatus = "OFF";
    }

    public String getBikeStatus() {
        return bikeStatus;
    }

    public void setBikeStatus(String bikeStatus){
        this.bikeStatus = bikeStatus;
    }

    public void setAcceleration() {
        if (speed >= 0 && speed < 20) speed += 1;
        if (speed >= 20 && speed < 30) speed += 2;
        if (speed >= 30 && speed < 40) speed += 3;
        if (speed >= 40) speed += 4;
    }
    public void setDecceleration() {
        if (speed > 0 && speed <= 20) speed -= 1;
        if (speed > 20 && speed <= 30) speed -= 2;
        if (speed > 30 && speed <= 40) speed -= 3;
        if (speed > 40) speed -= 4;
    }
    public int getSpeed() {
        return speed;
    }
    public String getGear() {
        if (speed >= 0 && speed < 21) return "Gear1: " + speed;
        if (speed >= 21 && speed < 31) return "Gear2: " + speed;
        if (speed >= 31 && speed < 41) return "Gear3: " + speed;
        if (speed >= 41) return "Gear4: " + speed;

        return "0";
    }
}
