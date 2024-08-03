package simulator.Views;

import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;
import javax.swing.*;

public class Board extends JPanel implements ActionListener {

    private final int B_WIDTH = 300;
    private final int B_HEIGHT = 300;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private final int DELAY = 140;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];
    JLabel lab = new JLabel("Record: 0");
    private int dots;
    private int apple_x;
    private int apple_y;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;


    public Board() {

        initBoard();
    }

    public void initBoard() {

        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);


        JLabel l = new JLabel();
        JPanel p = new JPanel(null);
        l.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonGray.png"));
        p.add(l);

        add(p);
        setBounds(10,150,300,300);
        loadImages();
        initGame();
    }

    private void loadImages() {

        ImageIcon iid = new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\dot.png");
        ball = iid.getImage();

        ImageIcon iia = new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\apple.png");
        apple = iia.getImage();

        ImageIcon iih = new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\head.png");
        head = iih.getImage();
    }

    private void initGame() {

        dots = 3;

        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;

        }


        locateApple();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }

    private void doDrawing(Graphics g) {

        if (inGame) {

            g.drawImage(apple, apple_x, apple_y, this);

            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], this);
                } else {
                    g.drawImage(ball, x[z], y[z], this);
                }

            }

            Toolkit.getDefaultToolkit().sync();

        } else {

            gameOver(g);
        }
    }

    private void gameOver(Graphics g) {

        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);


        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2);

        Restart();


    }

public void Restart()
{
        if(!inGame) {
            JButton nov = new JButton("New Game");
            nov.setFont(new Font("Helvetica", Font.BOLD, 14));
            nov.setContentAreaFilled(false);
            nov.setBorderPainted(false);
            nov.setBounds(75, 200, 150, 50);
            MouseListener mouseListener = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
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

            nov.addMouseListener(mouseListener);
            add(nov);
        }
    }



    private void checkApple() {

        if ((x[0] == apple_x) && (y[0] == apple_y)) {

            dots++;
            locateApple();



            lab.setText("Record: "+ dots);
            lab.setForeground(new Color(0xFF05FF54, true));
            add(lab);
        }
    }

    private void move() {

        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }

        if (rightDirection) {
            x[0] += DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= DOT_SIZE;
        }

        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }

    private void checkCollision() {

        for (int z = dots; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }

        if (y[0] >= B_HEIGHT) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] >= B_WIDTH) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }

        if (!inGame) {
            timer.stop();
        }
    }

    private void locateApple() {

        int r = (int) (Math.random() * RAND_POS);
        apple_x = ((r * DOT_SIZE));

        r = (int) (Math.random() * RAND_POS);
        apple_y = ((r * DOT_SIZE));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (inGame) {

            checkApple();
            checkCollision();
            move();
        }

        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
        }
    }
}