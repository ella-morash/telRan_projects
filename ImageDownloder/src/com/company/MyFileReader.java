package com.company;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MyFileReader {

    private final String FILE_PATH = "my_file.csv";

    public MyFileReader() {

    }

    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public void readFile() {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            int count = 1;
            while ((line = br.readLine()) != null) {

                String[] urls = line.split(",");
                switch (count) {
                    case 1:
                        System.out.println("Image 1 " + urls[0] + " Command 1 " + urls[1]);
                        break;
                    case 2:
                        System.out.println("Image 2 " + urls[0] + " Command 2 " + urls[1]);
                        break;
                    case 3:
                        System.out.println("Image 3 " + urls[0] + " Command 3 " + urls[1]);
                        break;
                }
                count++;

            }
            //System.out.println(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, String> storeFile() {
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
