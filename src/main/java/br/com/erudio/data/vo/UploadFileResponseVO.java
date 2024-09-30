package br.com.erudio.data.vo;

import java.io.Serializable;

public class UploadFileResponseVO implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private String fileName;
	//caminho onde será baixado o arquivo
	private String fileDownloadUri;
	//tipo de arquivo
	private String fileTipe;
	
	private long size;
	
	

	public UploadFileResponseVO() {
		super();
	}

	public UploadFileResponseVO(String fileName, String fileDownloadUri, String fileTipe, long size) {
		super();
		this.fileName = fileName;
		this.fileDownloadUri = fileDownloadUri;
		this.fileTipe = fileTipe;
		this.size = size;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDownloadUri() {
		return fileDownloadUri;
	}

	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

	public String getFileTipe() {
		return fileTipe;
	}

	public void setFileTipe(String fileTipe) {
		this.fileTipe = fileTipe;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	
	
	
}
