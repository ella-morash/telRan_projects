package com.company.commands;

import javax.swing.*;
import java.awt.image.BufferedImage;

public abstract class Command {
    public String command;

    public BufferedImage execute(BufferedImage plain) {
        return null;
    }

    public String getCommand() {
        return command;
    }
}
