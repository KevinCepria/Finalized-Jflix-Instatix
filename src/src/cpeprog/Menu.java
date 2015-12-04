// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Menu.java

package src.cpeprog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// Referenced classes of package src.cpeprog:
//            CPEPROG, MovieSelect2, ViewSnackBar, ReservationList

public class Menu extends CPEPROG
{
	String workingDir = System.getProperty("user.dir");
    public Menu()
    {
    	
        setTitle("Main Menu");
        setDefaultCloseOperation(3);
        setBounds(100, 100, 587, 612);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnNewButton = new JButton("SELECT MOVIE");
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                Menu.a.setVisible(true);
            }

       
        });
        btnNewButton.setFont(new Font("Arial Black", 0, 13));
        btnNewButton.setBackground(Color.YELLOW);
        btnNewButton.setBounds(26, 192, 156, 50);
        contentPane.add(btnNewButton);
        JButton btnSnackBar = new JButton("VIEW SNACK BAR");
        btnSnackBar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                ViewSnackBar snacks = new ViewSnackBar();
                snacks.setVisible(true);
                setVisible(false);
            }

           
        });
        btnSnackBar.setBackground(Color.YELLOW);
        btnSnackBar.setFont(new Font("Arial Black", 0, 12));
        btnSnackBar.setBounds(26, 255, 156, 50);
        contentPane.add(btnSnackBar);
        JButton btnReservations = new JButton("RESERVATIONS");
        btnReservations.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                ReservationList R = new ReservationList();
                R.setVisible(true);
            }

        });
        btnReservations.setBackground(Color.YELLOW);
        btnReservations.setFont(new Font("Arial Black", 0, 12));
        btnReservations.setBounds(26, 318, 156, 50);
        contentPane.add(btnReservations);
        JButton btnExit = new JButton("EXIT");
        btnExit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }

            
        });
        btnExit.setBackground(Color.YELLOW);
        btnExit.setFont(new Font("Arial Black", 0, 13));
        btnExit.setBounds(26, 381, 156, 50);
        contentPane.add(btnExit);
        JLabel lblNewLabel_1 = new JLabel("JFlix   Istatix");
        lblNewLabel_1.setFont(new Font("Blackadder ITC", 0, 60));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBackground(Color.WHITE);
        lblNewLabel_1.setBounds(145, 33, 330, 120);
        contentPane.add(lblNewLabel_1);
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBackground(Color.YELLOW);
        lblNewLabel.setIcon(new ImageIcon(workingDir+"\\bin\\src\\bgproject.PNG"));
        lblNewLabel.setBounds(0, 0, 569, 565);
        contentPane.add(lblNewLabel);
    }

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    static java.util.List p = new ArrayList();

}
