package com.company.service;

import com.company.commands.Command;
import com.company.loader.Loader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Editor {
    private MyFileReader reader;

    public Editor(MyFileReader reader) {

        this.reader = reader;
    }

    public void editImages() throws IOException {
        var map = reader.getMap();
        int count = 0;

        outerFor:
        for (Map.Entry pair : map.entrySet()) {
            for (Command command : Loader.classes) {
            //boolean equal = pair.getValue().equals(command.getCommand());
            if (pair.getValue().equals(command.getCommand())) {
                    URL imageURL = new URL((String) pair.getKey());
                    BufferedImage image = ImageReader.readImage(imageURL);
                    ImageSaver.saveImage(command.execute(image), count++);
                    continue outerFor;
                }

            }

        }
    }


}




