package AirConditionalApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {


    @Test
    public void checkThatAcCanBeOn(){
        Ac myAc = new Ac(false, 16);
        myAc.setAcCondition(true);
        assertTrue(myAc.getAcCondition());
    }
    @Test
    public void checkThatAcCanBeOff(){
        Ac myAc = new Ac(true,16);
        myAc.setAcCondition(false);
        assertFalse(myAc.getAcCondition());
    }
    @Test
    public void checkThatAcTemperatureCanBeIncreased(){
        Ac myAc = new Ac(true,16);
        myAc.increaseTemperature();
        assertEquals(17,myAc.getAcTemperature());
        myAc.increaseTemperature();
        assertEquals(18,myAc.getAcTemperature());
        myAc.increaseTemperature();
        assertEquals(19,myAc.getAcTemperature());
    }
    @Test
    public void checkThatAcTemperatureCanBeDecreased(){
        Ac myAc = new Ac(true,19);
        myAc.decreaseTemperature();
        assertEquals(18,myAc.getAcTemperature());
        myAc.decreaseTemperature();
        assertEquals(17,myAc.getAcTemperature());
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getAcTemperature());
    }
    @Test
    public void checkThatTemperatureCanTExceed30(){
        Ac myAc = new Ac(true,28);
        myAc.increaseTemperature();
        assertEquals(29,myAc.getAcTemperature());
        myAc.increaseTemperature();
        assertEquals(30,myAc.getAcTemperature());
        myAc.increaseTemperature();
        assertEquals(30,myAc.getAcTemperature());
    }
    @Test
    public void checkThatTemperatureCanTGoBelow16(){
        Ac myAc = new Ac(true,18);
        myAc.decreaseTemperature();
        assertEquals(17,myAc.getAcTemperature());
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getAcTemperature());
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getAcTemperature());
    }
}
