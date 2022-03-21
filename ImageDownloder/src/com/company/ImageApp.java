package com.company;

import com.company.commands.Command;
import com.company.commands.Preview;
import com.company.loader.Loader;
import com.company.service.Editor;
import com.company.service.MyFileReader;

import java.io.IOException;

public class ImageApp {

    public static void main(String[] args) throws IOException {
        MyFileReader reader = new MyFileReader();
        //System.out.println(reader.getMap());
        Editor edit = new Editor(reader);
        edit.editImages();

    }
}
