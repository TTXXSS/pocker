package parking;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InOrderParkingStrategyTest {
    public static final String PARKING_NAME_A = "ParkingA";
    public static final String PARKING_NAME_B = "ParkingB";
    public static final String PARKING_NAME_C = "ParkingC";
    public static final String CAR_NAME_AA111 = "AA111";
    private InOrderParkingStrategy inOrderParkingStrategy = new InOrderParkingStrategy();
	@Test
    public void testCreateReceipt_givenACarAndAParkingLog_thenGiveAReceiptWithCarNameAndParkingLotName() {

	    /* Exercise 1, Write a test case on InOrderParkingStrategy.createReceipt()
	    * With using Mockito to mock the input parameter */
	    ParkingLot parkingLot = mock(ParkingLot.class);
	    Car car = mock(Car.class);

	    when(parkingLot.getName()).thenReturn(PARKING_NAME_A);
	    when(car.getName()).thenReturn(CAR_NAME_AA111);

	    Receipt receipt = inOrderParkingStrategy.createReceipt(parkingLot,car);
	    assertSame(receipt.getParkingLotName(),PARKING_NAME_A);
	    assertSame(receipt.getCarName(),CAR_NAME_AA111);



    }

    @Test
    public void testCreateNoSpaceReceipt_givenACar_thenGiveANoSpaceReceipt() {

        /* Exercise 1, Write a test case on InOrderParkingStrategy.createNoSpaceReceipt()
         * With using Mockito to mock the input parameter */

    }

    @Test
    public void testPark_givenNoAvailableParkingLot_thenCreateNoSpaceReceipt(){

	    /* Exercise 2: Test park() method. Use Mockito.spy and Mockito.verify to test the situation for no available parking lot */

    }

    @Test
    public void testPark_givenThereIsOneParkingLotWithSpace_thenCreateReceipt(){

        /* Exercise 2: Test park() method. Use Mockito.spy and Mockito.verify to test the situation for one available parking lot */

    }

    @Test
    public void testPark_givenThereIsOneFullParkingLot_thenCreateReceipt(){

        /* Exercise 2: Test park() method. Use Mockito.spy and Mockito.verify to test the situation for one available parking lot but it is full */

    }

    @Test
    public void testPark_givenThereIsMultipleParkingLotAndFirstOneIsFull_thenCreateReceiptWithUnfullParkingLot(){

        /* Exercise 3: Test park() method. Use Mockito.spy and Mockito.verify to test the situation for multiple parking lot situation */

    }


}
