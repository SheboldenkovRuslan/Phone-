package simulator.Views;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Snake extends JFrame {

    public Snake() {

        initUI();
    }

    void initUI() {
        setBounds(0, 0, 330, 690);
        JLabel l = new JLabel();


        JPanel p = new JPanel();

        l.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonGray.png"));
        p.add(l);

        add(p);
        add(new Board());


        setTitle("Snake");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}