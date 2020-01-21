package com.adneom.test.partition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit test for simple App.
 */
public class PartitionTest
{
	@Rule
	public final ExpectedException exception = ExpectedException.none();
   
	@Test
	public void chunkTest() {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		final Integer[] listeNull = null;
		exception.expect(NullPointerException.class);
		result = Partition.chunk(Arrays.asList(listeNull), 2);
		
		final Integer[] liste = new Integer[]{1,2,3,4,5};
		result = Partition.chunk(Arrays.asList(liste), 2);
		assertNotNull(result); 
		assertEquals(result.size(), 3);
		assertEquals(result.get(2).size(), 1);
	}

}
