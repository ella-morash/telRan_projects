package com.company;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

    private final String FILE_PATH = "my_file.csv";

    public MyFileReader() {
        
    }

    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public void readFile(){
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            while ((line = br.readLine())!=null){
                String [] urls = line.split(",");
                System.out.println("Image " + urls[0] + " Command " + urls[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
