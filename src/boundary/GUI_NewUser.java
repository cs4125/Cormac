package boundary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI_NewUser extends JFrame implements ActionListener {
    
    // needs to load a Control object with selection
    // needs Control constructor
    
    public void displayGUI() {
        
        JFrame frame = new JFrame("NewUser Menu");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
    