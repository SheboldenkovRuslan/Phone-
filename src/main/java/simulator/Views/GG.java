package simulator.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class GG  {
    public static JFrame frame = new JFrame();
    public static JButton one = new JButton();
    public static JButton two = new JButton();
    public static JButton tri = new JButton();
    public static JButton four = new JButton();
    public static JButton enter = new JButton("Enter");

    public static JLabel jtf = new JLabel();
    public static JPanel panel = new JPanel();
    public static JButton five = new JButton();
    public static JButton six = new JButton();
    public static JButton seven = new JButton();
    public static JButton vosem = new JButton();
    public static JButton nine = new JButton();
    public static JButton zero = new JButton();

    private static JTextField inText;
    private static final int WINDOW_WIDTH = 340;
    private static final int WINDOW_HEIGHT = 650;
    private static final int BUTTON_WIDTH = 60;
    private static final int BUTTON_HEIGHT = 40;
    private static final int MARGIN_X = 40;
    private static final int MARGIN_Y = 70;
    private static void repaintFont() {
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
    }
    public static void Pass() {


        panel.setLayout(new FlowLayout());


        frame.setSize(340, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        one.setContentAreaFilled(false);
        one.setBorderPainted(false);
        one.setVisible(true);
        one.setBounds(60, 200, 50, 50);
        one.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\pngwing.com.png"));
        one.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "1");
        });

        two.setContentAreaFilled(false);
        two.setBorderPainted(false);
        two.setVisible(true);
        two.setBounds(137, 200, 50, 50);
        two.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\two.png"));
        two.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "2");
        });

        tri.setContentAreaFilled(false);
        tri.setBorderPainted(false);
        tri.setVisible(true);
        tri.setBounds(215, 200, 50, 50);
        tri.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\tri.png"));
        tri.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "3");
        });

        four.setContentAreaFilled(false);
        four.setBorderPainted(false);
        four.setVisible(true);
        four.setBounds(60, 280, 50, 50);
        four.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\four.png"));
        four.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "4");
        });

        five.setContentAreaFilled(false);
        five.setBorderPainted(false);
        five.setVisible(true);
        five.setBounds(137, 280, 50, 50);
        five.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\five.png"));
        five.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "5");
        });

        six.setContentAreaFilled(false);
        six.setBorderPainted(false);
        six.setVisible(true);
        six.setBounds(215, 280, 50, 50);
        six.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\six.png"));
        six.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "6");
        });

        seven.setContentAreaFilled(false);
        seven.setVisible(true);
        seven.setBorderPainted(false);
        seven.setBounds(60, 360, 50, 50);
        seven.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\seven.png"));
        seven.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "7");
        });

        vosem.setContentAreaFilled(false);
        vosem.setBorderPainted(false);
        vosem.setVisible(true);
        vosem.setBounds(137, 360, 50, 50);
        vosem.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\vosem.png"));
        vosem.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "8");
        });

        nine.setContentAreaFilled(false);
        nine.setBorderPainted(false);
        nine.setVisible(true);
        nine.setBounds(215, 360, 50, 50);
        nine.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\nine.png"));
        nine.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "9");
        });

        zero.setContentAreaFilled(false);
        zero.setBorderPainted(false);
        zero.setVisible(true);
        zero.setBounds(137, 440, 50, 50);
        zero.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\zero.png"));
        zero.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "0");
        });

        enter.setContentAreaFilled(false);
        enter.setBorderPainted(false);
        enter.setVisible(true);
        enter.setBounds(215, 520, 80, 50);


        JButton b = new JButton("Clear");
        b.setBounds(40,520,80,50);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                inText.setText("");
            }
        });


        int[] x = {MARGIN_X, MARGIN_X + 90, 200, 290, 380};
        int[] y = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420};
        inText = new JTextField("");
        inText.setHorizontalAlignment(JTextField.CENTER);
        inText.setBounds(x[0], y[0]+40, 260, 70);
        inText.setOpaque(false);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        jtf.add(inText);



        panel.add(jtf);
        frame.add(panel);
        jtf.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefon228.png"));
        jtf.setPreferredSize(new Dimension(330, 650));
        jtf.add(one);
        jtf.add(two);
        jtf.add(tri);
        jtf.add(four);
        jtf.add(five);
        jtf.add(six);
        jtf.add(seven);
        jtf.add(vosem);
        jtf.add(nine);
        jtf.add(zero);
        jtf.add(enter);
        jtf.add(b);
        frame.pack();
        frame.setVisible(true);


        MouseListener mouseListener = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                boolean  result = Pattern.matches("1234",inText.getText());
                if(result==true){
                    Application.Skelet();
                    frame.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Wrong Password");
                    inText.setText("");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };

        enter.addMouseListener(mouseListener);
        }




    public static void main(String[] args) {
        Pass();
    }
}
