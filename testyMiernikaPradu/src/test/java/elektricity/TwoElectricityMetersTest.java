package elektricity;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TwoElectricityMetersTest {
    @Test
    public void addKwh_newMeter_proprAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);
    }

    @Test
    public void addKwh_newMeter2_proprAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(4);
        Assert.assertTrue(electricityMeter.getKwh() == 5);
    }

    @Test
    public void addKwh_newMeter5_proprAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
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
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 1);
    }

    @Test
    public void addKwhCounterIncreasIfSecond() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(1);
        Assert.assertTrue(electricityMeter.getKwh() == 2);
    }

    public void givenNewMeterWhenFirstAdditionThenProperCounter() {
        //Given
        ElectricityMeter electricityMeter = new ElectricityMeter();
        ElectricityMeter electricityMeter1= new ElectricityMeter();
        //When
        electricityMeter.addKwh(2);
        //Then
        Assert.assertTrue(electricityMeter.getKwh() == 2);
    }

    @Ignore("not implemented yet")
    @Test(expected = ArithmeticException.class)
    public void getHowMoreExpensiveNormalIs() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        ElectricityMeter electricityMeter1 = new ElectricityMeter();
        electricityMeter.setCentsForKwh(90);
        electricityMeter.getHowMoreExpensiveNormalIs();
    }
}