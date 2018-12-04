package edu.iot.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import edu.iot.common.ui.Prompt;

public class FileSelect {

	private File dir;
	private String[] filters;

	public FileSelect(String dir) {
		filters = null;
		this.dir = new File(dir);
	}

	public FileSelect(String dir, String filters) {
		this.filters = null;
		this.filters = filters.split(",");
		this.dir = new File(dir);
	}

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
}