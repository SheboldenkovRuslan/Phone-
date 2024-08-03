package simulator.Views;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


import chrriis.common.WebServer;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class Browser extends JFrame {
   private static JFrame nav = new JFrame();
    static JLabel label1 = new JLabel();
    public Browser(){
        JPanel panelBrowser = new JPanel(null);
        panelBrowser.setLayout(null);
        final JWebBrowser navegador = new JWebBrowser();
        navegador.navigate("https://www.google.ru");
        navegador.setBounds(0,0,500,900);
        panelBrowser.add(navegador);
        navegador.setMenuBarVisible(true);

        label1.setBounds(0,0,340,600);
        label1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonGray.png"));
        label1.setVisible(true);
        panelBrowser.add(label1);
        add(panelBrowser);
        if(navegador.navigate("https://dzen.ru/?clid=2294317-10&from=dist_bookmark&win=362&yredirect=true")){
            navegador.reloadPage();
        }

    }
    public static void Brows(){
        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Browser nav = new Browser();

                JButton back = new JButton();
                back.setContentAreaFilled(false);
                back.setVisible(true);
                back.setLayout(new FlowLayout());
                back.setBackground(Color.BLACK);
                back.setBounds(50,0,240,20);
                MouseListener mouseListener1 = new MouseListener()
                {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        Application.Skelet();
                        nav.setVisible(false);
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

                label1.add(back);
                nav.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nav.setVisible(true);
                nav.setSize(340, 650);
            }
        });
    }
}