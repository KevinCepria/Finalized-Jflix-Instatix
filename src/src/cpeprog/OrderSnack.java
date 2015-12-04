// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderSnack.java

package src.cpeprog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class OrderSnack extends JFrame
{
	String workingDir = System.getProperty("user.dir");

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try
                {
                    OrderSnack frame = new OrderSnack();
                    frame.setVisible(true);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }

        });
    }

    public OrderSnack()
    {
        comboBox = new JComboBox();
        comboBox_1 = new JComboBox();
        comboBox_2 = new JComboBox();
        comboBox_3 = new JComboBox();
        comboBox_4 = new JComboBox();
        comboBox_5 = new JComboBox();
        comboBox_6 = new JComboBox();
        comboBox_7 = new JComboBox();
        comboBox_8 = new JComboBox();
        comboBox_9 = new JComboBox();
        comboBox_10 = new JComboBox();
        comboBox_11 = new JComboBox();
        setTitle("SnackBar");
        setResizable(false);
        setDefaultCloseOperation(3);
        setBounds(100, 100, 1065, 1029);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.cyan);
        JLabel lblNewLabel = new JLabel("ADD SNACKS");
        lblNewLabel.setFont(new Font("Arial Black", 0, 18));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(450, 0, 134, 24);
        contentPane.add(lblNewLabel);
        JLabel lblNewLabel_1 = new JLabel("CHOOSE POPCORN FLAVOR");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Arial Black", 0, 18));
        lblNewLabel_1.setBounds(374, 37, 294, 31);
        contentPane.add(lblNewLabel_1);
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBorder(border);
        lblNewLabel_2.setIcon(new ImageIcon(workingDir+"\\bin\\src\\butter.png"));
        lblNewLabel_2.setBounds(35, 81, 214, 200);
        contentPane.add(lblNewLabel_2);
        JLabel label = new JLabel("New label");
        label.setBorder(border);
        label.setIcon(new ImageIcon(workingDir+"\\bin\\src\\cheesepopcorn.png"));
        label.setBounds(288, 81, 214, 200);
        contentPane.add(label);
        JLabel label_1 = new JLabel("New label");
        label_1.setBorder(border);
        label_1.setIcon(new ImageIcon(workingDir+"\\bin\\src\\caramel popcorn.png"));
        label_1.setBounds(546, 81, 214, 200);
        contentPane.add(label_1);
        JLabel label_2 = new JLabel("New label");
        label_2.setBorder(border);
        label_2.setIcon(new ImageIcon(workingDir+"\\bin\\src\\barbecue.png"));
        label_2.setBounds(800, 81, 214, 200);
        contentPane.add(label_2);
        JLabel lblChooseDrinks = new JLabel("CHOOSE SIDE DISH");
        lblChooseDrinks.setFont(new Font("Arial Black", 0, 18));
        lblChooseDrinks.setBackground(new Color(165, 42, 42));
        lblChooseDrinks.setForeground(new Color(255, 255, 255));
        lblChooseDrinks.setBounds(424, 344, 196, 22);
        contentPane.add(lblChooseDrinks);
        JLabel label_4 = new JLabel("New label");
        label_4.setBorder(border);
        label_4.setIcon(new ImageIcon(workingDir+"\\bin\\src\\applepie.png"));
        label_4.setBounds(35, 390, 214, 200);
        contentPane.add(label_4);
        JLabel label_5 = new JLabel("New label");
        label_5.setBorder(border);
        label_5.setIcon(new ImageIcon(workingDir+"\\bin\\src\\frenchfries.png"));
        label_5.setBounds(288, 390, 214, 200);
        contentPane.add(label_5);
        JLabel label_6 = new JLabel("New label");
        label_6.setBorder(border);
        label_6.setIcon(new ImageIcon(workingDir+"\\bin\\src\\onionr.png"));
        label_6.setBounds(546, 390, 214, 200);
        contentPane.add(label_6);
        JLabel label_7 = new JLabel("New label");
        label_7.setBorder(border);
        label_7.setIcon(new ImageIcon(workingDir+"\\bin\\src\\hotdog.png"));
        label_7.setBounds(800, 390, 214, 200);
        contentPane.add(label_7);
        JLabel lblChooseSideDish = new JLabel("CHOOSE DRINKS");
        lblChooseSideDish.setForeground(new Color(255, 255, 255));
        lblChooseSideDish.setFont(new Font("Arial Black", 0, 18));
        lblChooseSideDish.setBounds(439, 655, 234, 31);
        contentPane.add(lblChooseSideDish);
        JLabel label_9 = new JLabel("New label");
        label_9.setBorder(border);
        label_9.setIcon(new ImageIcon(workingDir+"\\bin\\src\\rootbeer.png"));
        label_9.setBounds(35, 699, 214, 200);
        contentPane.add(label_9);
        JLabel label_10 = new JLabel("New label");
        label_10.setBorder(border);
        label_10.setIcon(new ImageIcon(workingDir+"\\bin\\src\\ice tea.png"));
        label_10.setBounds(288, 699, 214, 200);
        contentPane.add(label_10);
        JLabel label_11 = new JLabel("New label");
        label_11.setBorder(border);
        label_11.setIcon(new ImageIcon(workingDir+"\\bin\\src\\applejuice.png"));
        label_11.setBounds(546, 699, 214, 200);
        contentPane.add(label_11);
        JLabel label_12 = new JLabel("New label");
        label_12.setBorder(border);
        label_12.setIcon(new ImageIcon(workingDir+"\\bin\\src\\water.png"));
        label_12.setBounds(800, 699, 214, 200);
        contentPane.add(label_12);
        btnNewButton = new JButton("I'M HUNGRY!");
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
            }

         
        });
        btnNewButton.setFont(new Font("Arial Black", 0, 16));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(165, 42, 42));
        btnNewButton.setBounds(544, 935, 150, 41);
        contentPane.add(btnNewButton);
        JButton btnCancel = new JButton("CANCEL");
        btnCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                comboBox.setSelectedIndex(0);
                comboBox_1.setSelectedIndex(0);
                comboBox_2.setSelectedIndex(0);
                comboBox_3.setSelectedIndex(0);
                comboBox_4.setSelectedIndex(0);
                comboBox_5.setSelectedIndex(0);
                comboBox_6.setSelectedIndex(0);
                comboBox_7.setSelectedIndex(0);
                comboBox_8.setSelectedIndex(0);
                comboBox_9.setSelectedIndex(0);
                comboBox_10.setSelectedIndex(0);
                comboBox_11.setSelectedIndex(0);
                setVisible(false);
            }

        });
        btnCancel.setFont(new Font("Arial Black", 0, 16));
        btnCancel.setForeground(new Color(255, 255, 255));
        btnCancel.setBackground(new Color(165, 42, 42));
        btnCancel.setBounds(367, 935, 150, 41);
        contentPane.add(btnCancel);
        comboBox = new JComboBox();
        comboBox.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

          
        });
        comboBox.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox.setForeground(new Color(255, 255, 255));
        comboBox.setBackground(new Color(165, 42, 42));
        comboBox.setBounds(71, 282, 89, 22);
        contentPane.add(comboBox);
        comboBox_1 = new JComboBox();
        comboBox_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

          
        });
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_1.setForeground(new Color(255, 255, 255));
        comboBox_1.setBackground(new Color(165, 42, 42));
        comboBox_1.setBounds(324, 282, 89, 22);
        contentPane.add(comboBox_1);
        comboBox_2 = new JComboBox();
        comboBox_2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

          
        });
        comboBox_2.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_2.setForeground(new Color(255, 255, 255));
        comboBox_2.setBackground(new Color(165, 42, 42));
        comboBox_2.setBounds(582, 282, 89, 22);
        contentPane.add(comboBox_2);
        comboBox_3 = new JComboBox();
        comboBox_3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

        
        });
        comboBox_3.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_3.setForeground(new Color(255, 255, 255));
        comboBox_3.setBackground(new Color(165, 42, 42));
        comboBox_3.setBounds(836, 282, 89, 22);
        contentPane.add(comboBox_3);
        comboBox_4 = new JComboBox();
        comboBox_4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

          
        });
        comboBox_4.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_4.setForeground(new Color(255, 255, 255));
        comboBox_4.setBackground(new Color(165, 42, 42));
        comboBox_4.setBounds(71, 592, 89, 22);
        contentPane.add(comboBox_4);
        comboBox_5 = new JComboBox();
        comboBox_5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

         
        });
        comboBox_5.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_5.setForeground(new Color(255, 255, 255));
        comboBox_5.setBackground(new Color(165, 42, 42));
        comboBox_5.setBounds(324, 592, 89, 22);
        contentPane.add(comboBox_5);
        comboBox_6 = new JComboBox();
        comboBox_6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

         
        });
        comboBox_6.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_6.setForeground(new Color(255, 255, 255));
        comboBox_6.setBackground(new Color(165, 42, 42));
        comboBox_6.setBounds(582, 592, 89, 22);
        contentPane.add(comboBox_6);
        comboBox_7 = new JComboBox();
        comboBox_7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

        });
        comboBox_7.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_7.setForeground(new Color(255, 255, 255));
        comboBox_7.setBackground(new Color(165, 42, 42));
        comboBox_7.setBounds(836, 592, 89, 22);
        contentPane.add(comboBox_7);
        comboBox_8 = new JComboBox();
        comboBox_8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

        });
        comboBox_8.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_8.setForeground(new Color(255, 255, 255));
        comboBox_8.setBackground(new Color(165, 42, 42));
        comboBox_8.setBounds(71, 900, 89, 22);
        contentPane.add(comboBox_8);
        comboBox_9 = new JComboBox();
        comboBox_9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

        });
        comboBox_9.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_9.setForeground(new Color(255, 255, 255));
        comboBox_9.setBackground(new Color(165, 42, 42));
        comboBox_9.setBounds(324, 900, 89, 22);
        contentPane.add(comboBox_9);
        comboBox_10 = new JComboBox();
        comboBox_10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

        });
        comboBox_10.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_10.setForeground(new Color(255, 255, 255));
        comboBox_10.setBackground(new Color(165, 42, 42));
        comboBox_10.setBounds(582, 900, 89, 22);
        contentPane.add(comboBox_10);
        comboBox_11 = new JComboBox();
        comboBox_11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                lblNewLabel_5.setText((new StringBuilder("P")).append(getTotal()).toString());
            }

          
        });
        comboBox_11.setModel(new DefaultComboBoxModel(new String[] {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "10"
        }));
        comboBox_11.setForeground(new Color(255, 255, 255));
        comboBox_11.setBackground(new Color(165, 42, 42));
        comboBox_11.setBounds(836, 900, 89, 22);
        contentPane.add(comboBox_11);
        JLabel lblNewLabel_4 = new JLabel("QTY.");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Arial Black", 0, 13));
        lblNewLabel_4.setBounds(163, 284, 72, 16);
        contentPane.add(lblNewLabel_4);
        JLabel label_3 = new JLabel("QTY.");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("Arial Black", 0, 13));
        label_3.setBounds(414, 285, 72, 16);
        contentPane.add(label_3);
        JLabel label_8 = new JLabel("QTY.");
        label_8.setForeground(Color.WHITE);
        label_8.setFont(new Font("Arial Black", 0, 13));
        label_8.setBounds(672, 285, 72, 16);
        contentPane.add(label_8);
        JLabel label_13 = new JLabel("QTY.");
        label_13.setForeground(Color.WHITE);
        label_13.setFont(new Font("Arial Black", 0, 13));
        label_13.setBounds(927, 285, 72, 16);
        contentPane.add(label_13);
        JLabel label_14 = new JLabel("QTY.");
        label_14.setForeground(Color.WHITE);
        label_14.setFont(new Font("Arial Black", 0, 13));
        label_14.setBounds(163, 595, 72, 16);
        contentPane.add(label_14);
        JLabel label_15 = new JLabel("QTY.");
        label_15.setForeground(Color.WHITE);
        label_15.setFont(new Font("Arial Black", 0, 13));
        label_15.setBounds(414, 595, 72, 16);
        contentPane.add(label_15);
        JLabel label_16 = new JLabel("QTY.");
        label_16.setForeground(Color.WHITE);
        label_16.setFont(new Font("Arial Black", 0, 13));
        label_16.setBounds(672, 595, 72, 16);
        contentPane.add(label_16);
        JLabel label_17 = new JLabel("QTY.");
        label_17.setForeground(Color.WHITE);
        label_17.setFont(new Font("Arial Black", 0, 13));
        label_17.setBounds(927, 595, 72, 16);
        contentPane.add(label_17);
        JLabel label_18 = new JLabel("QTY.");
        label_18.setForeground(Color.WHITE);
        label_18.setFont(new Font("Arial Black", 0, 13));
        label_18.setBounds(927, 903, 72, 16);
        contentPane.add(label_18);
        JLabel label_19 = new JLabel("QTY.");
        label_19.setForeground(Color.WHITE);
        label_19.setFont(new Font("Arial Black", 0, 13));
        label_19.setBounds(672, 903, 72, 16);
        contentPane.add(label_19);
        JLabel label_20 = new JLabel("QTY.");
        label_20.setForeground(Color.WHITE);
        label_20.setFont(new Font("Arial Black", 0, 13));
        label_20.setBounds(414, 903, 72, 16);
        contentPane.add(label_20);
        JLabel label_21 = new JLabel("QTY.");
        label_21.setForeground(Color.WHITE);
        label_21.setFont(new Font("Arial Black", 0, 13));
        label_21.setBounds(163, 903, 72, 16);
        contentPane.add(label_21);
        lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setFont(new Font("Arial Black", 0, 16));
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setBounds(937, 941, 114, 28);
        contentPane.add(lblNewLabel_5);
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setFont(new Font("Arial Black", 0, 18));
        lblNewLabel_3.setIcon(new ImageIcon(workingDir+"\\bin\\src\\bg4.png"));
        lblNewLabel_3.setBounds(0, -25, 1054, 1024);
        contentPane.add(lblNewLabel_3);
    }

    public int getTotal()
    {
        int temp = comboBox.getSelectedIndex() * 70 + comboBox_1.getSelectedIndex() * 76 + comboBox_2.getSelectedIndex() * 88 + comboBox_3.getSelectedIndex() * 82 + comboBox_4.getSelectedIndex() * 36 + comboBox_5.getSelectedIndex() * 56 + comboBox_6.getSelectedIndex() * 64 + comboBox_7.getSelectedIndex() * 28 + comboBox_8.getSelectedIndex() * 32 + comboBox_9.getSelectedIndex() * 25 + comboBox_10.getSelectedIndex() * 25 + comboBox_11.getSelectedIndex() * 20;
        return temp;
    }

    public String getOrder()
    {
        String temp = "<html>Snacks:<br>";
        if(comboBox.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox.getSelectedIndex()).append(" Better Butter PopCorn").append("<br>").toString();
        if(comboBox_1.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_1.getSelectedIndex()).append(" Cheese Louise PopCorn\n").append("<br>").toString();
        if(comboBox_2.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_2.getSelectedIndex()).append(" Caramelts In Your Heart PopCorn<br>").toString();
        if(comboBox_3.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_3.getSelectedIndex()).append(" Barbecute PopCorn<br>").toString();
        if(comboBox_4.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_4.getSelectedIndex()).append(" Life Of Pie(Apple)<br>").toString();
        if(comboBox_5.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_5.getSelectedIndex()).append(" French-FRise Of The Guardians<br>").toString();
        if(comboBox_6.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_6.getSelectedIndex()).append(" Lord Of The Onion Rings<br>").toString();
        if(comboBox_7.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_7.getSelectedIndex()).append(" Hot(el for) Dog<br>").toString();
        if(comboBox_8.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_8.getSelectedIndex()).append(" RootBeer<br>").toString();
        if(comboBox_9.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_9.getSelectedIndex()).append(" Iced Tea<br>").toString();
        if(comboBox_10.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_10.getSelectedIndex()).append(" Too Late To Apple-o-Juice<br>").toString();
        if(comboBox_11.getSelectedIndex() > 0)
            temp = (new StringBuilder(String.valueOf(temp))).append(comboBox_11.getSelectedIndex()).append(" Water You Waiting For</html>").toString();
        return temp;
    }

    private JPanel contentPane;
    private JComboBox comboBox;
    private JComboBox comboBox_1;
    private JComboBox comboBox_2;
    private JComboBox comboBox_3;
    private JComboBox comboBox_4;
    private JComboBox comboBox_5;
    private JComboBox comboBox_6;
    private JComboBox comboBox_7;
    private JComboBox comboBox_8;
    private JComboBox comboBox_9;
    private JComboBox comboBox_10;
    private JComboBox comboBox_11;
    private JLabel lblNewLabel_5;
    JButton btnNewButton;













}
