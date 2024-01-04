package org.example.wcs.java.ts_to_java;

public class Photo {
    private String url;
    private String fileName;
    private int width;
    private int height;

    public Photo(String url, String fileName, int width, int height) {
        this.url = url;
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
