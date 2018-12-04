package edu.iot.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	public static void saveThumb(File src) throws Exception {

		File thumb = new File(src.getParent() + "/thumb", src.getName());
		// Thumbnail 파일 생성
		Thumbnails
				.of(src)
				.crop(Positions.CENTER) // 이미지 crop 센터를 중심으로 짜르겠다
				.size(200, 200)
				.toFile(thumb);

	}
	
	public static byte[] makeThumb(byte[] data) throws Exception{
		return makeThumb(data,100,100);
	}
	
	public static byte[] makeThumb(byte[] data, int width, int height) throws Exception{
		try(
		ByteArrayInputStream in = new ByteArrayInputStream(data);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		){
			Thumbnails.of(in)
					.size(width, height)
					.crop(Positions.CENTER)
					.toOutputStream(out);
			return out.toByteArray();
		}
	}
	
	
	
}
