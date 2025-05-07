package com.practice.yaro.photoclone.photoclone;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class Photo {

	private String id;
	@NonNull
	private String fileName;
	@JsonIgnore
	private byte[] data;

	public Photo(String id, String fileName, byte[] data) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.data = data;
	}
	
	public Photo() {
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

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

//raw data
}
