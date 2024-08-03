package simulator.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class MainWindow implements ActionListener {

    private final JLabel labelSelect;
    private JLabel labelChoix;
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel(null);
    private final JButton btnWithFriend;
    private final JButton btnWithPc;
    private JButton back;

    private JRadioButton choixWithPc[] = new JRadioButton[3];
    private boolean showHidePcPlay = false;
    private final Font FontForLabel = new Font("Comic Sans MS", Font.PLAIN, 16);
    private static int i = 0;

    public MainWindow() {
        back = new JButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelSelect = new JLabel(PlayWindow.setColor("Please Select Type Of Game :", "blue"));
        labelSelect.setBounds(40, 60, 315, 50);
        labelSelect.setFont(new Font("Comic Sans Ms", Font.PLAIN, 15));
        frame.add(labelSelect);

        btnWithFriend = new JButton("Play With My Friend");
        btnWithFriend.setBounds(40, 150, 250, 50);
        btnWithFriend.setFont(FontForLabel);
        btnWithFriend.addActionListener(event -> {
            new PlayWindow(0);
            frame.setVisible(false);
        });
        panel.add(btnWithFriend);

        btnWithPc = new JButton("Play With PC");
        btnWithPc.setBounds(40, 210, 250, 50);
        btnWithPc.setFont(FontForLabel);
        btnWithPc.addActionListener(event -> {
            showHidePcPlay = (showHidePcPlay) ? false : true;
            labelChoix.setVisible(showHidePcPlay);
            for (i = 0; i < 3; i++)
                choixWithPc[i].setVisible(showHidePcPlay);


        });
        panel.add(btnWithPc);

        labelChoix = new JLabel(PlayWindow.setColor("Please Select Level :", "green"));
        labelChoix.setBounds(40, 280, 250, 50);
        labelChoix.setVisible(false);
        frame.add(labelChoix);

        choixWithPc[0] = new JRadioButton("Easy");
        choixWithPc[1] = new JRadioButton("Medium");
        choixWithPc[2] = new JRadioButton("Hard");

        for (int i = 0; i < 3; i++) {
            choixWithPc[i].setBounds(40, 260 + 30 * i, 150, 30);
            choixWithPc[i].setVisible(false);
            choixWithPc[i].addActionListener(this);
            panel.add(choixWithPc[i]);
        }


        back.setContentAreaFilled(false);
        back.setVisible(true);
        back.setLayout(new FlowLayout());
        back.setBounds(45,610,240,20);
        panel.add(back);
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


        SimpleDateFormat d = new SimpleDateFormat("hh:mm");
        GregorianCalendar t = new GregorianCalendar();
        String s = d.format(t.getTime());
        Map<String, String> map = new HashMap<>();
        map.put("key", s);
        JLabel l = new JLabel(s);
        l.setBounds(50,0,50,50);
        l.setForeground(new Color(0xFF000000, true));


        labelSelect.setBounds(0,0,330,650);
        frame.setTitle("Game");
        panel.add(labelSelect);
        panel.add(labelChoix);
        frame.add(panel);
        panel.setPreferredSize(new Dimension(330, 650));
        labelSelect.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefon2281.png"));
        labelSelect.add(l);
        labelSelect.setVisible(true);
        labelChoix.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++)
            if (e.getSource() == choixWithPc[i]) {
                new PlayWindow(i + 1);
                frame.setVisible(false);
            }
    }

}