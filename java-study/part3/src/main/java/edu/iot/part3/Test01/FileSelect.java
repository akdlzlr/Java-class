package edu.iot.part3.Test01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FileSelect {

//	필드
	private File dir;
	private String[] filters;

//	생성자
	public FileSelect(String dir) {
		filters = null;
		this.dir = new File(dir);
	}

	public FileSelect(String dir, String filters) {
		this.filters = null;
		this.filters = filters.split(",");
		this.dir = new File(dir);
	}

//	메서드?
	public File select() {
		File[] files = getFileList();

		for (int i = 0; i < files.length; i++) {
			System.out.println((i + "]" + files[i].getName()));
		}

		Prompt prompt = new Prompt();
		int ix = prompt.getInt("선택");

		return files[ix];
	}

	private File[] getFileList() {
		if(filters==null) {
			return dir.listFiles();
		}else {
			return dir.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					name = name.toLowerCase();
					for(String filter : filters) {
						if(name.endsWith(filter)) {
							return true;
						}
					}
					return false;
				}
			});
		}
	}

//	메인 문
	public static void main(String[] args) {
		FileSelect fs = new FileSelect("c:/temp", ".mp3,.jpg,.txt");

		File file = fs.select();
		System.out.println(file);
		
		List<Saying> list = new ArrayList<>	();
		List<String> lines = FileUtil.readLines(file);
		for(String line : lines) {
			String[] temp = line.split("#");
			list.add(new Saying(temp[0],temp[1]));
		}
	
		for(Saying saying : list) {
			System.out.println(saying);
		}
		
	
	}
}
