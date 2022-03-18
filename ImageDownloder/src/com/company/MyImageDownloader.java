package com.company;

import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class MyImageDownloader {
    MyFileReader reader;

    public MyImageDownloader(MyFileReader reader) {
        this.reader = reader;
    }

    public void downloadImage() {
        BufferedImage image = null;
        Set<String> commands = new HashSet<>();
        int count = 0;

        try {
            for (Map.Entry pair : reader.getMap().entrySet()) {
                URL url = new URL((String) pair.getKey());
                image = ImageIO.read(url);
                commands.add(pair.getValue().toString());
                ImageIO.write(image, "jpg", new File("C:/telRan_projects/ImageDownloder/picture" + count++ +".jpg"));
                image = null;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
