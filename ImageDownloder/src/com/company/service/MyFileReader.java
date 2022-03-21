package com.company.service;


import com.company.commands.Preview;

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
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            while ((line = br.readLine()) != null) {
                String[] urls = line.split(",");
                System.out.println("Image " + urls[0] + " Command  " + urls[1]);
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
                map.put(urls[0], urls[1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

}
