package edu.iot.common.model;

import java.util.Date;

import lombok.Data;

@Data
public class GalleryImage {
	
	private long imageId;
	private long galleryId;
	private String fileName;
	private String title;
	private String source;
	private String serverFileName;
	private Date regDate;
	private Date updateDate;
}


