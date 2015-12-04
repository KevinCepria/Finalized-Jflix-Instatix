// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ViewSnackBar.java

package src.cpeprog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

// Referenced classes of package src.cpeprog:
//            Menu

public class ViewSnackBar extends Menu
{
	String workingDir = System.getProperty("user.dir");
    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try
                {
                    ViewSnackBar frame = new ViewSnackBar();
                    frame.setVisible(true);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }

        });
    }

    public ViewSnackBar()
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
        JLabel lblNewLabel_1 = new JLabel("POPCORN FLAVORS");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Arial Black", 0, 18));
        lblNewLabel_1.setBounds(416, 37, 294, 31);
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
        JLabel lblChooseDrinks = new JLabel("SIDE DISHES");
        lblChooseDrinks.setFont(new Font("Arial Black", 0, 18));
        lblChooseDrinks.setBackground(new Color(165, 42, 42));
        lblChooseDrinks.setForeground(new Color(255, 255, 255));
        lblChooseDrinks.setBounds(450, 328, 196, 22);
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
        JLabel lblChooseSideDish = new JLabel("DRINKS");
        lblChooseSideDish.setForeground(new Color(255, 255, 255));
        lblChooseSideDish.setFont(new Font("Arial Black", 0, 18));
        lblChooseSideDish.setBounds(476, 638, 234, 31);
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
        btnNewButton = new JButton("DONE");
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
                ViewSnackBar.b.setVisible(true);
            }

          
        });
        btnNewButton.setFont(new Font("Arial Black", 0, 16));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(165, 42, 42));
        btnNewButton.setBounds(449, 935, 150, 41);
        contentPane.add(btnNewButton);
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setFont(new Font("Arial Black", 0, 18));
        lblNewLabel_3.setIcon(new ImageIcon(workingDir+"\\bin\\src\\bg4.png"));
        lblNewLabel_3.setBounds(0, -25, 1054, 1024);
        contentPane.add(lblNewLabel_3);
    }

    private static final long serialVersionUID = 1L;
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
    JButton btnNewButton;
}
