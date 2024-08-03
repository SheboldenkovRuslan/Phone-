package simulator.Frame;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JPanel {
    static PhoneLayout phonePanel;
    public static void Back() {
        JFrame phone = new JFrame();
        JLabel label = new JLabel();

        label.setIcon(new ImageIcon("C:\\Users\\analo\\IdeaProjects\\Smartphone\\assets\\frames\\frame-0.png"));


        phonePanel = new PhoneLayout();
        phonePanel.add(label);
        phone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel background = new JPanel();
        label.setPreferredSize(new Dimension(330, 650));
        background.add(phonePanel);

        phone.add(background);
        phone.pack();
        phone.setVisible(true);
    }

}