package edu.iot.common.util;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class FileUtilTest {
	@Test
	public void loadTest() throws Exception {
		File file = new File("C:/Users/student/Desktop/강의 추가자료/tour100.txt");
//		List<String> list = FileUtil.readLines(file);
		List<String> list = FileUtil.readLines(file, "euc-kr");
		for(String spot : list) {
			System.out.println(spot);
		}
	}
}