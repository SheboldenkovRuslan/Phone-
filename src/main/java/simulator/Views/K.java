package simulator.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

/// ОСНОВА

public class K {

    private java.util.Timer timer = new Timer();

    private JLabel timeLabel = new JLabel();
    JButton d_on = new JButton();
    JButton d_off = new JButton();
    JButton off = new JButton();
    JButton on = new JButton();
    JButton off_phone = new JButton();
    JButton keyboard = new JButton();
    JButton headphones = new JButton();
    JLabel name;
   public static JButton back = new JButton();


    public static JFrame frame1 = new JFrame();
    public static JButton one1 = new JButton();
    public static JButton close1 = new JButton("ЗАКРЫТЬ");
    public static JButton two1 = new JButton();
    public static JButton tri1 = new JButton();
    public static JButton four1 = new JButton();
    public static JButton enter1 = new JButton("*");

    public static JLabel jtf31 = new JLabel();
    public static JPanel panel1 = new JPanel();
    public static JButton five1 = new JButton();
    public static JButton six1 = new JButton();
    public static JButton seven1 = new JButton();
    public static JButton vosem1 = new JButton();
    public static JButton nine1 = new JButton();
    public static JButton zero1 = new JButton();

    private static JTextField inText1;
    private static final int WINDOW_WIDTH1 = 340;
    private static final int WINDOW_HEIGHT1 = 650;
    private static final int BUTTON_WIDTH1 = 60;
    private static final int BUTTON_HEIGHT1 = 40;
    private static final int MARGIN_X1 = 40;
    private static final int MARGIN_Y1 = 70;



    public static JFrame frame = new JFrame();
    public static JButton one = new JButton();
    public static JButton close = new JButton("ЗАКРЫТЬ");
    public static JButton two = new JButton();
    public static JButton tri = new JButton();
    public static JButton four = new JButton();
    public static JButton enter = new JButton("*");

    public static JLabel jtf3 = new JLabel();
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


    JButton but = new JButton("Андрей Kонстантинович");
    JTextField ok = new JTextField("Поиск");
    JLabel kon = new JLabel("Контакты");
    JLabel rid = new JLabel("РиА");
    JLabel card = new JLabel("Моя карточка");

    private java.util.Timer timer1 = new Timer();
    private JLabel timeLabel1 = new JLabel();

    JButton d_on1 = new JButton();
    JButton d_off1 = new JButton();
    JButton off1 = new JButton();
    JButton on1 = new JButton();
    JButton off_phone1 = new JButton();
    JButton keyboard1 = new JButton();
    JButton headphones1 = new JButton();
    JLabel name1;

    JButton venom = new JButton();

    JLabel a = new JLabel("A");
    JLabel t = new JLabel("_________________________________");
    JLabel t2 = new JLabel("________________________________________________");




    JFrame f1= new JFrame("типа телефон");
    JFrame f;
    JFrame f2;
    JPanel jpanel = new JPanel();
    JPanel jPanel1 = new JPanel();
    JLabel jtf1 = new JLabel();
    JLabel jtf = new JLabel();


    K(){
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);

        a.setVisible(true);
        a.setBounds(50,210,20,20);
        a.setForeground(new Color(0xFFFFFFFF, true));
        a.setFont(new Font("Arial Black", Font.PLAIN, 15));
        jtf.add(a);
        a.repaint();

        t.setVisible(true);
        t.setBounds(24,210,290,20);
        t.setForeground(new Color(0xFFFFFFFF, true));
        t.setFont(new Font("Serif", Font.PLAIN, 15));
        jtf.add(t);
        t.repaint();


        venom.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\venom.png"));
        venom.setVisible(true);
        jtf.add(venom);
        venom.setContentAreaFilled(false);
        venom.setBorderPainted(false);
        venom.setBounds(40,150,50,50);
        venom.repaint();


        ok.setBounds(30,100,270,40);
        ok.setVisible(true);
        ok.setBackground(new Color(0xFF000000, true));
        //ok.setOpaque(false);
        jtf.add(ok);

        kon.setBounds(30,7,150,150);
        kon.setVisible(true);
        kon.setForeground(new Color(0xFFF6F3F3, true));
        kon.setFont(new Font("Arial Black", Font.PLAIN, 25));
        jtf.add(kon);

        rid.setBounds(100,130,50,50);
        rid.setVisible(true);
        rid.setForeground(new Color(0xFFF6F3F3, true));
        rid.setFont(new Font("Arial Black", Font.PLAIN, 15));
        jtf.add(rid);

