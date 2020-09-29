package elektricity;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityMeterTest {
    ElectricityMeter electricityMeter;
    TariffProvider tp;

    @BeforeEach
    void setUp() {
        tp = Mockito.mock(TariffProvider.class);
        electricityMeter = new ElectricityMeter(tp);
        electricityMeter.setTariffon(true);
    }

    @Test
    public void givenTariffOnWhenAdditionThenKwhInceased() {
        //Given
        Mockito.when(tp.isTariffNow()).thenReturn(true);
        //When
        electricityMeter.addKwh(50);
        //Then
        //Assumptions.assumeTrue(tp.isTariffNow());
        Assertions.assertEquals(50, electricityMeter.getKwhTariff());

    }


}