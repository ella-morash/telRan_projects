package com.company.commands;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Preview extends Command {
    public final String command = "PREVIEW";


    @Override
    public BufferedImage execute(BufferedImage plain) {

        Graphics graphics = plain.createGraphics();

        // draw an orange rectangle
        graphics.setColor(Color.orange);
        graphics.fillRect(0,0,100,50);

        // layout the picture right now!
        graphics.drawImage(plain,0,0,null);

        return plain;
    }

    @Override
    public String getCommand() {
        return command;
    }
}
