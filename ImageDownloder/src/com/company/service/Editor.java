package com.company.service;

import com.company.commands.Command;
import com.company.loader.Loader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class Editor {
    private MyFileReader reader;

    public Editor(MyFileReader reader) {
        this.reader = reader;
    }

    public void editImages() throws IOException {
        var map = reader.getMap();
        int count = 0;
        for (Map.Entry pair : map.entrySet()) {
            for (Command command : Loader.classes) {
                if (command.getCommand().equals(pair.getValue())) {
                    URL imageURL = new URL((String) pair.getKey());
                    BufferedImage image = ImageReader.readImage(imageURL);
                    ImageSaver.saveImage(command.execute(image),count++);
                }

            }

        }
    }

}
