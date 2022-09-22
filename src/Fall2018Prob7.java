import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;


public class Fall2018Prob7 {
    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(800, 800);
        Graphics gr = dp.getGraphics();

        drawFigure(gr, 10, 200, 210, 6);
        drawFigure(gr, 300, 100, 300, 3);
        drawFigure(gr, 10, 500, 250, 1);
        drawFigure(gr, 300, 500, 400, 16);
    }
    private static void drawFigure(Graphics gr, int x, int y, int size, int num){
        int stepSize = size / num;
        gr.setColor(Color.ORANGE);
        gr.fillRect(x, y, size, size);
        for(int i = 0; i < num; i++ ){
            if (i%2 == 0){
                gr.setColor(Color.BLACK);
            }else gr.setColor(Color.WHITE);
            gr.fillOval(x+i*stepSize, y+i*stepSize, (num-i)*stepSize, (num-i)*stepSize);
        }
    }
}