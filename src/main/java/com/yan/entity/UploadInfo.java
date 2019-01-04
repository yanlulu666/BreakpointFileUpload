package com.yan.entity;

public class UploadInfo {

  private String md5;

  private String chunks;

  private String chunk;

  private String uploadFolderPath;

  private String fileName;

  private String ext;

  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public String getChunks() {
    return chunks;
  }

  public void setChunks(String chunks) {
    this.chunks = chunks;
  }

  public String getChunk() {
    return chunk;
  }

  public void setChunk(String chunk) {
    this.chunk = chunk;
  }

  public String getUploadFolderPath() {
    return uploadFolderPath;
  }

  public void setUploadFolderPath(String uploadFolderPath) {
    this.uploadFolderPath = uploadFolderPath;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public UploadInfo(String md5, String chunks, String chunk, String uploadFolderPath,
      String fileName, String ext) {
    super();
    this.md5 = md5;
    this.chunks = chunks;
    this.chunk = chunk;
    this.uploadFolderPath = uploadFolderPath;
    this.fileName = fileName;
    this.ext = ext;
  }

}
