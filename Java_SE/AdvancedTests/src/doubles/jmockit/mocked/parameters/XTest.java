package doubles.jmockit.mocked.parameters;

import org.junit.Test;

public class XTest {

	@Test
	public void testM()
	{
	   new X().m(new Y(), new Y(), new Z(), new Z());
	}
}
