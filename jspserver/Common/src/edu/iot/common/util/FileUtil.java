package edu.iot.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	public static List<String> readLines(File file) {
//		List<String> list = new ArrayList<>();
//
//		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
//			// ?��?���? ?���?, 출력?���?
//			String lineString;
//			while ((lineString = br.readLine()) != null) {
//				list.add(lineString);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
		return readLines(file,"utf-8");
	}
	
	public static List<String> readLines(File file, String charset) {
		List<String> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(file),charset));) {
			String lineString;
			while ((lineString = br.readLine()) != null) {
				list.add(lineString);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void serialize(String path, Object obj) throws Exception {
		//	저장
		try(
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			oos.writeObject(obj);
		}
	}
	
	public static Object deserialize(String path) throws Exception {
		//	열기
		try(
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		){
			return ois.readObject();
		}
	}
	
//	Gson에서 문자열을 읽기 위한 메서드
	public static String readAll(String path) throws Exception{
		StringBuilder sb = new StringBuilder();
		try(
			BufferedReader br = new BufferedReader(new FileReader(path));
				){
			int ch;
			while((ch=br.read())!=-1) {
				sb.append((char)ch);
			}
		}
		return sb.toString();
	}
//	json 파일 경로 준비, 이 경로는 위에 readAll 메서드의 경로가 된다.
//	파일의 상대경로를 절대 경로로 바꿔주는 메서드?
	public static String readResource(String path) throws Exception{
		path = FileUtil.class.getResource(path).getPath();
		return FileUtil.readAll(path);
	}
	
	public static byte[] bytes(File file) throws Exception{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try (BufferedInputStream bis = new BufferedInputStream
				(new FileInputStream(file))){
			int data;
			while((data=bis.read())!=-1) {
				out.write(data);
			}
			return out.toByteArray();
		}
	}
	
	public static void save(File file,byte[] data) throws Exception{
		try(
			FileOutputStream fos = new FileOutputStream(file)
		){
			fos.write(data);
		}  
	}
}