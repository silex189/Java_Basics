package characteristics.risk.safetyNet.neverFailingTest.v1;

import java.io.IOException;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class EnvironmentTest {

	@Test
	public void includeForMissingResourceFails() {
		try {
			new Environment().include("somethingthatdoesnotexist");
		} catch (IOException e) {
			assertThat(e.getMessage(),
					containsString("somethingthatdoesnotexist"));
		}
	}
}
