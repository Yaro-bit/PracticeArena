package com.practice.yaro.photoclone.photoclone;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

public class Photo {
	
	
	private String id;
	@NonNull
	private String fileName;
	
	
	


	public Photo(String id, String fileName) {
		super();
		this.id = id;
		this.fileName = fileName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

//raw data
}
