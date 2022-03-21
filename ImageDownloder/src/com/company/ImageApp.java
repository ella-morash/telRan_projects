package com.company;

import com.company.service.Editor;
import com.company.service.MyFileReader;

import java.io.IOException;

public class ImageApp {

    public static void main(String[] args) throws IOException {
        MyFileReader reader = new MyFileReader();
        reader.printFile();
        Editor edit = new Editor(reader);
        edit.editImages();
    }
}
