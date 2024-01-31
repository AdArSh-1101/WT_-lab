import javax.swing.*;
import java.awt.*;

public class ColoredSmiley extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw yellow face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw black eyes
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 30, 30);
        g.fillOval(170, 100, 30, 30);

        // Draw red smiling mouth
        g.setColor(Color.RED);
        g.drawArc(100, 150, 100, 50, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Smiley");
        ColoredSmiley smiley = new ColoredSmiley();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(smiley);
        frame.setVisible(true);
    }
}
