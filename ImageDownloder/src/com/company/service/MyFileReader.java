package com.company.service;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MyFileReader {

    private final String FILE_PATH = "my_file.csv";
    private final HashMap<String,String> map;

    public MyFileReader() {

        this.map = readFile();
    }

    public HashMap<String, String> getMap() {

        return map;
    }

    public void printFile() {
        String line = "";
        int count = 1;
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            while ((line = br.readLine()) != null) {
                String[] urls = line.split(",");
                System.out.println("Image " + count + " " + urls[0] + " Command  " + count + " " + urls[1]);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private HashMap<String, String> readFile() {
        HashMap<String, String> map = new HashMap<>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            while ((line = br.readLine()) != null) {
                String[] urls = line.split(",");
                map.put(urls[0], urls[1].trim());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
