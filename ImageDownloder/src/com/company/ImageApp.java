package com.company;

import com.company.commands.Command;
import com.company.commands.GrayScale;
import com.company.loader.Loader;
import com.company.service.Editor;

import java.io.IOException;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        MyFileReader reader = new MyFileReader();
        Editor edit = new Editor(reader);
        edit.editImages();
    }
}
