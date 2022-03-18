package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyFileReader reader = new MyFileReader();
        reader.readFile();
        HashMap<String,String> map = reader.storeFile();
        map = reader.storeFile();

        System.out.println(map);

        MyImageDownloader downloader = new MyImageDownloader(reader);
        downloader.downloadImage();
    }
}
