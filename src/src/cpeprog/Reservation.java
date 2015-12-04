// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Reservation.java

package src.cpeprog;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// Referenced classes of package src.cpeprog:
//            Menu, Confirmation, MovieSelect2

public class Reservation extends Menu
{
	String workingDir = System.getProperty("user.dir");
    public Reservation()
    {
        res = new ArrayList();
        initialize();
    }

    public int getseatcount()
    {
        int seatcount = Integer.parseInt(textField_2.getText());
        int availableseats = Integer.parseInt(textField_1.getText());
        seatcount -= availableseats;
        textField_2.setText((new StringBuilder()).append(seatcount).toString());
        return seatcount;
    }

    private void initialize()
    {
        frmSeatReservation = new JFrame();
        frmSeatReservation.setBackground(new Color(165, 42, 42));
        frmSeatReservation.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Clamor\\Desktop\\download.jpg"));
        frmSeatReservation.getContentPane().setBackground(new Color(240, 240, 240));
        frmSeatReservation.setTitle("Seat Reservation");
        frmSeatReservation.setBounds(100, 100, 953, 466);
        frmSeatReservation.setDefaultCloseOperation(3);
        frmSeatReservation.getContentPane().setLayout(null);
        final JButton A31 = new JButton("A6");
        A31.setFont(new Font("Tahoma", 0, 10));
        A31.setForeground(Color.BLUE);
        final JButton A32 = new JButton("A7");
        A32.setFont(new Font("Tahoma", 0, 10));
        A32.setForeground(Color.BLUE);
        final JButton A33 = new JButton("A8");
        A33.setFont(new Font("Tahoma", 0, 10));
        A33.setForeground(Color.BLUE);
        final JButton A34 = new JButton("A9");
        A34.setFont(new Font("Tahoma", 0, 10));
        A34.setForeground(Color.BLUE);
        final JButton A35 = new JButton("A10");
        A35.setFont(new Font("Tahoma", 0, 10));
        A35.setForeground(Color.BLUE);
        final JButton A36 = new JButton("B6");
        A36.setFont(new Font("Tahoma", 0, 10));
        A36.setForeground(Color.BLUE);
        final JButton A37 = new JButton("B7");
        A37.setFont(new Font("Tahoma", 0, 10));
        A37.setForeground(Color.BLUE);
        final JButton A38 = new JButton("B8");
        A38.setFont(new Font("Tahoma", 0, 10));
        A38.setForeground(Color.BLUE);
        final JButton A39 = new JButton("B9");
        A39.setFont(new Font("Tahoma", 0, 10));
        A39.setForeground(Color.BLUE);
        final JButton A40 = new JButton("B10");
        A40.setFont(new Font("Tahoma", 0, 10));
        A40.setForeground(Color.BLUE);
        final JButton A41 = new JButton("C6");
        A41.setFont(new Font("Tahoma", 0, 10));
        A41.setForeground(Color.BLUE);
        final JButton A42 = new JButton("C7");
        A42.setFont(new Font("Tahoma", 0, 10));
        A42.setForeground(Color.BLUE);
        final JButton A43 = new JButton("C8");
        A43.setFont(new Font("Tahoma", 0, 10));
        A43.setForeground(Color.BLUE);
        final JButton A44 = new JButton("C9");
        A44.setFont(new Font("Tahoma", 0, 10));
        A44.setForeground(Color.BLUE);
        final JButton A45 = new JButton("C10");
        A45.setFont(new Font("Tahoma", 0, 10));
        A45.setForeground(Color.BLUE);
        final JButton A46 = new JButton("D6");
        A46.setFont(new Font("Tahoma", 0, 10));
        A46.setForeground(Color.BLUE);
        final JButton A47 = new JButton("D7");
        A47.setFont(new Font("Tahoma", 0, 10));
        A47.setForeground(Color.BLUE);
        final JButton A48 = new JButton("D8");
        A48.setFont(new Font("Tahoma", 0, 10));
        A48.setForeground(Color.BLUE);
        final JButton A49 = new JButton("D9");
        A49.setFont(new Font("Tahoma", 0, 10));
        A49.setForeground(Color.BLUE);
        final JButton A50 = new JButton("D10");
        A50.setFont(new Font("Tahoma", 0, 10));
        A50.setForeground(Color.BLUE);
        final JButton A51 = new JButton("E6");
        A51.setFont(new Font("Tahoma", 0, 10));
        A51.setForeground(Color.BLUE);
        final JButton A52 = new JButton("E7");
        A52.setFont(new Font("Tahoma", 0, 10));
        A52.setForeground(Color.BLUE);
        final JButton A53 = new JButton("E8");
        A53.setFont(new Font("Tahoma", 0, 10));
        A53.setForeground(Color.BLUE);
        final JButton A54 = new JButton("E9");
        A54.setFont(new Font("Tahoma", 0, 10));
        A54.setForeground(Color.BLUE);
        final JButton A55 = new JButton("E10");
        A55.setFont(new Font("Tahoma", 0, 10));
        A55.setForeground(Color.BLUE);
        final JButton A56 = new JButton("F6");
        A56.setFont(new Font("Tahoma", 0, 10));
        A56.setForeground(Color.BLUE);
        final JButton A57 = new JButton("F7");
        A57.setFont(new Font("Tahoma", 0, 10));
        A57.setForeground(Color.BLUE);
        final JButton A58 = new JButton("F8");
        A58.setFont(new Font("Tahoma", 0, 10));
        A58.setForeground(Color.BLUE);
        final JButton A59 = new JButton("F9");
        A59.setFont(new Font("Tahoma", 0, 10));
        A59.setForeground(Color.BLUE);
        final JButton A60 = new JButton("F10");
        A60.setFont(new Font("Tahoma", 0, 10));
        A60.setForeground(Color.BLUE);
        final JButton A61 = new JButton("A11");
        A61.setFont(new Font("Tahoma", 0, 10));
        A61.setForeground(Color.BLUE);
        final JButton A62 = new JButton("A12");
        A62.setFont(new Font("Tahoma", 0, 10));
        A62.setForeground(Color.BLUE);
        final JButton A63 = new JButton("A13");
        A63.setFont(new Font("Tahoma", 0, 10));
        A63.setForeground(Color.BLUE);
        final JButton A64 = new JButton("A14");
        A64.setFont(new Font("Tahoma", 0, 10));
        A64.setForeground(Color.BLUE);
        final JButton A65 = new JButton("A15");
        A65.setFont(new Font("Tahoma", 0, 10));
        A65.setForeground(Color.BLUE);
        final JButton A66 = new JButton("B11");
        A66.setFont(new Font("Tahoma", 0, 10));
        A66.setForeground(Color.BLUE);
        final JButton A67 = new JButton("B12");
        A67.setFont(new Font("Tahoma", 0, 10));
        A67.setForeground(Color.BLUE);
        final JButton A68 = new JButton("B13");
        A68.setFont(new Font("Tahoma", 0, 10));
        A68.setForeground(Color.BLUE);
        final JButton A69 = new JButton("B14");
        A69.setFont(new Font("Tahoma", 0, 10));
        A69.setForeground(Color.BLUE);
        final JButton A70 = new JButton("B15");
        A70.setFont(new Font("Tahoma", 0, 10));
        A70.setForeground(Color.BLUE);
        final JButton A71 = new JButton("C11");
        A71.setFont(new Font("Tahoma", 0, 10));
        A71.setForeground(Color.BLUE);
        final JButton A72 = new JButton("C12");
        A72.setFont(new Font("Tahoma", 0, 10));
        A72.setForeground(Color.BLUE);
        final JButton A73 = new JButton("C13");
        A73.setFont(new Font("Tahoma", 0, 10));
        A73.setForeground(Color.BLUE);
        final JButton A74 = new JButton("C14");
        A74.setFont(new Font("Tahoma", 0, 10));
        A74.setForeground(Color.BLUE);
        final JButton A75 = new JButton("C15");
        A75.setFont(new Font("Tahoma", 0, 10));
        A75.setForeground(Color.BLUE);
        final JButton A76 = new JButton("D11");
        A76.setFont(new Font("Tahoma", 0, 10));
        A76.setForeground(Color.BLUE);
        final JButton A77 = new JButton("D12");
        A77.setFont(new Font("Tahoma", 0, 10));
        A77.setForeground(Color.BLUE);
        final JButton A78 = new JButton("D13");
        A78.setFont(new Font("Tahoma", 0, 10));
        A78.setForeground(Color.BLUE);
        final JButton A79 = new JButton("D14");
        A79.setFont(new Font("Tahoma", 0, 10));
        A79.setForeground(Color.BLUE);
        final JButton A80 = new JButton("D15");
        A80.setFont(new Font("Tahoma", 0, 10));
        A80.setForeground(Color.BLUE);
        final JButton A81 = new JButton("E11");
        A81.setFont(new Font("Tahoma", 0, 10));
        A81.setForeground(Color.BLUE);
        final JButton A82 = new JButton("E12");
        A82.setFont(new Font("Tahoma", 0, 10));
        A82.setForeground(Color.BLUE);
        final JButton A83 = new JButton("E13");
        A83.setFont(new Font("Tahoma", 0, 10));
        A83.setForeground(Color.BLUE);
        final JButton A84 = new JButton("E14");
        A84.setFont(new Font("Tahoma", 0, 10));
        A84.setForeground(Color.BLUE);
        final JButton A85 = new JButton("E15");
        A85.setForeground(Color.BLUE);
        A85.setFont(new Font("Tahoma", 0, 10));
        final JButton A86 = new JButton("F11");
        A86.setFont(new Font("Tahoma", 0, 10));
        A86.setForeground(Color.BLUE);
        final JButton A87 = new JButton("F12");
        A87.setFont(new Font("Tahoma", 0, 10));
        A87.setForeground(Color.BLUE);
        final JButton A88 = new JButton("F13");
        A88.setFont(new Font("Tahoma", 0, 10));
        A88.setForeground(Color.BLUE);
        final JButton A89 = new JButton("F14");
        A89.setFont(new Font("Tahoma", 0, 10));
        A89.setForeground(Color.BLUE);
        final JButton A90 = new JButton("F15");
        A90.setFont(new Font("Tahoma", 0, 10));
        A90.setForeground(Color.BLUE);
        A0 = new JButton("A1");
        A0.setForeground(Color.BLUE);
        A0.setFont(new Font("Tahoma", 0, 10));
        A0.setBackground(Color.GREEN);
        A0.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A0.getBackground() == Color.GREEN)
                    {
                        A0.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A0.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A0.setBounds(7, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A0);
        final JButton A1 = new JButton("A2");
        A1.setFont(new Font("Tahoma", 0, 10));
        A1.setForeground(Color.BLUE);
        A1.setBackground(Color.GREEN);
        A1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A1.getBackground() == Color.GREEN)
                    {
                        A1.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A1.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A1.setBounds(61, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A1);
        A2 = new JButton("A3");
        A2.setFont(new Font("Tahoma", 0, 10));
        A2.setForeground(Color.BLUE);
        A2.setBackground(Color.GREEN);
        A2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A2.getBackground() == Color.GREEN)
                    {
                        A2.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A2.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A2.setBounds(115, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A2);
        A3 = new JButton("A4");
        A3.setFont(new Font("Tahoma", 0, 10));
        A3.setForeground(Color.BLUE);
        A3.setBackground(Color.GREEN);
        A3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A3.getBackground() == Color.GREEN)
                    {
                        A3.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A3.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        
        });
        A3.setBounds(169, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A3);
        A4 = new JButton("A5");
        A4.setFont(new Font("Tahoma", 0, 10));
        A4.setForeground(Color.BLUE);
        A4.setBackground(Color.GREEN);
        A4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A4.getBackground() == Color.GREEN)
                    {
                        A4.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A4.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A4.setBounds(223, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A4);
        A6 = new JButton("B1");
        A6.setFont(new Font("Tahoma", 0, 10));
        A6.setForeground(Color.BLUE);
        A6.setBackground(Color.GREEN);
        A6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A6.getBackground() == Color.GREEN)
                    {
                        A6.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A6.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A6.setBounds(7, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A6);
        A7 = new JButton("B2");
        A7.setFont(new Font("Tahoma", 0, 10));
        A7.setForeground(Color.BLUE);
        A7.setBackground(Color.GREEN);
        A7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A7.getBackground() == Color.GREEN)
                    {
                        A7.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A7.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A7.setBounds(61, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A7);
        A8 = new JButton("B3");
        A8.setFont(new Font("Tahoma", 0, 10));
        A8.setForeground(Color.BLUE);
        A8.setBackground(Color.GREEN);
        A8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A8.getBackground() == Color.GREEN)
                    {
                        A8.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A8.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A8.setBounds(115, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A8);
        A9 = new JButton("B4");
        A9.setFont(new Font("Tahoma", 0, 10));
        A9.setForeground(Color.BLUE);
        A9.setBackground(Color.GREEN);
        A9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A9.getBackground() == Color.GREEN)
                    {
                        A9.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A9.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A9.setBounds(169, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A9);
        A10 = new JButton("B5");
        A10.setFont(new Font("Tahoma", 0, 10));
        A10.setForeground(Color.BLUE);
        A10.setBackground(Color.GREEN);
        A10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A10.getBackground() == Color.GREEN)
                    {
                        A10.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A10.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A10.setBounds(223, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A10);
        A11 = new JButton("C1");
        A11.setFont(new Font("Tahoma", 0, 10));
        A11.setForeground(Color.BLUE);
        A11.setBackground(Color.GREEN);
        A11.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A11.getBackground() == Color.GREEN)
                    {
                        A11.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A11.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A11.setBounds(7, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A11);
        A12 = new JButton("C2");
        A12.setFont(new Font("Tahoma", 0, 10));
        A12.setForeground(Color.BLUE);
        A12.setBackground(Color.GREEN);
        A12.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A12.getBackground() == Color.GREEN)
                    {
                        A12.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A12.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A12.setBounds(61, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A12);
        A13 = new JButton("C3");
        A13.setFont(new Font("Tahoma", 0, 10));
        A13.setForeground(Color.BLUE);
        A13.setBackground(Color.GREEN);
        A13.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A13.getBackground() == Color.GREEN)
                    {
                        A13.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A13.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A13.setBounds(115, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A13);
        A14 = new JButton("C4");
        A14.setFont(new Font("Tahoma", 0, 10));
        A14.setForeground(Color.BLUE);
        A14.setBackground(Color.GREEN);
        A14.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A14.getBackground() == Color.GREEN)
                    {
                        A14.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A14.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A14.setBounds(169, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A14);
        A15 = new JButton("C5");
        A15.setFont(new Font("Tahoma", 0, 10));
        A15.setForeground(Color.BLUE);
        A15.setBackground(Color.GREEN);
        A15.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A15.getBackground() == Color.GREEN)
                    {
                        A15.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A15.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A15.setBounds(223, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A15);
        A20 = new JButton("D5");
        A20.setFont(new Font("Tahoma", 0, 10));
        A20.setForeground(Color.BLUE);
        A20.setBackground(Color.GREEN);
        A20.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A20.getBackground() == Color.GREEN)
                    {
                        A20.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A20.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

            
        });
        A20.setBounds(223, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A20);
        A19 = new JButton("D4");
        A19.setFont(new Font("Tahoma", 0, 10));
        A19.setForeground(Color.BLUE);
        A19.setBackground(Color.GREEN);
        A19.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A19.getBackground() == Color.GREEN)
                    {
                        A19.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A19.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A19.setBounds(169, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A19);
        A18 = new JButton("D3");
        A18.setFont(new Font("Tahoma", 0, 10));
        A18.setForeground(Color.BLUE);
        A18.setBackground(Color.GREEN);
        A18.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A18.getBackground() == Color.GREEN)
                    {
                        A18.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A18.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A18.setBounds(115, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A18);
        A17 = new JButton("D2");
        A17.setFont(new Font("Tahoma", 0, 10));
        A17.setForeground(Color.BLUE);
        A17.setBackground(Color.GREEN);
        A17.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A17.getBackground() == Color.GREEN)
                    {
                        A17.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A17.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

            
        });
        A17.setBounds(61, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A17);
        A16 = new JButton("D1");
        A16.setFont(new Font("Tahoma", 0, 10));
        A16.setForeground(Color.BLUE);
        A16.setBackground(Color.GREEN);
        A16.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A16.getBackground() == Color.GREEN)
                    {
                        A16.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A16.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A16.setBounds(7, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A16);
        A25 = new JButton("E5");
        A25.setFont(new Font("Tahoma", 0, 10));
        A25.setForeground(Color.BLUE);
        A25.setBackground(Color.GREEN);
        A25.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A25.getBackground() == Color.GREEN)
                    {
                        A25.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A25.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A25.setBounds(223, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A25);
        A24 = new JButton("E4");
        A24.setFont(new Font("Tahoma", 0, 10));
        A24.setForeground(Color.BLUE);
        A24.setBackground(Color.GREEN);
        A24.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A24.getBackground() == Color.GREEN)
                    {
                        A24.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A24.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A24.setBounds(169, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A24);
        A23 = new JButton("E3");
        A23.setFont(new Font("Tahoma", 0, 10));
        A23.setForeground(Color.BLUE);
        A23.setBackground(Color.GREEN);
        A23.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A23.getBackground() == Color.GREEN)
                    {
                        A23.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A23.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A23.setBounds(115, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A23);
        A22 = new JButton("E2");
        A22.setFont(new Font("Tahoma", 0, 10));
        A22.setForeground(Color.BLUE);
        A22.setBackground(Color.GREEN);
        A22.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A22.getBackground() == Color.GREEN)
                    {
                        A22.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A22.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A22.setBounds(61, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A22);
        A21 = new JButton("E1");
        A21.setFont(new Font("Tahoma", 0, 10));
        A21.setForeground(Color.BLUE);
        A21.setBackground(Color.GREEN);
        A21.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A21.getBackground() == Color.GREEN)
                    {
                        A21.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A21.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A21.setBounds(7, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A21);
        A30 = new JButton("F5");
        A30.setFont(new Font("Tahoma", 0, 10));
        A30.setForeground(Color.BLUE);
        A30.setBackground(Color.GREEN);
        A30.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A30.getBackground() == Color.GREEN)
                    {
                        A30.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A30.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A30.setBounds(223, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A30);
        A29 = new JButton("F4");
        A29.setFont(new Font("Tahoma", 0, 10));
        A29.setForeground(Color.BLUE);
        A29.setBackground(Color.GREEN);
        A29.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A29.getBackground() == Color.GREEN)
                    {
                        A29.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A29.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A29.setBounds(169, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A29);
        A28 = new JButton("F3");
        A28.setFont(new Font("Tahoma", 0, 10));
        A28.setForeground(Color.BLUE);
        A28.setBackground(Color.GREEN);
        A28.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A28.getBackground() == Color.GREEN)
                    {
                        A28.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A28.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A28.setBounds(115, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A28);
        A27 = new JButton("F2");
        A27.setFont(new Font("Tahoma", 0, 10));
        A27.setForeground(Color.BLUE);
        A27.setBackground(Color.GREEN);
        A27.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A27.getBackground() == Color.GREEN)
                    {
                        A27.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A27.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A27.setBounds(61, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A27);
        A26 = new JButton("F1");
        A26.setFont(new Font("Tahoma", 0, 10));
        A26.setForeground(Color.BLUE);
        A26.setBackground(Color.GREEN);
        A26.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A26.getBackground() == Color.GREEN)
                    {
                        A26.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A26.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A26.setBounds(7, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A26);
        btnReceipt = new JButton("Receipt");
        btnReceipt.setForeground(new Color(255, 255, 255));
        btnReceipt.setBackground(new Color(165, 42, 42));
        btnReceipt.setFont(new Font("Arial Black", 0, 16));
        btnReceipt.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
                throws NumberFormatException
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    String a = "Cannot issue receipt. You still have reservation counters.";
                    JOptionPane.showMessageDialog(null, a, "", 0);
                } else
                if(Integer.parseInt(textField_1.getText()) == 0)
                {
                    String w = "You haven't reserve a seat/s yet. Please reserve at least one for a receipt to be issued.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                } else
                {
                    try
                    {
                        String a = JOptionPane.showInputDialog("How many regulars?");
                        String b = JOptionPane.showInputDialog("How many seniors?");
                        a1 = Integer.parseInt(a);
                        b1 = Integer.parseInt(b);
                        if(a1 < 0 || b1 < 0)
                        {
                            String c = "Must be zero or higher!";
                            JOptionPane.showMessageDialog(null, c, "", 0);
                        } else
                        {
                            c1 = Integer.parseInt(textField_1.getText());
                            if(c1 != a1 + b1)
                            {
                                String c = "Receipt cannot be issued because\nthe total number of seats reserved is not equal\nto the total number of regulars and seniors.";
                                JOptionPane.showMessageDialog(null, c, "", 0);
                            } else
                            if(c1 == a1 + b1)
                            {
                                getseatcount();
                                d1 = a1 * 250;
                                e1 = b1 * 200;
                                total = d1 + e1;
                                if(A0.getBackground() == Color.RED)
                                    res.add(A0.getText());
                                if(A1.getBackground() == Color.RED)
                                    res.add(A1.getText());
                                if(A2.getBackground() == Color.RED)
                                    res.add(A2.getText());
                                if(A3.getBackground() == Color.RED)
                                    res.add(A3.getText());
                                if(A4.getBackground() == Color.RED)
                                    res.add(A4.getText());
                                if(A6.getBackground() == Color.RED)
                                    res.add(A6.getText());
                                if(A7.getBackground() == Color.RED)
                                    res.add(A7.getText());
                                if(A8.getBackground() == Color.RED)
                                    res.add(A8.getText());
                                if(A9.getBackground() == Color.RED)
                                    res.add(A9.getText());
                                if(A10.getBackground() == Color.RED)
                                    res.add(A10.getText());
                                if(A11.getBackground() == Color.RED)
                                    res.add(A11.getText());
                                if(A12.getBackground() == Color.RED)
                                    res.add(A12.getText());
                                if(A13.getBackground() == Color.RED)
                                    res.add(A13.getText());
                                if(A14.getBackground() == Color.RED)
                                    res.add(A14.getText());
                                if(A15.getBackground() == Color.RED)
                                    res.add(A15.getText());
                                if(A16.getBackground() == Color.RED)
                                    res.add(A16.getText());
                                if(A17.getBackground() == Color.RED)
                                    res.add(A17.getText());
                                if(A18.getBackground() == Color.RED)
                                    res.add(A18.getText());
                                if(A19.getBackground() == Color.RED)
                                    res.add(A19.getText());
                                if(A20.getBackground() == Color.RED)
                                    res.add(A20.getText());
                                if(A21.getBackground() == Color.RED)
                                    res.add(A21.getText());
                                if(A22.getBackground() == Color.RED)
                                    res.add(A22.getText());
                                if(A23.getBackground() == Color.RED)
                                    res.add(A23.getText());
                                if(A24.getBackground() == Color.RED)
                                    res.add(A24.getText());
                                if(A25.getBackground() == Color.RED)
                                    res.add(A25.getText());
                                if(A26.getBackground() == Color.RED)
                                    res.add(A26.getText());
                                if(A27.getBackground() == Color.RED)
                                    res.add(A27.getText());
                                if(A28.getBackground() == Color.RED)
                                    res.add(A28.getText());
                                if(A29.getBackground() == Color.RED)
                                    res.add(A29.getText());
                                if(A30.getBackground() == Color.RED)
                                    res.add(A30.getText());
                                if(A31.getBackground() == Color.RED)
                                    res.add(A31.getText());
                                if(A32.getBackground() == Color.RED)
                                    res.add(A32.getText());
                                if(A33.getBackground() == Color.RED)
                                    res.add(A33.getText());
                                if(A34.getBackground() == Color.RED)
                                    res.add(A34.getText());
                                if(A35.getBackground() == Color.RED)
                                    res.add(A35.getText());
                                if(A36.getBackground() == Color.RED)
                                    res.add(A36.getText());
                                if(A37.getBackground() == Color.RED)
                                    res.add(A37.getText());
                                if(A38.getBackground() == Color.RED)
                                    res.add(A38.getText());
                                if(A39.getBackground() == Color.RED)
                                    res.add(A39.getText());
                                if(A40.getBackground() == Color.RED)
                                    res.add(A40.getText());
                                if(A41.getBackground() == Color.RED)
                                    res.add(A41.getText());
                                if(A42.getBackground() == Color.RED)
                                    res.add(A42.getText());
                                if(A43.getBackground() == Color.RED)
                                    res.add(A43.getText());
                                if(A44.getBackground() == Color.RED)
                                    res.add(A44.getText());
                                if(A45.getBackground() == Color.RED)
                                    res.add(A45.getText());
                                if(A46.getBackground() == Color.RED)
                                    res.add(A46.getText());
                                if(A47.getBackground() == Color.RED)
                                    res.add(A47.getText());
                                if(A48.getBackground() == Color.RED)
                                    res.add(A48.getText());
                                if(A49.getBackground() == Color.RED)
                                    res.add(A49.getText());
                                if(A50.getBackground() == Color.RED)
                                    res.add(A50.getText());
                                if(A51.getBackground() == Color.RED)
                                    res.add(A51.getText());
                                if(A52.getBackground() == Color.RED)
                                    res.add(A52.getText());
                                if(A53.getBackground() == Color.RED)
                                    res.add(A53.getText());
                                if(A54.getBackground() == Color.RED)
                                    res.add(A54.getText());
                                if(A55.getBackground() == Color.RED)
                                    res.add(A55.getText());
                                if(A56.getBackground() == Color.RED)
                                    res.add(A56.getText());
                                if(A57.getBackground() == Color.RED)
                                    res.add(A57.getText());
                                if(A58.getBackground() == Color.RED)
                                    res.add(A58.getText());
                                if(A59.getBackground() == Color.RED)
                                    res.add(A59.getText());
                                if(A60.getBackground() == Color.RED)
                                    res.add(A60.getText());
                                if(A61.getBackground() == Color.RED)
                                    res.add(A61.getText());
                                if(A62.getBackground() == Color.RED)
                                    res.add(A62.getText());
                                if(A63.getBackground() == Color.RED)
                                    res.add(A63.getText());
                                if(A64.getBackground() == Color.RED)
                                    res.add(A64.getText());
                                if(A65.getBackground() == Color.RED)
                                    res.add(A65.getText());
                                if(A66.getBackground() == Color.RED)
                                    res.add(A66.getText());
                                if(A67.getBackground() == Color.RED)
                                    res.add(A67.getText());
                                if(A68.getBackground() == Color.RED)
                                    res.add(A68.getText());
                                if(A69.getBackground() == Color.RED)
                                    res.add(A69.getText());
                                if(A70.getBackground() == Color.RED)
                                    res.add(A70.getText());
                                if(A71.getBackground() == Color.RED)
                                    res.add(A71.getText());
                                if(A72.getBackground() == Color.RED)
                                    res.add(A72.getText());
                                if(A73.getBackground() == Color.RED)
                                    res.add(A73.getText());
                                if(A74.getBackground() == Color.RED)
                                    res.add(A74.getText());
                                if(A75.getBackground() == Color.RED)
                                    res.add(A75.getText());
                                if(A76.getBackground() == Color.RED)
                                    res.add(A76.getText());
                                if(A77.getBackground() == Color.RED)
                                    res.add(A77.getText());
                                if(A78.getBackground() == Color.RED)
                                    res.add(A78.getText());
                                if(A79.getBackground() == Color.RED)
                                    res.add(A79.getText());
                                if(A80.getBackground() == Color.RED)
                                    res.add(A80.getText());
                                if(A81.getBackground() == Color.RED)
                                    res.add(A81.getText());
                                if(A82.getBackground() == Color.RED)
                                    res.add(A82.getText());
                                if(A83.getBackground() == Color.RED)
                                    res.add(A83.getText());
                                if(A84.getBackground() == Color.RED)
                                    res.add(A84.getText());
                                if(A85.getBackground() == Color.RED)
                                    res.add(A85.getText());
                                if(A86.getBackground() == Color.RED)
                                    res.add(A86.getText());
                                if(A87.getBackground() == Color.RED)
                                    res.add(A87.getText());
                                if(A88.getBackground() == Color.RED)
                                    res.add(A88.getText());
                                if(A89.getBackground() == Color.RED)
                                    res.add(A89.getText());
                                if(A90.getBackground() == Color.RED)
                                    res.add(A90.getText());
                                sample = new Confirmation();
                                sample.setVisible(true);
                                sample.btnNewButton.addActionListener(new ActionListener() {

                                    public void actionPerformed(ActionEvent e)
                                    {
                                        res.removeAll(res);
                                        textField_1.setText("0");
                                        if(A0.getBackground() == Color.RED)
                                            A0.setBackground(Color.YELLOW);
                                        if(A1.getBackground() == Color.RED)
                                            A1.setBackground(Color.YELLOW);
                                        if(A2.getBackground() == Color.RED)
                                            A2.setBackground(Color.YELLOW);
                                        if(A3.getBackground() == Color.RED)
                                            A3.setBackground(Color.YELLOW);
                                        if(A4.getBackground() == Color.RED)
                                            A4.setBackground(Color.YELLOW);
                                        if(A6.getBackground() == Color.RED)
                                            A6.setBackground(Color.YELLOW);
                                        if(A7.getBackground() == Color.RED)
                                            A7.setBackground(Color.YELLOW);
                                        if(A8.getBackground() == Color.RED)
                                            A8.setBackground(Color.YELLOW);
                                        if(A9.getBackground() == Color.RED)
                                            A9.setBackground(Color.YELLOW);
                                        if(A10.getBackground() == Color.RED)
                                            A10.setBackground(Color.YELLOW);
                                        if(A11.getBackground() == Color.RED)
                                            A11.setBackground(Color.YELLOW);
                                        if(A12.getBackground() == Color.RED)
                                            A12.setBackground(Color.YELLOW);
                                        if(A13.getBackground() == Color.RED)
                                            A13.setBackground(Color.YELLOW);
                                        if(A14.getBackground() == Color.RED)
                                            A14.setBackground(Color.YELLOW);
                                        if(A15.getBackground() == Color.RED)
                                            A15.setBackground(Color.YELLOW);
                                        if(A16.getBackground() == Color.RED)
                                            A16.setBackground(Color.YELLOW);
                                        if(A17.getBackground() == Color.RED)
                                            A17.setBackground(Color.YELLOW);
                                        if(A18.getBackground() == Color.RED)
                                            A18.setBackground(Color.YELLOW);
                                        if(A19.getBackground() == Color.RED)
                                            A19.setBackground(Color.YELLOW);
                                        if(A20.getBackground() == Color.RED)
                                            A20.setBackground(Color.YELLOW);
                                        if(A21.getBackground() == Color.RED)
                                            A21.setBackground(Color.YELLOW);
                                        if(A22.getBackground() == Color.RED)
                                            A22.setBackground(Color.YELLOW);
                                        if(A23.getBackground() == Color.RED)
                                            A23.setBackground(Color.YELLOW);
                                        if(A24.getBackground() == Color.RED)
                                            A24.setBackground(Color.YELLOW);
                                        if(A25.getBackground() == Color.RED)
                                            A25.setBackground(Color.YELLOW);
                                        if(A26.getBackground() == Color.RED)
                                            A26.setBackground(Color.YELLOW);
                                        if(A27.getBackground() == Color.RED)
                                            A27.setBackground(Color.YELLOW);
                                        if(A28.getBackground() == Color.RED)
                                            A28.setBackground(Color.YELLOW);
                                        if(A29.getBackground() == Color.RED)
                                            A29.setBackground(Color.YELLOW);
                                        if(A30.getBackground() == Color.RED)
                                            A30.setBackground(Color.YELLOW);
                                        if(A31.getBackground() == Color.RED)
                                            A31.setBackground(Color.YELLOW);
                                        if(A32.getBackground() == Color.RED)
                                            A32.setBackground(Color.YELLOW);
                                        if(A33.getBackground() == Color.RED)
                                            A33.setBackground(Color.YELLOW);
                                        if(A34.getBackground() == Color.RED)
                                            A34.setBackground(Color.YELLOW);
                                        if(A35.getBackground() == Color.RED)
                                            A35.setBackground(Color.YELLOW);
                                        if(A36.getBackground() == Color.RED)
                                            A36.setBackground(Color.YELLOW);
                                        if(A37.getBackground() == Color.RED)
                                            A37.setBackground(Color.YELLOW);
                                        if(A38.getBackground() == Color.RED)
                                            A38.setBackground(Color.YELLOW);
                                        if(A39.getBackground() == Color.RED)
                                            A39.setBackground(Color.YELLOW);
                                        if(A40.getBackground() == Color.RED)
                                            A40.setBackground(Color.YELLOW);
                                        if(A41.getBackground() == Color.RED)
                                            A41.setBackground(Color.YELLOW);
                                        if(A42.getBackground() == Color.RED)
                                            A42.setBackground(Color.YELLOW);
                                        if(A43.getBackground() == Color.RED)
                                            A43.setBackground(Color.YELLOW);
                                        if(A44.getBackground() == Color.RED)
                                            A44.setBackground(Color.YELLOW);
                                        if(A45.getBackground() == Color.RED)
                                            A45.setBackground(Color.YELLOW);
                                        if(A46.getBackground() == Color.RED)
                                            A46.setBackground(Color.YELLOW);
                                        if(A47.getBackground() == Color.RED)
                                            A47.setBackground(Color.YELLOW);
                                        if(A48.getBackground() == Color.RED)
                                            A48.setBackground(Color.YELLOW);
                                        if(A49.getBackground() == Color.RED)
                                            A49.setBackground(Color.YELLOW);
                                        if(A50.getBackground() == Color.RED)
                                            A50.setBackground(Color.YELLOW);
                                        if(A51.getBackground() == Color.RED)
                                            A51.setBackground(Color.YELLOW);
                                        if(A52.getBackground() == Color.RED)
                                            A52.setBackground(Color.YELLOW);
                                        if(A53.getBackground() == Color.RED)
                                            A53.setBackground(Color.YELLOW);
                                        if(A54.getBackground() == Color.RED)
                                            A54.setBackground(Color.YELLOW);
                                        if(A55.getBackground() == Color.RED)
                                            A55.setBackground(Color.YELLOW);
                                        if(A56.getBackground() == Color.RED)
                                            A56.setBackground(Color.YELLOW);
                                        if(A57.getBackground() == Color.RED)
                                            A57.setBackground(Color.YELLOW);
                                        if(A58.getBackground() == Color.RED)
                                            A58.setBackground(Color.YELLOW);
                                        if(A59.getBackground() == Color.RED)
                                            A59.setBackground(Color.YELLOW);
                                        if(A60.getBackground() == Color.RED)
                                            A60.setBackground(Color.YELLOW);
                                        if(A61.getBackground() == Color.RED)
                                            A61.setBackground(Color.YELLOW);
                                        if(A62.getBackground() == Color.RED)
                                            A62.setBackground(Color.YELLOW);
                                        if(A63.getBackground() == Color.RED)
                                            A63.setBackground(Color.YELLOW);
                                        if(A64.getBackground() == Color.RED)
                                            A64.setBackground(Color.YELLOW);
                                        if(A65.getBackground() == Color.RED)
                                            A65.setBackground(Color.YELLOW);
                                        if(A66.getBackground() == Color.RED)
                                            A66.setBackground(Color.YELLOW);
                                        if(A67.getBackground() == Color.RED)
                                            A67.setBackground(Color.YELLOW);
                                        if(A68.getBackground() == Color.RED)
                                            A68.setBackground(Color.YELLOW);
                                        if(A69.getBackground() == Color.RED)
                                            A69.setBackground(Color.YELLOW);
                                        if(A70.getBackground() == Color.RED)
                                            A70.setBackground(Color.YELLOW);
                                        if(A71.getBackground() == Color.RED)
                                            A71.setBackground(Color.YELLOW);
                                        if(A72.getBackground() == Color.RED)
                                            A72.setBackground(Color.YELLOW);
                                        if(A73.getBackground() == Color.RED)
                                            A73.setBackground(Color.YELLOW);
                                        if(A74.getBackground() == Color.RED)
                                            A74.setBackground(Color.YELLOW);
                                        if(A75.getBackground() == Color.RED)
                                            A75.setBackground(Color.YELLOW);
                                        if(A76.getBackground() == Color.RED)
                                            A76.setBackground(Color.YELLOW);
                                        if(A77.getBackground() == Color.RED)
                                            A77.setBackground(Color.YELLOW);
                                        if(A78.getBackground() == Color.RED)
                                            A78.setBackground(Color.YELLOW);
                                        if(A79.getBackground() == Color.RED)
                                            A79.setBackground(Color.YELLOW);
                                        if(A80.getBackground() == Color.RED)
                                            A80.setBackground(Color.YELLOW);
                                        if(A81.getBackground() == Color.RED)
                                            A81.setBackground(Color.YELLOW);
                                        if(A82.getBackground() == Color.RED)
                                            A82.setBackground(Color.YELLOW);
                                        if(A83.getBackground() == Color.RED)
                                            A83.setBackground(Color.YELLOW);
                                        if(A84.getBackground() == Color.RED)
                                            A84.setBackground(Color.YELLOW);
                                        if(A85.getBackground() == Color.RED)
                                            A85.setBackground(Color.YELLOW);
                                        if(A86.getBackground() == Color.RED)
                                            A86.setBackground(Color.YELLOW);
                                        if(A87.getBackground() == Color.RED)
                                            A87.setBackground(Color.YELLOW);
                                        if(A88.getBackground() == Color.RED)
                                            A88.setBackground(Color.YELLOW);
                                        if(A89.getBackground() == Color.RED)
                                            A89.setBackground(Color.YELLOW);
                                        if(A90.getBackground() == Color.RED)
                                            A90.setBackground(Color.YELLOW);
                                    

                                  
                                    }
                      
                                });
                            }
                        }
                    }
                    catch(NumberFormatException d)
                    {
                        String a = "Must be a number!";
                        JOptionPane.showMessageDialog(null, a, "", 0);
                    }
                }
            }

          

          
        });
        btnReceipt.setBounds(169, 351, 117, 47);
        frmSeatReservation.getContentPane().add(btnReceipt);
        JButton btnReserveSeats = new JButton("Reserve Seat/s");
        btnReserveSeats.setForeground(new Color(255, 255, 255));
        btnReserveSeats.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
                throws NumberFormatException
            {
                if(A0.getBackground() == Color.RED || A1.getBackground() == Color.RED || A2.getBackground() == Color.RED || A3.getBackground() == Color.RED || A4.getBackground() == Color.RED || A6.getBackground() == Color.RED || A7.getBackground() == Color.RED || A8.getBackground() == Color.RED || A9.getBackground() == Color.RED || A10.getBackground() == Color.RED || A11.getBackground() == Color.RED || A12.getBackground() == Color.RED || A13.getBackground() == Color.RED || A14.getBackground() == Color.RED || A15.getBackground() == Color.RED || A16.getBackground() == Color.RED || A17.getBackground() == Color.RED || A18.getBackground() == Color.RED || A19.getBackground() == Color.RED || A20.getBackground() == Color.RED || A21.getBackground() == Color.RED || A22.getBackground() == Color.RED || A23.getBackground() == Color.RED || A24.getBackground() == Color.RED || A25.getBackground() == Color.RED || A26.getBackground() == Color.RED || A27.getBackground() == Color.RED || A28.getBackground() == Color.RED || A29.getBackground() == Color.RED || A30.getBackground() == Color.RED || A31.getBackground() == Color.RED || A32.getBackground() == Color.RED || A33.getBackground() == Color.RED || A34.getBackground() == Color.RED || A35.getBackground() == Color.RED || A36.getBackground() == Color.RED || A37.getBackground() == Color.RED || A38.getBackground() == Color.RED || A39.getBackground() == Color.RED || A40.getBackground() == Color.RED || A41.getBackground() == Color.RED || A42.getBackground() == Color.RED || A43.getBackground() == Color.RED || A44.getBackground() == Color.RED || A45.getBackground() == Color.RED || A46.getBackground() == Color.RED || A47.getBackground() == Color.RED || A48.getBackground() == Color.RED || A49.getBackground() == Color.RED || A50.getBackground() == Color.RED || A51.getBackground() == Color.RED || A52.getBackground() == Color.RED || A53.getBackground() == Color.RED || A54.getBackground() == Color.RED || A55.getBackground() == Color.RED || A56.getBackground() == Color.RED || A57.getBackground() == Color.RED || A58.getBackground() == Color.RED || A59.getBackground() == Color.RED || A60.getBackground() == Color.RED || A61.getBackground() == Color.RED || A62.getBackground() == Color.RED || A63.getBackground() == Color.RED || A64.getBackground() == Color.RED || A65.getBackground() == Color.RED || A66.getBackground() == Color.RED || A67.getBackground() == Color.RED || A68.getBackground() == Color.RED || A69.getBackground() == Color.RED || A70.getBackground() == Color.RED || A71.getBackground() == Color.RED || A72.getBackground() == Color.RED || A73.getBackground() == Color.RED || A74.getBackground() == Color.RED || A75.getBackground() == Color.RED || A76.getBackground() == Color.RED || A77.getBackground() == Color.RED || A78.getBackground() == Color.RED || A79.getBackground() == Color.RED || A80.getBackground() == Color.RED || A81.getBackground() == Color.RED || A82.getBackground() == Color.RED || A83.getBackground() == Color.RED || A84.getBackground() == Color.RED || A85.getBackground() == Color.RED || A86.getBackground() == Color.RED || A87.getBackground() == Color.RED || A88.getBackground() == Color.RED || A89.getBackground() == Color.RED || A90.getBackground() == Color.RED)
                {
                    String a = "You still have a pending reservation.\nPlease issue a receipt before creating a new reservation.";
                    JOptionPane.showMessageDialog(null, a, "", 0);
                } else
                if(A0.getBackground() == Color.YELLOW && A1.getBackground() == Color.YELLOW && A2.getBackground() == Color.YELLOW && A3.getBackground() == Color.YELLOW && A7.getBackground() == Color.YELLOW && A8.getBackground() == Color.YELLOW && A9.getBackground() == Color.YELLOW && A10.getBackground() == Color.YELLOW && A11.getBackground() == Color.YELLOW && A12.getBackground() == Color.YELLOW && A13.getBackground() == Color.YELLOW && A14.getBackground() == Color.YELLOW && A15.getBackground() == Color.YELLOW && A16.getBackground() == Color.YELLOW && A17.getBackground() == Color.YELLOW && A18.getBackground() == Color.YELLOW && A19.getBackground() == Color.YELLOW && A20.getBackground() == Color.YELLOW && A21.getBackground() == Color.YELLOW && A22.getBackground() == Color.YELLOW && A23.getBackground() == Color.YELLOW && A24.getBackground() == Color.YELLOW && A25.getBackground() == Color.YELLOW && A26.getBackground() == Color.YELLOW && A27.getBackground() == Color.YELLOW && A28.getBackground() == Color.YELLOW && A29.getBackground() == Color.YELLOW && A30.getBackground() == Color.YELLOW && A31.getBackground() == Color.YELLOW && A32.getBackground() == Color.YELLOW && A33.getBackground() == Color.YELLOW && A34.getBackground() == Color.YELLOW && A35.getBackground() == Color.YELLOW && A36.getBackground() == Color.YELLOW && A37.getBackground() == Color.YELLOW && A38.getBackground() == Color.YELLOW && A39.getBackground() == Color.YELLOW && A40.getBackground() == Color.YELLOW && A41.getBackground() == Color.YELLOW && A42.getBackground() == Color.YELLOW && A43.getBackground() == Color.YELLOW && A44.getBackground() == Color.YELLOW && A45.getBackground() == Color.YELLOW && A46.getBackground() == Color.YELLOW && A47.getBackground() == Color.YELLOW && A48.getBackground() == Color.YELLOW && A49.getBackground() == Color.YELLOW && A50.getBackground() == Color.YELLOW && A51.getBackground() == Color.YELLOW && A52.getBackground() == Color.YELLOW && A53.getBackground() == Color.YELLOW && A54.getBackground() == Color.YELLOW && A55.getBackground() == Color.YELLOW && A56.getBackground() == Color.YELLOW && A57.getBackground() == Color.YELLOW && A58.getBackground() == Color.YELLOW && A59.getBackground() == Color.YELLOW && A60.getBackground() == Color.YELLOW && A61.getBackground() == Color.YELLOW && A62.getBackground() == Color.YELLOW && A63.getBackground() == Color.YELLOW && A64.getBackground() == Color.YELLOW && A65.getBackground() == Color.YELLOW && A66.getBackground() == Color.YELLOW && A67.getBackground() == Color.YELLOW && A68.getBackground() == Color.YELLOW && A69.getBackground() == Color.YELLOW && A70.getBackground() == Color.YELLOW && A71.getBackground() == Color.YELLOW && A72.getBackground() == Color.YELLOW && A73.getBackground() == Color.YELLOW && A74.getBackground() == Color.YELLOW && A75.getBackground() == Color.YELLOW && A76.getBackground() == Color.YELLOW && A77.getBackground() == Color.YELLOW && A78.getBackground() == Color.YELLOW && A79.getBackground() == Color.YELLOW && A80.getBackground() == Color.YELLOW && A81.getBackground() == Color.YELLOW && A82.getBackground() == Color.YELLOW && A83.getBackground() == Color.YELLOW && A84.getBackground() == Color.YELLOW && A85.getBackground() == Color.YELLOW && A86.getBackground() == Color.YELLOW && A87.getBackground() == Color.YELLOW && A88.getBackground() == Color.YELLOW && A89.getBackground() == Color.YELLOW && A90.getBackground() == Color.YELLOW)
                {
                    String a = "Sorry! No more seats available. Better luck next time!";
                    JOptionPane.showMessageDialog(null, a, "", 0);
                } else
                {
                    try
                    {
                        String a = JOptionPane.showInputDialog("How many seats to be reserved?");
                        int a1 = Integer.parseInt(a);
                        if(a1 < 0)
                        {
                            String b = "Must be positive!";
                            JOptionPane.showMessageDialog(null, b, "", 0);
                            textField.setText("0");
                            textField_1.setText("0");
                        } else
                        if(a1 == 0)
                        {
                            String b = "Must reserve at least one seat!";
                            JOptionPane.showMessageDialog(null, b, "", 0);
                            textField.setText("0");
                            textField_1.setText("0");
                        } else
                        {
                            textField.setText((new StringBuilder()).append(a1).toString());
                            textField_1.setText((new StringBuilder()).append(a1).toString());
                            int sc = Integer.parseInt(textField_2.getText());
                            if(a1 > sc)
                            {
                                String b = "The number of seats reserved exceeds the number of seats available.";
                                JOptionPane.showMessageDialog(null, b, "", 0);
                                textField.setText("0");
                                textField_1.setText("0");
                            }
                        }
                    }
                    catch(NumberFormatException e)
                    {
                        String b = "Must be a number!";
                        JOptionPane.showMessageDialog(null, b, "", 0);
                        textField.setText("0");
                        textField_1.setText("0");
                    }
                }
            }

           
        });
        btnReserveSeats.setFont(new Font("Arial Black", 0, 14));
        btnReserveSeats.setBackground(new Color(165, 42, 42));
        btnReserveSeats.setBounds(7, 351, 151, 47);
        frmSeatReservation.getContentPane().add(btnReserveSeats);
        lblNewLabel = new JLabel("Reservation Counter:");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", 0, 17));
        lblNewLabel.setBounds(28, 290, 169, 50);
        frmSeatReservation.getContentPane().add(lblNewLabel);
        textField = new JTextField();
        textField.setText("0");
        textField.setBounds(199, 303, 46, 30);
        frmSeatReservation.getContentPane().add(textField);
        textField.setColumns(10);
        lblNoOfSeats = new JLabel("No. of seats reserved:");
        lblNoOfSeats.setForeground(new Color(255, 255, 255));
        lblNoOfSeats.setFont(new Font("Tahoma", 0, 17));
        lblNoOfSeats.setBounds(276, 290, 169, 50);
        frmSeatReservation.getContentPane().add(lblNoOfSeats);
        textField_1 = new JTextField();
        textField_1.setText("0");
        textField_1.setColumns(10);
        textField_1.setBounds(449, 303, 46, 30);
        frmSeatReservation.getContentPane().add(textField_1);
        A31.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A31.getBackground() == Color.GREEN)
                    {
                        A31.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A31.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A31.setBackground(Color.GREEN);
        A31.setBounds(331, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A31);
        A32.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A32.getBackground() == Color.GREEN)
                    {
                        A32.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A32.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A32.setBackground(Color.GREEN);
        A32.setBounds(385, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A32);
        A33.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A33.getBackground() == Color.GREEN)
                    {
                        A33.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A33.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A33.setBackground(Color.GREEN);
        A33.setBounds(439, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A33);
        A34.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A34.getBackground() == Color.GREEN)
                    {
                        A34.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A34.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A34.setBackground(Color.GREEN);
        A34.setBounds(493, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A34);
        A35.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A35.getBackground() == Color.GREEN)
                    {
                        A35.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A35.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A35.setBackground(Color.GREEN);
        A35.setBounds(547, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A35);
        A36.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A36.getBackground() == Color.GREEN)
                    {
                        A36.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A36.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A36.setBackground(Color.GREEN);
        A36.setBounds(331, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A36);
        A37.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A37.getBackground() == Color.GREEN)
                    {
                        A37.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A37.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A37.setBackground(Color.GREEN);
        A37.setBounds(385, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A37);
        A38.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A38.getBackground() == Color.GREEN)
                    {
                        A38.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A38.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A38.setBackground(Color.GREEN);
        A38.setBounds(439, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A38);
        A39.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A39.getBackground() == Color.GREEN)
                    {
                        A39.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A39.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A39.setBackground(Color.GREEN);
        A39.setBounds(493, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A39);
        A40.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A40.getBackground() == Color.GREEN)
                    {
                        A40.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A40.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A40.setBackground(Color.GREEN);
        A40.setBounds(547, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A40);
        A41.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A41.getBackground() == Color.GREEN)
                    {
                        A41.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A41.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        
        });
        A41.setBackground(Color.GREEN);
        A41.setBounds(331, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A41);
        A42.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A42.getBackground() == Color.GREEN)
                    {
                        A42.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A42.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A42.setBackground(Color.GREEN);
        A42.setBounds(385, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A42);
        A43.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A43.getBackground() == Color.GREEN)
                    {
                        A43.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A43.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A43.setBackground(Color.GREEN);
        A43.setBounds(439, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A43);
        A44.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A44.getBackground() == Color.GREEN)
                    {
                        A44.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A44.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A44.setBackground(Color.GREEN);
        A44.setBounds(493, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A44);
        A45.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A45.getBackground() == Color.GREEN)
                    {
                        A45.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A45.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A45.setBackground(Color.GREEN);
        A45.setBounds(547, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A45);
        A46.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A46.getBackground() == Color.GREEN)
                    {
                        A46.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A46.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A46.setBackground(Color.GREEN);
        A46.setBounds(331, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A46);
        A47.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A47.getBackground() == Color.GREEN)
                    {
                        A47.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A47.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A47.setBackground(Color.GREEN);
        A47.setBounds(385, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A47);
        A48.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A48.getBackground() == Color.GREEN)
                    {
                        A48.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A48.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A48.setBackground(Color.GREEN);
        A48.setBounds(439, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A48);
        A49.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A49.getBackground() == Color.GREEN)
                    {
                        A49.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A49.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A49.setBackground(Color.GREEN);
        A49.setBounds(493, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A49);
        A50.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A50.getBackground() == Color.GREEN)
                    {
                        A50.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A50.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

            
        });
        A50.setBackground(Color.GREEN);
        A50.setBounds(547, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A50);
        A51.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A51.getBackground() == Color.GREEN)
                    {
                        A51.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A51.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A51.setBackground(Color.GREEN);
        A51.setBounds(331, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A51);
        A52.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A52.getBackground() == Color.GREEN)
                    {
                        A52.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A52.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A52.setBackground(Color.GREEN);
        A52.setBounds(385, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A52);
        A53.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A53.getBackground() == Color.GREEN)
                    {
                        A53.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A53.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A53.setBackground(Color.GREEN);
        A53.setBounds(439, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A53);
        A54.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A54.getBackground() == Color.GREEN)
                    {
                        A54.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A54.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A54.setBackground(Color.GREEN);
        A54.setBounds(493, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A54);
        A55.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A55.getBackground() == Color.GREEN)
                    {
                        A55.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A55.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A55.setBackground(Color.GREEN);
        A55.setBounds(547, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A55);
        A56.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A56.getBackground() == Color.GREEN)
                    {
                        A56.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A56.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
           
        });
        A56.setBackground(Color.GREEN);
        A56.setBounds(331, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A56);
        A57.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A57.getBackground() == Color.GREEN)
                    {
                        A57.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A57.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A57.setBackground(Color.GREEN);
        A57.setBounds(385, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A57);
        A58.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A58.getBackground() == Color.GREEN)
                    {
                        A58.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A58.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A58.setBackground(Color.GREEN);
        A58.setBounds(439, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A58);
        A59.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A59.getBackground() == Color.GREEN)
                    {
                        A59.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A59.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A59.setBackground(Color.GREEN);
        A59.setBounds(493, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A59);
        A60.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A60.getBackground() == Color.GREEN)
                    {
                        A60.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A60.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

            
        });
        A60.setBackground(Color.GREEN);
        A60.setBounds(547, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A60);
        A61.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A61.getBackground() == Color.GREEN)
                    {
                        A61.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A61.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A61.setBackground(Color.GREEN);
        A61.setBounds(655, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A61);
        A62.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A62.getBackground() == Color.GREEN)
                    {
                        A62.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A62.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A62.setBackground(Color.GREEN);
        A62.setBounds(709, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A62);
        A63.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A63.getBackground() == Color.GREEN)
                    {
                        A63.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A63.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A63.setBackground(Color.GREEN);
        A63.setBounds(763, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A63);
        A64.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A64.getBackground() == Color.GREEN)
                    {
                        A64.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A64.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A64.setBackground(Color.GREEN);
        A64.setBounds(817, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A64);
        A65.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A65.getBackground() == Color.GREEN)
                    {
                        A65.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A65.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A65.setBackground(Color.GREEN);
        A65.setBounds(871, 11, 53, 37);
        frmSeatReservation.getContentPane().add(A65);
        A66.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A66.getBackground() == Color.GREEN)
                    {
                        A66.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A66.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A66.setBackground(Color.GREEN);
        A66.setBounds(655, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A66);
        A67.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A67.getBackground() == Color.GREEN)
                    {
                        A67.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A67.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A67.setBackground(Color.GREEN);
        A67.setBounds(709, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A67);
        A68.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A68.getBackground() == Color.GREEN)
                    {
                        A68.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A68.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A68.setBackground(Color.GREEN);
        A68.setBounds(763, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A68);
        A69.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A69.getBackground() == Color.GREEN)
                    {
                        A69.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A69.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A69.setBackground(Color.GREEN);
        A69.setBounds(817, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A69);
        A70.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A70.getBackground() == Color.GREEN)
                    {
                        A70.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A70.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A70.setBackground(Color.GREEN);
        A70.setBounds(871, 56, 53, 37);
        frmSeatReservation.getContentPane().add(A70);
        A71.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A71.getBackground() == Color.GREEN)
                    {
                        A71.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A71.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A71.setBackground(Color.GREEN);
        A71.setBounds(655, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A71);
        A72.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A72.getBackground() == Color.GREEN)
                    {
                        A72.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A72.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A72.setBackground(Color.GREEN);
        A72.setBounds(709, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A72);
        A73.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A73.getBackground() == Color.GREEN)
                    {
                        A73.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A73.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A73.setBackground(Color.GREEN);
        A73.setBounds(763, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A73);
        A74.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A74.getBackground() == Color.GREEN)
                    {
                        A74.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A74.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A74.setBackground(Color.GREEN);
        A74.setBounds(817, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A74);
        A75.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A75.getBackground() == Color.GREEN)
                    {
                        A75.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A75.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A75.setBackground(Color.GREEN);
        A75.setBounds(871, 101, 53, 37);
        frmSeatReservation.getContentPane().add(A75);
        A76.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A76.getBackground() == Color.GREEN)
                    {
                        A76.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A76.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A76.setBackground(Color.GREEN);
        A76.setBounds(655, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A76);
        A77.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A77.getBackground() == Color.GREEN)
                    {
                        A77.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A77.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A77.setBackground(Color.GREEN);
        A77.setBounds(709, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A77);
        A78.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A78.getBackground() == Color.GREEN)
                    {
                        A78.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A78.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

         
        });
        A78.setBackground(Color.GREEN);
        A78.setBounds(763, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A78);
        A79.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A79.getBackground() == Color.GREEN)
                    {
                        A79.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A79.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A79.setBackground(Color.GREEN);
        A79.setBounds(817, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A79);
        A80.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A80.getBackground() == Color.GREEN)
                    {
                        A80.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A80.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A80.setBackground(Color.GREEN);
        A80.setBounds(871, 146, 53, 37);
        frmSeatReservation.getContentPane().add(A80);
        A81.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A81.getBackground() == Color.GREEN)
                    {
                        A81.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A81.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A81.setBackground(Color.GREEN);
        A81.setBounds(655, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A81);
        A82.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A82.getBackground() == Color.GREEN)
                    {
                        A82.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A82.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A82.setBackground(Color.GREEN);
        A82.setBounds(709, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A82);
        A83.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A83.getBackground() == Color.GREEN)
                    {
                        A83.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A83.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A83.setBackground(Color.GREEN);
        A83.setBounds(763, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A83);
        A84.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A84.getBackground() == Color.GREEN)
                    {
                        A84.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A84.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A84.setBackground(Color.GREEN);
        A84.setBounds(817, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A84);
        A85.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A85.getBackground() == Color.GREEN)
                    {
                        A85.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A85.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A85.setBackground(Color.GREEN);
        A85.setBounds(871, 191, 53, 37);
        frmSeatReservation.getContentPane().add(A85);
        A86.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A86.getBackground() == Color.GREEN)
                    {
                        A86.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A86.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A86.setBackground(Color.GREEN);
        A86.setBounds(655, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A86);
        A87.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A87.getBackground() == Color.GREEN)
                    {
                        A87.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A87.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

          
        });
        A87.setBackground(Color.GREEN);
        A87.setBounds(709, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A87);
        A88.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A88.getBackground() == Color.GREEN)
                    {
                        A88.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A88.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

       
        });
        A88.setBackground(Color.GREEN);
        A88.setBounds(763, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A88);
        A89.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A89.getBackground() == Color.GREEN)
                    {
                        A89.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A89.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

           
        });
        A89.setBackground(Color.GREEN);
        A89.setBounds(817, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A89);
        A90.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField.getText()) > 0)
                {
                    if(A90.getBackground() == Color.GREEN)
                    {
                        A90.setBackground(Color.RED);
                        int a = Integer.parseInt(textField.getText()) - 1;
                        textField.setText((new StringBuilder()).append(a).toString());
                    } else
                    if(A90.getBackground() == Color.YELLOW)
                    {
                        String w = "This seat is already reserved.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    } else
                    {
                        String w = "You have already chosen this seat. Please choose another one.";
                        JOptionPane.showMessageDialog(null, w, "", 0);
                    }
                } else
                {
                    String w = "You haven't reserve a seat/s yet or you run out of reservation counters.\nPlease reserve at least one seat or issue a receipt if you already have at least one reserved seat.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                }
            }

        });
        A90.setBackground(Color.GREEN);
        A90.setBounds(871, 236, 53, 37);
        frmSeatReservation.getContentPane().add(A90);
        JLabel lblNoOfSeats_1 = new JLabel("No. of seats available:");
        lblNoOfSeats_1.setForeground(new Color(255, 255, 255));
        lblNoOfSeats_1.setFont(new Font("Tahoma", 0, 17));
        lblNoOfSeats_1.setBounds(435, 348, 182, 50);
        frmSeatReservation.getContentPane().add(lblNoOfSeats_1);
        textField_2 = new JTextField();
        textField_2.setText("90");
        textField_2.setColumns(10);
        textField_2.setBounds(606, 361, 46, 30);
        frmSeatReservation.getContentPane().add(textField_2);
        JLabel label = new JLabel("/ 90");
        label.setFont(new Font("Tahoma", 0, 17));
        label.setBounds(655, 348, 53, 50);
        frmSeatReservation.getContentPane().add(label);
        JButton btnClear = new JButton("Clear");
        btnClear.setForeground(new Color(255, 255, 255));
        btnClear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(Integer.parseInt(textField_1.getText()) != 0)
                {
                    textField.setText("0");
                    textField_1.setText("0");
                    String w = "Pending reservations are now cancelled.";
                    JOptionPane.showMessageDialog(null, w, "", 2);
                    if(A0.getBackground() == Color.RED)
                        A0.setBackground(Color.GREEN);
                    if(A1.getBackground() == Color.RED)
                        A1.setBackground(Color.GREEN);
                    if(A2.getBackground() == Color.RED)
                        A2.setBackground(Color.GREEN);
                    if(A3.getBackground() == Color.RED)
                        A3.setBackground(Color.GREEN);
                    if(A4.getBackground() == Color.RED)
                        A4.setBackground(Color.GREEN);
                    if(A6.getBackground() == Color.RED)
                        A6.setBackground(Color.GREEN);
                    if(A7.getBackground() == Color.RED)
                        A7.setBackground(Color.GREEN);
                    if(A8.getBackground() == Color.RED)
                        A8.setBackground(Color.GREEN);
                    if(A9.getBackground() == Color.RED)
                        A9.setBackground(Color.GREEN);
                    if(A10.getBackground() == Color.RED)
                        A10.setBackground(Color.GREEN);
                    if(A11.getBackground() == Color.RED)
                        A11.setBackground(Color.GREEN);
                    if(A12.getBackground() == Color.RED)
                        A12.setBackground(Color.GREEN);
                    if(A13.getBackground() == Color.RED)
                        A13.setBackground(Color.GREEN);
                    if(A14.getBackground() == Color.RED)
                        A14.setBackground(Color.GREEN);
                    if(A15.getBackground() == Color.RED)
                        A15.setBackground(Color.GREEN);
                    if(A16.getBackground() == Color.RED)
                        A16.setBackground(Color.GREEN);
                    if(A17.getBackground() == Color.RED)
                        A17.setBackground(Color.GREEN);
                    if(A18.getBackground() == Color.RED)
                        A18.setBackground(Color.GREEN);
                    if(A19.getBackground() == Color.RED)
                        A19.setBackground(Color.GREEN);
                    if(A20.getBackground() == Color.RED)
                        A20.setBackground(Color.GREEN);
                    if(A21.getBackground() == Color.RED)
                        A21.setBackground(Color.GREEN);
                    if(A22.getBackground() == Color.RED)
                        A22.setBackground(Color.GREEN);
                    if(A23.getBackground() == Color.RED)
                        A23.setBackground(Color.GREEN);
                    if(A24.getBackground() == Color.RED)
                        A24.setBackground(Color.GREEN);
                    if(A25.getBackground() == Color.RED)
                        A25.setBackground(Color.GREEN);
                    if(A26.getBackground() == Color.RED)
                        A26.setBackground(Color.GREEN);
                    if(A27.getBackground() == Color.RED)
                        A27.setBackground(Color.GREEN);
                    if(A28.getBackground() == Color.RED)
                        A28.setBackground(Color.GREEN);
                    if(A29.getBackground() == Color.RED)
                        A29.setBackground(Color.GREEN);
                    if(A30.getBackground() == Color.RED)
                        A30.setBackground(Color.GREEN);
                    if(A31.getBackground() == Color.RED)
                        A31.setBackground(Color.GREEN);
                    if(A32.getBackground() == Color.RED)
                        A32.setBackground(Color.GREEN);
                    if(A33.getBackground() == Color.RED)
                        A33.setBackground(Color.GREEN);
                    if(A34.getBackground() == Color.RED)
                        A34.setBackground(Color.GREEN);
                    if(A35.getBackground() == Color.RED)
                        A35.setBackground(Color.GREEN);
                    if(A36.getBackground() == Color.RED)
                        A36.setBackground(Color.GREEN);
                    if(A37.getBackground() == Color.RED)
                        A37.setBackground(Color.GREEN);
                    if(A38.getBackground() == Color.RED)
                        A38.setBackground(Color.GREEN);
                    if(A39.getBackground() == Color.RED)
                        A39.setBackground(Color.GREEN);
                    if(A40.getBackground() == Color.RED)
                        A40.setBackground(Color.GREEN);
                    if(A41.getBackground() == Color.RED)
                        A41.setBackground(Color.GREEN);
                    if(A42.getBackground() == Color.RED)
                        A42.setBackground(Color.GREEN);
                    if(A43.getBackground() == Color.RED)
                        A43.setBackground(Color.GREEN);
                    if(A44.getBackground() == Color.RED)
                        A44.setBackground(Color.GREEN);
                    if(A45.getBackground() == Color.RED)
                        A45.setBackground(Color.GREEN);
                    if(A46.getBackground() == Color.RED)
                        A46.setBackground(Color.GREEN);
                    if(A47.getBackground() == Color.RED)
                        A47.setBackground(Color.GREEN);
                    if(A48.getBackground() == Color.RED)
                        A48.setBackground(Color.GREEN);
                    if(A49.getBackground() == Color.RED)
                        A49.setBackground(Color.GREEN);
                    if(A50.getBackground() == Color.RED)
                        A50.setBackground(Color.GREEN);
                    if(A51.getBackground() == Color.RED)
                        A51.setBackground(Color.GREEN);
                    if(A52.getBackground() == Color.RED)
                        A52.setBackground(Color.GREEN);
                    if(A53.getBackground() == Color.RED)
                        A53.setBackground(Color.GREEN);
                    if(A54.getBackground() == Color.RED)
                        A54.setBackground(Color.GREEN);
                    if(A55.getBackground() == Color.RED)
                        A55.setBackground(Color.GREEN);
                    if(A56.getBackground() == Color.RED)
                        A56.setBackground(Color.GREEN);
                    if(A57.getBackground() == Color.RED)
                        A57.setBackground(Color.GREEN);
                    if(A58.getBackground() == Color.RED)
                        A58.setBackground(Color.GREEN);
                    if(A59.getBackground() == Color.RED)
                        A59.setBackground(Color.GREEN);
                    if(A60.getBackground() == Color.RED)
                        A60.setBackground(Color.GREEN);
                    if(A61.getBackground() == Color.RED)
                        A61.setBackground(Color.GREEN);
                    if(A62.getBackground() == Color.RED)
                        A62.setBackground(Color.GREEN);
                    if(A63.getBackground() == Color.RED)
                        A63.setBackground(Color.GREEN);
                    if(A64.getBackground() == Color.RED)
                        A64.setBackground(Color.GREEN);
                    if(A65.getBackground() == Color.RED)
                        A65.setBackground(Color.GREEN);
                    if(A66.getBackground() == Color.RED)
                        A66.setBackground(Color.GREEN);
                    if(A67.getBackground() == Color.RED)
                        A67.setBackground(Color.GREEN);
                    if(A68.getBackground() == Color.RED)
                        A68.setBackground(Color.GREEN);
                    if(A69.getBackground() == Color.RED)
                        A69.setBackground(Color.GREEN);
                    if(A70.getBackground() == Color.RED)
                        A70.setBackground(Color.GREEN);
                    if(A71.getBackground() == Color.RED)
                        A71.setBackground(Color.GREEN);
                    if(A72.getBackground() == Color.RED)
                        A72.setBackground(Color.GREEN);
                    if(A73.getBackground() == Color.RED)
                        A73.setBackground(Color.GREEN);
                    if(A74.getBackground() == Color.RED)
                        A74.setBackground(Color.GREEN);
                    if(A75.getBackground() == Color.RED)
                        A75.setBackground(Color.GREEN);
                    if(A76.getBackground() == Color.RED)
                        A76.setBackground(Color.GREEN);
                    if(A77.getBackground() == Color.RED)
                        A77.setBackground(Color.GREEN);
                    if(A78.getBackground() == Color.RED)
                        A78.setBackground(Color.GREEN);
                    if(A79.getBackground() == Color.RED)
                        A79.setBackground(Color.GREEN);
                    if(A80.getBackground() == Color.RED)
                        A80.setBackground(Color.GREEN);
                    if(A81.getBackground() == Color.RED)
                        A81.setBackground(Color.GREEN);
                    if(A82.getBackground() == Color.RED)
                        A82.setBackground(Color.GREEN);
                    if(A83.getBackground() == Color.RED)
                        A83.setBackground(Color.GREEN);
                    if(A84.getBackground() == Color.RED)
                        A84.setBackground(Color.GREEN);
                    if(A85.getBackground() == Color.RED)
                        A85.setBackground(Color.GREEN);
                    if(A86.getBackground() == Color.RED)
                        A86.setBackground(Color.GREEN);
                    if(A87.getBackground() == Color.RED)
                        A87.setBackground(Color.GREEN);
                    if(A88.getBackground() == Color.RED)
                        A88.setBackground(Color.GREEN);
                    if(A89.getBackground() == Color.RED)
                        A89.setBackground(Color.GREEN);
                    if(A90.getBackground() == Color.RED)
                        A90.setBackground(Color.GREEN);
                } else
                {
                    String w = "You have not reserve anything.";
                    JOptionPane.showMessageDialog(null, w, "", 0);
                    textField.setText("0");
                    textField_1.setText("0");
                }
            }

          
           
        });
        btnClear.setFont(new Font("Arial Black", 0, 16));
        btnClear.setBackground(new Color(165, 42, 42));
        btnClear.setBounds(296, 351, 117, 47);
        frmSeatReservation.getContentPane().add(btnClear);
        JLabel lblLegend = new JLabel("Legend:");
        lblLegend.setForeground(new Color(255, 255, 255));
        lblLegend.setBackground(new Color(255, 255, 255));
        lblLegend.setBounds(770, 272, 46, 14);
        frmSeatReservation.getContentPane().add(lblLegend);
        JLabel label_1 = new JLabel("");
        label_1.setBackground(new Color(0, 255, 0));
        label_1.setForeground(Color.GREEN);
        label_1.setBounds(709, 290, 46, 14);
        label_1.setOpaque(true);
        frmSeatReservation.getContentPane().add(label_1);
        JLabel label_2 = new JLabel("");
        label_2.setOpaque(true);
        label_2.setForeground(Color.RED);
        label_2.setBackground(Color.red);
        label_2.setBounds(709, 317, 46, 14);
        label_1.setOpaque(true);
        frmSeatReservation.getContentPane().add(label_2);
        JLabel label_3 = new JLabel("");
        label_3.setOpaque(true);
        label_3.setForeground(Color.YELLOW);
        label_3.setBackground(Color.yellow);
        label_3.setBounds(709, 344, 46, 14);
        label_1.setOpaque(true);
        frmSeatReservation.getContentPane().add(label_3);
        JLabel lblSeatAvailable = new JLabel("- seat available");
        lblSeatAvailable.setForeground(new Color(255, 255, 255));
        lblSeatAvailable.setBounds(763, 290, 107, 14);
        frmSeatReservation.getContentPane().add(lblSeatAvailable);
        JLabel lblSeatPending = new JLabel("- seat pending in reservation");
        lblSeatPending.setForeground(new Color(255, 255, 255));
        lblSeatPending.setBounds(763, 317, 171, 14);
        frmSeatReservation.getContentPane().add(lblSeatPending);
        JLabel lblSeatAlready = new JLabel("- seat already reserved");
        lblSeatAlready.setForeground(new Color(255, 255, 255));
        lblSeatAlready.setBounds(763, 344, 161, 14);
        frmSeatReservation.getContentPane().add(lblSeatAlready);
        JButton btnNewButton = new JButton("Back");
        btnNewButton.setBackground(new Color(165, 42, 42));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                textField.setText("0");
                textField_1.setText("0");
                if(A0.getBackground() == Color.RED)
                    A0.setBackground(Color.GREEN);
                if(A1.getBackground() == Color.RED)
                    A1.setBackground(Color.GREEN);
                if(A2.getBackground() == Color.RED)
                    A2.setBackground(Color.GREEN);
                if(A3.getBackground() == Color.RED)
                    A3.setBackground(Color.GREEN);
                if(A4.getBackground() == Color.RED)
                    A4.setBackground(Color.GREEN);
                if(A6.getBackground() == Color.RED)
                    A6.setBackground(Color.GREEN);
                if(A7.getBackground() == Color.RED)
                    A7.setBackground(Color.GREEN);
                if(A8.getBackground() == Color.RED)
                    A8.setBackground(Color.GREEN);
                if(A9.getBackground() == Color.RED)
                    A9.setBackground(Color.GREEN);
                if(A10.getBackground() == Color.RED)
                    A10.setBackground(Color.GREEN);
                if(A11.getBackground() == Color.RED)
                    A11.setBackground(Color.GREEN);
                if(A12.getBackground() == Color.RED)
                    A12.setBackground(Color.GREEN);
                if(A13.getBackground() == Color.RED)
                    A13.setBackground(Color.GREEN);
                if(A14.getBackground() == Color.RED)
                    A14.setBackground(Color.GREEN);
                if(A15.getBackground() == Color.RED)
                    A15.setBackground(Color.GREEN);
                if(A16.getBackground() == Color.RED)
                    A16.setBackground(Color.GREEN);
                if(A17.getBackground() == Color.RED)
                    A17.setBackground(Color.GREEN);
                if(A18.getBackground() == Color.RED)
                    A18.setBackground(Color.GREEN);
                if(A19.getBackground() == Color.RED)
                    A19.setBackground(Color.GREEN);
                if(A20.getBackground() == Color.RED)
                    A20.setBackground(Color.GREEN);
                if(A21.getBackground() == Color.RED)
                    A21.setBackground(Color.GREEN);
                if(A22.getBackground() == Color.RED)
                    A22.setBackground(Color.GREEN);
                if(A23.getBackground() == Color.RED)
                    A23.setBackground(Color.GREEN);
                if(A24.getBackground() == Color.RED)
                    A24.setBackground(Color.GREEN);
                if(A25.getBackground() == Color.RED)
                    A25.setBackground(Color.GREEN);
                if(A26.getBackground() == Color.RED)
                    A26.setBackground(Color.GREEN);
                if(A27.getBackground() == Color.RED)
                    A27.setBackground(Color.GREEN);
                if(A28.getBackground() == Color.RED)
                    A28.setBackground(Color.GREEN);
                if(A29.getBackground() == Color.RED)
                    A29.setBackground(Color.GREEN);
                if(A30.getBackground() == Color.RED)
                    A30.setBackground(Color.GREEN);
                if(A31.getBackground() == Color.RED)
                    A31.setBackground(Color.GREEN);
                if(A32.getBackground() == Color.RED)
                    A32.setBackground(Color.GREEN);
                if(A33.getBackground() == Color.RED)
                    A33.setBackground(Color.GREEN);
                if(A34.getBackground() == Color.RED)
                    A34.setBackground(Color.GREEN);
                if(A35.getBackground() == Color.RED)
                    A35.setBackground(Color.GREEN);
                if(A36.getBackground() == Color.RED)
                    A36.setBackground(Color.GREEN);
                if(A37.getBackground() == Color.RED)
                    A37.setBackground(Color.GREEN);
                if(A38.getBackground() == Color.RED)
                    A38.setBackground(Color.GREEN);
                if(A39.getBackground() == Color.RED)
                    A39.setBackground(Color.GREEN);
                if(A40.getBackground() == Color.RED)
                    A40.setBackground(Color.GREEN);
                if(A41.getBackground() == Color.RED)
                    A41.setBackground(Color.GREEN);
                if(A42.getBackground() == Color.RED)
                    A42.setBackground(Color.GREEN);
                if(A43.getBackground() == Color.RED)
                    A43.setBackground(Color.GREEN);
                if(A44.getBackground() == Color.RED)
                    A44.setBackground(Color.GREEN);
                if(A45.getBackground() == Color.RED)
                    A45.setBackground(Color.GREEN);
                if(A46.getBackground() == Color.RED)
                    A46.setBackground(Color.GREEN);
                if(A47.getBackground() == Color.RED)
                    A47.setBackground(Color.GREEN);
                if(A48.getBackground() == Color.RED)
                    A48.setBackground(Color.GREEN);
                if(A49.getBackground() == Color.RED)
                    A49.setBackground(Color.GREEN);
                if(A50.getBackground() == Color.RED)
                    A50.setBackground(Color.GREEN);
                if(A51.getBackground() == Color.RED)
                    A51.setBackground(Color.GREEN);
                if(A52.getBackground() == Color.RED)
                    A52.setBackground(Color.GREEN);
                if(A53.getBackground() == Color.RED)
                    A53.setBackground(Color.GREEN);
                if(A54.getBackground() == Color.RED)
                    A54.setBackground(Color.GREEN);
                if(A55.getBackground() == Color.RED)
                    A55.setBackground(Color.GREEN);
                if(A56.getBackground() == Color.RED)
                    A56.setBackground(Color.GREEN);
                if(A57.getBackground() == Color.RED)
                    A57.setBackground(Color.GREEN);
                if(A58.getBackground() == Color.RED)
                    A58.setBackground(Color.GREEN);
                if(A59.getBackground() == Color.RED)
                    A59.setBackground(Color.GREEN);
                if(A60.getBackground() == Color.RED)
                    A60.setBackground(Color.GREEN);
                if(A61.getBackground() == Color.RED)
                    A61.setBackground(Color.GREEN);
                if(A62.getBackground() == Color.RED)
                    A62.setBackground(Color.GREEN);
                if(A63.getBackground() == Color.RED)
                    A63.setBackground(Color.GREEN);
                if(A64.getBackground() == Color.RED)
                    A64.setBackground(Color.GREEN);
                if(A65.getBackground() == Color.RED)
                    A65.setBackground(Color.GREEN);
                if(A66.getBackground() == Color.RED)
                    A66.setBackground(Color.GREEN);
                if(A67.getBackground() == Color.RED)
                    A67.setBackground(Color.GREEN);
                if(A68.getBackground() == Color.RED)
                    A68.setBackground(Color.GREEN);
                if(A69.getBackground() == Color.RED)
                    A69.setBackground(Color.GREEN);
                if(A70.getBackground() == Color.RED)
                    A70.setBackground(Color.GREEN);
                if(A71.getBackground() == Color.RED)
                    A71.setBackground(Color.GREEN);
                if(A72.getBackground() == Color.RED)
                    A72.setBackground(Color.GREEN);
                if(A73.getBackground() == Color.RED)
                    A73.setBackground(Color.GREEN);
                if(A74.getBackground() == Color.RED)
                    A74.setBackground(Color.GREEN);
                if(A75.getBackground() == Color.RED)
                    A75.setBackground(Color.GREEN);
                if(A76.getBackground() == Color.RED)
                    A76.setBackground(Color.GREEN);
                if(A77.getBackground() == Color.RED)
                    A77.setBackground(Color.GREEN);
                if(A78.getBackground() == Color.RED)
                    A78.setBackground(Color.GREEN);
                if(A79.getBackground() == Color.RED)
                    A79.setBackground(Color.GREEN);
                if(A80.getBackground() == Color.RED)
                    A80.setBackground(Color.GREEN);
                if(A81.getBackground() == Color.RED)
                    A81.setBackground(Color.GREEN);
                if(A82.getBackground() == Color.RED)
                    A82.setBackground(Color.GREEN);
                if(A83.getBackground() == Color.RED)
                    A83.setBackground(Color.GREEN);
                if(A84.getBackground() == Color.RED)
                    A84.setBackground(Color.GREEN);
                if(A85.getBackground() == Color.RED)
                    A85.setBackground(Color.GREEN);
                if(A86.getBackground() == Color.RED)
                    A86.setBackground(Color.GREEN);
                if(A87.getBackground() == Color.RED)
                    A87.setBackground(Color.GREEN);
                if(A88.getBackground() == Color.RED)
                    A88.setBackground(Color.GREEN);
                if(A89.getBackground() == Color.RED)
                    A89.setBackground(Color.GREEN);
                if(A90.getBackground() == Color.RED)
                    A90.setBackground(Color.GREEN);
                frmSeatReservation.setVisible(false);
                Reservation.a.comboBox.setSelectedIndex(Reservation.a.l);
                Reservation.a.comboBox_1.setSelectedIndex(Reservation.a.n[0]);
                Reservation.a.comboBox_2.setSelectedIndex(Reservation.a.n[1]);
                Reservation.a.comboBox_3.setSelectedIndex(Reservation.a.n[2]);
                Reservation.a.comboBox_4.setSelectedIndex(Reservation.a.n[3]);
                Reservation.a.setVisible(true);
            }

          
        });
        btnNewButton.setFont(new Font("Arial Black", 0, 16));
        btnNewButton.setBounds(817, 371, 97, 36);
        frmSeatReservation.getContentPane().add(btnNewButton);
        JButton btnHelp = new JButton("Help");
        btnHelp.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                String a = "How to reserve:\n1. Click on the Reserve Seat/s button.\n2. Click on the seat/s you wish to reserve.\n3. Issue a receipt.";
                JOptionPane.showMessageDialog(null, a, "Method of Reservation", 1);
            }

        
        });
        btnHelp.setForeground(Color.WHITE);
        btnHelp.setFont(new Font("Arial Black", 0, 16));
        btnHelp.setBackground(new Color(165, 42, 42));
        btnHelp.setBounds(708, 371, 97, 36);
        frmSeatReservation.getContentPane().add(btnHelp);
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(workingDir+"\\bin\\src\\reservebg1.png"));
        lblNewLabel_1.setBounds(0, 0, 943, 419);
        frmSeatReservation.getContentPane().add(lblNewLabel_1);
    }

    void open()
    {
        frmSeatReservation.setVisible(true);
    }

    void close()
    {
        frmSeatReservation.setVisible(false);
    }

    int getResrvedTix()
    {
        return c1;
    }

    int getPrice()
    {
        return total;
    }

    int getReg()
    {
        return a1;
    }

    int getSeniors()
    {
        return b1;
    }

    Confirmation sample;
    private JFrame frmSeatReservation;
    private JButton A2;
    private JButton A3;
    private JButton A4;
    private JButton A6;
    private JButton A7;
    private JButton A8;
    private JButton A9;
    private JButton A10;
    private JButton A11;
    private JButton A12;
    private JButton A13;
    private JButton A14;
    private JButton A15;
    private JButton A20;
    private JButton A19;
    private JButton A18;
    private JButton A17;
    private JButton A16;
    private JButton A25;
    private JButton A24;
    private JButton A23;
    private JButton A22;
    private JButton A21;
    private JButton A30;
    private JButton A29;
    private JButton A28;
    private JButton A27;
    private JButton A26;
    java.util.List res;
    private JButton btnReceipt;
    private JLabel lblNewLabel;
    private JTextField textField;
    private JLabel lblNoOfSeats;
    private JTextField textField_1;
    private JTextField textField_2;
    private JButton A0;
    int total;
    int c1;
    int a1;
    int b1;
    int d1;
    int e1;

































}
