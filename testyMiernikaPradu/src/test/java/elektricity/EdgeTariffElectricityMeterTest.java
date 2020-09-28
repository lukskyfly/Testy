package elektricity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EdgeTariffElectricityMeterTest {

    static ElectricityMeter electricityMeter;
    static TariffProvider tp;
    private Integer kwhUsedInCase;
    private boolean isTariffInCase;
    private float sumKwhTariffInCase;
    private float sumKwhInCase;

    public EdgeTariffElectricityMeterTest(Integer kwhUsedInCase,
                                          boolean isTariffInCase,
                                          float sumKwhTariffInCase,
                                          float sumKwhInCase
    ) {
        this.kwhUsedInCase = kwhUsedInCase;
        this.isTariffInCase = isTariffInCase;
        this.sumKwhTariffInCase = sumKwhTariffInCase;
        this.sumKwhInCase = sumKwhInCase;
    }

    @BeforeClass
    public static void setUp() {
        tp = Mockito.mock(TariffProvider.class);
        electricityMeter = new ElectricityMeter(tp);
        electricityMeter.setTariffon(true);


    }

    @Test
    public void GivenDependOnTariffWhenKwhAdditionThenSpecificCounterTariffIsIncreased() {
        //Given
        Mockito.when(tp.isTariffNow()).thenReturn(isTariffInCase);
        //When
        electricityMeter.addKwh(kwhUsedInCase);
        //Then
        if (isTariffInCase) {
            Assert.assertEquals(sumKwhTariffInCase, electricityMeter.getKwhTariff(), 0.01);
        } else {
        }
        Assert.assertEquals(sumKwhInCase, electricityMeter.getKwhTariff(), 0.01);
    }
@Parameterized.Parameters
    public static Collection inputData() {
        return Arrays.asList(new Object[][]{
                {
                        100, false, 100, 0
                },

                {
                        100, false, 200, 0
                },

                {
                        100, false, 300, 0
                },

                {
                        100, false, 400, 0
                },

                {
                        100, false, 500, 0
                },

                {
                        100, false, 600, 0
                },

                {
                        100, false, 700, 0
                },

                {
                        100, false, 800, 0
                },

                {
                        100, false, 900, 0
                },

                {
                        100, false, 1000, 0
                },

                {
                        100, false, 1100, 0
                },

                {
                        100, false, 1200, 0
                },

                {
                        150, false, 1350, 0
                },

                {
                        200, false, 1550, 0
                },

                {
                        200, false, 1750, 0
                },

                {
                        400, false, 2150, 0
                },

                {
                        150, false, 2300, 0
                },

                {
                        100, false, 2400, 0
                },

                {
                        100, false, 2500, 0
                },

                {
                        100, false, 2600, 0
                },

                {
                        100, false, 2700, 0
                },

                {
                        100, false, 2800, 0
                },

                {
                        100, false, 2900, 0
                },

                {
                        100, false, 3000, 0
                },

                {
                        100, false, 3100, 0
                },

                {
                        100, false, 3200, 0
                },


                {
                        100, true, 3200, 100
                },

                {
                        100, true, 3200, 200
                },

                {
                        1800, true, 3200, 2000
                },

                {
                        2000, true, 3200, 4000
                },

                {
                        100, false, 3300, 4000
                },

                {
                        100, false, 3400, 4000
                },

                {
                        100, false, 3500, 4000
                },

                {
                        300, false, 3800, 4000
                },

                {
                        300, false, 4100, 4000
                },

                {
                        300, false, 4400, 4000
                },

                {
                        300, false, 4700, 4000
                },

                {
                        3000, false, 7700, 4000
                },

                {
                        3200, false, 10900, 4000
                },

                {
                        3000, false, 13900, 4000
                },

                {
                        450, false, 14350, 4000
                },

                {
                        550, false, 14900, 4000
                },

                {
                        300, false, 15200, 4000
                },

                {
                        250, false, 15450, 4000
                },

                {
                        200, false, 15650, 4000
                },

                {
                        200, false, 15850, 4000
                },

                {
                        300, false, 16150, 4000
                },

                {
                        100, false, 16250, 4000
                },

                {
                        100, false, 16350, 4000
                }
        });

    }

}