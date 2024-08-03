package simulator.Views;

import simulator.Controller.*;
import simulator.Models.Time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Application {
    static Calendar calendar;
    static SimpleDateFormat timeFormat;
    static SimpleDateFormat time2;
    static JLabel timeLabel;
    static JLabel dateLabel;
    static  String time;
    static String date;
    public static void TT(int x){}

    public static void Skelet() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JFrame jfrm = new JFrame("Smartphone");
        jfrm.setSize(330, 650);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        JLabel jtf = new JLabel();
        JLabel topBar = new JLabel();

        JButton button1 = new JButton();
        FF r = new FF(1);
        FF r1 = new FF(1);
        r1.hashCode();
        r.hashCode();
        button1.setContentAreaFilled(r1.equals(r));
        button1.setBorderPainted(false);
        button1.setVisible(true);
        button1.setBounds(30, 550, 50, 50);
        button1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\calendar.png"));


        JButton tictac = new JButton();
        tictac.setContentAreaFilled(false);
        tictac.setBorderPainted(false);
        tictac.setVisible(true);
        tictac.setBounds(100, 550, 50, 50);
        tictac.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\logo.png"));



        JButton calculator = new JButton();
        calculator.setContentAreaFilled(false);
        calculator.setBorderPainted(false);
        calculator.setVisible(true);
        calculator.setBounds(175, 550, 50, 50);
        calculator.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\calculator.png"));

        JButton eldorado = new JButton();
        eldorado.setContentAreaFilled(false);
        eldorado.setBorderPainted(false);
        eldorado.setVisible(true);
        eldorado.setBounds(250, 550, 50, 50);
        eldorado.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\eldorado.png"));

        JButton browser = new JButton();
        browser.setContentAreaFilled(false);
        browser.setBorderPainted(false);
        browser.setVisible(true);
        browser.setBounds(250, 470, 50, 50);
        browser.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\internet.png"));

        JButton laber = new JButton();
        laber.setContentAreaFilled(false);
        laber.setBorderPainted(false);
        laber.setVisible(true);
        laber.setBounds(175, 470, 50, 50);
        laber.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\Snake.png"));

        JButton map = new JButton();
        map.setContentAreaFilled(false);
        map.setBorderPainted(false);
        map.setVisible(true);
        map.setBounds(100, 470, 48, 50);
        map.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\map.png"));


        timeFormat = new SimpleDateFormat("h:mm");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Bahnschrift",0,70));
        timeLabel.setForeground(new Color(0xFFF6F3F3, true));// цвет времени
        time = timeFormat.format(java.util.Calendar.getInstance().getTime());
        timeLabel.setText(time);
        timeLabel.setBounds(100,50,200,200);


        time2 = new SimpleDateFormat("EEEE,d MMMM");
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Bahnschrift",0,20));
        dateLabel.setForeground(new Color(0xFFF6F3F3, true));

        date = time2.format(java.util.Calendar.getInstance().getTime());
        dateLabel.setText(date);
        dateLabel.setBounds(95,90,250,200);



        jtf.add(timeLabel);
        jtf.setVisible(true);
        timeLabel.setOpaque(false);

        jtf.add(dateLabel);
        jtf.setVisible(true);
        dateLabel.setOpaque(false);



        panel.add(jtf);
        jtf.add(topBar);
        jfrm.add(panel);
        topBar.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\topBar.png"));
        topBar.setBounds(235,20,60,21);
        jtf.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefon228.png"));
        jtf.setPreferredSize(new Dimension(330, 650));
        jtf.add(button1);
        jtf.add(tictac);
        jtf.add(calculator);
        jtf.add(eldorado);
        jtf.add(browser);
        jtf.add(laber);
        jtf.add(map);
        jfrm.pack();
        jfrm.setVisible(true);


        JButton back = new JButton();


        MouseListener mouseListener = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                new simulator.Views.Calendar();
                jfrm.setVisible(false);
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

        button1.addMouseListener(mouseListener);


        MouseListener mouseListenerTictac = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                new MainWindow();
                jfrm.setVisible(false);
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

        tictac.addMouseListener(mouseListenerTictac);

        MouseListener mouseListener2 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                new Calculator();
                jfrm.setVisible(false);
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

        calculator.addMouseListener(mouseListener2);



        MouseListener mouseListenerEldorado = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                Eldorado.Set();
                jfrm.setVisible(false);
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

        eldorado.addMouseListener(mouseListenerEldorado);


        MouseListener mouseListenerBrowser = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                Browser.Brows();
                jfrm.setVisible(false);
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

        browser.addMouseListener(mouseListenerBrowser);


        MouseListener mouseListenerLaber = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                EventQueue.invokeLater(() -> {
                    JFrame ex = new Snake();
                    JLabel l = new JLabel();
                    JPanel p = new JPanel();

                    JButton back = new JButton();
                    back.setContentAreaFilled(false);
                    back.setVisible(true);
                    back.setLayout(new FlowLayout());
                    back.setBounds(50,610,240,20);
                    ex.add(back);
                    MouseListener BACK = new MouseListener()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e) {

                            Application.Skelet();
                            ex.setVisible(false);
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    };
                    back.addMouseListener(BACK);

                    ex.setBounds(0,0,330,690);
                    l.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonGray.png"));
                    p.add(l);
                    ex.add(p);
                    ex.setVisible(true);
                });
                jfrm.setVisible(false);
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

        laber.addMouseListener(mouseListenerLaber);

        MouseListener mouseListenermap = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                try {
                    UIManager.setLookAndFeel(String.valueOf(new map()));
                } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException |
                         IllegalAccessException e1) {

                }
                SwingUtilities.invokeLater(() -> {
                    new map().setVisible(true);
                });

                jfrm.setVisible(false);
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

        map.addMouseListener(mouseListenermap);


    }


    public static void main(String[] args) {
        GG.Pass();

    }


}