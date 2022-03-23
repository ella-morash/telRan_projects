package com.company.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintFile {
    MyFileReader reader;

    public PrintFile(MyFileReader reader) {
        this.reader = reader;
    }

    public void printFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(reader.getFILE_PATH()));
            br.lines().forEach(l-> System.out.println(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
