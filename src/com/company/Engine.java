package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Engine extends JFrame
{
    private BufferStrategy bs;
    private Graphics graphics;
    private BufferedImage image;

    public Engine(int width, int height, String title)
    {
        setTitle(title);
        setSize(width, height);
        setVisible(true);

        createBufferStrategy(3);
        image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
    }

    private void render()
    {
        graphics.drawImage(image, 0, 0, )
    }

    public void run()
    {
        while (isActive())
        {
            bs = getBufferStrategy();
            graphics = bs.getDrawGraphics();
            render();
            graphics.dispose();
            bs.show();


        }
    }
}
