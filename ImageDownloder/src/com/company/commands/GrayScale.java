package com.company.commands;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

public class GrayScale extends Command {

    public String command;

    @Override
    public BufferedImage execute(BufferedImage plain) {
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        ColorConvertOp op = new ColorConvertOp(cs, null);
        BufferedImage edited = op.filter(plain, null);
        return edited;
    }

    public GrayScale(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return "GrayScale{" +
                "command='" + command + '\'' +
                "} " + super.toString();
    }
}
