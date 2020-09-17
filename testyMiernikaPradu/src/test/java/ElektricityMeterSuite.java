import elektricity.ElectricityMeterTest;
import elektricity.TwoElectricityMetersTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ElectricityMeterTest.class,
        ElectricityMeterTest.class,
        TwoElectricityMetersTest.class
})
public class ElektricityMeterSuite {
}
