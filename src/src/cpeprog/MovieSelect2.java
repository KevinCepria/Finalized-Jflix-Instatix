// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MovieSelect2.java

package src.cpeprog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

// Referenced classes of package src.cpeprog:
//            Menu, Movie

public class MovieSelect2 extends Menu
{
	Movie movie[][][]= new Movie[7][4][6];
    JLabel label;
    JComboBox comboBox_1;
    JComboBox comboBox_2;
    JComboBox comboBox_3;
    JComboBox comboBox_4;
    private JPanel contentPane;
    int i=0;
    int j=0;
    JLabel lblNewLabel_4;
    JComboBox comboBox;
    int l;
    int c;
   
    String movTitles[]=new String[9];
    String movDate[]=new String[8];
    String workingDir = System.getProperty("user.dir");
	
    int n[] = new int[4];
    public void database()
    {
    	   
        n[0] = 0;
        n[1] = 0;
        n[2] = 0;
        n[3] = 0;
        movTitles[0] = "Spider-Man 2";
        movTitles[1] = "Avengers Age of Ultron";
        movTitles[2] = "Inside Out";
        movTitles[3] = "Star Wars The Force Awakens";
        movTitles[4] = "Insidious Chapter 3";
        movTitles[5] = "Scream";
        movTitles[6] = "Goosebumps";
        movTitles[7] = "Warcraft";
        movTitles[8]="Captain America Civil War";
        String movDate[] = new String[7];
        movDate[0] = "November 26, 2015";
        movDate[1] = "November 27, 2015";
        movDate[2] = "November 28, 2015";
        movDate[3] = "November 29, 2015";
        movDate[4] = "November 30, 2015";
        movDate[5] = "December 1, 2015";
        movDate[6] = "December 2, 2015";
        //day1
        movie[0][0][0] = new Movie(1, movTitles[0], movDate[0], "8:00 AM - 10:00 AM");
        movie[0][0][1] = new Movie(1, movTitles[0], movDate[0], "10:30 AM - 12:30 PM");
        movie[0][0][2] = new Movie(1, movTitles[0], movDate[0], "1:00 PM - 2:00 PM");
        movie[0][0][3] = new Movie(1, movTitles[0], movDate[0], "2:30 PM - 4:30 PM");
        movie[0][0][4] = new Movie(1, movTitles[0], movDate[0], "5:00 PM - 7:00 PM");
        movie[0][0][5] = new Movie(1, movTitles[0], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[0][1][0] = new Movie(2, movTitles[3], movDate[0], "8:00 AM - 10:00 AM");
        movie[0][1][1] = new Movie(2, movTitles[3], movDate[0], "10:30 AM - 12:30 PM");
        movie[0][1][2] = new Movie(2, movTitles[3], movDate[0], "1:00 PM - 2:00 PM");
        movie[0][1][3] = new Movie(2, movTitles[3], movDate[0], "2:30 PM - 4:30 PM");
        movie[0][1][4] = new Movie(2, movTitles[3], movDate[0], "5:00 PM - 7:00 PM");
        movie[0][1][5] = new Movie(2, movTitles[3], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[0][2][0] = new Movie(3, movTitles[4], movDate[0], "8:00 AM - 10:00 AM");
        movie[0][2][1] = new Movie(3, movTitles[4], movDate[0], "10:30 AM - 12:30 PM");
        movie[0][2][2] = new Movie(3, movTitles[4], movDate[0], "1:00 PM - 2:00 PM");
        movie[0][2][3] = new Movie(3, movTitles[4], movDate[0], "2:30 PM - 4:30 PM");
        movie[0][2][4] = new Movie(3, movTitles[4], movDate[0], "5:00 PM - 7:00 PM");
        movie[0][2][5] = new Movie(3, movTitles[4], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[0][3][0] = new Movie(4, movTitles[6], movDate[0], "8:00 AM - 10:00 AM");
        movie[0][3][1] = new Movie(4, movTitles[6], movDate[0], "10:30 AM - 12:30 PM");
        movie[0][3][2] = new Movie(4, movTitles[6], movDate[0], "1:00 PM - 2:00 PM");
        movie[0][3][3] = new Movie(4, movTitles[6], movDate[0], "2:30 PM - 4:30 PM");
        movie[0][3][4] = new Movie(4, movTitles[6], movDate[0], "5:00 PM - 7:00 PM");
        movie[0][3][5] = new Movie(4, movTitles[6], movDate[0], "7:30 PM - 9:30 PM");
        
        ///day2
        movie[1][0][0] = new Movie(1, movTitles[7], movDate[1], "8:00 AM - 10:00 AM");
        movie[1][0][1] = new Movie(1, movTitles[7], movDate[1], "10:30 AM - 12:30 PM");
        movie[1][0][2] = new Movie(1, movTitles[7], movDate[1], "1:00 PM - 2:00 PM");
        movie[1][0][3] = new Movie(1, movTitles[7], movDate[1], "2:30 PM - 4:30 PM");
        movie[1][0][4] = new Movie(1, movTitles[7], movDate[1], "5:00 PM - 7:00 PM");
        movie[1][0][5] = new Movie(1, movTitles[7], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[1][1][0] = new Movie(2, movTitles[2], movDate[1], "8:00 AM - 10:00 AM");
        movie[1][1][1] = new Movie(2, movTitles[2], movDate[1], "10:30 AM - 12:30 PM");
        movie[1][1][2] = new Movie(2, movTitles[2], movDate[1], "1:00 PM - 2:00 PM");
        movie[1][1][3] = new Movie(2, movTitles[2], movDate[1], "2:30 PM - 4:30 PM");
        movie[1][1][4] = new Movie(2, movTitles[2], movDate[1], "5:00 PM - 7:00 PM");
        movie[1][1][5] = new Movie(2, movTitles[2], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[1][2][0] = new Movie(3, movTitles[1], movDate[1], "8:00 AM - 10:00 AM");
        movie[1][2][1] = new Movie(3, movTitles[1], movDate[1], "10:30 AM - 12:30 PM");
        movie[1][2][2] = new Movie(3, movTitles[1], movDate[1], "1:00 PM - 2:00 PM");
        movie[1][2][3] = new Movie(3, movTitles[1], movDate[1], "2:30 PM - 4:30 PM");
        movie[1][2][4] = new Movie(3, movTitles[1], movDate[1], "5:00 PM - 7:00 PM");
        movie[1][2][5] = new Movie(3, movTitles[1], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[1][3][0] = new Movie(4, movTitles[5], movDate[1], "8:00 AM - 10:00 AM");
        movie[1][3][1] = new Movie(4, movTitles[5], movDate[1], "10:30 AM - 12:30 PM");
        movie[1][3][2] = new Movie(4, movTitles[5], movDate[1], "1:00 PM - 2:00 PM");
        movie[1][3][3] = new Movie(4, movTitles[5], movDate[1], "2:30 PM - 4:30 PM");
        movie[1][3][4] = new Movie(4, movTitles[5], movDate[1], "5:00 PM - 7:00 PM");
        movie[1][3][5] = new Movie(4, movTitles[5], movDate[1], "7:30 PM - 9:30 PM");
        
        //day 3
        movie[2][0][0] = new Movie(1, movTitles[8], movDate[1], "8:00 AM - 10:00 AM");
        movie[2][0][1] = new Movie(1, movTitles[8], movDate[1], "10:30 AM - 12:30 PM");
        movie[2][0][2] = new Movie(1, movTitles[8], movDate[1], "1:00 PM - 2:00 PM");
        movie[2][0][3] = new Movie(1, movTitles[8], movDate[1], "2:30 PM - 4:30 PM");
        movie[2][0][4] = new Movie(1, movTitles[8], movDate[1], "5:00 PM - 7:00 PM");
        movie[2][0][5] = new Movie(1, movTitles[8], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[2][1][0] = new Movie(2, movTitles[4], movDate[1], "8:00 AM - 10:00 AM");
        movie[2][1][1] = new Movie(2, movTitles[4], movDate[1], "10:30 AM - 12:30 PM");
        movie[2][1][2] = new Movie(2, movTitles[4], movDate[1], "1:00 PM - 2:00 PM");
        movie[2][1][3] = new Movie(2, movTitles[4], movDate[1], "2:30 PM - 4:30 PM");
        movie[2][1][4] = new Movie(2, movTitles[4], movDate[1], "5:00 PM - 7:00 PM");
        movie[2][1][5] = new Movie(2, movTitles[4], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[2][2][0] = new Movie(3, movTitles[1], movDate[1], "8:00 AM - 10:00 AM");
        movie[2][2][1] = new Movie(3, movTitles[1], movDate[1], "10:30 AM - 12:30 PM");
        movie[2][2][2] = new Movie(3, movTitles[1], movDate[1], "1:00 PM - 2:00 PM");
        movie[2][2][3] = new Movie(3, movTitles[1], movDate[1], "2:30 PM - 4:30 PM");
        movie[2][2][4] = new Movie(3, movTitles[1], movDate[1], "5:00 PM - 7:00 PM");
        movie[2][2][5] = new Movie(3, movTitles[1], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[2][3][0] = new Movie(4, movTitles[3], movDate[1], "8:00 AM - 10:00 AM");
        movie[2][3][1] = new Movie(4, movTitles[3], movDate[1], "10:30 AM - 12:30 PM");
        movie[2][3][2] = new Movie(4, movTitles[3], movDate[1], "1:00 PM - 2:00 PM");
        movie[2][3][3] = new Movie(4, movTitles[3], movDate[1], "2:30 PM - 4:30 PM");
        movie[2][3][4] = new Movie(4, movTitles[3], movDate[1], "5:00 PM - 7:00 PM");
        movie[2][3][5] = new Movie(4, movTitles[3], movDate[1], "7:30 PM - 9:30 PM");
        
      //day4
        movie[3][0][0] = new Movie(1, movTitles[0], movDate[0], "8:00 AM - 10:00 AM");
        movie[3][0][1] = new Movie(1, movTitles[0], movDate[0], "10:30 AM - 12:30 PM");
        movie[3][0][2] = new Movie(1, movTitles[0], movDate[0], "1:00 PM - 2:00 PM");
        movie[3][0][3] = new Movie(1, movTitles[0], movDate[0], "2:30 PM - 4:30 PM");
        movie[3][0][4] = new Movie(1, movTitles[0], movDate[0], "5:00 PM - 7:00 PM");
        movie[3][0][5] = new Movie(1, movTitles[0], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[3][1][0] = new Movie(2, movTitles[3], movDate[0], "8:00 AM - 10:00 AM");
        movie[3][1][1] = new Movie(2, movTitles[3], movDate[0], "10:30 AM - 12:30 PM");
        movie[3][1][2] = new Movie(2, movTitles[3], movDate[0], "1:00 PM - 2:00 PM");
        movie[3][1][3] = new Movie(2, movTitles[3], movDate[0], "2:30 PM - 4:30 PM");
        movie[3][1][4] = new Movie(2, movTitles[3], movDate[0], "5:00 PM - 7:00 PM");
        movie[3][1][5] = new Movie(2, movTitles[3], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[3][2][0] = new Movie(3, movTitles[4], movDate[0], "8:00 AM - 10:00 AM");
        movie[3][2][1] = new Movie(3, movTitles[4], movDate[0], "10:30 AM - 12:30 PM");
        movie[3][2][2] = new Movie(3, movTitles[4], movDate[0], "1:00 PM - 2:00 PM");
        movie[3][2][3] = new Movie(3, movTitles[4], movDate[0], "2:30 PM - 4:30 PM");
        movie[3][2][4] = new Movie(3, movTitles[4], movDate[0], "5:00 PM - 7:00 PM");
        movie[3][2][5] = new Movie(3, movTitles[4], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[3][3][0] = new Movie(4, movTitles[6], movDate[0], "8:00 AM - 10:00 AM");
        movie[3][3][1] = new Movie(4, movTitles[6], movDate[0], "10:30 AM - 12:30 PM");
        movie[3][3][2] = new Movie(4, movTitles[6], movDate[0], "1:00 PM - 2:00 PM");
        movie[3][3][3] = new Movie(4, movTitles[6], movDate[0], "2:30 PM - 4:30 PM");
        movie[3][3][4] = new Movie(4, movTitles[6], movDate[0], "5:00 PM - 7:00 PM");
        movie[3][3][5] = new Movie(4, movTitles[6], movDate[0], "7:30 PM - 9:30 PM");
        
        ///day5
        movie[4][0][0] = new Movie(1, movTitles[7], movDate[1], "8:00 AM - 10:00 AM");
        movie[4][0][1] = new Movie(1, movTitles[7], movDate[1], "10:30 AM - 12:30 PM");
        movie[4][0][2] = new Movie(1, movTitles[7], movDate[1], "1:00 PM - 2:00 PM");
        movie[4][0][3] = new Movie(1, movTitles[7], movDate[1], "2:30 PM - 4:30 PM");
        movie[4][0][4] = new Movie(1, movTitles[7], movDate[1], "5:00 PM - 7:00 PM");
        movie[4][0][5] = new Movie(1, movTitles[7], movDate[1], "7:30 PM - 9:30 PM");
       
        movie[4][1][0] = new Movie(2, movTitles[2], movDate[1], "8:00 AM - 10:00 AM");
        movie[4][1][1] = new Movie(2, movTitles[2], movDate[1], "10:30 AM - 12:30 PM");
        movie[4][1][2] = new Movie(2, movTitles[2], movDate[1], "1:00 PM - 2:00 PM");
        movie[4][1][3] = new Movie(2, movTitles[2], movDate[1], "2:30 PM - 4:30 PM");
        movie[4][1][4] = new Movie(2, movTitles[2], movDate[1], "5:00 PM - 7:00 PM");
        movie[4][1][5] = new Movie(2, movTitles[2], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[4][2][0] = new Movie(3, movTitles[1], movDate[1], "8:00 AM - 10:00 AM");
        movie[4][2][1] = new Movie(3, movTitles[1], movDate[1], "10:30 AM - 12:30 PM");
        movie[4][2][2] = new Movie(3, movTitles[1], movDate[1], "1:00 PM - 2:00 PM");
        movie[4][2][3] = new Movie(3, movTitles[1], movDate[1], "2:30 PM - 4:30 PM");
        movie[4][2][4] = new Movie(3, movTitles[1], movDate[1], "5:00 PM - 7:00 PM");
        movie[4][2][5] = new Movie(3, movTitles[1], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[4][3][0] = new Movie(4, movTitles[5], movDate[1], "8:00 AM - 10:00 AM");
        movie[4][3][1] = new Movie(4, movTitles[5], movDate[1], "10:30 AM - 12:30 PM");
        movie[4][3][2] = new Movie(4, movTitles[5], movDate[1], "1:00 PM - 2:00 PM");
        movie[4][3][3] = new Movie(4, movTitles[5], movDate[1], "2:30 PM - 4:30 PM");
        movie[4][3][4] = new Movie(4, movTitles[5], movDate[1], "5:00 PM - 7:00 PM");
        movie[4][3][5] = new Movie(4, movTitles[5], movDate[1], "7:30 PM - 9:30 PM");
        
        //day 6
        movie[5][0][0] = new Movie(1, movTitles[8], movDate[1], "8:00 AM - 10:00 AM");
        movie[5][0][1] = new Movie(1, movTitles[8], movDate[1], "10:30 AM - 12:30 PM");
        movie[5][0][2] = new Movie(1, movTitles[8], movDate[1], "1:00 PM - 2:00 PM");
        movie[5][0][3] = new Movie(1, movTitles[8], movDate[1], "2:30 PM - 4:30 PM");
        movie[5][0][4] = new Movie(1, movTitles[8], movDate[1], "5:00 PM - 7:00 PM");
        movie[5][0][5] = new Movie(1, movTitles[8], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[5][1][0] = new Movie(2, movTitles[4], movDate[1], "8:00 AM - 10:00 AM");
        movie[5][1][1] = new Movie(2, movTitles[4], movDate[1], "10:30 AM - 12:30 PM");
        movie[5][1][2] = new Movie(2, movTitles[4], movDate[1], "1:00 PM - 2:00 PM");
        movie[5][1][3] = new Movie(2, movTitles[4], movDate[1], "2:30 PM - 4:30 PM");
        movie[5][1][4] = new Movie(2, movTitles[4], movDate[1], "5:00 PM - 7:00 PM");
        movie[5][1][5] = new Movie(2, movTitles[4], movDate[1], "7:30 PM - 9:30 PM");
       
        movie[5][2][0] = new Movie(3, movTitles[1], movDate[1], "8:00 AM - 10:00 AM");
        movie[5][2][1] = new Movie(3, movTitles[1], movDate[1], "10:30 AM - 12:30 PM");
        movie[5][2][2] = new Movie(3, movTitles[1], movDate[1], "1:00 PM - 2:00 PM");
        movie[5][2][3] = new Movie(3, movTitles[1], movDate[1], "2:30 PM - 4:30 PM");
        movie[5][2][4] = new Movie(3, movTitles[1], movDate[1], "5:00 PM - 7:00 PM");
        movie[5][2][5] = new Movie(3, movTitles[1], movDate[1], "7:30 PM - 9:30 PM");
        
        movie[5][3][0] = new Movie(4, movTitles[3], movDate[1], "8:00 AM - 10:00 AM");
        movie[5][3][1] = new Movie(4, movTitles[3], movDate[1], "10:30 AM - 12:30 PM");
        movie[5][3][2] = new Movie(4, movTitles[3], movDate[1], "1:00 PM - 2:00 PM");
        movie[5][3][3] = new Movie(4, movTitles[3], movDate[1], "2:30 PM - 4:30 PM");
        movie[5][3][4] = new Movie(4, movTitles[3], movDate[1], "5:00 PM - 7:00 PM");
        movie[5][3][5] = new Movie(4, movTitles[3], movDate[1], "7:30 PM - 9:30 PM");
        
      //day7
        movie[6][0][0] = new Movie(1, movTitles[0], movDate[0], "8:00 AM - 10:00 AM");
        movie[6][0][1] = new Movie(1, movTitles[0], movDate[0], "10:30 AM - 12:30 PM");
        movie[6][0][2] = new Movie(1, movTitles[0], movDate[0], "1:00 PM - 2:00 PM");
        movie[6][0][3] = new Movie(1, movTitles[0], movDate[0], "2:30 PM - 4:30 PM");
        movie[6][0][4] = new Movie(1, movTitles[0], movDate[0], "5:00 PM - 7:00 PM");
        movie[6][0][5] = new Movie(1, movTitles[0], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[6][1][0] = new Movie(2, movTitles[3], movDate[0], "8:00 AM - 10:00 AM");
        movie[6][1][1] = new Movie(2, movTitles[3], movDate[0], "10:30 AM - 12:30 PM");
        movie[6][1][2] = new Movie(2, movTitles[3], movDate[0], "1:00 PM - 2:00 PM");
        movie[6][1][3] = new Movie(2, movTitles[3], movDate[0], "2:30 PM - 4:30 PM");
        movie[6][1][4] = new Movie(2, movTitles[3], movDate[0], "5:00 PM - 7:00 PM");
        movie[6][1][5] = new Movie(2, movTitles[3], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[6][2][0] = new Movie(3, movTitles[4], movDate[0], "8:00 AM - 10:00 AM");
        movie[6][2][1] = new Movie(3, movTitles[4], movDate[0], "10:30 AM - 12:30 PM");
        movie[6][2][2] = new Movie(3, movTitles[4], movDate[0], "1:00 PM - 2:00 PM");
        movie[6][2][3] = new Movie(3, movTitles[4], movDate[0], "2:30 PM - 4:30 PM");
        movie[6][2][4] = new Movie(3, movTitles[4], movDate[0], "5:00 PM - 7:00 PM");
        movie[6][2][5] = new Movie(3, movTitles[4], movDate[0], "7:30 PM - 9:30 PM");
        
        movie[6][3][0] = new Movie(4, movTitles[8], movDate[0], "8:00 AM - 10:00 AM");
        movie[6][3][1] = new Movie(4, movTitles[8], movDate[0], "10:30 AM - 12:30 PM");
        movie[6][3][2] = new Movie(4, movTitles[8], movDate[0], "1:00 PM - 2:00 PM");
        movie[6][3][3] = new Movie(4, movTitles[8], movDate[0], "2:30 PM - 4:30 PM");
        movie[6][3][4] = new Movie(4, movTitles[8], movDate[0], "5:00 PM - 7:00 PM");
        movie[6][3][5] = new Movie(4, movTitles[8], movDate[0], "7:30 PM - 9:30 PM");
    }

    public MovieSelect2()
    {
     
    
        setTitle("Movies");
        database();
        setDefaultCloseOperation(3);
        setResizable(false);
        setBounds(100, 100, 1100, 1000);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblSelectADate = new JLabel("Select a Date");
        lblSelectADate.setForeground(new Color(255, 255, 255));
        lblSelectADate.setBounds(535, 48, 102, 16);
        contentPane.add(lblSelectADate);
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.cyan);
        JLabel lblCinema = new JLabel("CINEMA 1");
        lblCinema.setForeground(new Color(255, 255, 255));
        lblCinema.setFont(new Font("Tahoma", 0, 17));
        lblCinema.setBounds(201, 76, 79, 22);
        contentPane.add(lblCinema);
        JLabel lblCinema_2 = new JLabel("CINEMA 2");
        lblCinema_2.setForeground(new Color(255, 255, 255));
        lblCinema_2.setFont(new Font("Tahoma", 0, 17));
        lblCinema_2.setBounds(666, 76, 79, 22);
        contentPane.add(lblCinema_2);
        JLabel lblCinema_1 = new JLabel("CINEMA 3");
        lblCinema_1.setForeground(new Color(255, 255, 255));
        lblCinema_1.setFont(new Font("Tahoma", 0, 17));
        lblCinema_1.setBounds(201, 492, 79, 22);
        contentPane.add(lblCinema_1);
        JLabel lblCinema_3 = new JLabel("CINEMA 4");
        lblCinema_3.setForeground(new Color(255, 255, 255));
        lblCinema_3.setFont(new Font("Tahoma", 0, 17));
        lblCinema_3.setBounds(666, 492, 79, 22);
        contentPane.add(lblCinema_3);
        final JLabel lblNewLabel = new JLabel("Movie 1");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", 1, 14));
        lblNewLabel.setBounds(201, 388, 183, 22);
        lblNewLabel.setText(movie[0][0][0].getTitle());
        contentPane.add(lblNewLabel);
        final JLabel lblMovie = new JLabel("Movie 2");
        lblMovie.setForeground(new Color(255, 255, 255));
        lblMovie.setFont(new Font("Tahoma", 1, 14));
        lblMovie.setBounds(666, 388, 218, 22);
        lblMovie.setText(movie[0][1][0].getTitle());
        contentPane.add(lblMovie);
        final JLabel lblMovie_1 = new JLabel("Movie 3");
        lblMovie_1.setForeground(new Color(255, 255, 255));
        lblMovie_1.setFont(new Font("Tahoma", 1, 14));
        lblMovie_1.setText(movie[0][2][0].getTitle());
        lblMovie_1.setBounds(201, 803, 194, 22);
        contentPane.add(lblMovie_1);
        final JLabel lblMovie_2 = new JLabel("Movie 4");
        lblMovie_2.setForeground(new Color(255, 255, 255));
        lblMovie_2.setFont(new Font("Tahoma", 1, 14));
        lblMovie_2.setBounds(666, 803, 183, 22);
        lblMovie_2.setText(movie[0][3][0].getTitle());
        contentPane.add(lblMovie_2);
        label = new JLabel("New label");
        label.setForeground(new Color(255, 255, 255));
        label.setBounds(368, 414, 118, 16);
        label.setText(movie[i][0][j].getSeats());
        contentPane.add(label);
        final JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(833, 414, 126, 16);
        lblNewLabel_1.setText(movie[i][1][j].getSeats());
        contentPane.add(lblNewLabel_1);
        comboBox_1 = new JComboBox();
        comboBox_1.setBackground(new Color(165, 42, 42));
        comboBox_1.setForeground(new Color(255, 255, 255));
        comboBox_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                j = comboBox_1.getSelectedIndex();
                label.setText(movie[i][0][j].getSeats());
            }

           
        });
        comboBox_1.setBounds(201, 411, 155, 22);
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
            movie[0][0][0].getTime(), movie[0][0][1].getTime(), movie[0][0][2].getTime(), movie[0][0][3].getTime(), movie[0][0][4].getTime(), movie[0][0][5].getTime()
        }));
        contentPane.add(comboBox_1);
        comboBox_2 = new JComboBox();
        comboBox_2.setBackground(new Color(165, 42, 42));
        comboBox_2.setForeground(new Color(255, 255, 255));
        comboBox_2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                j = comboBox_2.getSelectedIndex();
                lblNewLabel_1.setText(movie[i][1][j].getSeats());
            }

        });
        comboBox_2.setBounds(666, 411, 155, 22);
        comboBox_2.setModel(new DefaultComboBoxModel(new String[] {
            movie[0][0][0].getTime(), movie[0][0][1].getTime(), movie[0][0][2].getTime(), movie[0][0][3].getTime(), movie[0][0][4].getTime(), movie[0][0][5].getTime()
        }));
        contentPane.add(comboBox_2);
        final JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(368, 835, 118, 16);
        lblNewLabel_2.setText(movie[i][2][j].getSeats());
        contentPane.add(lblNewLabel_2);
        comboBox_3 = new JComboBox();
        comboBox_3.setBackground(new Color(165, 42, 42));
        comboBox_3.setForeground(new Color(255, 255, 255));
        comboBox_3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                j = comboBox_3.getSelectedIndex();
                lblNewLabel_2.setText(movie[i][2][j].getSeats());
            }

           
        });
        comboBox_3.setBounds(201, 832, 155, 22);
        comboBox_3.setModel(new DefaultComboBoxModel(new String[] {
            movie[0][0][0].getTime(), movie[0][0][1].getTime(), movie[0][0][2].getTime(), movie[0][0][3].getTime(), movie[0][0][4].getTime(), movie[0][0][5].getTime()
        }));
        contentPane.add(comboBox_3);
        final JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(832, 835, 127, 16);
        lblNewLabel_3.setText(movie[i][3][j].getSeats());
        contentPane.add(lblNewLabel_3);
        comboBox_4 = new JComboBox();
        comboBox_4.setBackground(new Color(165, 42, 42));
        comboBox_4.setForeground(new Color(255, 255, 255));
        comboBox_4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                j = comboBox_4.getSelectedIndex();
                lblNewLabel_3.setText(movie[i][3][j].getSeats());
            }

           
        });
        comboBox_4.setBounds(666, 832, 155, 22);
        comboBox_4.setModel(new DefaultComboBoxModel(new String[] {
            movie[0][0][0].getTime(), movie[0][0][1].getTime(), movie[0][0][2].getTime(), movie[0][0][3].getTime(), movie[0][0][4].getTime(), movie[0][0][5].getTime()
        }));
        contentPane.add(comboBox_4);
        lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][0][j].getTitle().toLowerCase()).append(".png").toString()));
        lblNewLabel_4.setBounds(201, 99, 301, 287);
        lblNewLabel_4.setBorder(border);
        contentPane.add(lblNewLabel_4);
        final JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBounds(666, 99, 301, 287);
        lblNewLabel_5.setBorder(border);
        lblNewLabel_5.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][1][j].getTitle().toLowerCase()).append(".png").toString()));
        contentPane.add(lblNewLabel_5);
        final JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setBounds(201, 517, 301, 287);
        lblNewLabel_6.setBorder(border);
        lblNewLabel_6.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][2][j].getTitle().toLowerCase()).append(".png").toString()));
        contentPane.add(lblNewLabel_6);
        final JLabel lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setBounds(666, 517, 301, 287);
        lblNewLabel_7.setBorder(border);
        lblNewLabel_7.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][3][j].getTitle().toLowerCase()).append(".png").toString()));
        contentPane.add(lblNewLabel_7);
        final JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                try
                {
                    Desktop.getDesktop().open(new File((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][1][j].getTitle().toLowerCase()).append(".mp4").toString()));
                    contentPane.add(btnNewButton_2);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }

           
        });
        btnNewButton_2.setBorder(border);
        btnNewButton_2.setBounds(666, 99, 301, 287);
        btnNewButton_2.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][1][j].getTitle().toLowerCase()).append(".png").toString()));
        contentPane.add(btnNewButton_2);
        final JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                try
                {
                    Desktop.getDesktop().open(new File((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][0][j].getTitle().toLowerCase()).append(".mp4").toString()));
                    contentPane.add(btnNewButton_2);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }

         
        });
        btnNewButton_1.setBorder(border);
        btnNewButton_1.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][0][j].getTitle().toLowerCase()).append(".png").toString()));
        btnNewButton_1.setBounds(201, 99, 301, 287);
        contentPane.add(btnNewButton_1);
        final JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                try
                {
                    Desktop.getDesktop().open(new File((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][2][j].getTitle().toLowerCase()).append(".mp4").toString()));
                    contentPane.add(btnNewButton_2);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }

           
        });
        btnNewButton_3.setBorder(border);
        btnNewButton_3.setBounds(201, 517, 301, 287);
        btnNewButton_3.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][2][j].getTitle().toLowerCase()).append(".png").toString()));
        contentPane.add(btnNewButton_3);
        final JButton btnNewButton_4 = new JButton("");
        btnNewButton_4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                try
                {
                    Desktop.getDesktop().open(new File((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][3][j].getTitle().toLowerCase()).append(".mp4").toString()));
                    contentPane.add(btnNewButton_2);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }

          
        });
        btnNewButton_4.setBorder(border);
        btnNewButton_4.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][3][j].getTitle().toLowerCase()).append(".png").toString()));
        btnNewButton_4.setBounds(666, 517, 301, 287);
        contentPane.add(btnNewButton_4);
        comboBox = new JComboBox();
        comboBox.setForeground(new Color(255, 255, 255));
        comboBox.setBackground(new Color(165, 42, 42));
        comboBox.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                i = comboBox.getSelectedIndex();
                lblNewLabel.setText(movie[i][0][0].getTitle());
                lblMovie.setText(movie[i][1][1].getTitle());
                lblMovie_1.setText(movie[i][2][0].getTitle());
                lblMovie_2.setText(movie[i][3][0].getTitle());
                comboBox_1.setSelectedIndex(0);
                comboBox_2.setSelectedIndex(0);
                comboBox_3.setSelectedIndex(0);
                comboBox_4.setSelectedIndex(0);
                j = 0;
                label.setText(movie[i][0][j].getSeats());
                lblNewLabel_1.setText(movie[i][1][j].getSeats());
                lblNewLabel_2.setText(movie[i][2][j].getSeats());
                lblNewLabel_3.setText(movie[i][3][j].getSeats());
                lblNewLabel_4.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][0][j].getTitle().toLowerCase()).append(".png").toString()));
                lblNewLabel_5.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][1][j].getTitle().toLowerCase()).append(".png").toString()));
                lblNewLabel_6.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][2][j].getTitle().toLowerCase()).append(".png").toString()));
                lblNewLabel_7.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][3][j].getTitle().toLowerCase()).append(".png").toString()));
                btnNewButton_1.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][0][j].getTitle().toLowerCase()).append(".png").toString()));
                btnNewButton_2.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][1][j].getTitle().toLowerCase()).append(".png").toString()));
                btnNewButton_3.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][2][j].getTitle().toLowerCase()).append(".png").toString()));
                btnNewButton_4.setIcon(new ImageIcon((new StringBuilder(workingDir+"\\bin\\src\\")).append(movie[i][3][j].getTitle().toLowerCase()).append(".png").toString()));
            }

          
        });
        comboBox.setModel(new DefaultComboBoxModel(new String[] {
            "November 26,2015", "November 27,2015", "November 28,2015", "November 29,2015", "November 30,2015", "December 1,2015", "December 2,2015"
        }));
        comboBox.setBounds(423, 23, 312, 22);
        contentPane.add(comboBox);
        JButton btnBack = new JButton("BACK");
        btnBack.setForeground(new Color(255, 255, 255));
        btnBack.setFont(new Font("Arial Black", 0, 13));
        btnBack.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
                setVisible(false);
                MovieSelect2.b.setVisible(true);
            }

        });
        btnBack.setBackground(new Color(165, 42, 42));
        btnBack.setBounds(36, 900, 107, 33);
        contentPane.add(btnBack);
        JButton btnNewButton = new JButton("RESERVE TICKETS");
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0)
            {
            	j=comboBox_1.getSelectedIndex();
                movie[i][0][j].openSeatReservation();
                setVisible(false);
                l = i;
                c = 0;
                getcombox();
            }

           
        });
        btnNewButton.setBackground(new Color(165, 42, 42));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Arial Black", 0, 13));
        btnNewButton.setBounds(201, 443, 183, 33);
        contentPane.add(btnNewButton);
        JButton button = new JButton("RESERVE TICKETS");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	j=comboBox_2.getSelectedIndex();
                movie[i][1][j].openSeatReservation();
                setVisible(false);
                l = i;
                c = 1;
                getcombox();
            }

        });
        button.setBackground(new Color(165, 42, 42));
        button.setForeground(new Color(255, 255, 255));
        button.setFont(new Font("Arial Black", 0, 13));
        button.setBounds(666, 443, 183, 33);
        contentPane.add(button);
        JButton button_1 = new JButton("RESERVE TICKETS");
        button_1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	j=comboBox_3.getSelectedIndex();
                movie[i][2][j].openSeatReservation();
                setVisible(false);
                l = i;
                c = 2;
                getcombox();
            }

           
        });
        button_1.setForeground(new Color(255, 255, 255));
        button_1.setFont(new Font("Arial Black", 0, 13));
        button_1.setBackground(new Color(165, 42, 42));
        button_1.setBounds(201, 862, 183, 33);
        contentPane.add(button_1);
        JButton button_2 = new JButton("RESERVE TICKETS");
        button_2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
            	j=comboBox_4.getSelectedIndex();
                movie[i][3][j].openSeatReservation();
                setVisible(false);
                l = i;
                c = 3;
                getcombox();
            }

           
        });
        button_2.setBackground(new Color(165, 42, 42));
        button_2.setForeground(new Color(255, 255, 255));
        button_2.setFont(new Font("Arial Black", 0, 13));
        button_2.setBounds(666, 862, 183, 33);
        contentPane.add(button_2);
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setIcon(new ImageIcon(workingDir+"\\bin\\src\\cinemabg.png"));
        lblNewLabel_8.setBounds(0, 0, 1100, 1000);
        contentPane.add(lblNewLabel_8);
    }

    private void getcombox()
    {
        n[0] = comboBox_1.getSelectedIndex();
        n[1] = comboBox_2.getSelectedIndex();
        n[2] = comboBox_3.getSelectedIndex();
        n[3] = comboBox_4.getSelectedIndex();
    }


   


}
