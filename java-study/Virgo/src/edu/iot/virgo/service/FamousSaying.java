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
//	�̱��� ���� ����
	private FamousSaying(){
		load();
//		init();
	}
	
	private static FamousSaying famousSaying = new FamousSaying();
	
	public static FamousSaying getinstence(){
		return famousSaying;
	}
//	
//	public void init() {		// ���� �޼��� , �и� ���µ� ����� �� �ִ�.
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
		
		Collections.shuffle(list);		// ���°�
		archive = new Saying[list.size()];
		list.toArray(archive);
	}

	public Saying[] getArchive() {
		return archive;
	}
	
	public Saying getSaying() {
		Saying saying = archive[index];
		index++;
		index %= archive.length;			//��ȯ�Ҷ� ���, init�� ������
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