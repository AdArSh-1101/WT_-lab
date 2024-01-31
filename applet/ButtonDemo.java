import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Applet implements ActionListener {
    private Button redButton;
    private Button blueButton;
    private String message = "";

    public void init() {
        redButton = new Button("RED");
        blueButton = new Button("BLUE");
        add(redButton);
        add(blueButton);
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 100);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            message = "you have pressed RED";
        } else if (e.getSource() == blueButton) {
            message = "you have pressed BLUE";
        }
        repaint();
    }

    public static void main(String[] args) {
        ButtonDemo demo = new ButtonDemo();
        demo.init();
        Frame f = new Frame("Button Demo");
        f.add(demo);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
