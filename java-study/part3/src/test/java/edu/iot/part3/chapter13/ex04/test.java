package edu.iot.part3.chapter13.ex04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class test {

	@Test
	public void testChildProduct() {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("LG");
		assertEquals(product.getModel(),"SmartTV");
	}
	@Test	
	public void testStorage() {
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		Tv orgTv = new Tv();
		storage.add(orgTv, 0);
		Tv tv = storage.get(0);
		assertSame(orgTv,tv);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class) //이 예외가 발생해야 성공
	public void testStorageException() {
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 101);
	}
}