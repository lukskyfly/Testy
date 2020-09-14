package elektricity;

import org.junit.Assert;
import org.junit.Test;

public class ElectricityMeterTest {

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
        electricityMeter.addKwh(4);
        Assert.assertTrue(electricityMeter.getKwh() == 5);
    }
    @Test
    public void addKwh_newMeter5_proprAddition() {
        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.addKwh(1);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        electricityMeter.addKwh(4);
        Assert.assertTrue(electricityMeter.getKwh() == 17);
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

}