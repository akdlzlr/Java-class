package edu.iot.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 50);
		
		assertEquals(60, result, 0); // 거짓이면 예외발생
	}
	
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		double result = cal.sub(20, 10);
		
		assertEquals(10, result, 0);
	}
//	 단위 테스트는 독립적으로 이루어져야 한다. add 테스트와 sub 테스트 할 시 서로 영향을 주면 안됨
//	이때 필드의 영향력을 없애기 위해 Cal 클래스의 인스턴스를 각 각 따로 만든다. junit이 해쥼ㅎㅎ
//	@Before, @After가 인스턴스의 필드값을 초기화 해줌??
//	@Before,AfterClass는 static method여야 함
//	Ctrl + Shift + f11 = 커버리지 테스트
}
