package edu.iot.virgo.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.iot.common.util.FileUtil;
import edu.iot.virgo.model.Saying;

public class FamousSaying {
	private final static String FILE_PATH = "c:/temp/famoussaying.txt";
	private Saying[] archive;
	private int index;
//	싱글톤 패턴 구조
	private FamousSaying(){
		load();
//		init();
	}
	
	private static FamousSaying famousSaying = new FamousSaying();
	
	public static FamousSaying getinstence(){
		return famousSaying;
	}
//	
//	public void init() {		// 섞는 메서드 , 패를 섞는데 사용할 수 있다.
//		for(int i = archive.length;i>0; i--) {
//			int select = Random.rand(0, i);
//			ArrayUtil.swap(archive, i-1, select);
//		}
//	}
	
	public void load() {
		File file = new File(FILE_PATH);
		
		List<Saying> list = new ArrayList<>	();
		List<String> lines = FileUtil.readLines(file);
		for(String line : lines) {
			String[] temp = line.split("#");
			list.add(new Saying(temp[0],temp[1]));
		}
		
		Collections.shuffle(list);		// 섞는것
		archive = new Saying[list.size()];
		list.toArray(archive);
	}

	public Saying[] getArchive() {
		return archive;
	}
	
	public Saying getSaying() {
		Saying saying = archive[index];
		index++;
		index %= archive.length;			//순환할때 사용, init는 사용못함
//		if(index==archive.length) {
//			index=0;
//			load();
//		}
		return saying;		
	}
	
	public void print(PrintSaying ps, Saying saying) {
		ps.print(saying);
	}
}