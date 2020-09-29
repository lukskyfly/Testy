import elektricity.NewElectricityMeterTest;
import elektricity.TwoElectricityMetersTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        NewElectricityMeterTest.class,
        NewElectricityMeterTest.class,
        TwoElectricityMetersTest.class
})
public class ElektricityMeterSuite {
}
