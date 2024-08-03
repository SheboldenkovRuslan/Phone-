package simulator.Frame;

import simulator.Views.Application;

import java.awt.*;
import javax.swing.*;

public class PhoneLayout extends JPanel {


    private Image phoneFrame = new ImageIcon("C:\\Users\\analo\\IdeaProjects\\Smartphone\\assets\\backgrounds\\background-0.jpeg").getImage();
    private Dimension size = new Dimension(315  , 650) ;
    static Application home = new Application();

    public PhoneLayout() {
        setPreferredSize(size);
        add(home);
    }

    private void add(Application home) {
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(phoneFrame, 0, 10, this);

    }



}
