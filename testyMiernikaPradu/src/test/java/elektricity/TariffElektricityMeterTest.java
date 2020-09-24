package elektricity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TariffElektricityMeterTest {
    ElectricityMeter electricityMeter;
    @Before
    public void setUp() {
        electricityMeter = new ElectricityMeter();
        electricityMeter.setTariffon(true);
        electricityMeter.setElctricityTariffStartHour(12);
        electricityMeter.setElctricityTariffEndHour(14);

    }
    @Test
    public void GivenOnTariffWhenKwhAdditionThenCounterTariffIsIncreased(){
        //Given
        //TODO setTariff Time mock isTariffNow() 
        //When
        electricityMeter.addKwh(100);
        //Then
        Assert.assertEquals(100,electricityMeter.getKwhTariff(),0.01);
    }
    @Test
    public void GivenNotOnTariffWhenKwhAdditionThenCounterTariffIsIncreased(){
        //Given
        //TODO setTariff Time mock isTariffNow()
        //When
        electricityMeter.addKwh(100);
        //Then
        Assert.assertEquals(100,electricityMeter.getKwhTariff(),0.01);
    }
}
