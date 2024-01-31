import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class count extends JApplet implements ActionListener {
    private JTextField input1, input2, result;
    int res = 0;
    public void init() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        input1 = new JTextField(10); // Add input1 field
        
        result = new JTextField(10);
        
        JButton count = new JButton("count");
        count.addActionListener(this);
        
        contentPane.add(new JLabel("counter"));
        
        contentPane.add(result);
        contentPane.add(count);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("count")) { // Change "count" to "count"
                res++;
            } 
            result.setText(Integer.toString(res));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input");
        }
    }

    public static void main(String[] args) {
        count applet = new count(); // Change "count" to "count"
        applet.init();

        JFrame frame = new JFrame("count Applet"); // Change "count" to "count"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }
}
