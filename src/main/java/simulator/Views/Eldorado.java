package simulator.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

import java.io.*;
import java.util.Calendar;

public class Eldorado {
    public static String count228;

    public static void Set() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JPanel panel1 = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel();

        SimpleDateFormat d = new SimpleDateFormat("hh:mm");
        GregorianCalendar t = new GregorianCalendar();
        String s = d.format(t.getTime());
        Map<String, String> map = new HashMap<>();
        map.put("key", s);
        JLabel a = new JLabel(s);
        a.setBounds(50,0,50,50);
        a.setForeground(new Color(0xFFF6F3F3, true));

        JLabel l = new JLabel("Добавить");
        l.setForeground(new Color(0xFFF6F3F3, true));
        l.setBounds(60,150,100,100);

        JLabel la = new JLabel("Найти");
        la.setForeground(new Color(0xFFF6F3F3, true));
        la.setBounds(220,150,100,100);

        JLabel lab = new JLabel("Удалить");
        lab.setForeground(new Color(0xFFF6F3F3, true));
        lab.setBounds(150,320,100,100);

        JLabel labl = new JLabel("Список");
        labl.setForeground(new Color(0xFFF6F3F3, true));
        labl.setBounds(150,480,100,100);

        JFrame frame = new JFrame();
        frame.setBounds(105,300,1,1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);

        JFrame jfrm = new JFrame("Eldorado");
        jfrm.setSize(340, 650);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);

        JButton button1 = new JButton();
        button1.setBounds(40, 80, 90, 100);
        button1.setVisible(true);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\dobavit.png"));
        button1.setLayout(new FlowLayout());
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);

        JButton button2 = new JButton();
        button2.setBounds(190, 80, 120, 120);
        button2.setVisible(true);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        button2.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\poisk.png"));
        button2.setLayout(new FlowLayout());
        button2.setBackground(Color.GREEN);
        button2.setForeground(Color.WHITE);

        JButton button3 = new JButton();
        button3.setBounds(120, 250, 120, 120);
        button3.setVisible(true);
        button3.setContentAreaFilled(false);
        button3.setBorderPainted(false);
        button3.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\delete.png"));
        button3.setLayout(new FlowLayout());
        button3.setBackground(Color.RED);
        button3.setForeground(Color.WHITE);

        JButton button4 = new JButton();
        button4.setBounds(120, 410, 120, 120);
        button4.setVisible(true);
        button4.setContentAreaFilled(false);
        button4.setBorderPainted(false);
        button4.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\assets\\spisok.png"));
        button4.setLayout(new FlowLayout());
        button4.setBackground(Color.MAGENTA);
        button4.setForeground(Color.WHITE);



        JButton back = new JButton();
        back.setContentAreaFilled(false);
        back.setVisible(true);
        back.setLayout(new FlowLayout());
        back.setBounds(50,610,240,20);

        MouseListener BACK = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Application.Skelet();
                jfrm.setVisible(false);
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


        panel.add(label);
        jfrm.add(panel);
        label.setPreferredSize(new Dimension(340, 650));
        panel.setPreferredSize(new Dimension(340,660));
        label.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonGray.png"));
        label.add(l);
        label.add(la);
        label.add(lab);
        label.add(labl);
        label.setVisible(true);
        label.add(button1);
        label.add(button2);
        label.add(button3);
        label.add(button4);
        label.add(back);
        label.add(a);
        jfrm.pack();
        jfrm.setVisible(true);




        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(true);
                String Brand = "", cpu = "", Monitor = "", Memory = "", count228 = "";
                Brand = JOptionPane.showInputDialog(frame,"Введите марку компьютера");
                cpu = JOptionPane.showInputDialog(frame ,"Введите покление процессора Intel core");
                Monitor = JOptionPane.showInputDialog(frame ,"Введите диагональ монитора (в дюймах)");
                Memory = JOptionPane.showInputDialog(frame ,"Введите память компьютера (в Гб)");
                count228 = JOptionPane.showInputDialog(frame ,"Введите номер компьютера");
                String comp, comp1;
                comp1 = count228 + " " + "Компьютер: " + Brand + " Поколение процессора Intel core: " + cpu + " Монитор: " + Monitor + "/Inch" + " Память: " + Memory + "/Gb";
                comp = "Характеристики компьютера " + Brand + ":" + "\n" + "\n" + cpu + "\n" + Monitor + "\n" + Memory + "\n" + "\n" + "    Компьютер добавлен!";
                JLabel label1 = new JLabel(comp);
                label1.setBounds(0,0,100,200);

                JOptionPane.showMessageDialog(frame, comp);

                frame.add(label1);
                Shop.AddPc(comp1);
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

        button1.addMouseListener(mouseListener);

        MouseListener mouseListener2 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(true);
                String comp;
                comp = JOptionPane.showInputDialog(frame ,"Введите номер компьютера");
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                byte[] content = new byte[0];
                try {
                    content = new byte[fis.available()];
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.read(content);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                String[] lines = new String(content).split("\n");
                for (String line : lines) {
                    String[] words = line.split(" ");
                    Queue<String> words2 = new LinkedList<>();
                    words.equals(words2);
                    words2.offer(" ");//добавляет

                    for (String word : words) {
                        if (word.equalsIgnoreCase(comp)) {
                            JOptionPane.showMessageDialog(frame, words);
                            Shop.count = true;
                            break;
                        }
                    }
                }

                if (Shop.count == false) {
                    String warning = "Не найдено в базе!";
                    JOptionPane.showMessageDialog(frame, warning);
                }
                Shop.count = false;
                System.out.println("\n");
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

        button2.addMouseListener(mouseListener2);

        MouseListener mouseListener3 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(true);
                String comp = "";
                String cpu = "";
                String monitor = "";
                String memory = "";
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                byte[] content = new byte[0];
                try {
                    content = new byte[fis.available()];
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.read(content);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                String[] lines = new String(content).split("\n");
                for (String line : lines) {
                    String[] words = line.split(" ");
                    for (String word : words) {
                        Shop.count = true;
                    }
                }
                JOptionPane.showMessageDialog(frame, lines);
                count228 = JOptionPane.showInputDialog(frame ,"Введите номер компьютера");
                try {
                    JOptionPane.showMessageDialog(frame, Shop.DeletePc(count228) + "Компьютер удалён из базы");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
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

        button3.addMouseListener(mouseListener3);

        MouseListener mouseListener4 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(true);
                String comp = "";
                String cpu = "";
                String monitor = "";
                String memory = "";
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\shop.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                byte[] content = new byte[0];
                try {
                    content = new byte[fis.available()];
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.read(content);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    fis.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                String[] lines = new String(content).split("\n");
                for (String line : lines) {
                    String[] words = line.split(" ");
                    for (String word : words) {
                    }
                }
                JOptionPane.showMessageDialog(frame, lines);
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

        button4.addMouseListener(mouseListener4);
    }
}

