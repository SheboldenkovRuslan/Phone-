package simulator.Views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SS implements ActionListener  {
    JRadioButton r1 = new JRadioButton();
    JRadioButton r2 = new JRadioButton();
    JRadioButton r3 = new JRadioButton();
    JRadioButton r4 = new JRadioButton();
    JRadioButton r5 = new JRadioButton();
    JRadioButton r6 = new JRadioButton();
    JRadioButton r7 = new JRadioButton();
    JRadioButton r8 = new JRadioButton();
    JRadioButton r9 = new JRadioButton();
    JRadioButton r10 = new JRadioButton();
    JRadioButton r11 = new JRadioButton();
    JRadioButton b1 = new JRadioButton();
    JRadioButton b3 = new JRadioButton();
    JRadioButton b4 = new JRadioButton();
    JRadioButton b5 = new JRadioButton();
    JRadioButton b6 = new JRadioButton();
    //////////
    JFrame f = new JFrame();
    JPanel jpanel;
    JLabel jtfdate;
    JLabel jtf = new JLabel();
    /////////
    JLabel min2;
    JLabel min3;
    JLabel min4;
    JLabel min5;
    JLabel min6;
    JLabel min7;
    JLabel min8;
    JLabel min9;
    JLabel min10;
    JLabel min11;
    JLabel min12;
    JLabel min13;
    JLabel min14;
    JLabel min15;
    JLabel min16;
    JLabel min17;
    JLabel min18;
    JLabel min19;
    JLabel min20;

    JLabel min21;
    JLabel min22;
    JLabel min23;
    JLabel min24;
    JLabel min25;
    JLabel min26;
    JLabel min27;
    JLabel min28;
    JLabel min30;
    ////////////
    Calendar cal2;  JLabel date2;
    Calendar cal3;  JLabel date3;
    Calendar cal4;  JLabel date4;
    Calendar cal5;  JLabel date5;
    Calendar cal6;  JLabel date6;
    Calendar cal7;  JLabel date7;
    Calendar cal8;  JLabel date8;
    Calendar cal9;  JLabel date9;
    Calendar cal10;  JLabel date10;
    Calendar cal11;  JLabel date11;
    Calendar cal12;  JLabel date12;
    Calendar cal13;  JLabel date13;
    Calendar cal14;  JLabel date14;
    Calendar cal15;  JLabel date15;
    Calendar cal16;  JLabel date16;
    Calendar cal17;  JLabel date17;
    Calendar cal18;  JLabel date18;
    Calendar cal19;  JLabel date19;
    Calendar cal20;  JLabel date20;
    Calendar cal21;  JLabel date21;
    Calendar cal22;  JLabel date22;
    Calendar cal23;  JLabel date23;
    Calendar cal24;  JLabel date24;
    Calendar cal25;  JLabel date25;
    Calendar cal26;  JLabel date26;
    Calendar cal27;  JLabel date27;
    Calendar cal28;  JLabel date28;
    Calendar cal30;  JLabel date30;
    JScrollPane s;
    JTable k = new JTable();

    SimpleDateFormat formatall = new SimpleDateFormat("hh:mm");

    ///date_now
    Calendar calendar;
    SimpleDateFormat formattedDate = new SimpleDateFormat("hh:mm");
    String dateToday;
    ///////
    JLabel tire = new JLabel("-");
    JLabel vremi = new JLabel("Время поездки:");
    JLabel red;
    JLabel blue;
    JLabel man;
    //////
    JLabel red_b1;
    JLabel red_b2;
    JLabel red_v1;
    JLabel red_v2;
    JLabel blue_b1;
    JLabel blue_b2;
    JLabel blue_v1;
    JLabel blue_v2;

    SS() {
        jpanel = new JPanel();
        cal2 = new GregorianCalendar();
        cal2.add(Calendar.MINUTE, 2);
        String dateToday2 = formattedDate.format(cal2.getTime());
        date2 = new JLabel(dateToday2);
        date2.setBounds(160,600,70,70);
        date2.setFont(new Font("Serif", Font.PLAIN, 20));
        date2.setVisible(false);
        jpanel.add(date2);

        cal3 = new GregorianCalendar();
        cal3.add(Calendar.MINUTE, 3);
        String dateToday3 = formattedDate.format(cal3.getTime());
        date3 = new JLabel(dateToday3);
        date3.setBounds(160,600,70,70);
        date3.setFont(new Font("Serif", Font.PLAIN, 20));
        date3.setVisible(false);
        jpanel.add(date3);

        cal4 = new GregorianCalendar();
        cal4.add(Calendar.MINUTE, 4);
        String dateToday4 = formattedDate.format(cal4.getTime());
        date4 = new JLabel(dateToday4);
        date4.setBounds(160,600,70,70);
        date4.setFont(new Font("Serif", Font.PLAIN, 20));
        date4.setVisible(false);
        jpanel.add(date4);

        cal5 = new GregorianCalendar();
        cal5.add(Calendar.MINUTE, 5);
        String dateToday5 = formattedDate.format(cal5.getTime());
        date5 = new JLabel(dateToday5);
        date5.setBounds(160,600,70,70);
        date5.setFont(new Font("Serif", Font.PLAIN, 20));
        date5.setVisible(false);
        jpanel.add(date5);

        cal6 = new GregorianCalendar();
        cal6.add(Calendar.MINUTE, 6);
        String dateToday6 = formattedDate.format(cal6.getTime());
        date6 = new JLabel(dateToday6);
        date6.setBounds(160,600,70,70);
        date6.setFont(new Font("Serif", Font.PLAIN, 20));
        date6.setVisible(false);
        jpanel.add(date6);

        cal7 = new GregorianCalendar();
        cal7.add(Calendar.MINUTE, 7);
        String dateToday7 = formattedDate.format(cal7.getTime());
        date7 = new JLabel(dateToday7);
        date7.setBounds(160,600,70,70);
        date7.setFont(new Font("Serif", Font.PLAIN, 20));
        date7.setVisible(false);
        jpanel.add(date7);

        cal8 = new GregorianCalendar();
        cal8.add(Calendar.MINUTE, 8);
        String dateToday8 = formattedDate.format(cal8.getTime());
        date8 = new JLabel(dateToday8);
        date8.setBounds(160,600,70,70);
        date8.setFont(new Font("Serif", Font.PLAIN, 20));
        date8.setVisible(false);
        jpanel.add(date8);

        cal9 = new GregorianCalendar();
        cal9.add(Calendar.MINUTE, 9);
        String dateToday9 = formattedDate.format(cal9.getTime());
        date9 = new JLabel(dateToday9);
        date9.setBounds(160,600,70,70);
        date9.setFont(new Font("Serif", Font.PLAIN, 20));
        date9.setVisible(false);
        jpanel.add(date9);

        cal10 = new GregorianCalendar();
        cal10.add(Calendar.MINUTE, 10);
        String dateToday10 = formattedDate.format(cal10.getTime());
        date10 = new JLabel(dateToday10);
        date10.setBounds(160,600,70,70);
        date10.setFont(new Font("Serif", Font.PLAIN, 20));
        date10.setVisible(false);
        jpanel.add(date10);



        cal12 = new GregorianCalendar();
        cal12.add(Calendar.MINUTE, 12);
        String dateToday12 = formattedDate.format(cal12.getTime());
        date12 = new JLabel(dateToday12);
        date12.setBounds(160,600,70,70);
        date12.setFont(new Font("Serif", Font.PLAIN, 20));
        date12.setVisible(false);
        jpanel.add(date12);

        cal13 = new GregorianCalendar();
        cal13.add(Calendar.MINUTE, 13);
        String dateToday13 = formattedDate.format(cal13.getTime());
        date13 = new JLabel(dateToday13);
        date13.setBounds(160,600,70,70);
        date13.setFont(new Font("Serif", Font.PLAIN, 20));
        date13.setVisible(false);
        jpanel.add(date13);

        cal14 = new GregorianCalendar();
        cal14.add(Calendar.MINUTE, 14);
        String dateToday14 = formattedDate.format(cal14.getTime());
        date14 = new JLabel(dateToday14);
        date14.setBounds(160,600,70,70);
        date14.setFont(new Font("Serif", Font.PLAIN, 20));
        date14.setVisible(false);
        jpanel.add(date14);

        cal15 = new GregorianCalendar();
        cal15.add(Calendar.MINUTE, 15);
        String dateToday15 = formattedDate.format(cal15.getTime());
        date15 = new JLabel(dateToday15);
        date15.setBounds(160,600,70,70);
        date15.setFont(new Font("Serif", Font.PLAIN, 20));
        date15.setVisible(false);
        jpanel.add(date15);

        cal16 = new GregorianCalendar();
        cal16.add(Calendar.MINUTE, 16);
        String dateToday16 = formattedDate.format(cal16.getTime());
        date16 = new JLabel(dateToday16);
        date16.setBounds(160,600,70,70);
        date16.setFont(new Font("Serif", Font.PLAIN, 20));
        date16.setVisible(false);
        jpanel.add(date16);

        cal17 = new GregorianCalendar();
        cal17.add(Calendar.MINUTE, 17);
        String dateToday17 = formattedDate.format(cal17.getTime());
        date17 = new JLabel(dateToday17);
        date17.setBounds(160,600,70,70);
        date17.setFont(new Font("Serif", Font.PLAIN, 20));
        date17.setVisible(false);
        jpanel.add(date17);

        cal18 = new GregorianCalendar();
        cal18.add(Calendar.MINUTE, 18);
        String dateToday18 = formattedDate.format(cal18.getTime());
        date18 = new JLabel(dateToday18);
        date18.setBounds(160,600,70,70);
        date18.setFont(new Font("Serif", Font.PLAIN, 20));
        date18.setVisible(false);
        jpanel.add(date18);

        cal19 = new GregorianCalendar();
        cal19.add(Calendar.MINUTE, 19);
        String dateToday19 = formattedDate.format(cal19.getTime());
        date19 = new JLabel(dateToday19);
        date19.setBounds(160,600,70,70);
        date19.setFont(new Font("Serif", Font.PLAIN, 20));
        date19.setVisible(false);
        jpanel.add(date19);

        cal20 = new GregorianCalendar();
        cal20.add(Calendar.MINUTE, 20);
        String dateToday20 = formattedDate.format(cal20.getTime());
        date20 = new JLabel(dateToday20);
        date20.setBounds(160,600,70,70);
        date20.setFont(new Font("Serif", Font.PLAIN, 20));
        date20.setVisible(false);
        jpanel.add(date20);

        cal11 = new GregorianCalendar();
        cal11.add(Calendar.MINUTE, 11);
        String dateToday11 = formattedDate.format(cal11.getTime());
        date11 = new JLabel(dateToday11);
        date11.setBounds(160,600,70,70);
        date11.setFont(new Font("Serif", Font.PLAIN, 20));
        date11.setVisible(false);
        jpanel.add(date11);

        cal21 = new GregorianCalendar();
        cal21.add(Calendar.MINUTE, 21);
        String dateToday21 = formattedDate.format(cal21.getTime());
        date21 = new JLabel(dateToday21);
        date21.setBounds(160,600,70,70);
        date21.setFont(new Font("Serif", Font.PLAIN, 20));
        date21.setVisible(false);
        jpanel.add(date21);

        cal22 = new GregorianCalendar();
        cal22.add(Calendar.MINUTE, 22);
        String dateToday22 = formattedDate.format(cal22.getTime());
        date22 = new JLabel(dateToday22);
        date22.setBounds(160,600,70,70);
        date22.setFont(new Font("Serif", Font.PLAIN, 20));
        date22.setVisible(false);
        jpanel.add(date22);

        cal23 = new GregorianCalendar();
        cal23.add(Calendar.MINUTE, 23);
        String dateToday23 = formattedDate.format(cal23.getTime());
        date23 = new JLabel(dateToday23);
        date23.setBounds(160,600,70,70);
        date23.setFont(new Font("Serif", Font.PLAIN, 20));
        date23.setVisible(false);
        jpanel.add(date23);

        cal24 = new GregorianCalendar();
        cal24.add(Calendar.MINUTE, 24);
        String dateToday24 = formattedDate.format(cal24.getTime());
        date24 = new JLabel(dateToday24);
        date24.setBounds(160,600,70,70);
        date24.setFont(new Font("Serif", Font.PLAIN, 20));
        date24.setVisible(false);
        jpanel.add(date24);

        cal25 = new GregorianCalendar();
        cal25.add(Calendar.MINUTE, 25);
        String dateToday25 = formattedDate.format(cal25.getTime());
        date25 = new JLabel(dateToday25);
        date25.setBounds(160,600,70,70);
        date25.setFont(new Font("Serif", Font.PLAIN, 20));
        date25.setVisible(false);
        jpanel.add(date25);

        cal26 = new GregorianCalendar();
        cal26.add(Calendar.MINUTE, 26);
        String dateToday26 = formattedDate.format(cal26.getTime());
        date26 = new JLabel(dateToday26);
        date26.setBounds(160,600,70,70);
        date26.setFont(new Font("Serif", Font.PLAIN, 20));
        date26.setVisible(false);
        jpanel.add(date26);

        cal27 = new GregorianCalendar();
        cal27.add(Calendar.MINUTE, 27);
        String dateToday27 = formattedDate.format(cal27.getTime());
        date27 = new JLabel(dateToday27);
        date27.setBounds(160,600,70,70);
        date27.setFont(new Font("Serif", Font.PLAIN, 20));
        date27.setVisible(false);
        jpanel.add(date27);

        cal28 = new GregorianCalendar();
        cal28.add(Calendar.MINUTE, 28);
        String dateToday28 = formattedDate.format(cal28.getTime());
        date28 = new JLabel(dateToday28);
        date28.setBounds(160,600,70,70);
        date28.setFont(new Font("Serif", Font.PLAIN, 20));
        date28.setVisible(false);
        jpanel.add(date28);

        cal30 = new GregorianCalendar();
        cal30.add(Calendar.MINUTE, 30);
        String dateToday30 = formattedDate.format(cal20.getTime());
        date30 = new JLabel(dateToday30);
        date30.setBounds(160,600,70,70);
        date30.setFont(new Font("Serif", Font.PLAIN, 20));
        date30.setVisible(false);
        jpanel.add(date30);


        calendar = new GregorianCalendar();
        dateToday = formattedDate.format((calendar.getTime()));
        jtfdate = new JLabel(dateToday);
        jtfdate.setBounds(100,600,70,70);
        jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
        jtfdate.setVisible(false);
        jpanel.add(jtfdate);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = f.getContentPane();

        JButton back = new JButton();
        back.setContentAreaFilled(false);
        back.setVisible(true);
        back.setLayout(new FlowLayout());
        back.setBounds(50,690,240,20);
        jtf.add(back);
        MouseListener BACK = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e) {

                Application.Skelet();
                f.setVisible(false);
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

        con.add(r1);
        r1.setBounds(290, 653, 20, 20);
        r1.setContentAreaFilled(false);
        jtf.add(r1);
        r1.setLayout(new FlowLayout());;
        r1.addActionListener(this);

        con.add(r2);
        r2.setBounds(290, 607, 20, 20);
        r2.setContentAreaFilled(false);
        jtf.add(r2);
        r2.setLayout(new FlowLayout());
        r2.addActionListener(this);

        con.add(r3);
        r3.setBounds(290, 561, 20, 20);
        r3.setContentAreaFilled(false);
        jtf.add(r3);
        r3.setLayout(new FlowLayout());
        r3.addActionListener(this);

        con.add(r4);
        r4.setBounds(290, 515, 20, 20);
        r4.setContentAreaFilled(false);
        jtf.add(r4);
        r4.setLayout(new FlowLayout());
        r4.addActionListener(this);

        con.add(r5);
        r5.setBounds(290, 470, 20, 20);
        r5.setContentAreaFilled(false);
        jtf.add(r5);
        r5.setLayout(new FlowLayout());
        r5.addActionListener(this);

        con.add(r6);
        r6.setBounds(290, 425, 20, 20);
        r6.setContentAreaFilled(false);
        jtf.add(r6);
        r6.setLayout(new FlowLayout());
        r6.addActionListener(this);

        con.add(r7);
        r7.setBounds(290, 379, 20, 20);
        r7.setContentAreaFilled(false);
        jtf.add(r7);
        r7.setLayout(new FlowLayout());
        r7.addActionListener(this);

        con.add(r8);
        r8.setBounds(290, 333, 20, 20);
        r8.setContentAreaFilled(false);
        jtf.add(r8);
        r8.setLayout(new FlowLayout());
        r8.addActionListener(this);

        con.add(r9);
        r9.setBounds(290, 287, 20, 20);
        r9.setContentAreaFilled(false);
        jtf.add(r9);
        r9.setLayout(new FlowLayout());
        r9.addActionListener(this);

        con.add(r10);
        r10.setBounds(300, 187, 20, 20);
        r10.setContentAreaFilled(false);
        jtf.add(r10);
        r10.setLayout(new FlowLayout());
        r10.addActionListener(this);

        con.add(r11);
        r11.setBounds(438, 177, 20, 20);
        r11.setContentAreaFilled(false);
        jtf.add(r11);
        r11.setLayout(new FlowLayout());
        r11.addActionListener(this);

        con.add(b1);
        b1.setBounds(285, 177, 20, 20);
        b1.setContentAreaFilled(false);
        jtf.add(b1);
        b1.setLayout(new FlowLayout());
        b1.addActionListener(this);

        con.add(b3);
        b3.setBounds(297, 99, 20, 20);
        b3.setContentAreaFilled(false);
        jtf.add(b3);
        b3.setLayout(new FlowLayout());
        b3.addActionListener(this);

        con.add(b4);
        b4.setBounds(56, 242, 20, 20);
        b4.setContentAreaFilled(false);
        jtf.add(b4);
        b4.setLayout(new FlowLayout());
        b4.addActionListener(this);

        con.add(b5);
        b5.setBounds(56, 288, 20, 20);
        b5.setContentAreaFilled(false);
        jtf.add(b5);
        b5.setLayout(new FlowLayout());
        b5.addActionListener(this);

        con.add(b6);
        b6.setBounds(56, 334, 20, 20);
        b6.setContentAreaFilled(false);
        jtf.add(b6);
        b6.setLayout(new FlowLayout());
        b6.addActionListener(this);

        tire.setBounds(100,595,20,20);
        tire.setFont(new Font("Serif", Font.PLAIN, 20));

        vremi.setBounds(50,500,150,150);
        vremi.setFont(new Font("Serif", Font.PLAIN, 20));

        man = new JLabel();
        blue = new JLabel();
        red = new JLabel();

        red_b1 = new JLabel();
        red_b1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg2.png"));
        red_b1.setVisible(false);

        red_b2 = new JLabel();
        red_b2.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg2.png"));
        red_b2.setVisible(false);

        red_v1 = new JLabel();
        red_v1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg3.png"));
        red_v1.setVisible(false);

        red_v2 = new JLabel();
        red_v2.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg3.png"));
        red_v2.setVisible(false);

        blue_b1 = new JLabel();
        blue_b1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg1.png"));
        blue_b1.setVisible(false);

        blue_b2 = new JLabel();
        blue_b2.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg1.png"));
        blue_b2.setVisible(false);

        blue_v1 = new JLabel();
        blue_v1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg4.png"));
        blue_v1.setVisible(false);

        blue_v2 = new JLabel();
        blue_v2.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\gg4.png"));
        blue_v2.setVisible(false);

        red.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\к1.png"));
        blue.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\к2.png"));
        man.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\пп2.png"));

        red.setBounds(45,625,30,30);
        man.setBounds(87,613,50,50);
        blue.setBounds(115,625,30,30);

        jpanel.add(jtf);
        jtf.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\karta.png"));
        f.add(jpanel);
        f.pack();
        f.setVisible(true);

        min2 = new JLabel("2 мин");
        min2.setBounds(185,540,70,70);
        min2.setFont(new Font("Serif", Font.PLAIN, 20));

        min3 = new JLabel("3 мин");
        min3.setBounds(185,540,70,70);
        min3.setFont(new Font("Serif", Font.PLAIN, 20));

        min4 = new JLabel("4 мин");
        min4.setBounds(185,540,70,70);
        min4.setFont(new Font("Serif", Font.PLAIN, 20));

        min6 = new JLabel("6 мин");
        min6.setBounds(185,540,70,70);
        min6.setFont(new Font("Serif", Font.PLAIN, 20));

        min5 = new JLabel("5 мин");
        min5.setBounds(185,540,70,70);
        min5.setFont(new Font("Serif", Font.PLAIN, 20));

        min7= new JLabel("7 мин");
        min7.setBounds(185,540,70,70);
        min7.setFont(new Font("Serif", Font.PLAIN, 20));

        min8 = new JLabel("8 мин");
        min8.setBounds(185,540,70,70);
        min8.setFont(new Font("Serif", Font.PLAIN, 20));

        min9 = new JLabel("9 мин");
        min9.setBounds(185,540,70,70);
        min9.setFont(new Font("Serif", Font.PLAIN, 20));

        min10 = new JLabel("10 мин");
        min10.setBounds(185,540,70,70);
        min10.setFont(new Font("Serif", Font.PLAIN, 20));

        min11= new JLabel("11 мин");
        min11.setBounds(185,540,70,70);
        min11.setFont(new Font("Serif", Font.PLAIN, 20));

        min12= new JLabel("12 мин");
        min12.setBounds(185,540,70,70);
        min12.setFont(new Font("Serif", Font.PLAIN, 20));

        min13 = new JLabel("13 мин");
        min13.setBounds(185,540,70,70);
        min13.setFont(new Font("Serif", Font.PLAIN, 20));

        min14 = new JLabel("14 мин");
        min14.setBounds(185,540,70,70);
        min14.setFont(new Font("Serif", Font.PLAIN, 20));

        min15 = new JLabel("15 мин");
        min15.setBounds(185,540,70,70);
        min15.setFont(new Font("Serif", Font.PLAIN, 20));

        min16 = new JLabel("16 мин");
        min16.setBounds(185,540,70,70);
        min16.setFont(new Font("Serif", Font.PLAIN, 20));

        min17 = new JLabel("17 мин");
        min17.setBounds(185,540,70,70);
        min17.setFont(new Font("Serif", Font.PLAIN, 20));

        min18 = new JLabel("18 мин");
        min18.setBounds(185,540,70,70);
        min18.setFont(new Font("Serif", Font.PLAIN, 20));

        min19 = new JLabel("19 мин");
        min19.setBounds(185,540,70,70);
        min19.setFont(new Font("Serif", Font.PLAIN, 20));

        min20 = new JLabel("20 мин");
        min20.setBounds(185,540,70,70);
        min20.setFont(new Font("Serif", Font.PLAIN, 20));

        min21 = new JLabel("21 мин");
        min21.setBounds(185,540,70,70);
        min21.setFont(new Font("Serif", Font.PLAIN, 20));

        min22= new JLabel("22 мин");
        min22.setBounds(185,540,70,70);
        min22.setFont(new Font("Serif", Font.PLAIN, 20));

        min23 = new JLabel("23 мин");
        min23.setBounds(185,540,70,70);
        min23.setFont(new Font("Serif", Font.PLAIN, 20));

        min24= new JLabel("24 мин");
        min24.setBounds(185,540,70,70);
        min24.setFont(new Font("Serif", Font.PLAIN, 20));


        min25 = new JLabel("25 мин");
        min25.setBounds(185,540,70,70);
        min25.setFont(new Font("Serif", Font.PLAIN, 20));

        min26= new JLabel("26 мин");
        min26.setBounds(185,540,70,70);
        min26.setFont(new Font("Serif", Font.PLAIN, 20));

        min27 = new JLabel("27 мин");
        min27.setBounds(185,540,70,70);
        min27.setFont(new Font("Serif", Font.PLAIN, 20));

        min28= new JLabel("28 мин");
        min28.setBounds(185,540,70,70);
        min28.setFont(new Font("Serif", Font.PLAIN, 20));

        min30= new JLabel("30 мин");
        min30.setBounds(185,540,70,70);
        min30.setFont(new Font("Serif", Font.PLAIN, 20));
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((r1.isSelected() && r2.isSelected()) || (r2.isSelected() && r3.isSelected()) || (r3.isSelected() && r4.isSelected()) || (r4.isSelected() && r5.isSelected()) ||
                (r5.isSelected() && r6.isSelected()) || (r6.isSelected() && r7.isSelected()) || (r7.isSelected() && r8.isSelected()) || (r8.isSelected() && r9.isSelected()) ||
                (r9.isSelected() && r10.isSelected()) || (b1.isSelected() && b4.isSelected()) || (b4.isSelected() && b5.isSelected()) || (b5.isSelected() && b6.isSelected()))
        {

            if((b1.isSelected() && b4.isSelected()) || (b5.isSelected() && b6.isSelected()) || (b4.isSelected() && b5.isSelected()))
            {
                if(b1.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v2.setBounds(279,155,30,30);
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();

                    blue_b1.setBounds(30,237,30,30);
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                } else if (b5.isSelected() && b6.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b2.setBounds(30,330,30,30);
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();

                    blue_b1.setBounds(30,280,30,30);
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                } else if (b4.isSelected() && b5.isSelected()) {
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);


                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    blue_b2.setBounds(30,280,30,30); // b5
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();
                }
                man.setVisible(false);
                red.setVisible(false);
                blue.setVisible(false);
                blue.setVisible(true);
                blue.setBounds(45,625,30,30);
                jtf.add(blue);
                blue.repaint();
            }
            else
            {
                if(r1.isSelected() && r2.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,645,30,30);
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,600,30,30);
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }
                else if(r2.isSelected() && r3.isSelected()){
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);


                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                else if(r3.isSelected() && r4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);


                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                } else if (r4.isSelected() && r5.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);


                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,465,30,30); // r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                    
                } else if (r5.isSelected() && r6.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);


                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,465,30,30); // r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                    
                } else if (r6.isSelected() && r7.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                else if(r7.isSelected() && r8.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                else if (r8.isSelected() && r9.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                } else if (r9.isSelected() && r10.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                man.setVisible(false);
                red.setVisible(false);
                blue.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);

            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            min2.setVisible(true);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal2 = new GregorianCalendar();
            cal2.add(Calendar.MINUTE, 2);
            String dateToday2 = formattedDate.format(cal2.getTime());
            date2 = new JLabel(dateToday2);
            date2.setBounds(110,570,70,70);
            date2.setFont(new Font("Serif", Font.PLAIN, 20));
            date2.setVisible(true);
            jpanel.add(date2);
            jtf.add(date2);
            date2.repaint();

            jtf.add(min2);
            min2.repaint();
        }

        else if((r1.isSelected() && r3.isSelected()) || (r3.isSelected() && r5.isSelected()) || (r10.isSelected() && r11.isSelected()) ||
                (b1.isSelected() && b3.isSelected()))
        {
            if(b1.isSelected() && b3.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                blue_v1.setBounds(290,77,30,30);
                blue_v1.setVisible(true);
                jtf.add(blue_v1);
                blue_v1.repaint();

                blue_v2.setBounds(279,155,30,30);
                blue_v2.setVisible(true);
               jtf.add(blue_v2);
                blue_v2.repaint();

                man.setVisible(false);
                red.setVisible(false);
                blue.setVisible(false);
                blue.setVisible(true);
                blue.setBounds(45,625,30,30);
                jtf.add(blue);
                blue.repaint();
            }
            else
            {
                if(r1.isSelected() && r3.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(262,645,30,30);
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,555,30,30);
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                }
                else if (r3.isSelected() && r5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,465,30,30);
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,555,30,30);
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }
                else if(r10.isSelected() && r11.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);


                    red_v1.setBounds(294 ,166,30,30);
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();

                    red_v2.setBounds(430,155,30,30);
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();
                }
                man.setVisible(false);
                red.setVisible(false);
                blue.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal4 = new GregorianCalendar();
            cal4.add(Calendar.MINUTE, 4);
            String dateToday2 = formattedDate.format(cal4.getTime());
            date4 = new JLabel(dateToday2);
            date4.setBounds(110,570,70,70);
            date4.setFont(new Font("Serif", Font.PLAIN, 20));
            date4.setVisible(true);
            jpanel.add(date4);
            jtf.add(date4);
            date4.repaint();

            min2.setVisible(false);
            min4.setVisible(true);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtf.add(min4);
            min4.repaint();
        }

        else if((r1.isSelected() && r4.isSelected()) || (r2.isSelected() && r5.isSelected()) || (r3.isSelected() && r6.isSelected()) || (r9.isSelected() && r11.isSelected()) ||
                (r9.isSelected() && b1.isSelected()) || (r10.isSelected() && b4.isSelected()) || (b4.isSelected() && b3.isSelected()))
        {
            if ((r9.isSelected() && b1.isSelected()) ||(r10.isSelected() && b4.isSelected()))
            {
                if((r9.isSelected() && b1.isSelected()))
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();

                } else if (r10.isSelected() && b4.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();

                    blue_b1.setBounds(30,237,30,30);
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                }
                blue.setVisible(false);
                    red.setVisible(false);
                    man.setVisible(false);
                    blue.setVisible(true);
                    man.setVisible(true);
                    red.setVisible(true);
                    blue.setBounds(115, 625, 30, 30);
                    man.setBounds(87, 613, 50, 50);
                    red.setBounds(45, 625, 30, 30);
                    jtf.add(blue);
                    jtf.add(red);
                    jtf.add(man);
                    red.repaint();
                    blue.repaint();
                    man.repaint();
            }
            else if (b4.isSelected() && b3.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                blue_v1.setBounds(290,77,30,30); // b3
                blue_v1.setVisible(true);
                jtf.add(blue_v1);
                blue_v1.repaint();

                blue_b1.setBounds(30,237,30,30); //b4
                blue_b1.setVisible(true);
                jtf.add(blue_b1);
                blue_b1.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                blue.setBounds(45,625,30,30);
                jtf.add(blue);
                blue.repaint();
            }
            else
            {
                if((r1.isSelected() && r4.isSelected()))
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }
                else if(r2.isSelected() && r5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                }
                else if(r3.isSelected() && r6.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                } else if (r9.isSelected() && r11.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();


                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);

            vremi.setVisible(true);
            jtf.add(vremi);
            vremi.repaint();

            tire.setVisible(true);
            jtf.add(tire);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(true);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);

            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();
            cal6 = new GregorianCalendar();
            cal6.add(Calendar.MINUTE, 6);
            String dateToday2 = formattedDate.format(cal6.getTime());
            date6 = new JLabel(dateToday2);
            date6.setBounds(110,570,70,70);
            date6.setFont(new Font("Serif", Font.PLAIN, 20));
            date6.setVisible(true);
            jpanel.add(date6);
            jtf.add(date6);
            date6.repaint();

            jtf.add(min6);
            min6.repaint();

        }
        else if((r1.isSelected() && r5.isSelected()) || (r10.isSelected() && b5.isSelected()) || (r9.isSelected() && b4.isSelected()) ||
                (r8.isSelected() && r11.isSelected()) || (r2.isSelected() && r6.isSelected()))
        {
           if ((r10.isSelected() && b5.isSelected()) || (r9.isSelected() && b4.isSelected()))
            {
                if (r10.isSelected() && b5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();
                }
                else if (r9.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                red.repaint();
                blue.repaint();
                man.repaint();
            }
            else
            {
                if(r1.isSelected() && r5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,465,30,30); //r5
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                } else if (r8.isSelected() && r11.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();

                    red_b1.setBounds(260,328,30,30); //r8
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                } else if (r2.isSelected() && r6.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();


                    red_b1.setBounds(260,420,30,30); //r6
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(true);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);

            jpanel.add(jtfdate);
            jtf.add(jtfdate);jtfdate.repaint();

            cal8 = new GregorianCalendar();
            cal8.add(Calendar.MINUTE, 8);
            String dateToday8 = formattedDate.format(cal8.getTime());
            date8 = new JLabel(dateToday8);
            date8.setBounds(110,570,70,70);
            date8.setFont(new Font("Serif", Font.PLAIN, 20));
            date8.setVisible(true);
            jpanel.add(date8);

            jtf.add(date8);
            date8.repaint();

            jtf.add(min8);
            min8.repaint();
        }
        else if((r1.isSelected() && r6.isSelected()) || (r2.isSelected() && r7.isSelected()) || (r7.isSelected() && b1.isSelected())
        || (r8.isSelected() && b4.isSelected()) || (r8.isSelected() && b1.isSelected()) || (r9.isSelected() && b3.isSelected()) ||
                (r9.isSelected() && b5.isSelected()) || (r10.isSelected() && b6.isSelected()))
        {
            if ((r10.isSelected() && b5.isSelected()) || (r9.isSelected() && b4.isSelected()) || (r9.isSelected() && b3.isSelected()) || (r7.isSelected() && b1.isSelected()) ||
                    (r8.isSelected() && b1.isSelected()) || (r8.isSelected() && b4.isSelected()) || (r9.isSelected() && b5.isSelected()) || (r10.isSelected() && b6.isSelected()))
            {
                if (r10.isSelected() && b5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();


                }
                else if(r9.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                } else if (r9.isSelected() && b3.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                } else if (r7.isSelected() && b1.isSelected()){
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                else if (r8.isSelected() && b1.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                else if (r8.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }
                else if(r9.isSelected() && b5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                }
                else if(r10.isSelected() && b6.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b2.setBounds(30,330,30,30); //b6
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);

                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                if(r1.isSelected() && r6.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);
                    
                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                } else if (r2.isSelected() && r7.isSelected()){
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(true);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);

            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();
            cal10 = new GregorianCalendar();
            cal10.add(Calendar.MINUTE, 10);
            String dateToday10 = formattedDate.format(cal10.getTime());
            date10 = new JLabel(dateToday10);
            date10.setBounds(110,570,70,70);
            date10.setFont(new Font("Serif", Font.PLAIN, 20));
            date10.setVisible(true);
            jpanel.add(date10);

            jtf.add(date10);
            date10.repaint();

            jtf.add(min10);
            min10.repaint();
        }
        else if((r1.isSelected() && r7.isSelected()) || (r2.isSelected() && r8.isSelected()) || (r3.isSelected() && r9.isSelected()) ||
                (r6.isSelected() && r11.isSelected()) || (r6.isSelected() && b1.isSelected()) || (r8.isSelected() && b5.isSelected()) ||
                (r7.isSelected() && b4.isSelected()) || (r9.isSelected() && b6.isSelected()))
        {
            if ((r6.isSelected() && b1.isSelected()) || (r8.isSelected() && b5.isSelected()) || (r7.isSelected() && b4.isSelected()) || (r9.isSelected() && b6.isSelected()))
            {
                if(r6.isSelected() && b1.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();
                }else if (r8.isSelected() && b5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }else if(r7.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                }else if ((r9.isSelected() && b6.isSelected()))
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_b2.setBounds(30,330,30,30); //b6
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                if (r1.isSelected() && r7.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,372,30,30); // r7
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }else if(r2.isSelected() && r8.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,328,30,30); //r8
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }else if (r3.isSelected() && r9.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,282,30,30); // r9
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }else if (r6.isSelected() && r11.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(true);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);

            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();
            cal13 = new GregorianCalendar();
            cal13.add(Calendar.MINUTE, 13);
            String dateToday13 = formattedDate.format(cal13.getTime());
            date13 = new JLabel(dateToday13);
            date13.setBounds(110,570,70,70);
            date13.setFont(new Font("Serif", Font.PLAIN, 20));
            date13.setVisible(true);
            jpanel.add(date13);

            jtf.add(date13);
            date13.repaint();

            jtf.add(min13);
            min13.repaint();
        }
        else if ((r1.isSelected() && r8.isSelected()) || (r2.isSelected() && r9.isSelected()) || (r5.isSelected() && r11.isSelected()) ||
                (r5.isSelected() && b1.isSelected()) || (r6.isSelected() && b4.isSelected()) || (r6.isSelected() && b5.isSelected()) ||
                (r7.isSelected() && b5.isSelected()) || (r8.isSelected() && b6.isSelected()))
        {
            if ((r5.isSelected() && b1.isSelected()) || (r6.isSelected() && b4.isSelected()) ||(r6.isSelected() && b5.isSelected())
                    || (r7.isSelected() && b5.isSelected()) || (r8.isSelected() && b6.isSelected()))
            {
                if(r5.isSelected() && b1.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();
                }else if (r6.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }else if(r6.isSelected() && b5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                } else if (r7.isSelected() && b5.isSelected()) {

                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }else if (r8.isSelected() && b6.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    blue_b2.setBounds(30,330,30,30); //b6
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();
                }
                blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);
            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();
        }
        else
        {
            if(r1.isSelected() && r8.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b1.setBounds(260,645,30,30); // r1
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();

                red_b2.setBounds(260,328,30,30); //r8
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();
            }else if(r2.isSelected() && r9.isSelected())
            {
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b1.setBounds(260,282,30,30); // r9
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();

                red_b2.setBounds(260,600,30,30); //r2
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();
            }else if (r5.isSelected() && r11.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_v2.setBounds(430,155,30,30); // r11
                red_v2.setVisible(true);
                jtf.add(red_v2);
                red_v2.repaint();

                red_b1.setBounds(260,465,30,30); //r5
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();
            }
            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            jtf.add(red);
            red.repaint();
        }
            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(true);
            min14.setVisible(false);
            min18.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);

            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();
            cal15 = new GregorianCalendar();
            cal15.add(Calendar.MINUTE, 15);
            String dateToday15 = formattedDate.format(cal15.getTime());
            date15 = new JLabel(dateToday15);
            date15.setBounds(110,570,70,70);
            date15.setFont(new Font("Serif", Font.PLAIN, 20));
            date15.setVisible(true);
            jpanel.add(date15);

            jtf.add(date15);
            date15.repaint();

            jtf.add(min15);
            min15.repaint();
        }
        else if ((r1.isSelected() && r9.isSelected()) || (r2.isSelected() && r10.isSelected()) || (r4.isSelected() && b1.isSelected()) ||
                (r5.isSelected() && b4.isSelected()) || (r6.isSelected() && b3.isSelected()) || (r7.isSelected() && b6.isSelected()))
        {
            if ((r4.isSelected() && b1.isSelected()) || (r5.isSelected() && b4.isSelected()) || (r6.isSelected() && b3.isSelected()) || (r7.isSelected() && b6.isSelected()))
            {
                if(r4.isSelected() && b1.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();
                }else if (r5.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                }else if (r6.isSelected() && b3.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }else if (r7.isSelected() && b6.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_b2.setBounds(30,330,30,30); //b6
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                if(r1.isSelected() && r9.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,282,30,30); // r9
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                } else if(r2.isSelected() && r10.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();

                    red_b1.setBounds(260,600,30,30); //r2
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(true);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);
            min16.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);

            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();
            cal17 = new GregorianCalendar();
            cal17.add(Calendar.MINUTE, 17);
            String dateToday17 = formattedDate.format(cal17.getTime());
            date17 = new JLabel(dateToday17);
            date17.setBounds(110,570,70,70);
            date17.setFont(new Font("Serif", Font.PLAIN, 20));
            date17.setVisible(true);
            jpanel.add(date17);

            jtf.add(date17);
            date17.repaint();

            jtf.add(min17);
            min19.repaint();
        }
        else if ((r1.isSelected() && r10.isSelected()) || (r4.isSelected() && b4.isSelected()) || (r5.isSelected() && b5.isSelected()) ||
                (r6.isSelected() && b6.isSelected()))
        {
            if ((r4.isSelected() && b4.isSelected()) || (r5.isSelected() && b5.isSelected()) ||
                (r6.isSelected() && b6.isSelected()))
            {
                if (r4.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }else if (r5.isSelected() && b5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                }else if (r6.isSelected() && b6.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b2.setBounds(30,330,30,30); //b6
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                }
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                if (r1.isSelected() && r10.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(true);
            min14.setVisible(false);
            min18.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min16.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal20 = new GregorianCalendar();
            cal20.add(Calendar.MINUTE, 20);
            String dateToday20 = formattedDate.format(cal20.getTime());
            date20 = new JLabel(dateToday20);
            date20.setBounds(110,570,70,70);
            date20.setFont(new Font("Serif", Font.PLAIN, 20));
            date20.setVisible(true);
            jpanel.add(date20);
            jtf.add(date20);
            date20.repaint();

            jtf.add(min20);
            min20.repaint();
        }
        else if ((r1.isSelected() && r11.isSelected()) || (r1.isSelected() && b1.isSelected()) || (r2.isSelected() && b4.isSelected()) ||
                (r3.isSelected() && b3.isSelected()))
        {
            if((r1.isSelected() && b1.isSelected()) || (r2.isSelected() && b4.isSelected()) ||
                (r3.isSelected() && b3.isSelected()))
            {
                if (r1.isSelected() && b1.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();
                } else if (r2.isSelected() && b4.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                } else if (r3.isSelected() && b3.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();
                }
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                if (r1.isSelected() && r11.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,645,30,30); // r1
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();


            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min16.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(true);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal23 = new GregorianCalendar();
            cal23.add(Calendar.MINUTE, 23);
            String dateToday23 = formattedDate.format(cal23.getTime());
            date23 = new JLabel(dateToday23);
            date23.setBounds(110,570,70,70);
            date23.setFont(new Font("Serif", Font.PLAIN, 20));
            date23.setVisible(true);
            jpanel.add(date23);
            jtf.add(date23);
            date23.repaint();


            jtf.add(min23);
            min23.repaint();
        }
        else if (r1.isSelected() && b3.isSelected())
        {

            blue_b1.setVisible(false);
            blue_b2.setVisible(false);
            blue_v1.setVisible(false);
            blue_v2.setVisible(false);
            red_v1.setVisible(false);
            red_v2.setVisible(false);
            red_b1.setVisible(false);
            red_b2.setVisible(false);

            red_b1.setBounds(260,645,30,30); // r1
            red_b1.setVisible(true);
            jtf.add(red_b1);
            red_b1.repaint();

            blue_v1.setBounds(290,77,30,30); // b3
            blue_v1.setVisible(true);
            jtf.add(blue_v1);
            blue_v1.repaint();

            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);
            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min16.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(true);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal27 = new GregorianCalendar();
            cal27.add(Calendar.MINUTE, 27);
            String dateToday27 = formattedDate.format(cal27.getTime());
            date27 = new JLabel(dateToday27);
            date27.setBounds(110,570,70,70);
            date27.setFont(new Font("Serif", Font.PLAIN, 20));
            date27.setVisible(true);
            jpanel.add(date27);
            jtf.add(date27);
            date27.repaint();

            jtf.add(min27);
            min27.repaint();
        }
        else if ((r1.isSelected() && b4.isSelected()) || (r2.isSelected() && b3.isSelected()) || (r2.isSelected() && b5.isSelected()))
        {
            if (r1.isSelected() && b4.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b1.setBounds(260,645,30,30); // r1
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();

                blue_b1.setBounds(30,237,30,30); //b4
                blue_b1.setVisible(true);
                jtf.add(blue_b1);
                blue_b1.repaint();
            } else if (r2.isSelected() && b3.isSelected()) {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b2.setBounds(260,600,30,30); //r2
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();

                blue_v1.setBounds(290,77,30,30); // b3
                blue_v1.setVisible(true);
                jtf.add(blue_v1);
                blue_v1.repaint();
            }else if(r2.isSelected() && b5.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b2.setBounds(260,600,30,30); //r2
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();

                blue_b1.setBounds(30,280,30,30); // b5
                blue_b1.setVisible(true);
                jtf.add(blue_b1);
                blue_b1.repaint();
            }
            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);
            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min22.setVisible(false);
            min16.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(true);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);
            min3.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal25 = new GregorianCalendar();
            cal25.add(Calendar.MINUTE, 25);
            String dateToday25 = formattedDate.format(cal25.getTime());
            date25 = new JLabel(dateToday25);
            date25.setBounds(110,570,70,70);
            date25.setFont(new Font("Serif", Font.PLAIN, 20));
            date25.setVisible(true);
            jpanel.add(date25);
            jtf.add(date25);
            date25.repaint();

            jtf.add(min25);
            min25.repaint();
        }
        else if ((r1.isSelected() && b5.isSelected()) || (r2.isSelected() && b6.isSelected()))
        {

            if(r1.isSelected() && b5.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b1.setBounds(260,645,30,30); // r1
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();

                blue_b1.setBounds(30,280,30,30); // b5
                blue_b1.setVisible(true);
                jtf.add(blue_b1);
                blue_b1.repaint();
            }
            else if (r2.isSelected() && b6.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b2.setBounds(260,600,30,30); //r2
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();

                blue_b2.setBounds(30,330,30,30); //b6
                blue_b2.setVisible(true);
                jtf.add(blue_b2);
                blue_b2.repaint();
            }
            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);

            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min16.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(true);
            min30.setVisible(false);
            min3.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal28 = new GregorianCalendar();
            cal28.add(Calendar.MINUTE, 28);
            String dateToday28 = formattedDate.format(cal28.getTime());
            date28 = new JLabel(dateToday28);
            date28.setBounds(110,570,70,70);
            date28.setFont(new Font("Serif", Font.PLAIN, 20));
            date28.setVisible(true);
            jpanel.add(date28);
            jtf.add(date28);
            date28.repaint();

            jtf.add(min28);
            min28.repaint();
        }
        else if (r1.isSelected() && b6.isSelected())
        {
            blue_b1.setVisible(false);
            blue_b2.setVisible(false);
            blue_v1.setVisible(false);
            blue_v2.setVisible(false);
            red_v1.setVisible(false);
            red_v2.setVisible(false);
            red_b1.setVisible(false);
            red_b2.setVisible(false);

            red_b1.setBounds(260,645,30,30); // r1
            red_b1.setVisible(true);
            jtf.add(red_b1);
            red_b1.repaint();

            blue_b2.setBounds(30,330,30,30); //b6
            blue_b2.setVisible(true);
            jtf.add(blue_b2);
            blue_b2.repaint();

            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);
            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min16.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(true);
            min3.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal30 = new GregorianCalendar();
            cal30.add(Calendar.MINUTE, 30);
            String dateToday30 = formattedDate.format(cal30.getTime());
            date30 = new JLabel(dateToday30);
            date30.setBounds(110,570,70,70);
            date30.setFont(new Font("Serif", Font.PLAIN, 20));
            date30.setVisible(true);
            jpanel.add(date30);
            jtf.add(date30);
            date30.repaint();

            jtf.add(min30);
            min30.repaint();
        }
        else if((r2.isSelected() && r4.isSelected() || (r10.isSelected() && b1.isSelected())))
        {
            if((r10.isSelected() && b1.isSelected()))
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_v1.setBounds(294 ,166,30,30); //r10
                red_v1.setVisible(true);
                jtf.add(red_v1);
                red_v1.repaint();

                blue_v2.setBounds(279,155,30,30); //b1
                blue_v2.setVisible(true);
                jtf.add(blue_v2);
                blue_v2.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);


                red_b2.setBounds(260,600,30,30); //r2
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();

                red_b1.setBounds(260,510,30,30); //r4
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(true);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min16.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal3 = new GregorianCalendar();
            cal3.add(Calendar.MINUTE, 3);
            String dateToday3 = formattedDate.format(cal3.getTime());
            date3 = new JLabel(dateToday3);
            date3.setBounds(110,570,70,70);
            date3.setFont(new Font("Serif", Font.PLAIN, 20));
            date3.setVisible(true);
            jpanel.add(date3);
            jtf.add(date3);
            date3.repaint();

            jtf.add(min3);
            min3.repaint();
        }
        else if ((r2.isSelected() && r11.isSelected()) || (r2.isSelected() && b1.isSelected()) || (r3.isSelected() && b4.isSelected()) ||
                (r4.isSelected() && b3.isSelected()))
        {
            if((r2.isSelected() && b1.isSelected()) || (r3.isSelected() && b4.isSelected()) ||
                    (r4.isSelected() && b3.isSelected()))
            {
                if (r2.isSelected() && b1.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();

                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                }else if(r3.isSelected() && b4.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                } else if (r4.isSelected() && b3.isSelected()) {

                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();

                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                if (r2.isSelected() && r11.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,600,30,30); //r2
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();
                }
                    blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min16.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(true);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal21 = new GregorianCalendar();
            cal21.add(Calendar.MINUTE, 21);
            String dateToday21 = formattedDate.format(cal21.getTime());
            date21 = new JLabel(dateToday21);
            date21.setBounds(110,570,70,70);
            date21.setFont(new Font("Serif", Font.PLAIN, 20));
            date21.setVisible(true);
            jpanel.add(date21);
            jtf.add(date21);
            date21.repaint();

            jtf.add(min21);
            min21.repaint();
        }
        else if((r3.isSelected() && r7.isSelected()) || (r4.isSelected() && r8.isSelected()) || (r5.isSelected() && r9.isSelected()) ||
                (r11.isSelected() && b4.isSelected()) || (r6.isSelected() && r10.isSelected()) || (b3.isSelected() && b5.isSelected()))
        {
            if((r11.isSelected() && b4.isSelected()))
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_v2.setBounds(430,155,30,30); // r11
                red_v2.setVisible(true);
                jtf.add(red_v2);
                red_v2.repaint();

                blue_b1.setBounds(30,237,30,30); //b4
                blue_b1.setVisible(true);
                jtf.add(blue_b1);
                blue_b1.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);

                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else if (b3.isSelected() && b5.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                blue_v1.setBounds(290,77,30,30); // b3
                blue_v1.setVisible(true);
                jtf.add(blue_v1);
                blue_v1.repaint();

                blue_b2.setBounds(30,330,30,30); //b6
                blue_b2.setVisible(true);
                jtf.add(blue_b2);
                blue_b2.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                blue.setBounds(45,625,30,30);
                jtf.add(blue);
                blue.repaint();
            }
            else
            {
                if (r3.isSelected() && r7.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,372,30,30); // r7
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                }
                else if (r4.isSelected() && r8.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,510,30,30); //r4
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                } else if (r5.isSelected() && r9.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,282,30,30); // r9
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                }else if (r6.isSelected() && r10.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(true);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min16.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal9 = new GregorianCalendar();
            cal9.add(Calendar.MINUTE, 9);
            String dateToday9 = formattedDate.format(cal9.getTime());
            date9 = new JLabel(dateToday9);
            date9.setBounds(110,570,70,70);
            date9.setFont(new Font("Serif", Font.PLAIN, 20));
            date9.setVisible(true);
            jpanel.add(date9);
            jtf.add(date9);
            date9.repaint();

            jtf.add(min9);
            min9.repaint();
        }
        else if((r3.isSelected() && r8.isSelected()) || (r7.isSelected() && r11.isSelected()) || (r11.isSelected() && b3.isSelected()) ||
                (b3.isSelected() && b6.isSelected()))
        {
            if ((r11.isSelected() && b3.isSelected())){
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_v2.setBounds(430,155,30,30); // r11
                red_v2.setVisible(true);
                jtf.add(red_v2);
                red_v2.repaint();

                blue_v1.setBounds(290,77,30,30); // b3
                blue_v1.setVisible(true);
                jtf.add(blue_v1);
                blue_v1.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else if(b3.isSelected() && b6.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                blue_v1.setBounds(290,77,30,30); // b3
                blue_v1.setVisible(true);
                jtf.add(blue_v1);
                blue_v1.repaint();

                blue_b2.setBounds(30,330,30,30); //b6
                blue_b2.setVisible(true);
                jtf.add(blue_b2);
                blue_b2.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                blue.setBounds(45,625,30,30);
                jtf.add(blue);
                blue.repaint();
            }
            else
            {
                if (r3.isSelected() && r8.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                } else if(r7.isSelected() && r11.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(true);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min16.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal11 = new GregorianCalendar();
            cal11.add(Calendar.MINUTE, 11);
            String dateToday11 = formattedDate.format(cal11.getTime());
            date11 = new JLabel(dateToday11);
            date11.setBounds(110,570,70,70);
            date11.setFont(new Font("Serif", Font.PLAIN, 20));
            date11.setVisible(true);
            jpanel.add(date11);
            jtf.add(date11);
            date11.repaint();

            jtf.add(min11);
            min11.repaint();
        }
        else if (r3.isSelected() && r10.isSelected())
        {
            blue_b1.setVisible(false);
            blue_b2.setVisible(false);
            blue_v1.setVisible(false);
            blue_v2.setVisible(false);
            red_v1.setVisible(false);
            red_v2.setVisible(false);
            red_b1.setVisible(false);
            red_b2.setVisible(false);

            red_b1.setBounds(260,555,30,30); // r3
            red_b1.setVisible(true);
            jtf.add(red_b1);
            red_b1.repaint();

            red_v1.setBounds(294 ,166,30,30); //r10
            red_v1.setVisible(true);
            jtf.add(red_v1);
            red_v1.repaint();

            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            jtf.add(red);
            red.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(true);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal16 = new GregorianCalendar();
            cal16.add(Calendar.MINUTE, 16);
            String dateToday16 = formattedDate.format(cal16.getTime());
            date16 = new JLabel(dateToday16);
            date16.setBounds(110,570,70,70);
            date16.setFont(new Font("Serif", Font.PLAIN, 20));
            date16.setVisible(true);
            jpanel.add(date16);
            jtf.add(date16);
            date16.repaint();

            jtf.add(min16);
            min16.repaint();
        }
        else if (r4.isSelected() && r11.isSelected())
        {
            blue_b1.setVisible(false);
            blue_b2.setVisible(false);
            blue_v1.setVisible(false);
            blue_v2.setVisible(false);
            red_v1.setVisible(false);
            red_v2.setVisible(false);
            red_b1.setVisible(false);
            red_b2.setVisible(false);

            red_b2.setBounds(260,510,30,30); //r4
            red_b2.setVisible(true);
            jtf.add(red_b2);
            red_b2.repaint();

            red_v2.setBounds(430,155,30,30); // r11
            red_v2.setVisible(true);
            jtf.add(red_v2);
            red_v2.repaint();

            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            jtf.add(red);
            red.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();


            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(true);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal18 = new GregorianCalendar();
            cal18.add(Calendar.MINUTE, 18);
            String dateToday18 = formattedDate.format(cal18.getTime());
            date18 = new JLabel(dateToday18);
            date18.setBounds(110,570,70,70);
            date18.setFont(new Font("Serif", Font.PLAIN, 20));
            date18.setVisible(true);
            jpanel.add(date18);
            jtf.add(date18);
            date18.repaint();

            jtf.add(min18);
            min18.repaint();
        }
        else if ((r3.isSelected() && r11.isSelected()) || (r3.isSelected() && b1.isSelected()) || (r5.isSelected() && b3.isSelected()))
        {
            if((r3.isSelected() && b1.isSelected()) || (r5.isSelected() && b3.isSelected()))
            {
                if(r3.isSelected() && b1.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,555,30,30); // r3
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();
                } else if (r5.isSelected() && b3.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b1.setBounds(260,555,30,30); // r3
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();

                red_v2.setBounds(430,155,30,30); // r11
                red_v2.setVisible(true);
                jtf.add(red_v2);
                red_v2.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(true);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal19 = new GregorianCalendar();
            cal19.add(Calendar.MINUTE, 19);
            String dateToday19 = formattedDate.format(cal19.getTime());
            date19 = new JLabel(dateToday19);
            date19.setBounds(110,570,70,70);
            date19.setFont(new Font("Serif", Font.PLAIN, 20));
            date19.setVisible(true);
            jpanel.add(date19);
            jtf.add(date19);
            date19.repaint();

            jtf.add(min19);
            min19.repaint();
        }
        else if ((r3.isSelected() && b5.isSelected()) || (r4.isSelected() && b6.isSelected()))
        {
            if ((r3.isSelected() && b5.isSelected()))
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b1.setBounds(260,555,30,30); // r3
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();


                blue_b1.setBounds(30,280,30,30); // b5
                blue_b1.setVisible(true);
                jtf.add(blue_b1);
                blue_b1.repaint();
            } else if  (r4.isSelected() && b6.isSelected()) {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b2.setBounds(260,510,30,30); //r4
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();

                blue_b2.setBounds(30,330,30,30); //b6
                blue_b2.setVisible(true);
                jtf.add(blue_b2);
                blue_b2.repaint();
            }

            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);
            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min24.setVisible(true);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal24 = new GregorianCalendar();
            cal24.add(Calendar.MINUTE, 24);
            String dateToday24 = formattedDate.format(cal24.getTime());
            date24 = new JLabel(dateToday24);
            date24.setBounds(110,570,70,70);
            date24.setFont(new Font("Serif", Font.PLAIN, 20));
            date24.setVisible(true);
            jpanel.add(date24);
            jtf.add(date24);
            date24.repaint();

            jtf.add(min24);
            min24.repaint();
        }
        else if (r3.isSelected() && b6.isSelected())
        {

            blue_b1.setVisible(false);
            blue_b2.setVisible(false);
            blue_v1.setVisible(false);
            blue_v2.setVisible(false);
            red_v1.setVisible(false);
            red_v2.setVisible(false);
            red_b1.setVisible(false);
            red_b2.setVisible(false);

            red_b1.setBounds(260,555,30,30); // r3
            red_b1.setVisible(true);
            jtf.add(red_b1);
            red_b1.repaint();

            blue_b2.setBounds(30,330,30,30); //b6
            blue_b2.setVisible(true);
            jtf.add(blue_b2);
            blue_b2.repaint();

            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);
            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();


            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(true);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal26 = new GregorianCalendar();
            cal26.add(Calendar.MINUTE, 26);
            String dateToday26 = formattedDate.format(cal26.getTime());
            date26 = new JLabel(dateToday26);
            date26.setBounds(110,570,70,70);
            date26.setFont(new Font("Serif", Font.PLAIN, 20));
            date26.setVisible(true);
            jpanel.add(date26);
            jtf.add(date26);
            date26.repaint();

            jtf.add(min26);
            min26.repaint();
        }
        else if((r4.isSelected() && r6.isSelected()) || (r5.isSelected() && r7.isSelected()) || (r6.isSelected() && r8.isSelected()) || (r7.isSelected() && r9.isSelected()) ||
                (r8.isSelected() && r10.isSelected()) || (b1.isSelected() && b5.isSelected()) || (b4.isSelected() && b6.isSelected()))
        {
            if ((b1.isSelected() && b5.isSelected()) || (b4.isSelected() && b6.isSelected()))
            {
                if (b1.isSelected() && b5.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();

                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                } else if (b4.isSelected() && b6.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    blue_b2.setBounds(30,330,30,30); //b6
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();

                    blue_b1.setBounds(30,237,30,30); //b4
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();

                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                blue.setBounds(45,625,30,30);
                jtf.add(blue);
                blue.repaint();
            }
            else {
                if (r4.isSelected() && r6.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,420,30,30); //r6
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                } else if (r5.isSelected() && r7.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,465,30,30); //r5
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                } else if(r6.isSelected() && r8.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,328,30,30); //r8
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                } else if (r7.isSelected() && r9.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,282,30,30); // r9
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                }else if (r8.isSelected() && r10.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(true);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal5 = new GregorianCalendar();
            cal5.add(Calendar.MINUTE, 5);
            String dateToday5 = formattedDate.format(cal5.getTime());
            date5 = new JLabel(dateToday5);
            date5.setBounds(110,570,70,70);
            date5.setFont(new Font("Serif", Font.PLAIN, 20));
            date5.setVisible(true);
            jpanel.add(date5);
            jtf.add(date5);
            date5.repaint();

            jtf.add(min5);
            min5.repaint();
        }

        else if((r4.isSelected() && r7.isSelected()) || (b1.isSelected() && b6.isSelected()) || (r10.isSelected() && b3.isSelected()) ||
                (r7.isSelected() && r10.isSelected()) || (r6.isSelected() && r9.isSelected()) || (r5.isSelected() && r8.isSelected()) ||  (r11.isSelected() && b1.isSelected()))
        {
            if((r10.isSelected() && b3.isSelected()) ||  (r11.isSelected() && b1.isSelected()))
            {
                if (r10.isSelected() && b3.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();
                }else if (r11.isSelected() && b1.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();

                    blue_v2.setBounds(279,155,30,30); //b1
                    blue_v2.setVisible(true);
                    jtf.add(blue_v2);
                    blue_v2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else if ((b1.isSelected() && b6.isSelected()))
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                blue_v2.setBounds(279,155,30,30); //b1
                blue_v2.setVisible(true);
                jtf.add(blue_v2);
                blue_v2.repaint();

                blue_b2.setBounds(30,330,30,30); //b6
                blue_b2.setVisible(true);
                jtf.add(blue_b2);
                blue_b2.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                blue.setBounds(45,625,30,30);
                jtf.add(blue);
                blue.repaint();
            }
            else {
                if (r4.isSelected() && r7.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                } else if(r7.isSelected() && r10.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);
                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();
                } else if(r6.isSelected() && r9.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    red_b2.setBounds(260,420,30,30); //r6
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                } else if(r5.isSelected() && r8.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();


                }

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(true);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal7 = new GregorianCalendar();
            cal7.add(Calendar.MINUTE, 7);
            String dateToday7 = formattedDate.format(cal7.getTime());
            date7 = new JLabel(dateToday7);
            date7.setBounds(110,570,70,70);
            date7.setFont(new Font("Serif", Font.PLAIN, 20));
            date7.setVisible(true);
            jpanel.add(date7);
            jtf.add(date7);
            date7.repaint();

            jtf.add(min7);
            min7.repaint();
        }
        else if((r4.isSelected() && r9.isSelected()) || (r5.isSelected() && r10.isSelected()) || (r8.isSelected() && b3.isSelected()) ||
                (r11.isSelected() && b5.isSelected()))
        {
            if ((r8.isSelected() && b3.isSelected()) || (r11.isSelected() && b5.isSelected()))
            {
                if(r8.isSelected() && b3.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,328,30,30); //r8
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();
                } else if (r11.isSelected() && b5.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();


                    blue_b1.setBounds(30,280,30,30); // b5
                    blue_b1.setVisible(true);
                    jtf.add(blue_b1);
                    blue_b1.repaint();
                }
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);

                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }
            else
            {
                if(r4.isSelected() && r9.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b2.setBounds(260,510,30,30); //r4
                    red_b2.setVisible(true);
                    jtf.add(red_b2);
                    red_b2.repaint();
                    red_b1.setBounds(260,282,30,30); // r9
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();
                } else if  (r5.isSelected() && r10.isSelected()) {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,465,30,30); //r5
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();


                    red_v1.setBounds(294 ,166,30,30); //r10
                    red_v1.setVisible(true);
                    jtf.add(red_v1);
                    red_v1.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(true);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal12 = new GregorianCalendar();
            cal12.add(Calendar.MINUTE, 12);
            String dateToday12 = formattedDate.format(cal12.getTime());
            date12 = new JLabel(dateToday12);
            date12.setBounds(110,570,70,70);
            date12.setFont(new Font("Serif", Font.PLAIN, 20));
            date12.setVisible(true);
            jpanel.add(date12);
            jtf.add(date12);
            date12.repaint();

            jtf.add(min12);
            min12.repaint();
        }
        else if((r4.isSelected() && r10.isSelected()) || (r7.isSelected() && b3.isSelected()) ||(r11.isSelected() && b6.isSelected()))
        {
            if (r4.isSelected() && r10.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b2.setBounds(260,510,30,30); //r4
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();

                red_v1.setBounds(294 ,166,30,30); //r10
                red_v1.setVisible(true);
                jtf.add(red_v1);
                red_v1.repaint();

                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                jtf.add(red);
                red.repaint();
            }
            else
            {

                if(r7.isSelected() && b3.isSelected())
                {
                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_b1.setBounds(260,372,30,30); // r7
                    red_b1.setVisible(true);
                    jtf.add(red_b1);
                    red_b1.repaint();

                    blue_v1.setBounds(290,77,30,30); // b3
                    blue_v1.setVisible(true);
                    jtf.add(blue_v1);
                    blue_v1.repaint();
                } else if (r11.isSelected() && b6.isSelected()) {

                    blue_b1.setVisible(false);
                    blue_b2.setVisible(false);
                    blue_v1.setVisible(false);
                    blue_v2.setVisible(false);
                    red_v1.setVisible(false);
                    red_v2.setVisible(false);
                    red_b1.setVisible(false);
                    red_b2.setVisible(false);

                    red_v2.setBounds(430,155,30,30); // r11
                    red_v2.setVisible(true);
                    jtf.add(red_v2);
                    red_v2.repaint();

                    blue_b2.setBounds(30,330,30,30); //b6
                    blue_b2.setVisible(true);
                    jtf.add(blue_b2);
                    blue_b2.repaint();
                }
                blue.setVisible(false);
                red.setVisible(false);
                man.setVisible(false);
                blue.setVisible(true);
                man.setVisible(true);
                red.setVisible(true);
                red.setBounds(45,625,30,30);
                man.setBounds(87,613,50,50);
                blue.setBounds(115,625,30,30);
                jtf.add(blue);
                jtf.add(red);
                jtf.add(man);
                blue.repaint();
                red.repaint();
                man.repaint();
            }

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min14.setVisible(true);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min18.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(false);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal14 = new GregorianCalendar();
            cal14.add(Calendar.MINUTE, 14);
            String dateToday14 = formattedDate.format(cal14.getTime());
            date14 = new JLabel(dateToday14);
            date14.setBounds(110,570,70,70);
            date14.setFont(new Font("Serif", Font.PLAIN, 20));
            date14.setVisible(true);
            jpanel.add(date14);
            jtf.add(date14);
            date14.repaint();

            jtf.add(min14);
            min14.repaint();
        }
        else if ((r4.isSelected() && b5.isSelected()) || (r5.isSelected() && b6.isSelected()))
        {
            if (r4.isSelected() && b5.isSelected())
            {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b2.setBounds(260,510,30,30); //r4
                red_b2.setVisible(true);
                jtf.add(red_b2);
                red_b2.repaint();

                blue_b1.setBounds(30,280,30,30); // b5
                blue_b1.setVisible(true);
                jtf.add(blue_b1);
                blue_b1.repaint();
            } else if (r5.isSelected() && b6.isSelected()) {
                blue_b1.setVisible(false);
                blue_b2.setVisible(false);
                blue_v1.setVisible(false);
                blue_v2.setVisible(false);
                red_v1.setVisible(false);
                red_v2.setVisible(false);
                red_b1.setVisible(false);
                red_b2.setVisible(false);

                red_b1.setBounds(260,465,30,30); //r5
                red_b1.setVisible(true);
                jtf.add(red_b1);
                red_b1.repaint();

                blue_b2.setBounds(30,330,30,30); //b6
                blue_b2.setVisible(true);
                jtf.add(blue_b2);
                blue_b2.repaint();
            }
            blue.setVisible(false);
            red.setVisible(false);
            man.setVisible(false);
            blue.setVisible(true);
            man.setVisible(true);
            red.setVisible(true);
            red.setBounds(45,625,30,30);
            man.setBounds(87,613,50,50);
            blue.setBounds(115,625,30,30);
            jtf.add(blue);
            jtf.add(red);
            jtf.add(man);
            blue.repaint();
            red.repaint();
            man.repaint();

            vremi.setVisible(false);
            tire.setVisible(false);
            jtf.add(vremi);
            vremi.setVisible(true);
            vremi.repaint();
            jtf.add(tire);
            tire.setVisible(true);
            tire.repaint();

            min2.setVisible(false);
            min3.setVisible(false);
            min4.setVisible(false);
            min5.setVisible(false);
            min6.setVisible(false);
            min7.setVisible(false);
            min8.setVisible(false);
            min9.setVisible(false);
            min10.setVisible(false);
            min14.setVisible(false);
            min18.setVisible(false);
            min11.setVisible(false);
            min12.setVisible(false);
            min13.setVisible(false);
            min15.setVisible(false);
            min16.setVisible(false);
            min17.setVisible(false);
            min19.setVisible(false);
            min20.setVisible(false);
            min21.setVisible(false);
            min22.setVisible(true);
            min23.setVisible(false);
            min24.setVisible(false);
            min25.setVisible(false);
            min26.setVisible(false);
            min27.setVisible(false);
            min28.setVisible(false);
            min30.setVisible(false);

            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            r5.setSelected(false);
            r6.setSelected(false);
            r7.setSelected(false);
            r8.setSelected(false);
            r9.setSelected(false);
            r10.setSelected(false);
            r11.setSelected(false);
            b1.setSelected(false);
            b3.setSelected(false);
            b4.setSelected(false);
            b5.setSelected(false);
            b6.setSelected(false);

            jtfdate.setVisible(false);
            date2.setVisible(false);
            date3.setVisible(false);
            date4.setVisible(false);
            date5.setVisible(false);
            date6.setVisible(false);
            date7.setVisible(false);
            date8.setVisible(false);
            date9.setVisible(false);
            date10.setVisible(false);
            date11.setVisible(false);
            date12.setVisible(false);
            date13.setVisible(false);
            date14.setVisible(false);
            date15.setVisible(false);
            date16.setVisible(false);
            date17.setVisible(false);
            date18.setVisible(false);
            date19.setVisible(false);
            date20.setVisible(false);
            date21.setVisible(false);
            date22.setVisible(false);
            date23.setVisible(false);
            date24.setVisible(false);
            date25.setVisible(false);
            date26.setVisible(false);
            date27.setVisible(false);
            date28.setVisible(false);
            date30.setVisible(false);

            calendar = new GregorianCalendar();
            dateToday = formattedDate.format((calendar.getTime()));
            jtfdate = new JLabel(dateToday);
            jtfdate.setBounds(50,570,70,70);
            jtfdate.setFont(new Font("Serif", Font.PLAIN, 20));
            jtfdate.setVisible(true);
            jpanel.add(jtfdate);
            jtf.add(jtfdate);
            jtfdate.repaint();

            cal22 = new GregorianCalendar();
            cal22.add(Calendar.MINUTE, 22);
            String dateToday22 = formattedDate.format(cal22.getTime());
            date22 = new JLabel(dateToday22);
            date22.setBounds(110,570,70,70);
            date22.setFont(new Font("Serif", Font.PLAIN, 20));
            date22.setVisible(true);
            jpanel.add(date22);
            jtf.add(date22);
            date22.repaint();

            jtf.add(min22);
            min22.repaint();


        }
    }

        public static void main(String[] args) {
            new SS();
        }
}