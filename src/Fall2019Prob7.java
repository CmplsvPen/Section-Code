import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;


public class Fall2019Prob7 {
    public static void main(String[] args) {
        int x = 20;
        int y = 200;
        int divs = 6;
        int size = 210;
        DrawingPanel dp = new DrawingPanel(800, 800);
        Graphics gr = dp.getGraphics();

        dp.setBackground(Color.CYAN);
        doIt(gr, x, y, size, divs);
    }
    private static void doIt(Graphics gr, int x, int y, int size, int divs){
        int numSteps = divs/2;
        int stepSize = size / numSteps;
        int rectWidth = size/divs;
        gr.setColor(Color.GRAY);
        for(int i = 0; i < numSteps; i+=2){
            gr.fillRect(x + i * rectWidth, y, rectWidth, (i+1) * stepSize);
        }
        for (int i = numSteps; i < divs; i += 2) {
            gr.fillRect(x + i * rectWidth, y, rectWidth, (numSteps - i) * stepSize);
        }
    }
    private static void doRect(Graphics gr, int i, int x, int y,int size, int rectWidth){
    }
}