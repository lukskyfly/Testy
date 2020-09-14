package elektricity;

import org.junit.Assert;
import org.junit.Test;

public class ElectricityMeterTest {

    @Test
    public void addKwh() {
       ElectricityMeter electricityMeter = new ElectricityMeter();
       electricityMeter.addKwh(1);
       Assert.assertTrue(electricityMeter.getKwh()== 1
       );

    }
}