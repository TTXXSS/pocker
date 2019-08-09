package parking;

import mockit.MockUp;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

@RunWith(JMockit.class)
public class VipParkingStrategyJMockitTest {

    @Test
    public void testCalculateHourlyPrice_givenSunday_thenPriceIsDoubleOfSundayPrice(){

        /* Exercise 6: Write test case for VipParkingStrategy calculateHourlyPrice
        * by using JMockit to mock static method */
        new MockUp<VipParkingStrategy>(){
            public int  calculateHourlyPrice() {
                return 25;
            }
        };

    }

    @Test
    public void testCalculateHourlyPrice_givenNotSunday_thenPriceIsDoubleOfNonSundayPrice(){

        /* Exercise 6: Write test case for VipParkingStrategy calculateHourlyPrice
         * by using JMockit to mock static method */


    }
}
