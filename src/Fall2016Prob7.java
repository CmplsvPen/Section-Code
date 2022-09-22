import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;


public class Fall2016Prob7 {
    public static void main(String[] args){
        int WIDTH = 400;
        DrawingPanel dp = new DrawingPanel(WIDTH, WIDTH);
        Graphics gr = dp.getGraphics();

        doIt(gr, WIDTH, 8);
    }
    private static void doIt(Graphics gr, int drSize, int gridDiv){
        int gridSize = drSize / gridDiv;
        for (int i = 0; i<drSize; i += gridSize){
            for (int j = 0; j < i; j += gridSize){
                gr.fillOval(j, i, gridSize, gridSize);
            }
            gr.fillRect(i, i, gridSize, gridSize);
        }
    }
}
