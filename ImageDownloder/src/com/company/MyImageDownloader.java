package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MyImageDownloader {
    MyFileReader reader;

    public MyImageDownloader(MyFileReader reader) {
        this.reader = reader;
    }

    public void downloadImage() {
        BufferedImage image = null;
        int count = 1;

        try {
            for (Map.Entry pair : reader.storeFile().entrySet()) {

                URL url = new URL((String) pair.getKey());

                image = ImageIO.read(url);

                switch (count) {
                    case 1:
                        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                        ColorConvertOp op = new ColorConvertOp(cs, null);
                        image = op.filter(image, null);
                        ImageIO.write(image, "jpg", new File("C:/telRan_projects/ImageDownloder/picture1.jpg"));
                        break;
                    case 2:
                        ImageIO.write(image, "jpg", new File("C:/telRan_projects/ImageDownloder/picture2.jpg"));
                        break;
                    case 3:
                        ImageIO.write(image, "jpg", new File("C:/telRan_projects/ImageDownloder/picture3.jpg"));
                        break;

                }
                count++;
                image = null;

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
