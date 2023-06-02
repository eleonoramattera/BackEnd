package TestJUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ProtottoTest.class, UserTest.class })
public class AllTests {

}
