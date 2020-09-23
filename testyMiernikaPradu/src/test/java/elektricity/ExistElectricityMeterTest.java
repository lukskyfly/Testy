package elektricity;

import org.junit.*;

public class ExistElectricityMeterTest {

    private static ElectricityMeter electricityMeter;
    @BeforeClass
    public static void init(){
        ExistElectricityMeterTest.electricityMeter = new ElectricityMeter();


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

        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 101);
    }

    @Test
    public void addKwh_newMeter2_proprAddition() {

        electricityMeter.addKwh(1);
        electricityMeter.addKwh(4);
        Assert.assertTrue(electricityMeter.getKwh() == 105);
    }

    @Test
    public void addKwh_newMeter5_proprAddition() {

        electricityMeter.addKwh(1);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        Assert.assertTrue("", electricityMeter.getKwh() == 117);
    }

    @Test
    public void addKwhCounterIncreasIfNew() {

        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 101);
    }

    @Test
    public void addKwhCounterIncreasIfSecond() {

        electricityMeter.addKwh(1);
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 102);
    }

    public void givenNewMeterWhenFirstAdditionThenProperCounter() {
        //Given

        //When
        electricityMeter.addKwh(2);
        //Then
        Assert.assertTrue(electricityMeter.getKwh() == 102);
    }

    //    @Ignore("not implemented yet")
    @Test(expected = ArithmeticException.class)
    public void getHowMoreExpensiveNormalIs() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.setCentsForKwh(90);
        electricityMeter.getHowMoreExpensiveNormalIs();
    }
}