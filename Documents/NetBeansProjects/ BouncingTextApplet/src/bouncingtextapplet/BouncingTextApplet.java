/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingtextapplet;

/**
 *
 * @author Shmels
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class BouncingTextApplet extends Applet implements Runnable {
    private Thread animationThread;
    private int xPosition = 0;
    private int yPosition = 50;
    private String displayText = "Your Name"; // Replace with your name
    private int appletWidth;
    private boolean running = false;
    
    @Override
    public void init() {
        // Set applet size and background color
        setSize(400, 200);
        setBackground(Color.BLACK);
        
        // Get applet dimensions
        appletWidth = getWidth();
        yPosition = getHeight() / 2;
        
        // Set display text - replace with your actual name
        displayText = "Java Applet";
    }
    
    @Override
    public void start() {
        if (animationThread == null) {
            animationThread = new Thread(this);
            running = true;
            animationThread.start();
        }
    }
    
    @Override
    public void stop() {
        running = false;
        if (animationThread != null) {
            animationThread = null;
        }
    }
    
    @Override
    public void run() {
        while (running) {
            // Update x-coordinate
            xPosition += 5;
            
            // Reset position if text hits right edge
            if (xPosition > appletWidth) {
                xPosition = -100; // Reset to left side with some offset
            }
            
            // Request repaint
            repaint();
            
            // Pause the animation
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
    
    @Override
    public void paint(Graphics g) {
        // Set text color and font
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        
        // Draw the bouncing text
        g.drawString(displayText, xPosition, yPosition);
    }
}