        card.setBounds(100,150,80,50);
        card.setVisible(true);
        card.setForeground(new Color(0xFFF6F3F3, true));
        card.setFont(new Font("Arial Black", Font.PLAIN, 10));
        jtf.add(card);

        but.setBounds(30,240,220,30);
        but.setContentAreaFilled(false);
        but.setBorderPainted(false);
        but.setForeground(new Color(0xFFF6F3F3, true));
        but.setFont(new Font("Arial Black", Font.PLAIN, 13));
        but.setLayout(new FlowLayout());
        but.setVisible(true);
        jtf.add(but);


        jpanel.add(jtf);
        jtf.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonGray.png"));
        f1.add(jpanel);
        f1.pack();
        f1.setVisible(true);



        but.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f1.setVisible(false);
                but.setVisible(false);
                ok.setVisible(false);
                kon.setVisible(false);
                rid.setVisible(false);
                card.setVisible(false);
                venom.setVisible(false);
                t.setVisible(false);
                a.setVisible(false);
                back.setVisible(false);

                zn();
                zp();

            }
        });



        back.setContentAreaFilled(false);
        back.setVisible(true);
        back.setLayout(new FlowLayout());
        back.setBounds(50,610,240,20);
        MouseListener mouseListener1 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {

                Application.Skelet();
                frame.setVisible(false);
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
        back.addMouseListener(mouseListener1);

        jtf.add(back);

    }
    public void zn()
    {

                f = new JFrame("Seconds");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setBounds(340,0,330,650);

                jpanel.add(jtf);
                jtf.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\Telefon_Blyur.png"));
                f.add(jpanel);
                f.pack();

                f.setVisible(true);

                name = new JLabel("РИА");
                name.setVisible(true);

                jtf.add(name);
                name.setBounds(140,100,50,50);
                //name.setForeground(Color.white);
                name.setFont(new Font("Serif", Font.PLAIN, 22));
                name.repaint();

                off.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\выкл1.png"));
                on.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\вкл.png"));



                d_off.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\динамик_выкл.png"));
                d_on.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\динамик_вкл.png"));
                headphones.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\наушники.png"));

                keyboard.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\клавиши.png"));
                off_phone.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\отбой.png"));

                jtf.add(timeLabel);
                timeLabel.setBounds(150,170,50,50);
                timeLabel.setFont(new Font("Serif", Font.PLAIN, 30));
                timeLabel.repaint();

                off.setVisible(false);
                jtf.add(off);
                off.setContentAreaFilled(false);
                off.setBorderPainted(false);
                off.setBounds(55,250,50,50);
                off.repaint();


                on.setVisible(true);
                jtf.add(on);
                on.setContentAreaFilled(false);
                on.setBorderPainted(false);
                on.setBounds(55,250,50,50);
                on.repaint();


                d_off.setVisible(false);
                jtf.add(d_off);
                d_off.setContentAreaFilled(false);
                d_off.setBorderPainted(false);
                d_off.setBounds(210,250,50,50);
                d_off.repaint();


                d_on.setVisible(true);
                jtf.add(d_on);
                d_on.setContentAreaFilled(false);
                d_on.setBorderPainted(false);
                d_on.setBounds(210,250,50,50);
                d_on.repaint();

                headphones.setVisible(false);
                jtf.add(headphones);
                headphones.setContentAreaFilled(false);
                headphones.setBorderPainted(false);
                headphones.setBounds(210,250,50,50);
                headphones.repaint();


                keyboard.setVisible(true);
                jtf.add(keyboard);
                keyboard.setContentAreaFilled(false);
                keyboard.setBorderPainted(false);
                keyboard.setBounds(134,250,50,50);
                keyboard.repaint();


                off_phone.setVisible(true);
                jtf.add(off_phone);
                off_phone.setContentAreaFilled(false);
                off_phone.setBorderPainted(false);
                off_phone.setBounds(125,400,80,80);
                off_phone.repaint();


                timer.schedule(new UpdateUITask(), 0, 1000);






        off_phone.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f2.setVisible(false);
                new K();
            }
        });

        off.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                off.setVisible(false);
                on.setVisible(true);
            }
        });



        on.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                on.setVisible(false);
                off.setVisible(true);
            }
        });



        d_off.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d_off.setVisible(false);
                d_on.setVisible(false);
                headphones.setVisible(true);
            }
        });



        d_on.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d_off.setVisible(true);
                d_on.setVisible(false);
                headphones.setVisible(false);
            }
        });



        headphones.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d_off.setVisible(false);
                d_on.setVisible(true);
                headphones.setVisible(false);
            }
        });
            }
            private class UpdateUITask extends TimerTask {

                int nSeconds = 0;

                @Override
                public void run() {
                    EventQueue.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            timeLabel.setText(String.valueOf(nSeconds++));
                        }
                    });
                }
            }



    private static void repaintFont1() {
        inText1.setFont(inText1.getFont().deriveFont(Font.PLAIN));
    }
    public void Pass1() {
        panel1.setLayout(new FlowLayout());
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        JButton one1 = new JButton();
        one1.setContentAreaFilled(false);
        one1.setBorderPainted(false);
        one1.setVisible(true);
        one1.setBounds(60, 200, 50, 50);
        one1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\pngwing.com.png"));
        one1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "1");
        });
        JButton two1 = new JButton();
        two1.setContentAreaFilled(false);
        two1.setBorderPainted(false);
        two1.setVisible(true);
        two1.setBounds(137, 200, 50, 50);
        two1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\two.png"));
        two1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "2");
        });
        JButton tri1 = new JButton();
        tri1.setContentAreaFilled(false);
        tri1.setBorderPainted(false);
        tri1.setVisible(true);
        tri1.setBounds(215, 200, 50, 50);
        tri1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\tri.png"));
        tri1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "3");
        });
        JButton four1 = new JButton();
        four1.setContentAreaFilled(false);
        four1.setBorderPainted(false);
        four1.setVisible(true);
        four1.setBounds(60, 280, 50, 50);
        four1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\four.png"));
        four1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "4");
        });


        JButton five1 = new JButton();
        five1.setContentAreaFilled(false);
        five1.setBorderPainted(false);
        five1.setVisible(true);
        five1.setBounds(137, 280, 50, 50);
        five1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\five.png"));
        five1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "5");
        });
        JButton six1 = new JButton();
        six1.setContentAreaFilled(false);
        six1.setBorderPainted(false);
        six1.setVisible(true);
        six1.setBounds(215, 280, 50, 50);
        six1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\six.png"));
        six1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "6");
        });
        JButton seven1 = new JButton();
        seven1.setContentAreaFilled(false);
        seven1.setVisible(true);
        seven1.setBorderPainted(false);
        seven1.setBounds(60, 360, 50, 50);
        seven1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\seven.png"));
        seven1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "7");
        });
        JButton vosem1 = new JButton();
        vosem1.setContentAreaFilled(false);
        vosem1.setBorderPainted(false);
        vosem1.setVisible(true);
        vosem1.setBounds(137, 360, 50, 50);
        vosem1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\vosem.png"));
        vosem1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "8");
        });
        JButton nine1 = new JButton();
        nine1.setContentAreaFilled(false);
        nine1.setBorderPainted(false);
        nine1.setVisible(true);
        nine1.setBounds(215, 360, 50, 50);
        nine1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\nine.png"));
        nine1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "9");
        });
        JButton zero1 = new JButton();
        zero1.setContentAreaFilled(false);
        zero1.setBorderPainted(false);
        zero1.setVisible(true);
        zero1.setBounds(137, 440, 50, 50);
        zero1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\zero.png"));
        zero1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "0");
        });
        JButton enter1 = new JButton();
        enter1.setContentAreaFilled(false);
        enter1.setBorderPainted(false);
        enter1.setVisible(true);
        enter1.setBounds(70, 440, 50, 50);
        enter1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\звездочка.png"));
        enter1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "*");
        });

        close1.setContentAreaFilled(false);
        close1.setBorderPainted(false);
        close1.setVisible(true);
        close1.setBounds(175, 10, 150, 150);
        close1.setFont(new Font("Serif", Font.PLAIN, 20));


        JButton b1 = new JButton("#");
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.setVisible(true);
        b1.setBounds(220, 440, 50, 50);
        b1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\решетка.png"));
        b1.addActionListener(event -> {
            repaintFont1();
            inText1.setText(inText1.getText() + "#");
        });

        int[] x = {MARGIN_X1, MARGIN_X1 + 90, 200, 290, 380};
        int[] y = {MARGIN_Y1, MARGIN_Y1 + 100, MARGIN_Y1 + 180, MARGIN_Y1 + 260, MARGIN_Y1 + 340, MARGIN_Y1 + 420};
        inText1 = new JTextField("");
        inText1.setHorizontalAlignment(JTextField.CENTER);
        inText1.setBounds(x[0], y[0]+40, 260, 70);
        inText1.setOpaque(false);
        inText1.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        jtf31.add(inText1);



        panel1.add(jtf31);
        frame1.add(panel1);
        jtf31.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\Telefon_Blyur.png"));
        jtf3.setPreferredSize(new Dimension(330, 650));
        jtf31.add(one1);
        jtf31.add(two1);
        jtf31.add(tri1);
        jtf31.add(four1);
        jtf31.add(five1);
        jtf31.add(six1);
        jtf31.add(seven1);
        jtf31.add(vosem1);
        jtf31.add(nine1);
        jtf31.add(zero1);
        jtf31.add(enter1);
        jtf31.add(b1);
        jtf31.add(close1);
        close1.repaint();
        frame1.pack();
        frame1.setVisible(true);

    }



    public void zp()
    {

        f2 = new JFrame("ЗВОНОК_П");
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel1.add(jtf1);
        jtf1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\Telefon_Blyur.png"));
        f2.add(jPanel1);
        f2.pack();

        f2.setVisible(true);

        name1 = new JLabel("Андрей Kонстантинович");
        name1.setVisible(true);

        jtf1.add(name1);
        name1.setBounds(45,5,250,250);
        //name.setForeground(Color.white);
        name1.setFont(new Font("Serif", Font.PLAIN, 22));
        name1.repaint();

        off1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\выкл1.png"));
        on1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\вкл.png"));

        d_off1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\динамик_выкл.png"));
        d_on1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\динамик_вкл.png"));
        headphones1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\наушники.png"));

        keyboard1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\клавиши.png"));
        off_phone1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\отбой.png"));

        jtf1.add(timeLabel1);
        timeLabel1.setBounds(150,170,50,50);
        timeLabel1.setFont(new Font("Serif", Font.PLAIN, 30));
        timeLabel1.repaint();

        off1.setVisible(false);
        jtf1.add(off1);
        off1.setContentAreaFilled(false);
        off1.setBorderPainted(false);
        off1.setBounds(55,250,50,50);
        off1.repaint();


        on1.setVisible(true);
        jtf1.add(on1);
        on1.setContentAreaFilled(false);
        on1.setBorderPainted(false);
        on1.setBounds(55,250,50,50);
        on1.repaint();

        d_off1.setVisible(false);
        jtf1.add(d_off1);
        d_off1.setContentAreaFilled(false);
        d_off1.setBorderPainted(false);
        d_off1.setBounds(210,250,50,50);
        d_off1.repaint();


        d_on1.setVisible(true);
        jtf1.add(d_on1);
        d_on1.setContentAreaFilled(false);
        d_on1.setBorderPainted(false);
        d_on1.setBounds(210,250,50,50);
        d_on1.repaint();


        headphones1.setVisible(false);
        jtf1.add(headphones1);
        headphones1.setContentAreaFilled(false);
        headphones1.setBorderPainted(false);
        headphones1.setBounds(210,250,50,50);
        headphones1.repaint();


        keyboard1.setVisible(true);
        jtf1.add(keyboard1);
        keyboard1.setContentAreaFilled(false);
        keyboard1.setBorderPainted(false);
        keyboard1.setBounds(134,250,50,50);
        keyboard1.repaint();


        off_phone1.setVisible(true);
        jtf1.add(off_phone1);
        off_phone1.setContentAreaFilled(false);
        off_phone1.setBorderPainted(false);
        off_phone1.setBounds(125,400,80,80);
        off_phone1.repaint();


        timer1.schedule(new UpdateUITask1(), 0, 1000);

        off_phone1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                f2.setVisible(false);
                new K();
            }
        });

        off1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                off1.setVisible(false);
                on1.setVisible(true);
            }
        });

        on1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                on1.setVisible(false);
                off1.setVisible(true);
            }
        });

        keyboard.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Pass();
                inText.setText("");
            }
        });


        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                inText.setText("");
                frame.setVisible(false);
                frame1.remove(frame1);

            }
        });




        d_off1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d_off1.setVisible(false);
                d_on1.setVisible(false);
                headphones1.setVisible(true);
            }
        });

        d_on1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d_off1.setVisible(true);
                d_on1.setVisible(false);
                headphones1.setVisible(false);
            }
        });

        headphones1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d_off1.setVisible(false);
                d_on1.setVisible(true);
                headphones1.setVisible(false);
            }
        });

        keyboard1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Pass1();
                inText1.setText("");
            }
        });

        close1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                inText1.setText("");
                frame1.setVisible(false);
            }
        });
    }
    private class UpdateUITask1 extends TimerTask {

        int nSeconds = 0;

        @Override
        public void run() {
            EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {
                    timeLabel1.setText(String.valueOf(nSeconds++));
                }
            });
        }
    }

        private static void repaintFont() {
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
    }
        public void Pass() {


        panel.setLayout(new FlowLayout());


        frame.setBounds(340,0,330,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

            JButton one = new JButton();
        one.setContentAreaFilled(false);
        one.setBorderPainted(false);
        one.setVisible(true);
        one.setBounds(60, 200, 50, 50);
        one.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\pngwing.com.png"));
        one.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "1");
        });
            JButton two = new JButton();
        two.setContentAreaFilled(false);
        two.setBorderPainted(false);
        two.setVisible(true);
        two.setBounds(137, 200, 50, 50);
        two.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\two.png"));
        two.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "2");
        });
            JButton tri = new JButton();
        tri.setContentAreaFilled(false);
        tri.setBorderPainted(false);
        tri.setVisible(true);
        tri.setBounds(215, 200, 50, 50);
        tri.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\tri.png"));
        tri.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "3");
        });
            JButton four = new JButton();
        four.setContentAreaFilled(false);
        four.setBorderPainted(false);
        four.setVisible(true);
        four.setBounds(60, 280, 50, 50);
        four.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\four.png"));
        four.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "4");
        });


            JButton five = new JButton();
        five.setContentAreaFilled(false);
        five.setBorderPainted(false);
        five.setVisible(true);
        five.setBounds(137, 280, 50, 50);
        five.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\five.png"));
        five.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "5");
        });
            JButton six = new JButton();
        six.setContentAreaFilled(false);
        six.setBorderPainted(false);
        six.setVisible(true);
        six.setBounds(215, 280, 50, 50);
        six.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\six.png"));
        six.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "6");
        });
            JButton seven = new JButton();
        seven.setContentAreaFilled(false);
        seven.setVisible(true);
        seven.setBorderPainted(false);
        seven.setBounds(60, 360, 50, 50);
        seven.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\seven.png"));
        seven.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "7");
        });
            JButton vosem = new JButton();
        vosem.setContentAreaFilled(false);
        vosem.setBorderPainted(false);
        vosem.setVisible(true);
        vosem.setBounds(137, 360, 50, 50);
        vosem.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\vosem.png"));
        vosem.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "8");
        });
            JButton nine = new JButton();
        nine.setContentAreaFilled(false);
        nine.setBorderPainted(false);
        nine.setVisible(true);
        nine.setBounds(215, 360, 50, 50);
        nine.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\nine.png"));
        nine.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "9");
        });
            JButton zero = new JButton();
        zero.setContentAreaFilled(false);
        zero.setBorderPainted(false);
        zero.setVisible(true);
        zero.setBounds(137, 440, 50, 50);
        zero.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\zero.png"));
        zero.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "0");
        });
            JButton enter = new JButton();
            enter.setContentAreaFilled(false);
            enter.setBorderPainted(false);
            enter.setVisible(true);
            enter.setBounds(70, 440, 50, 50);
            enter.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\звездочка.png"));
            enter.addActionListener(event -> {
            repaintFont();
            inText.setText(inText.getText() + "*");
        });

            close.setContentAreaFilled(false);
            close.setBorderPainted(false);
            close.setVisible(true);
            close.setBounds(175, 10, 150, 150);
            close.setFont(new Font("Serif", Font.PLAIN, 20));


        JButton b = new JButton("#");


            b.setContentAreaFilled(false);
            b.setBorderPainted(false);
            b.setVisible(true);
            b.setBounds(220, 440, 50, 50);
            b.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\решетка.png"));
            b.addActionListener(event -> {
                repaintFont();
                inText.setText(inText.getText() + "#");
            });

        int[] x = {MARGIN_X, MARGIN_X + 90, 200, 290, 380};
        int[] y = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420};
        inText = new JTextField("");
        inText.setHorizontalAlignment(JTextField.CENTER);
        inText.setBounds(x[0], y[0]+40, 260, 70);
        inText.setOpaque(false);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        jtf3.add(inText);



        panel.add(jtf3);
        frame.add(panel);
        jtf3.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\Telefon_Blyur.png"));
        //jtf3.setPreferredSize(new Dimension(330, 650));
        jtf3.add(one);
        jtf3.add(two);
        jtf3.add(tri);
        jtf3.add(four);
        jtf3.add(five);
            jtf3.add(six);
            jtf3.add(seven);
            jtf3.add(vosem);
            jtf3.add(nine);
            jtf3.add(zero);
            jtf3.add(enter);
            jtf3.add(b);
            jtf3.add(close);
            close.repaint();
        frame.pack();
        frame.setVisible(true);

    }



    public static void main(String[] args) {
        new K();
    }


}