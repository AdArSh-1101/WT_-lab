import javax.swing.*;
import java.awt.*;

public class HouseApplet extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw roof
        g.setColor(Color.BROWN);
        int[] xPoints = {150, 50, 250};
        int[] yPoints = {50, 150, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw walls
        g.setColor(Color.BLUE);
        g.fillRect(50, 150, 200, 100);

        // Draw door
        g.setColor(Color.GREEN);
        g.fillRect(120, 200, 60, 50);

        // Draw window
        g.setColor(Color.YELLOW);
        g.fillRect(70, 170, 50, 50);

        // Draw chimney
        g.setColor(Color.GRAY);
        g.fillRect(180, 70, 40, 70);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House Applet");
        HouseApplet house = new HouseApplet();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(house);
        frame.setVisible(true);
    }
}
