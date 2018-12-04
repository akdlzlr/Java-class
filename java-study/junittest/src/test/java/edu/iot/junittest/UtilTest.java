package edu.iot.junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilTest {
	
	public UtilTest() {
		System.out.println("생성자호출");
	}
	@Before
	public void setup() {
		System.out.println("Before Setup");
	}
	
	@After
	public void cleanup() {
		System.out.println("After Cleanup");
	}
	
	@Test
	public void testIntBoxing() {
		
		Box<Integer> box1 = Util.boxing(100);
		assertNotNull(box1);
		int intValue = box1.get();
		assertEquals(intValue,100);
	
		Box<String> box2 = Util.boxing("홍길동");
		assertNotNull(box2);
		String strValue = box2.get();
		assertNotNull(strValue, box2);
		
	}
	
	@Test
	public void testCompare() {
		int result1 = Util.compare(10, 20);
		assertTrue(result1 < 0);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		assertTrue(result2 > 0);
		System.out.println(result2);
	}
}
