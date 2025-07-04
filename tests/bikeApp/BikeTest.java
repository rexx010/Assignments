package bikeApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BikeTest {

    @Test
    public void checkThatBikeCanBeTurnedOn() {
        Bike myBugattiBike = new Bike(0);
        myBugattiBike.setBikeStatus("ON");
        assertEquals("ON", myBugattiBike.getBikeStatus());
    }
    @Test
    public void checkThatBikeCanBeTurnedOff() {
        Bike myBugattiBike = new Bike(0);
        myBugattiBike.setBikeStatus("OFF");
        assertEquals("OFF", myBugattiBike.getBikeStatus());
    }
    @Test
    public void checkThatBikeCanAccelerate() {
        Bike myBugattiBike = new Bike(15);
        myBugattiBike.setAcceleration();
        assertEquals(16, myBugattiBike.getSpeed());

        Bike myBugattiBike2 = new Bike(20);
        myBugattiBike2.setAcceleration();
        assertEquals(22, myBugattiBike2.getSpeed());

        Bike myBugattiBike3 = new Bike(30);
        myBugattiBike3.setAcceleration();
        assertEquals(33, myBugattiBike3.getSpeed());

        Bike myBugattiBike4 = new Bike(40);
        myBugattiBike4.setAcceleration();
        assertEquals(44, myBugattiBike4.getSpeed());
    }
    @Test
    public void checkThatBikeCanDeccelerate() {
        Bike myBugattiBike = new Bike(20);
        myBugattiBike.setDecceleration();
        assertEquals(19, myBugattiBike.getSpeed());

        Bike myBugattiBike2 = new Bike(22);
        myBugattiBike2.setDecceleration();
        assertEquals(20, myBugattiBike2.getSpeed());

        Bike myBugattiBike3 = new Bike(33);
        myBugattiBike3.setDecceleration();
        assertEquals(30, myBugattiBike3.getSpeed());

        Bike myBugattiBike4 = new Bike(44);
        myBugattiBike4.setDecceleration();
        assertEquals(40, myBugattiBike4.getSpeed());
    }
    @Test
    public void chechBikeGear() {
        Bike myBugattiBike = new Bike(22);
        myBugattiBike.setDecceleration();
        assertEquals("Gear1: 20", myBugattiBike.getGear());
        assertNotEquals("Gear2: 20", myBugattiBike.getGear());
        myBugattiBike.setAcceleration();
        assertEquals("Gear2: 22", myBugattiBike.getGear());
        assertNotEquals("Gear3: 22", myBugattiBike.getGear());

        Bike myBugattiBike2 = new Bike(33);
        myBugattiBike2.setDecceleration();
        assertEquals("Gear2: 30", myBugattiBike2.getGear());
        assertNotEquals("Gear3: 30", myBugattiBike2.getGear());
        myBugattiBike2.setAcceleration();
        assertEquals("Gear3: 33", myBugattiBike2.getGear());
        assertNotEquals("Gear4: 33", myBugattiBike2.getGear());

        Bike myBugattiBike3 = new Bike(44);
        myBugattiBike3.setDecceleration();
        assertEquals("Gear3: 40", myBugattiBike3.getGear());
        assertNotEquals("Gear4: 40", myBugattiBike3.getGear());
        myBugattiBike3.setAcceleration();
        assertEquals("Gear4: 44", myBugattiBike3.getGear());
        assertNotEquals("Gear5: 44", myBugattiBike3.getGear());

        Bike myBugattiBike4 = new Bike(54);
        myBugattiBike4.setDecceleration();
        assertEquals("Gear4: 50", myBugattiBike4.getGear());
        assertNotEquals("Gear5: 50", myBugattiBike4.getGear());
        myBugattiBike4.setAcceleration();
        assertEquals("Gear4: 54", myBugattiBike4.getGear());
    }
}
