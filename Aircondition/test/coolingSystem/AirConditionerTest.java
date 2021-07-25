package coolingSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void airConditionerIsTurnedOnTest(){
        AirConditioner myAirConditioner =new AirConditioner("lg");

        myAirConditioner.setOn();

        assertTrue(myAirConditioner.isOn());
    }

    @Test
    public void airConditionerIsTurnedOffTest(){
        AirConditioner myAirConditioner = new AirConditioner("lg");
        myAirConditioner.setOn();
        myAirConditioner.setOn();
        assertFalse(myAirConditioner.isOn());
    }

    @Test
    public void airConditionerTemperatureIncreaseTest(){
        AirConditioner myAirConditioner = new AirConditioner("lg");
        myAirConditioner.setOn();
        myAirConditioner.increaseTemperature();
        assertEquals(17, myAirConditioner.getTemperature());
    }

    @Test
    public void airConditionerTemperatureDecreaseTest(){
        AirConditioner myAirConditioner = new AirConditioner("lg");
        myAirConditioner.setOn();
        myAirConditioner.increaseTemperature();
        myAirConditioner.decreaseTemperature();
        assertEquals(16, myAirConditioner.getTemperature());
    }
    @Test
    public void airConditionerMaximumTemperatureIsThirtyTest(){
        AirConditioner myAirConditioner = new AirConditioner("lg");
        myAirConditioner.setOn();
        myAirConditioner.setTemperature(30);

        myAirConditioner.increaseTemperature();

        assertEquals(30, myAirConditioner.getTemperature());

    }

    @Test
    public void airConditionerMinimumTemperatureIsSixteenTest(){
        AirConditioner myAirConditioner = new AirConditioner("lg");
        myAirConditioner.setOn();
        myAirConditioner.setTemperature(16);
        myAirConditioner.decreaseTemperature();
        assertEquals(16, myAirConditioner.getTemperature());

    }


}