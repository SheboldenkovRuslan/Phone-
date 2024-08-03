package simulator.Views;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Calendar extends Application {
    static JLabel lblMonth, lblYear, label1;
    static JButton btnPrev, btnNext,back;
    static JTable tblCalendar;
    static JComboBox cmbYear;
    static JFrame frame;
    static DefaultTableModel mtblCalendar;
    static JScrollPane stblCalendar;
    static JPanel pnlCalendar;
    static int realYear, realMonth, realDay, currentYear, currentMonth;



    public Calendar(){
        createAndShowCalendar();
    }

    public static JPanel getPnlCalendar(){
        return pnlCalendar;
    }


    public static void createAndShowCalendar(){
        frame = new JFrame("Calendar");
        back = new JButton();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel topBar = new JLabel();



        lblMonth = new JLabel ("May");
        lblMonth.setForeground(Color.WHITE);
        lblYear = new JLabel ("Change year:");
        lblYear.setForeground(Color.WHITE);
        cmbYear = new JComboBox();
        btnPrev = new JButton ("<");
        btnNext = new JButton (">");
        mtblCalendar = new DefaultTableModel(){public boolean isCellEditable(int rowIndex, int mColIndex){return false;}};
        tblCalendar = new JTable(mtblCalendar);
        stblCalendar = new JScrollPane(tblCalendar);
        pnlCalendar = new JPanel(null);
        label1 = new JLabel();


        SimpleDateFormat d = new SimpleDateFormat("hh:mm");
        GregorianCalendar t = new GregorianCalendar();
        String s = d.format(t.getTime());
        Map<String, String> map = new HashMap<>();
        map.put("key", s);
        JLabel l = new JLabel(s);
        l.setBounds(50,0,50,50);
        l.setForeground(new Color(0xFFF6F3F3, true));


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


        btnNext.setBackground(Color.PINK);
        btnPrev.setBackground(Color.PINK);



        btnPrev.addActionListener(new btnPrev_Action());
        btnNext.addActionListener(new btnNext_Action());
        cmbYear.addActionListener(new cmbYear_Action());

        pnlCalendar.add(lblMonth);
        pnlCalendar.add(lblYear);
        pnlCalendar.add(cmbYear);
        pnlCalendar.add(btnPrev);
        pnlCalendar.add(btnNext);
        pnlCalendar.add(stblCalendar);
        pnlCalendar.add(label1);
        pnlCalendar.add(back);


        label1.setBounds(5, 0, 330, 650);
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2 + 120, 90, 100, 25);
        lblYear.setBounds(70, 460, 80, 20);
        cmbYear.setBounds(180, 460, 80, 20);
        btnPrev.setBounds(45, 120, 50, 25);
        btnNext.setBounds(245, 120, 50, 25);
        stblCalendar.setBounds(45, 180, 250, 250);

        GregorianCalendar cal = new GregorianCalendar();
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
        realMonth = cal.get(GregorianCalendar.MONTH);
        realYear = cal.get(GregorianCalendar.YEAR);
        currentMonth = realMonth;
        currentYear = realYear;

        List<String> headers = new ArrayList<>();
        headers.add("Sun");
        headers.add("Mon");
        headers.add("Tue");
        headers.add("Wed");
        headers.add("Thu");
        headers.add("Fri");
        headers.add("Sat");

        for (int i=0; i<7; i++){
            mtblCalendar.addColumn(headers.get(i));
        }

        tblCalendar.getParent().setBackground(tblCalendar.getBackground());

        tblCalendar.getTableHeader().setResizingAllowed(false);
        tblCalendar.getTableHeader().setReorderingAllowed(false);

        tblCalendar.setColumnSelectionAllowed(true);
        tblCalendar.setRowSelectionAllowed(true);
        tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        tblCalendar.setRowHeight(38);
        mtblCalendar.setColumnCount(7);
        mtblCalendar.setRowCount(6);

        for (int i=realYear-100; i<=realYear+100; i++){
            cmbYear.addItem(String.valueOf(i));
        }

        refreshCalendar (realMonth, realYear);

        pnlCalendar.add(label1);
        label1.add(topBar);
        frame.add(pnlCalendar);
        topBar.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\topBar.png"));
        topBar.setBounds(235,20,60,21);
        label1.setIcon(new ImageIcon("C:\\Users\\analo\\OneDrive\\Desktop\\JAVA\\profile\\telefonGray.png"));
        label1.setVisible(true);
        label1.add(l);
        pnlCalendar.setPreferredSize(new Dimension(340,660));
        label1.setPreferredSize(new Dimension(400,700));
        frame.pack();
        frame.setVisible(true);



    }

    static class btnPrev_Action implements ActionListener {
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 0){
                currentMonth = 11;
                currentYear -= 1;
            }
            else{
                currentMonth -= 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }
    }
    static class btnNext_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 11){
                currentMonth = 0;
                currentYear += 1;
            }
            else{
                currentMonth += 1;
            }
            refreshCalendar(currentMonth, currentYear);
        }

    }

    public static void refreshCalendar(int month, int year){

        Stack<String> months = new Stack<>();
        months.push("January");
        months.push("February");
        months.push("March");
        months.push("April");
        months.push("May");
        months.push("June");
        months.push("July");
        months.push("August");
        months.push("September");
        months.push("October");
        months.push("November");
        months.push("December");
        int nod, som;


        btnPrev.setEnabled(true);
        btnNext.setEnabled(true);

        btnNext.setToolTipText("Go to next month");
        btnPrev.setToolTipText("Go to previous Month");
        if (month == 0 && year <= realYear-10){btnPrev.setEnabled(false);}
        if (month == 11 && year >= realYear+100){btnNext.setEnabled(false);}
        lblMonth.setText(months.get(month));
        lblMonth.setBounds(160-lblMonth.getPreferredSize().width/2, 120, 100, 25);
        cmbYear.setSelectedItem(String.valueOf(year));


        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                mtblCalendar.setValueAt(null, i, j);
            }
        }


        GregorianCalendar cal = new GregorianCalendar(year, month, 1);
        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        som = cal.get(GregorianCalendar.DAY_OF_WEEK);


        for (int i=1; i<=nod; i++){
            int row = new Integer((i+som-2)/7);
            int column  =  (i+som-2)%7;
            mtblCalendar.setValueAt(i, row, column);
        }


        tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
    }

    static class tblCalendarRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            if (column == 0 || column == 6){
                setBackground(new Color(70, 68, 68, 255));
            }
            else{
                setBackground(new Color(0, 0, 0));
            }
            if (value != null){
                if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
                    setBackground(new Color(201, 0, 0));
                }
            }
            setBorder(null);
            setForeground(Color.WHITE);
            return this;
        }
    }
    static class cmbYear_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (cmbYear.getSelectedItem() != null){
                String b = cmbYear.getSelectedItem().toString();
                currentYear = Integer.parseInt(b);
                refreshCalendar(currentMonth, currentYear);
            }
        }
    }
}
