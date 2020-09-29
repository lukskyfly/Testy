package elektricity;

import org.junit.*;

public class NewElectricityMeterTest {

    private static ElectricityMeter electricityMeter;
    @BeforeClass
    public static void init(){
        electricityMeter = new ElectricityMeter();


    }

    @Before
    public void setUp() {
    electricityMeter.addKwh(100);

    }
    @AfterClass
    public static void release(){

    }
    @After
    public void tearDown(){
        electricityMeter.reset();

    }
    @Test
    public void addKwh_newMeter_proprAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);
    }

    @Test
    public void addKwh_newMeter2_proprAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(3);
        Assert.assertTrue("Should fail!",electricityMeter.getKwh() == 5);
    }

    @Test
    public void addKwh_newMeter5_proprAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        Assert.assertTrue("", electricityMeter.getKwh() == 17);
    }

    @Test
    public void addKwhCounterIncreasIfNew() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);
    }

    @Test
    public void addKwhCounterIncreasIfSecond() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 2);
    }

    public void givenNewMeterWhenFirstAdditionThenProperCounter() {
        //Given
        ElectricityMeter electricityMeter = new ElectricityMeter();
        //When
        electricityMeter.addKwh(2);
        //Then
        Assert.assertTrue(electricityMeter.getKwh() == 2);
    }

    //    @Ignore("not implemented yet")
    @Test(expected = ArithmeticException.class)
    public void getHowMoreExpensiveNormalIs() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.setCentsForKwh(90);
        electricityMeter.getHowMoreExpensiveNormalIs();
    }
}