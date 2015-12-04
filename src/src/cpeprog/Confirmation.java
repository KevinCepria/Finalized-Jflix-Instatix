// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Confirmation.java

package src.cpeprog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// Referenced classes of package src.cpeprog:
//            Reservation, OrderSnack, MovieSelect2, Movie, 
//            MyReservation, Menu

public class Confirmation extends Reservation
{
int newj;
String workingDir = System.getProperty("user.dir");
    public Confirmation()
    {
        snack = new OrderSnack();
        setTitle("Confirmation");
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.cyan);
        setBackground(Color.RED);
        setResizable(false);
        setDefaultCloseOperation(3);
        setBounds(100, 100, 681, 635);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Arial Black", 0, 18));
        lblNewLabel.setText(a.movie[a.i][a.c][a.j].getCinemanum());
        lblNewLabel.setBounds(106, 30, 156, 35);
        contentPane.add(lblNewLabel);
        label = new JLabel("New label");
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("Arial Black", 0, 18));
        label.setBounds(106, 61, 201, 35);
        contentPane.add(label);
        label.setText(a.movie[a.i][a.c][a.j].getTitle());
        label_1 = new JLabel("New label");
        label_1.setForeground(new Color(255, 255, 255));
        label_1.setFont(new Font("Arial Black", 0, 18));
        label_1.setBounds(106, 94, 201, 35);
        label_1.setText(a.movie[a.i][a.c][a.j].getDate());
        contentPane.add(label_1);
        label_2 = new JLabel("New label");
        label_2.setForeground(new Color(255, 255, 255));
        label_2.setFont(new Font("Arial Black", 0, 18));
        label_2.setBounds(106, 129, 201, 35);
        label_2.setText(a.movie[a.i][a.c][a.j].getTime());
        contentPane.add(label_2);
        label_3 = new JLabel("New label");
        label_3.setForeground(new Color(255, 255, 255));
        label_3.setFont(new Font("Arial Black", 0, 18));
        label_3.setBounds(106, 228, 201, 35);
        label_3.setText((new StringBuilder("Reserved Seats: ")).append(a.movie[a.i][a.c][a.j].getnumReserve()).toString());
        contentPane.add(label_3);
        label_4 = new JLabel("New label");
        label_4.setBackground(new Color(102, 153, 204));
        label_4.setForeground(new Color(255, 255, 255));
        label_4.setFont(new Font("Arial Black", 0, 14));
        label_4.setText(a.movie[a.i][a.c][a.j].getSeatnames());
        label_4.setBounds(106, 265, 156, 35);
        contentPane.add(label_4);
        label_5 = new JLabel("New label");
        label_5.setForeground(new Color(255, 255, 255));
        label_5.setFont(new Font("Arial Black", 0, 42));
        label_5.setBounds(418, 337, 225, 35);
        label_5.setText((new StringBuilder("P")).append(a.movie[a.i][a.c][a.j].getTotalPirce()).toString());
        contentPane.add(label_5);
        label_6 = new JLabel("");
        label_6.setForeground(Color.WHITE);
        label_6.setFont(new Font("Arial Black", 0, 36));
        label_6.setBounds(343, 414, 300, 35);
        newj=a.j;
        contentPane.add(label_6);
        btnNewButton = new JButton("CONFIRM");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(165, 42, 42));
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                MyReservation temp = new MyReservation(Confirmation.a.movie[Confirmation.a.i][Confirmation.a.c][newj], Confirmation.a.movie[Confirmation.a.i][Confirmation.a.c][newj].getTotalPirce(), snack);
                Menu.p.add(temp);
                System.out.println((new StringBuilder("T")).append(temp.getseatNames()).toString());
                label_6.setText((new StringBuilder("CODE: ")).append(temp.getCode()).toString());
                contentPane.remove(btnAddFood);
                contentPane.remove(btnNewButton);
                contentPane.remove(btnCancel);
                JButton btnOk = new JButton("OK");
                btnOk.setForeground(Color.WHITE);
                btnOk.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e)
                    {
                        setVisible(false);
                        Confirmation.a.comboBox.setSelectedIndex(Confirmation.a.l);
                        Confirmation.a.comboBox_1.setSelectedIndex(Confirmation.a.n[0]);
                        Confirmation.a.comboBox_2.setSelectedIndex(Confirmation.a.n[1]);
                        Confirmation.a.comboBox_3.setSelectedIndex(Confirmation.a.n[2]);
                        Confirmation.a.comboBox_4.setSelectedIndex(Confirmation.a.n[3]);
                        Confirmation.a.movie[Confirmation.a.i][Confirmation.a.c][newj].closeSeatReservation();
                        Confirmation.a.setVisible(true);
                        System.out.print(Confirmation.p.size());
                    }

                 
                });
                btnOk.setFont(new Font("Arial Black", 0, 18));
                btnOk.setBackground(new Color(165, 50, 60));
                btnOk.setBounds(239, 512, 200, 70);
                contentPane.add(btnOk);
                contentPane.validate();
                contentPane.repaint();
            }


            
          
        });
        btnNewButton.setFont(new Font("Arial Black", 0, 18));
        btnNewButton.setBounds(280, 531, 140, 40);
        contentPane.add(btnNewButton);
        btnCancel = new JButton("CANCEL");
        btnCancel.setForeground(new Color(255, 255, 255));
        btnCancel.setBackground(new Color(165, 42, 42));
        btnCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }

           
        });
        btnCancel.setFont(new Font("Arial Black", 0, 18));
        btnCancel.setBounds(470, 531, 140, 40);
        contentPane.add(btnCancel);
        lblRegulars = new JLabel("Regulars: ");
        lblRegulars.setForeground(new Color(255, 255, 255));
        lblRegulars.setText((new StringBuilder("Regulars: ")).append(a.movie[a.i][a.c][a.j].getReg()).toString());
        lblRegulars.setFont(new Font("Arial Black", 0, 18));
        lblRegulars.setBounds(106, 165, 201, 35);
        contentPane.add(lblRegulars);
        lblSeniors = new JLabel("Seniors:  ");
        lblSeniors.setForeground(new Color(255, 255, 255));
        lblSeniors.setText((new StringBuilder("Seniors: ")).append(a.movie[a.i][a.c][a.j].getSen()).toString());
        lblSeniors.setFont(new Font("Arial Black", 0, 18));
        lblSeniors.setBounds(106, 195, 201, 35);
        contentPane.add(lblSeniors);
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(343, 24, 300, 300);
        lblNewLabel_1.setBorder(border);
        lblNewLabel_1.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(a.movie[a.i][a.c][a.j].getTitle().toLowerCase()).append(".png").toString()));
        contentPane.add(lblNewLabel_1);
        btnAddFood = new JButton("ADD SNACKS");
        btnAddFood.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                snack.setVisible(true);
            }

          
        });
        btnAddFood.setForeground(Color.WHITE);
        btnAddFood.setFont(new Font("Arial Black", 0, 14));
        btnAddFood.setBackground(new Color(165, 42, 42));
        btnAddFood.setBounds(90, 531, 140, 40);
        contentPane.add(btnAddFood);
        lblNewLabel_3 = new JLabel("Snacks:");
        lblNewLabel_3.setFont(new Font("Arial Black", 0, 10));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setVerticalAlignment(1);
        lblNewLabel_3.setBounds(106, 303, 286, 210);
        contentPane.add(lblNewLabel_3);
        lblNewLabel_4 = new JLabel("Deadline of claiming of tickets is 4 hours before the reserved time. Failure to reach the deadline will cancel your reservation");
        lblNewLabel_4.setFont(new Font("Tahoma", 0, 11));
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(47, 584, 663, 16);
        contentPane.add(lblNewLabel_4);
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(workingDir+"\\bin\\src\\bg2.png"));
        lblNewLabel_2.setBounds(0, 0, 675, 600);
        contentPane.add(lblNewLabel_2);
        snack.btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                int newTotal = Confirmation.a.movie[Confirmation.a.i][Confirmation.a.c][Confirmation.a.j].getTotalPirce() + snack.getTotal();
                label_5.setText((new StringBuilder("P")).append(newTotal).toString());
                snack.setVisible(false);
                lblNewLabel_3.setText(snack.getOrder());
            }

        });
    }

    public Confirmation(MyReservation e)
    {
        snack = new OrderSnack();
        setTitle("Confirmation");
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.cyan);
        setBackground(Color.RED);
        setResizable(false);
        setDefaultCloseOperation(3);
        setBounds(100, 100, 681, 635);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnOk = new JButton("OK");
        btnOk.setForeground(Color.WHITE);
        btnOk.setFont(new Font("Arial Black", 0, 18));
        btnOk.setBackground(new Color(165, 50, 60));
        btnOk.setBounds(239, 512, 200, 70);
        contentPane.add(btnOk);
        btnOk.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }

          
        });
        lblNewLabel = new JLabel();
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Arial Black", 0, 18));
        lblNewLabel.setText(e.getCinema());
        lblNewLabel.setBounds(106, 30, 156, 35);
        contentPane.add(lblNewLabel);
        label = new JLabel();
        label.setText(e.getTitle());
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("Arial Black", 0, 18));
        label.setBounds(106, 61, 201, 35);
        contentPane.add(label);
        label_1 = new JLabel();
        label_1.setText(e.getDate());
        label_1.setForeground(new Color(255, 255, 255));
        label_1.setFont(new Font("Arial Black", 0, 18));
        label_1.setBounds(106, 94, 201, 35);
        contentPane.add(label_1);
        label_2 = new JLabel();
        label_2.setText(e.getTimeSlot());
        label_2.setForeground(new Color(255, 255, 255));
        label_2.setFont(new Font("Arial Black", 0, 18));
        label_2.setBounds(106, 129, 201, 35);
        contentPane.add(label_2);
        label_3 = new JLabel();
        label_3.setText(e.getResSeats());
        label_3.setForeground(new Color(255, 255, 255));
        label_3.setFont(new Font("Arial Black", 0, 18));
        label_3.setBounds(106, 228, 201, 35);
        contentPane.add(label_3);
        label_4 = new JLabel();
        label_4.setText(e.getseatNames());
        label_4.setForeground(new Color(255, 255, 255));
        label_4.setFont(new Font("Arial Black", 0, 14));
        label_4.setBounds(106, 265, 156, 35);
        contentPane.add(label_4);
        label_5 = new JLabel();
        label_5.setText(e.getPrice());
        label_5.setForeground(new Color(255, 255, 255));
        label_5.setFont(new Font("Arial Black", 0, 42));
        label_5.setBounds(418, 337, 225, 35);
        contentPane.add(label_5);
        label_6 = new JLabel();
        label_6.setText(e.getCode());
        label_6.setForeground(Color.WHITE);
        label_6.setFont(new Font("Arial Black", 0, 36));
        label_6.setBounds(363, 414, 300, 35);
        contentPane.add(label_6);
        lblRegulars = new JLabel();
        lblRegulars.setText(e.getReg());
        lblRegulars.setForeground(new Color(255, 255, 255));
        lblRegulars.setFont(new Font("Arial Black", 0, 18));
        lblRegulars.setBounds(106, 165, 201, 35);
        contentPane.add(lblRegulars);
        lblSeniors = new JLabel();
        lblSeniors.setText(e.getSen());
        lblSeniors = new JLabel((new StringBuilder("Seniors: ")).append(e.getSen()).toString());
        lblSeniors.setForeground(new Color(255, 255, 255));
        lblSeniors.setFont(new Font("Arial Black", 0, 18));
        lblSeniors.setBounds(106, 195, 201, 35);
        contentPane.add(lblSeniors);
        lblNewLabel_3 = new JLabel("Snacks:");
        lblNewLabel_3.setFont(new Font("Arial Black", 0, 10));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setText(e.getSnack());
        lblNewLabel_3.setVerticalAlignment(1);
        lblNewLabel_3.setBounds(106, 303, 286, 210);
        contentPane.add(lblNewLabel_3);
        lblNewLabel_4 = new JLabel("Deadline of claiming of tickets is 4 hours before the reserved time. Failure to reach the deadline will cancel your reservation");
        lblNewLabel_4.setFont(new Font("Tahoma", 0, 11));
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setBounds(31, 584, 663, 16);
        contentPane.add(lblNewLabel_4);
        lblNewLabel_1 = new JLabel();
        lblNewLabel_1.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(e.getTitle().toLowerCase()).append(".png").toString()));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(343, 24, 300, 300);
        lblNewLabel_1.setBorder(border);
        contentPane.add(lblNewLabel_1);
        lblNewLabel_2 = new JLabel();
        lblNewLabel_2.setIcon(new ImageIcon(workingDir+"\\bin\\src\\bg2.png"));
        lblNewLabel_2.setBounds(0, 0, 675, 600);
        contentPane.add(lblNewLabel_2);
    }

    private OrderSnack snack;
    JButton btnCancel;
    JButton btnNewButton;
    private JPanel contentPane;
    JLabel lblNewLabel;
    JLabel label;
    JLabel label_1;
    JLabel label_2;
    JLabel label_3;
    JLabel label_4;
    JLabel label_5;
    JLabel label_6;
    JLabel lblRegulars;
    JLabel lblSeniors;
    JLabel lblNewLabel_1;
    JLabel lblNewLabel_2;
    private JButton btnAddFood;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;




}
