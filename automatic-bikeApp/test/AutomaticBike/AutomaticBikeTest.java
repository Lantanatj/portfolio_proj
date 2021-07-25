package automaticBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


    class AutomaticBikeTest {
        @Test
        public void automaticBikeIsTurnedOn() {


            myBike.turnAutomaticBikeOn();

            assertTrue(myBike.isOn());
        }


        @Test
        public void automaticBikeIsTurnedOff(){
            AutomaticBike myBike = new AutomaticBike();
            myBike.turnAutomaticBikeOn();

            myBike.turnAutomaticBikeOff();

            assertFalse(myBike.isOn());
        }

        @Test
        public void whenAutomaticBikeAccelerates(){
            AutomaticBike myBike = new AutomaticBike();
            myBike.turnAutomaticBikeOn();

            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();

            assertEquals(31, myBike.getAutomaticBikeSpeed());
        }

        @Test
        public void whenAutomaticBikeIsDecelerated() {
            AutomaticBike myBike = new AutomaticBike();
            myBike.turnAutomaticBikeOn();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();

            myBike.decelerateAutomaticBike();

            assertEquals(31, myBike.getAutomaticBikeSpeed());
        }

        @Test
        public void automaticBikeGearRange() {
            AutomaticBike myBike = new AutomaticBike();
            myBike.turnAutomaticBikeOn();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();
            myBike.accelerateAutomaticBike();

            assertEquals(2, myBike.getGearStatus());

        }

