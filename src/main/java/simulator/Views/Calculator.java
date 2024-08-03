package simulator.Views;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.swing.*;
import java.lang.Math;

public class Calculator {

    private static final int WINDOW_WIDTH = 340;
    private static final int WINDOW_HEIGHT = 650;
    private static final int BUTTON_WIDTH = 60;
    private static final int BUTTON_HEIGHT = 40;
    private static final int MARGIN_X = 40;
    private static final int MARGIN_Y = 70;

    private JFrame frame;
    private JTextField inText;
    static JPanel panel = new JPanel(null);
    private JLabel label = new JLabel();
    static JButton back;
    private JButton btnC, btnBack, btnMod, btnDiv, btn7, btn8, btn9,
            btnMul, btn4, btn5, btn6, btnSub, btn1, btn2, btn3, btnAdd,
            btnPoint, btn0, btnEqual;
    private char opt = ' ';
    private boolean go = true;
    private boolean addWrite = true;
    private double val = 0;

    public Calculator() {
        back = new JButton();
        label = new JLabel();
        frame = new JFrame("Calculator");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);


        Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
        Font smallTxtBtnFont = new Font("Comic Sans MS", Font.PLAIN, 24);


        int[] x = {MARGIN_X, MARGIN_X + 90, 200, 290, 380};
        int[] y = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420};

        inText = new JTextField("0");
        inText.setBorder(null);
        inText.setHorizontalAlignment(JTextField.RIGHT);
        inText.setBounds(x[0], y[0]+70, 260, 70);
        inText.setEditable(false);
        inText.setBackground(Color.WHITE);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        panel.add(inText);

        btnC = new JButton("C");
        btnC.setBounds(x[0]-5, y[1]+120, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnC.setFont(btnFont);
        btnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnC.addActionListener(event -> {
            repaintFont();
            inText.setText("0");
            opt = ' ';
            val = 0;
        });
        panel.add(btnC);

        btnBack = new JButton("<-");
        btnBack.setBounds(x[1]-25, y[1]+120, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnBack.setFont(btnFont);
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBack.addActionListener(event -> {
            repaintFont();
            String str = inText.getText();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < (str.length() - 1); i++) {
                str2.append(str.charAt(i));//обновляет значение объекта, который вызвал метод
            }
            if (str2.toString().equals("")) {
                inText.setText("0");
            } else {
                inText.setText(str2.toString());
            }
        });
        panel.add(btnBack);

        btnMod = new JButton("%");
        btnMod.setBounds(x[2]-25, y[1]+120, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnMod.setFont(btnFont);
        btnMod.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMod.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    val = calc(val, inText.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = '%';
                    go = false;
                    addWrite = false;
                }
        });
        panel.add(btnMod);

        btnDiv = new JButton("/");
        btnDiv.setBounds(x[3]-45, y[1]+120, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnDiv.setFont(btnFont);
        btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDiv.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    val = calc(val, inText.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = '/';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '/';
                }
        });
        panel.add(btnDiv);

        btn7 = new JButton("7");
        btn7.setBounds(x[0]-5, y[2]+90, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn7.setFont(btnFont);
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn7.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("7");
                } else {
                    inText.setText(inText.getText() + "7");
                }
            } else {
                inText.setText("7");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(x[1]-25, y[2]+90, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn8.setFont(btnFont);
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn8.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("8");
                } else {
                    inText.setText(inText.getText() + "8");
                }
            } else {
                inText.setText("8");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(x[2]-25, y[2]+90, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn9.setFont(btnFont);
        btn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn9.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("9");
                } else {
                    inText.setText(inText.getText() + "9");
                }
            } else {
                inText.setText("9");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn9);

        btnMul = new JButton("*");
        btnMul.setBounds(x[3]-45, y[2]+90, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnMul.setFont(btnFont);
        btnMul.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMul.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    val = calc(val, inText.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = '*';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '*';
                }
        });
        panel.add(btnMul);

        btn4 = new JButton("4");
        btn4.setBounds(x[0]-5, y[3]+60, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn4.setFont(btnFont);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("4");
                } else {
                    inText.setText(inText.getText() + "4");
                }
            } else {
                inText.setText("4");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn4);

        btn5 = new JButton("5");
        btn5.setBounds(x[1]-25, y[3]+60, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn5.setFont(btnFont);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("5");
                } else {
                    inText.setText(inText.getText() + "5");
                }
            } else {
                inText.setText("5");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(x[2]-25, y[3]+60, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn6.setFont(btnFont);
        btn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn6.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("6");
                } else {
                    inText.setText(inText.getText() + "6");
                }
            } else {
                inText.setText("6");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn6);

        btnSub = new JButton("-");
        btnSub.setBounds(x[3]-45, y[3]+60, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnSub.setFont(btnFont);
        btnSub.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSub.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    val = calc(val, inText.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }

                    opt = '-';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '-';
                }
        });
        panel.add(btnSub);

        btn1 = new JButton("1");
        btn1.setBounds(x[0]-5, y[4]+30, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn1.setFont(btnFont);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("1");
                } else {
                    inText.setText(inText.getText() + "1");
                }
            } else {
                inText.setText("1");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn1);

        btn2 = new JButton("2");
        btn2.setBounds(x[1]-25, y[4]+30, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn2.setFont(btnFont);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("2");
                } else {
                    inText.setText(inText.getText() + "2");
                }
            } else {
                inText.setText("2");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn2);

        btn3 = new JButton("3");
        btn3.setBounds(x[2]-25, y[4]+30, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn3.setFont(btnFont);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("3");
                } else {
                    inText.setText(inText.getText() + "3");
                }
            } else {
                inText.setText("3");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn3);

        btnAdd = new JButton("+");
        btnAdd.setBounds(x[3]-45, y[4]+30, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnAdd.setFont(btnFont);
        btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAdd.addActionListener(event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    val = calc(val, inText.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = '+';
                    go = false;
                    addWrite = false;
                } else {
                    opt = '+';
                }
        });
        panel.add(btnAdd);

        btnPoint = new JButton(".");
        btnPoint.setBounds(x[0]-5, y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btnPoint.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        btnPoint.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPoint.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                inText.setText(inText.getText() + ".");
            } else {
                inText.setText("0.");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btnPoint);

        btn0 = new JButton("0");
        btn0.setBounds(x[1]-25, y[5], BUTTON_WIDTH, BUTTON_HEIGHT);
        btn0.setFont(btnFont);
        btn0.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn0.addActionListener(event -> {
            repaintFont();
            if (addWrite) {
                if (Pattern.matches("[0]*", inText.getText())) {
                    inText.setText("0");
                } else {
                    inText.setText(inText.getText() + "0");
                }
            } else {
                inText.setText("0");
                addWrite = true;
            }
            go = true;
        });
        panel.add(btn0);

        btnEqual = new JButton("=");
        btnEqual.setBounds(x[2]-25, y[5], 2 * BUTTON_WIDTH+10 , BUTTON_HEIGHT);
        btnEqual.setFont(btnFont);
        btnEqual.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnEqual.addActionListener(event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", inText.getText()))
                if (go) {
                    val = calc(val, inText.getText(), opt);
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                        inText.setText(String.valueOf((int) val));
                    } else {
                        inText.setText(String.valueOf(val));
                    }
                    opt = '=';
                    addWrite = false;
                }
        });
        panel.add(btnEqual);


        back.setContentAreaFilled(false);
        back.setVisible(true);
        back.setLayout(new FlowLayout());
        back.setBounds(50,610,240,20);
        panel.add(back);
        MouseListener BACK = new MouseListener()
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

        SimpleDateFormat d = new SimpleDateFormat("hh:mm");
        GregorianCalendar t = new GregorianCalendar();
        String s = d.format(t.getTime());
        Map<String, String> map = new HashMap<>();
        map.put("key", s);
        JLabel l = new JLabel(s);
        l.setBounds(50,0,50,50);
        l.setForeground(new Color(0xFFF6F3F3, true));



        back.addMouseListener(BACK);
        JLabel topBar = new JLabel();
        label.setBounds(5, 0, 330, 650);
        panel.add(label);
        label.add(topBar);
        frame.add(panel);

        topBar.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\topBar.png"));
        topBar.setBounds(235,20,60,21);
        label.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonOrange.png"));
        label.setVisible(true);
        label.add(l);
        panel.setPreferredSize(new Dimension(340,660));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private double calc(double x, String input, char opt) {
        inText.setFont(inText.getFont().deriveFont(Font.BOLD));
        double y = Double.parseDouble(input);
        if (opt == '+') {
            return x + y;
        } else if (opt == '-') {
            return x - y;
        } else if (opt == '*') {
            return x * y;
        } else if (opt == '/') {
            return x / y;
        } else if (opt == '%') {
            return x % y;
        } else if (opt == '^') {
            return Math.pow(x, y);
        }
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
        return y;
    }

    private void repaintFont() {
        inText.setFont(inText.getFont().deriveFont(Font.PLAIN));
    }
}