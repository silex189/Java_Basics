package characteristics.risk.safetyNet.erraticTest.v2;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ShuffleTest {

	private static final int MAX_LONG = 10;

	@Test
	public void testShuffle() {
		testShuffle(new Integer[] { 0 });
		testShuffle(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 });
		testShuffle(new Integer[] { 0, 1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8 });
	}

	private void testShuffle(Integer[] values) {
		for (int value : values) {
			assert value < MAX_LONG;
		}
		List<Integer> list = Arrays.asList(values);
		int[] expectedItemTimes = itemTimes(list);
		Collections.shuffle(list);
		int[] resultItemTimes = itemTimes(list);
		assertThat(expectedItemTimes, is(resultItemTimes));
	}

	private int[] itemTimes(List<Integer> list) {
		int[] itemTimes = new int[MAX_LONG];
		for (int value : list) {
			itemTimes[value]++;
		}
		return itemTimes;
	}

}
