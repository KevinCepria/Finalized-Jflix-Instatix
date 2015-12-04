// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReservationList.java

package src.cpeprog;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// Referenced classes of package src.cpeprog:
//            Menu, MovieSelect2, MyReservation, Confirmation

public class ReservationList extends Menu
    implements ActionListener
{
	String workingDir = System.getProperty("user.dir");
    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try
                {
                    ReservationList frame = new ReservationList();
                    frame.setVisible(true);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }

        });
    }

    public ReservationList()
    {
        MovieSelect2 _tmp = a;
        reserve = new JButton[MovieSelect2.p.size()];
        setTitle("Reservations");
        MovieSelect2 _tmp1 = a;
        System.out.print(MovieSelect2.p.size());
        setDefaultCloseOperation(3);
        setBounds(100, 100, 709, 675);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblNewLabel = new JLabel("Reservation List");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Arial Black", 0, 24));
        lblNewLabel.setBounds(235, 13, 267, 29);
        contentPane.add(lblNewLabel);
        int i = 0;
        do
        {
            MovieSelect2 _tmp2 = a;
            if(i < MovieSelect2.p.size())
            {
                int j = i + 1;
                reserve[i] = new JButton("sample");
                reserve[i].setText(((MyReservation)Menu.p.get(i)).getReservation());
                reserve[i].setForeground(new Color(255, 255, 255));
                reserve[i].setBackground(new Color(165, 42, 42));
                reserve[i].setFont(new Font("Arial Black", 0, 12));
                if(i == 0)
                    reserve[i].setBounds(10, 60 * j, 670, 40);
                else
                    reserve[i].setBounds(10, 60 * j - 10 * (j - 1), 670, 40);
                contentPane.add(reserve[i]);
                reserve[i].addActionListener(this);
                i++;
            } else
            {
                break;
            }
        } while(true);
        JButton OK = new JButton("OK");
        OK.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                ReservationList.b.setVisible(true);
            }

         
        });
        OK.setForeground(new Color(255, 255, 255));
        OK.setBackground(new Color(165, 42, 42));
        OK.setFont(new Font("Arial Black", 0, 12));
        OK.setBounds(291, 574, 100, 40);
        contentPane.add(OK);
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(workingDir+"\\bin\\src\\bg3.png"));
        lblNewLabel_1.setBounds(0, 0, 691, 628);
        contentPane.add(lblNewLabel_1);
    }

    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        for(int i = 0; i < p.size(); i++)
            if(source == reserve[i])
            {
                Confirmation u = new Confirmation((MyReservation)p.get(i));
                u.setVisible(true);
            }

    }

    private JPanel contentPane;
    private JButton reserve[];
}
